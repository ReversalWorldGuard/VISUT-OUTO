package com.anx.resut;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity 
{

    private Handler gameViewHander;
    
    private int nowView;
    
    private Runnable running=new Runnable(){

        @Override
        public void run()
        {
            // TODO: Implement this method
            gameViewJumper();
        }
        
        
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        gameViewHander=new Handler();
        running.run();
        
    }

    @Override
    protected void onDestroy()
    {
        // TODO: Implement this method
        super.onDestroy();
        gameViewHander.removeCallbacks(running);
    }
    
    private void gameViewJumper(){
        if(nowView!=GameData.GAMEVIEW){
            nowView=GameData.GAMEVIEW;
        
        switch (GameData.GAMEVIEW){
            case GameData.GAMEVIEW_BEGIN:
            setContentView(new BeginView(this));
            break;
            case GameData.GAMEVIEW_GAMEVIEW:
                setContentView(new GameView(this));
                break;
        }}
        
        gameViewHander.removeCallbacks(running);
        gameViewHander.postDelayed(running,1000);
    
}

}
