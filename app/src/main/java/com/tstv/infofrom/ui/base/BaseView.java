package com.tstv.infofrom.ui.base;

import com.arellomobile.mvp.MvpView;

/**
 * Created by tstv on 15.09.2017.
 */

public interface BaseView extends MvpView {

    void showDataProgress();

    void hideDataProgress();

    void showError(String message);

    void showMessage(String message);

   /* void showSnackBarProblem(ProblemType mProblemType);*/

    void hideKeyboard();

   /* enum ProblemType {
        Location, NetworkDisabled
    }*/
}
