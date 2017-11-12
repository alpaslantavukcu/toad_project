package com.alpaslantavukcu.toad_project;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    private MediaPlayer mp;
    private int m_duration;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onStartButtonClicked(View view)
    {
        mp = MediaPlayer.create(this, R.raw.toad);
        mp.start();
        m_duration = mp.getDuration();
    }

    public void onStopButtonClicked(View view)
    {
        mp.stop();
    }

    public void onButton1Clicked(View view){}

    public void onButton2Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 2);
    }

    public void onButton3Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 3);
    }

    public void onButton4Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 4);
    }

    public void onButton5Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 5);
    }

    public void onButton6Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 6);
    }

    public void onButton7Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 7);
    }

    public void onButton8Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 8);
    }

    public void onButton9Clicked(View view)
    {
        mp.seekTo(m_duration / 10 * 9);
    }
}

