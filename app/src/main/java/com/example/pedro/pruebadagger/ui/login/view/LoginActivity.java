package com.example.pedro.pruebadagger.ui.login.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;

import javax.inject.Inject;

/**
 * Necesario un presenter por activity
 */
public class LoginActivity extends BaseActivity implements Button.OnClickListener{

    TextView tvNick, tvPassword;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvNick = (TextView) findViewById(R.id.et_nick);
        tvPassword = (TextView) findViewById(R.id.et_password);

        Button bLogin = (Button) findViewById(R.id.b_Login);
        bLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_Login:
                loginPresenter.onClickLogin(tvNick.getText().toString(), tvPassword.getText().toString());
                break;
        }
    }
}
