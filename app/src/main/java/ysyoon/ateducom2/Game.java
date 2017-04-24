package ysyoon.ateducom2;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by YSYoon on 2017-02-25.
 */

public class Game extends Activity {

    @Bind(R.id.stay) TextView stay;
    @Bind(R.id.timerframe) FrameLayout timerframe;
    @Bind(R.id.start) Button start;
    @Bind(R.id.pause) Button pause;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        ButterKnife.bind(this);
    }

    private void start(){
        stay.setText("300");

        CountDownTimer countDownTimer = new CountDownTimer(30 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                stay.setText(millisUntilFinished/1000+"");
            }

            @Override
            public void onFinish() {
                stay.setText("Well Done!");
                timerframe.setVisibility(View.VISIBLE);
            }
        };
        countDownTimer.start();
    }
    private  void pause(){
        if(countDownTimer!=null){
            countDownTimer.cancel();
            countDownTimer=null;
        }
    }

    @OnClick({R.id.start, R.id.pause})
    public void which(View v) {
        switch (v.getId()) {
            case R.id.start:
                start();
                break;
            case R.id.pause:
                pause();
                break;
        }
    }



}





