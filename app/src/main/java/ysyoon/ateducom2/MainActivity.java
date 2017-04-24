package ysyoon.ateducom2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button) Button button;
    @Bind(R.id.button2) Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void clickbutton(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    @OnClick(R.id.button2)
    public void clickbutton2(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
