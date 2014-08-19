package com.weibo.follow;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FollowParser {
    /** 日志对象. */
    private static Logger logger = Logger.getLogger(FollowParser.class);
    /**
     * 解析关注或粉丝.
     * @param uid
     * @param follow
     * @return
     */
    public static ArrayList<FollowInfo> parserFollow(String uid, String follow) {
        ArrayList<FollowInfo> followList = new ArrayList<FollowInfo>();
        Document doc = Jsoup.parse(follow, "UTF-8");
        Elements divElements = doc.select("div.con_left");
        //System.out.println(divElements.size());
        if (divElements != null && !divElements.isEmpty()) {
            int divSize = divElements.size();
            for (int index = 0; index < divSize; index++) {
                Element element = divElements.get(index);
                FollowInfo followInfo = new FollowInfo();
                //System.out.println(element.toString());
                //System.out.println("----------------");
                followInfo.setUid(uid);
                followInfo.setFollowUid(element.select("a[class=W_f14 S_func1]").attr("usercard").substring(3));
                followInfo.setFollowNickname(element.select("a[class=W_f14 S_func1]").text());
                followInfo.setFollowFollow(element.select("div.connect").select("a[target=_blank]").get(0).text());
                followInfo.setFollowFans(element.select("div.connect").select("a[target=_blank]").get(1).text());
                followInfo.setFollowWeibo(element.select("div.connect").select("a[target=_blank]").get(2).text());
                //System.out.println("================");
                followList.add(followInfo);
            }
        }
        return followList;
    }
    /**
     * 获取关注或粉丝JS.
     * @param content
     * @return
     */
    public static String getFollowJS(String content) {
        String array[] = content.split("\n");
        String value = "";
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                //System.out.println(i + "\t" + array[i]);
                if (array[i].startsWith("<script>FM.view({\"ns\":\"pl.content.followTab.index\"")) {
                    value = array[i];
                    int index = value.indexOf("\"html\":\"");
                    if (index > 0) {
                        value = value.substring(index + 7, value.length() - 12); //12
                        value = value.replaceAll("\\\\t", "");
                        value = value.replaceAll("\\\\r\\\\n", "");
                        value = value.replaceAll("\\\\", "");
                        logger.debug(value);
                    }
                }
            }
        }
        return value;
    }
}
