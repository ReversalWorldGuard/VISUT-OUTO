package com.anx.resut;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.util.AttributeSet;
import android.content.Context;
import java.text.Format;
import android.view.LayoutInflater;

public class GameView extends SurfaceView implements Runnable,SurfaceHolder.Callback
{

    private SurfaceHolder holder;

    @Override
    public void surfaceCreated(SurfaceHolder p1)
    {
        // TODO: Implement this method
    }

    @Override
    public void surfaceChanged(SurfaceHolder p1, int p2, int p3, int p4)
    {
        // TODO: Implement this method
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder p1)
    {
        // TODO: Implement this method
    }

    @Override
    public void run()
    {
        // TODO: Implement this method
    }
    
    public GameView(Context c){
        super(c);
        this.holder=getHolder();
        holder.addCallback(this);
        
    }
    
    
    
}
