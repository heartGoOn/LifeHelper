package com.ycbjie.zhihu.contract;


import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;
import com.ycbjie.zhihu.model.ZhiHuHotBean;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/11/29
 * 描    述：知乎日报模块        日报
 * 修订历史：
 * ================================================
 */
public interface ZhiHuHotContract {

    //View(activity/fragment)继承，需要实现的方法
    interface View extends BaseView {
        void setView(ZhiHuHotBean zhiHuHotBean);
        void setEmptyView();
        void setNetworkErrorView();
        void setErrorView();
    }

    //Presenter控制器
    interface Presenter extends BasePresenter {
        void getData();
        void insertReadToDB(int news_id);
    }


}
