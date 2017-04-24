package ysyoon.ateducom2;

/**
 * Created by YSYoon on 2017-02-24.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends Activity {

    @Bind(R.id.login)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login)
    public void clicklogin(){
        Intent intent = new Intent(this, mainpage.class);
        startActivity(intent);
    }
}
