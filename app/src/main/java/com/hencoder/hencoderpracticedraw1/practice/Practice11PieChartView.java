package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
        paint.setStyle(Paint.Style.FILL);

        paint.setColor(Color.parseColor("#CD0000"));
        canvas.drawArc(150,100,850,800,180,130,true,paint);

        paint.setColor(Color.parseColor("#FFB90F"));
        canvas.drawArc(180,130,880,830,-50,50,true,paint);

        paint.setColor(Color.parseColor("#C71585"));
        canvas.drawArc(180,130,880,830,3,5,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(180,130,880,830,11,5,true,paint);






//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
