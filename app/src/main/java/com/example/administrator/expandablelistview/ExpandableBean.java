package com.example.administrator.expandablelistview;

import java.util.List;

/**
 * Created by Administrator on 2016/10/18 0018.
 */

public class ExpandableBean {


    /**
     * msg : 200
     * rsList : [{"replyUserId":1,"list":[{"content":"123456","id":54,"title":"","nickName":"13526813259","userId":"170","replyUserId":"170","comId":"6","replyBigId":"53","head":"/upload/icon_default.png","type":1,"replyId":"53","leaveDate":"2016-10-17 14:59:16"},{"content":"123456","id":55,"title":"","nickName":"13555568685","userId":"169","replyUserId":"170","comId":"6","replyBigId":"53","head":"/upload/icon_default.png","type":1,"replyId":"53","leaveDate":"2016-10-17 14:59:55"}],"replyBigId":0,"type":0,"id":53,"content":"我去啊","title":"","nickName":"13526813259","userId":"170","comId":"6","replyId":1,"head":"/upload/icon_default.png","leaveDate":"2016-10-17 14:56:05"},{"replyUserId":1,"list":[{"content":"抢俩","id":49,"title":"","nickName":"13526813259","userId":"170","replyUserId":"139","comId":"6","replyBigId":"47","head":"/upload/icon_default.png","type":1,"replyId":"47","leaveDate":"2016-10-17 13:07:15"},{"content":"抢俩","id":50,"title":"","nickName":"18803974279","userId":"140","replyUserId":"139","comId":"6","replyBigId":"47","head":"/upload/icon_default.png","type":1,"replyId":"47","leaveDate":"2016-10-17 13:24:39"},{"content":"抢俩","id":51,"title":"","nickName":"13000000000","userId":"141","replyUserId":"140","comId":"6","replyBigId":"47","head":"/upload/icon_default.png","type":1,"replyId":"50","leaveDate":"2016-10-17 13:25:37"}],"replyBigId":1,"type":0,"id":47,"content":"抢个沙发","title":"","nickName":"18039270196","userId":"139","comId":"6","replyId":1,"head":"/upload/icon_default.png","leaveDate":"2016-09-03 07:45:13"}]
     */

    public int msg;
    /**
     * replyUserId : 1
     * list : [{"content":"123456","id":54,"title":"","nickName":"13526813259","userId":"170","replyUserId":"170","comId":"6","replyBigId":"53","head":"/upload/icon_default.png","type":1,"replyId":"53","leaveDate":"2016-10-17 14:59:16"},{"content":"123456","id":55,"title":"","nickName":"13555568685","userId":"169","replyUserId":"170","comId":"6","replyBigId":"53","head":"/upload/icon_default.png","type":1,"replyId":"53","leaveDate":"2016-10-17 14:59:55"}]
     * replyBigId : 0
     * type : 0
     * id : 53
     * content : 我去啊
     * title :
     * nickName : 13526813259
     * userId : 170
     * comId : 6
     * replyId : 1
     * head : /upload/icon_default.png
     * leaveDate : 2016-10-17 14:56:05
     */

    public List<RsListBean> rsList;

    public static class RsListBean {
        public int replyUserId;
        public int replyBigId;
        public int type;
        public int id;
        public String content;
        public String title;
        public String nickName;
        public String userId;
        public String comId;
        public Object replyId;
        public String head;
        public String leaveDate;
        /**
         * content : 123456
         * id : 54
         * title :
         * nickName : 13526813259
         * userId : 170
         * replyUserId : 170
         * comId : 6
         * replyBigId : 53
         * head : /upload/icon_default.png
         * type : 1
         * replyId : 53
         * leaveDate : 2016-10-17 14:59:16
         */

        public List<ListBean> list;

        public static class ListBean {
            public String content;
            public int id;
            public String title;
            public String nickName;
            public String userId;
            public String replyUserId;
            public String comId;
            public String replyBigId;
            public String head;
            public int type;
            public String replyId;
            public String leaveDate;
        }
    }
}
