package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint paint;
    private Path path;

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        path = new Path();
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画坐标
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2.5f);
        canvas.drawLine(100,10,100,750,paint);
        canvas.drawLine(100,750,1300,750,paint);

        //画矩形
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#00CD00"));
        canvas.drawRect(130,749,260,750,paint);
        canvas.drawRect(290,725,420,750,paint);
        canvas.drawRect(450,725,580,750,paint);
        canvas.drawRect(610,500,740,750,paint);
        canvas.drawRect(770,300,900,750,paint);
        canvas.drawRect(930,200,1060,750,paint);
        canvas.drawRect(1090,550,1220,750,paint);

        //画text
        paint.setColor(Color.WHITE);
        paint.setTextSize(35);
        canvas.drawText("Froyo",150,785,paint);
        canvas.drawText("GB",330,785,paint);
        canvas.drawText("ICS",480,785,paint);
        canvas.drawText("JB",650,785,paint);
        canvas.drawText("KiKat",790,785,paint);
        canvas.drawText("L",980,785,paint);
        canvas.drawText("M",1140,785,paint);

        paint.setTextSize(60);
        canvas.drawText("直方图",620,900,paint);


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
