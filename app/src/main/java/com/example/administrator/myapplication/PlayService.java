package com.example.administrator.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2016/11/18.
 */
public class PlayService extends Service{
    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        mediaPlayer.start();
        return super.onStartCommand(intent,flags,startId);
    }
    public void onCreate(){
        super.onCreate();
        mediaPlayer=MediaPlayer.create(this,R.drawable.exodus);
        mediaPlayer.setLooping(true);
    }
    public void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
