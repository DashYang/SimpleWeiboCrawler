package com.weibo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.weibo.content.ContentCrawler;
import com.weibo.follow.FollowCrawler;
import com.weibo.follow.FollowInfo;
import com.weibo.util.GetPid;
import com.weibo.util.SeleniumClient;
import com.weibo.util.WeiboDB;
/**
 * 程序入口.
 */
public class Main {

    public static void main(final String[] args) throws IOException {
       //判断是否重新登录
        if (Config.IS_LOGIN) {
            try {
                Config.cookie = SeleniumClient.GetCookie();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //连接数据库
        Connection weiboDB = null;
        try {
            weiboDB = WeiboDB.getConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //获取uid前缀，个人100505 机构100206
        //String pid = GetPid.getPid(Config.UID, Config.cookie);
        //抓取微博内容
        //ContentCrawler.content(Config.cookie, Config.UID, pid,
        //                       Config.START_DATE, Config.END_DATE, weiboDB);
        //抓取一级关注
        //ArrayList<FollowInfo> followList = null;
        //followList = FollowCrawler.follow(Config.cookie, Config.UID, pid, weiboDB);
        //抓取二级关注
        //FollowCrawler.followFollow(Config.cookie, followList, weiboDB);
        //抓取一级粉丝
        //followList.clear();
        //followList = FollowCrawler.fans(Config.cookie, Config.UID, pid, weiboDB);
        //抓取二级粉丝
        //FollowCrawler.fansFans(Config.cookie, followList, weiboDB);
        
        
        ArrayList<String> uidList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("list.csv"));
        String userdate = br.readLine();
        while (userdate != null && !"".equals(userdate)) {
            uidList.add(userdate);
            userdate = br.readLine();
        }
        br.close();
        System.out.println("===" + uidList.size()  + "===");
        
        if (uidList != null && uidList.size() > 0) {
            for (int index = 0; index < uidList.size(); index++) {
                String pid = GetPid.getPid(uidList.get(index), Config.cookie);
                //System.out.println("===" + pid  + "===");
                //FollowCrawler.follow(Config.cookie, uidList.get(index), pid, weiboDB);
                ContentCrawler.content(Config.cookie, uidList.get(index), pid, Config.START_DATE, Config.END_DATE, weiboDB);
                System.out.println("===" + (index + 1) + "===");
            }
        }
        
        
        try {
            weiboDB.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
