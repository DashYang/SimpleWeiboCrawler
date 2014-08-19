package com.weibo;

/**.
 * 閰嶇疆鏂囦欢銆�
 */
public class Config {
    /** 鏁版嵁搴揑P. */
    public static final String HOST = "127.0.0.1";
    /** 鏁版嵁搴撶鍙ｅ彿. */
    public static final String PORT = "3306";
    /** 鏁版嵁搴撳悕绉�. */
    public static final String DB_NAME = "weibo_top_total";
    /** 鏁版嵁搴撶敤鎴峰悕. */
    public static final String USER = "root";
    /** 鏁版嵁搴撳瘑鐮�. */
    public static final String PASSWORD = "123456";
    /** 姣忔鎶撳彇闂撮殧. */
    public static final long THREAD_SLEEP = 3 * 1000; //鏂版氮瀵规姄鍙栨湁鎵�闄愬埗,
    /** 寰崥鐢ㄦ埛ID. */
    public static final String UID = "1729332983"; //
    /** 寮�濮嬫椂闂�. */
    public static final String START_DATE = "2014-07-01";
    /** 缁撴潫鏃堕棿. */
    public static final String END_DATE = "2014-08-01";
    /** 鏄惁閲嶆柊鐧诲綍. */
    public static final boolean IS_LOGIN = false; //闇�瑕佸畨瑁協irefox,璇峰湪寮瑰嚭鐨勭獥鍙ｄ腑鎵嬪姩鐧诲綍寰崥,20绉掑悗绐楀彛鑷姩鍏抽棴.
    /** 鐧诲綍cookie. */
    //public static String cookie = "YF-Ugrow-G0=fe7d42b1b76649f2dada9f1d178cfe5f; SUS=SID-5214997831-1406450565-JA-q2h63-4d9318254db199029f41558bf39776bb; SUBP=002A2c-gVlwEm1uAWxfgXELuuu1xVxBxAACEqUoIrJDib-GEmwxmIOVuHY-u_1%3D; WBtopGlobal_register_version=a8cf3e66ae57c88a; YF-V5-G0=8a3c37d39afd53b5f9eb3c8fb1874eec; un=cisl001@163.com; SUE=es%3D1a75e2d3243fa2bc6f38440850be800d%26ev%3Dv1%26es2%3D3b0ae5c827290a0502131e411a3778c7%26rs0%3DxuE%252FZBhtM7ESlsPlOBbl1xBjRJbh8rePM48d7Z3kvwXPwfGhDdmsNzrm6HbYkMqwiBpcgLLnKJmusWUrAU1ouh3aWhMJQip9PKrgxKdzKx%252B2LQjtTJ1%252BQUv1TBH4O2v0kQ%252B1%252FZxux9%252FsSmYoWHdWUSMLG9jvDXcgwYFrKzv2vsg%253D%26rv%3D0; Apache=4472390254035.896.1406450558105; SINAGLOBAL=4472390254035.896.1406450558105; ULV=1406450558209:1:1:1:4472390254035.896.1406450558105:; SUB=AasoDmb02IJ5IJGyT5jWWe0HcsJzz37Kwy6hrsdBEgo5RmWeRD%2F1Nu6oqABINoBiTSwsOGGUVw6bRhookrJuU7OYOr5nnIIZ5AUULqL2f8BGqEBJ5g4toKqLMMqX5f7TSg5c0bbVSZgAD7FsK4vi4Fo%3D; ALF=1437986565; YF-Page-G0=f9cf428f7c30a82f1d66fab847fbb873; SSOLoginState=1406450565; SUP=cv%3D1%26bt%3D1406450565%26et%3D1406536965%26d%3Dc909%26i%3D76bb%26us%3D1%26vf%3D0%26vt%3D0%26ac%3D%26st%3D0%26uid%3D5214997831%26name%3Dcisl001%2540163.com%26nick%3DCISL001%26fmp%3D%26lcp%3D; _s_tentry=passport.weibo.com;";
    public static String cookie = "UV5PAGE=usr513_105; SUB=_2AkMkrONNa8NlrAZTmfwcxWzqb4xH-jyXeum7An7uJhIyHRgv7mlVqSXB1ixKoXh4q9nVoluyxGwVZACwBw..; SUE=es%3Ddb5d71fde9487bc9d173b8191519bf56%26ev%3Dv1%26es2%3D81216376ba829d4f1e80e70fe1c81774%26rs0%3DiCP1UGJ7J%252FXOCLSo5xDLhhFW65QF69lm1HX32JELz2E5jA86g30yW0GfsQYF0rnfbE4Z8Dw7CkhgOGRNLevhiTvfcbon4WdQLgmjI5%252BmW6qduieE4tVlMOt409DE2IAO2EB8KZWACfO9SSv4X46fiJLbU9LHQN%252FU%252FCp4eNrxtj0%253D%26rv%3D0; UUG=usr1031; WBtopGlobal_register_version=c9fee367f33d1579; Apache=5157020865202.9.1408264981413; SINAGLOBAL=5157020865202.9.1408264981413; v5reg=usr1024; SUP=cv%3D1%26bt%3D1408265338%26et%3D1408351738%26d%3Dc909%26i%3De2b1%26us%3D1%26vf%3D0%26vt%3D0%26ac%3D2%26st%3D0%26uid%3D5214997831%26name%3Dcisl001%2540163.com%26nick%3DCISL001%26fmp%3D%26lcp%3D; SUS=SID-5214997831-1408265337-GZ-7k34o-58ca42396687ddb4f628005cb088e2b1; SSOLoginState=1408265338; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WWeMVl0.mTU4dXQM7f97.LP5JpX5K2t; _s_tentry=passport.weibo.com; un=cisl001@163.com; ALF=1439801337; ULV=1408264981432:1:1:1:5157020865202.9.1408264981413:;";
}
