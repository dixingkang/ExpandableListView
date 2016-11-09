package com.example.administrator.expandablelistview;

import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ExpandableListActivity {

    private Context mContext;

    private ExpandableListView elv;
    private String mJson = "{\n" +
            "  \"ShiroFilter.FILTERED\": true,\n" +
            "  \"code\": 200,\n" +
            "  \"anon.FILTERED\": true,\n" +
            "  \"rsList\": [\n" +
            "    {\n" +
            "      \"replyUserId\": null,\n" +
            "      \"list\": [\n" +
            "        {\n" +
            "          \"content\": \"123456\",\n" +
            "          \"id\": 54,\n" +
            "          \"title\": null,\n" +
            "          \"nickName\": \"13526813259\",\n" +
            "          \"userId\": \"170\",\n" +
            "          \"replyUserId\": \"170\",\n" +
            "          \"comId\": \"6\",\n" +
            "          \"replyBigId\": \"53\",\n" +
            "          \"head\": \"/upload/icon_default.png\",\n" +
            "          \"type\": 1,\n" +
            "          \"replyId\": \"53\",\n" +
            "          \"leaveDate\": \"2016-10-17 14:59:16\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"content\": \"123456\",\n" +
            "          \"id\": 55,\n" +
            "          \"title\": null,\n" +
            "          \"nickName\": \"13555568685\",\n" +
            "          \"userId\": \"169\",\n" +
            "          \"replyUserId\": \"170\",\n" +
            "          \"comId\": \"6\",\n" +
            "          \"replyBigId\": \"53\",\n" +
            "          \"head\": \"/upload/icon_default.png\",\n" +
            "          \"type\": 1,\n" +
            "          \"replyId\": \"53\",\n" +
            "          \"leaveDate\": \"2016-10-17 14:59:55\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"replyBigId\": null,\n" +
            "      \"type\": 0,\n" +
            "      \"id\": 53,\n" +
            "      \"content\": \"我去啊\",\n" +
            "      \"title\": null,\n" +
            "      \"nickName\": \"13526813259\",\n" +
            "      \"userId\": \"170\",\n" +
            "      \"comId\": \"6\",\n" +
            "      \"replyId\": null,\n" +
            "      \"head\": \"/upload/icon_default.png\",\n" +
            "      \"leaveDate\": \"2016-10-17 14:56:05\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"replyUserId\": null,\n" +
            "      \"list\": [\n" +
            "        {\n" +
            "          \"content\": \"抢俩\",\n" +
            "          \"id\": 49,\n" +
            "          \"title\": null,\n" +
            "          \"nickName\": \"13526813259\",\n" +
            "          \"userId\": \"170\",\n" +
            "          \"replyUserId\": \"139\",\n" +
            "          \"comId\": \"6\",\n" +
            "          \"replyBigId\": \"47\",\n" +
            "          \"head\": \"/upload/icon_default.png\",\n" +
            "          \"type\": 1,\n" +
            "          \"replyId\": \"47\",\n" +
            "          \"leaveDate\": \"2016-10-17 13:07:15\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"content\": \"抢俩\",\n" +
            "          \"id\": 50,\n" +
            "          \"title\": null,\n" +
            "          \"nickName\": \"18803974279\",\n" +
            "          \"userId\": \"140\",\n" +
            "          \"replyUserId\": \"139\",\n" +
            "          \"comId\": \"6\",\n" +
            "          \"replyBigId\": \"47\",\n" +
            "          \"head\": \"/upload/icon_default.png\",\n" +
            "          \"type\": 1,\n" +
            "          \"replyId\": \"47\",\n" +
            "          \"leaveDate\": \"2016-10-17 13:24:39\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"content\": \"抢俩\",\n" +
            "          \"id\": 51,\n" +
            "          \"title\": null,\n" +
            "          \"nickName\": \"13000000000\",\n" +
            "          \"userId\": \"141\",\n" +
            "          \"replyUserId\": \"140\",\n" +
            "          \"comId\": \"6\",\n" +
            "          \"replyBigId\": \"47\",\n" +
            "          \"head\": \"/upload/icon_default.png\",\n" +
            "          \"type\": 1,\n" +
            "          \"replyId\": \"50\",\n" +
            "          \"leaveDate\": \"2016-10-17 13:25:37\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"replyBigId\": null,\n" +
            "      \"type\": 0,\n" +
            "      \"id\": 47,\n" +
            "      \"content\": \"抢个沙发\",\n" +
            "      \"title\": null,\n" +
            "      \"nickName\": \"18039270196\",\n" +
            "      \"userId\": \"139\",\n" +
            "      \"comId\": \"6\",\n" +
            "      \"replyId\": null,\n" +
            "      \"head\": \"/upload/icon_default.png\",\n" +
            "      \"leaveDate\": \"2016-09-03 07:45:13\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    private ExpandableBean mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;
        elv = getExpandableListView();

        mData = new Gson().fromJson(mJson, ExpandableBean.class);

        Map<Integer, List<ExpandableBean.RsListBean.ListBean>> listBeanMap = new HashMap<>();

        for (int i = 0; i < mData.rsList.size(); i++) {
            listBeanMap.put(i, mData.rsList.get(i).list);
        }
        elv.setGroupIndicator(null);
        elv.setAdapter(new Main(mData.rsList, listBeanMap));
    }

    public class Main extends MyExopandablelisrViewAdapter {


        public Main(List<ExpandableBean.RsListBean> rsListBean, Map<Integer, List<ExpandableBean.RsListBean.ListBean>> listBean) {
            super(rsListBean, listBean);
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            ExpandableBean.RsListBean bean = (ExpandableBean.RsListBean) getGroup(groupPosition);


            TextView view = new TextView(mContext);
            view.setText(bean.content);
            return view;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

            ExpandableBean.RsListBean.ListBean bean = (ExpandableBean.RsListBean.ListBean) getChild(groupPosition, childPosition);

            TextView view = new TextView(mContext);
            view.setText(bean.content);

            return view;
        }
    }

    /**进度对话框 */
    private Dialog buildAlertDialog_progress() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("进度条");
        progressDialog.setMessage("正在下载...........");
/**进度条样式 */
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
/**模糊效果 */
        progressDialog.setIndeterminate(false);
        return progressDialog;
    }

}
