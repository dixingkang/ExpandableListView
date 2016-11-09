package com.example.administrator.expandablelistview;

import android.widget.BaseExpandableListAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/18 0018.
 */

public abstract class MyExopandablelisrViewAdapter extends BaseExpandableListAdapter {


    private Map<Integer, List<ExpandableBean.RsListBean.ListBean>> mListBean;
    private List<ExpandableBean.RsListBean> mRsListBean;


    public MyExopandablelisrViewAdapter(List<ExpandableBean.RsListBean> rsListBean, Map<Integer, List<ExpandableBean.RsListBean.ListBean>> listBean) {

        if (rsListBean == null) {
            throw new NullPointerException();
        }
        if (listBean == null) {
            throw new NullPointerException();
        }
        mRsListBean = rsListBean;
        mListBean = listBean;

    }

    @Override
    public int getGroupCount() {
        return mRsListBean.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return mListBean.get(groupPosition).size();
    }

    @Override
    public Object getGroup(int groupPosition) {

        return mRsListBean.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return mListBean.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return mRsListBean.get(groupPosition).replyUserId;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
