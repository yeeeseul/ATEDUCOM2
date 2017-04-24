package ysyoon.ateducom2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by YSYoon on 2017-02-24.
 */

public class Register extends Activity {
    @Bind(R.id.signup) Button signup;
    @Bind(R.id.cancel) Button cancel;
    @Bind(R.id.numberPicker) NumberPicker agepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ButterKnife.bind(this);
        agepicker.setMinValue(5);
        agepicker.setMaxValue(14);
        agepicker.setWrapSelectorWheel(false);
    }

    @OnClick(R.id.signup)
    public void clicksignup(){
        Toast.makeText(Register.this, "You've got an account!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.signup)
    public void clickcancel(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
