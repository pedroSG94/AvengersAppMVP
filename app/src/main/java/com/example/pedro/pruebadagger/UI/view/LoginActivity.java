package com.example.pedro.pruebadagger.UI.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pedro.pruebadagger.APP.base.BaseActivity;
import com.example.pedro.pruebadagger.APP.navigator.Navigator;
import com.example.pedro.pruebadagger.R;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements Button.OnClickListener{

    TextView tvNick, tvPassword;

    @Inject
    Navigator navigator;

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
                if (tvNick.getText().toString().equals("nick") && tvPassword.getText().toString().equals("admin")) {
                    navigator.goBack();
                    navigator.changeActivity(MainActivity.class);
                }
                else {
                    Toast.makeText(this, "Usuario o contraseña icorrectos", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
