package ysyoon.ateducom2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by YSYoon on 2017-02-24.
 */

public class MusicandPaints extends Activity {

    @Bind(R.id.videoView)
    VideoView videoView;
    public final static String VIDEO_URL = "http://www.youtube.com/watch?v=qorkD6nPYQM";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.musicandpaints);
        ButterKnife.bind(this);



        videoView.setVideoPath(VIDEO_URL);
        final MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

    }


}
