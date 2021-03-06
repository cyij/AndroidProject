package com.jrfunclibrary.base.view;

/**
 * Created by zhush on 2016/10/8.
 * E-mail 405086805@qq.com
 */
public interface BaseView {

    /**
     * 显示等待
     * @param message
     */
    public void showProgress(String message);

    /**
     * 关闭等待
     */
    public void closeProgress();

    /**
     * 显示信息
     * @param message
     */
    public void showMessage(String message);

}
