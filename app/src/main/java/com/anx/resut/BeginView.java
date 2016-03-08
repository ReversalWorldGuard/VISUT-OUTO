package com.anx.resut;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class BeginView extends LinearLayout implements Runnable
{

    private View view;

    private Button start;

    @Override
    public void run()
    {
        // TODO: Implement this method
        invalidate();
        }
    private void draw(){
       
    }

       
    public BeginView(Context c){
        super(c);
        this.view=LayoutInflater.from(c).inflate(R.layout.begin,null);
        draw();
        setGravity(Gravity.CENTER|Gravity.TOP);
        view.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
        addView(view);
        run();
        this.start=(Button)view.findViewById(R.id.beginButton);
        start.setOnClickListener(new OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    // TODO: Implement this method
                    GameData.GAMEVIEW=GameData.GAMEVIEW_GAMEVIEW;
                }
            });
    }
    
    
}
