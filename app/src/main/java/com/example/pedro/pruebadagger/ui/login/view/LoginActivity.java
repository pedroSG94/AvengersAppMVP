package com.example.pedro.pruebadagger.ui.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Necesario un presenter por activity
 */
public class LoginActivity extends BaseActivity{

    @Bind(R.id.et_nick) EditText etNick;
    @Bind(R.id.et_password) EditText etPassword;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectView(R.layout.activity_login);
    }

    @OnClick(R.id.b_Login)
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_Login:
                loginPresenter.onClickLogin(etNick.getText().toString(), etPassword.getText().toString());
                break;
        }
    }
}
