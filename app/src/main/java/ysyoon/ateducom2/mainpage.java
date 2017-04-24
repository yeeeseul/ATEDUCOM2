package ysyoon.ateducom2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by YSYoon on 2017-02-24.
 */

public class mainpage extends Activity {

    @Bind(R.id.cal) Button cal;
    @Bind(R.id.ana) Button ana;
    @Bind(R.id.games) Button games;
    @Bind(R.id.mus) Button mus;
    @Bind(R.id.set) Button set;
    @Bind(R.id.help) Button help;

    @Bind(R.id.anaframe) FrameLayout anaframe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        ButterKnife.bind(this);
    }
    /*
    @OnClick(R.id.help)
    public void clickhelp(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

    @OnClick(R.id.games)
    public void clickgames(){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

    @OnClick(R.id.cal)
    public void clickcal(){
        Intent intent = new Intent(this, CalendarAndAlram.class);
        startActivity(intent);
    }

    @OnClick(R.id.mus)
    public void clickmus(){
        Intent intent = new Intent(this, MusicandPaints.class);
        startActivity(intent);
    }
*/
    @OnClick(R.id.ana)
    public void clickana(){

        anaframe.setVisibility(View.VISIBLE);
   }


    @OnClick({R.id.help,R.id.games,R.id.cal,R.id.mus})
    public void onClick(View view){

        Intent intent ;



        switch (view.getId()){
            case R.id.cal:
                intent = new Intent(this, CalendarAndAlram.class);
                break;
            case R.id.games:
                intent  = new Intent(this,Game.class);
                break;
            case R.id.mus:
                intent  = new Intent(this,MusicandPaints.class);
                break;
            case R.id.help:
                intent  = new Intent(this,Help.class);
                break;
            default:
                return;
        }

        startActivity(intent);
    }


}
