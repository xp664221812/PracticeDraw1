package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        Path path=new Path();
        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.parseColor("#CD0000"));
        canvas.drawArc(150,100,850,800,180,130,true,paint);

        paint.setColor(Color.parseColor("#FFB90F"));
        canvas.drawArc(180,130,880,830,-50,50,true,paint);

        paint.setColor(Color.parseColor("#C71585"));
        canvas.drawArc(180,130,880,830,3,5,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(180,130,880,830,11,5,true,paint);

        paint.setColor(Color.parseColor("#008B45"));
        canvas.drawArc(180,130,880,830,19,60,true,paint);

        paint.setColor(Color.parseColor("#1C86EE"));
        canvas.drawArc(180,130,880,830,82,100,true,paint);

        paint.setColor(Color.WHITE);
        paint.setTextSize(35);
        paint.setStrokeWidth(3f);

//        path.moveTo(50,50);
        float[] points = {180,80,330,80,330,80,370,120
                ,120,840,270,840,270,840,330,780
                ,850,350,900,300,900,300,1000,300
                ,885,485,980,485
                ,883,510,930,510,930,510,960,540,960,540,1000,540
                ,875,560,930,560,930,560,960,600,960,600,1000,600
                ,790,720,840,750,840,750,990,750
        };

        canvas.drawText("Lollipop",30,90,paint);
        canvas.drawText("KitKat",20,850,paint);
        canvas.drawText("Marshmallow",1020,310,paint);
        canvas.drawText("Froyo",1000,495,paint);
        canvas.drawText("Gingerbread",1020,550,paint);
        canvas.drawText("Ice Cream Sandwitch",1020,610,paint);
        canvas.drawText("Jelly Bean",1010,760,paint);

        paint.setTextSize(60);
        canvas.drawText("饼图",500,900,paint);



        canvas.drawLines(points,paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
