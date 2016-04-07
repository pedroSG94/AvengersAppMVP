package com.example.pedro.pruebadagger.ui.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Necesario un presenter por activity
 */
public class LoginActivity extends BaseActivity implements LoginView{

    @Bind(R.id.et_nick) EditText etNick;
    @Bind(R.id.et_password) EditText etPassword;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public BasePresenter bindPresenter() {
        return loginPresenter;
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.b_Login)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_Login:
                loginPresenter.onClickLogin(etNick.getText().toString(), etPassword.getText().toString());
                break;
        }
    }

    @Override
    public void makeToast(final String message) {
        Toast.makeText(getApplication(), message, Toast.LENGTH_SHORT).show();
    }
}
