package com.b3lon9.demo8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;

public class Custom extends View {
    private Paint paint;

    // Constructor
    public Custom(Context context) {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);

        paint = new Paint();
        // color 지정
        paint.setStyle(Paint.Style.FILL);   // 기본값
        paint.setColor(Color.GREEN);

        // 원 그리기 cy:원의 중심점, radius:반지름
        canvas.drawCircle(100, 100, 100, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5.0F);
        paint.setColor(Color.MAGENTA);

        canvas.drawCircle(100, 100, 100, paint);


        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0F);
        paint.setColor(Color.RED);
        canvas.drawCircle(360, 100, 100, paint);

        // 사각형 그리기
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);

        paint.setARGB(128, 255, 0, 0);
        canvas.drawRect(10, 210, 200,410, paint);

        // 점선으로 바꾸기
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{5, 5}, 1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.0F);
        paint.setPathEffect(dashPathEffect);
        paint.setColor(Color.BLUE);
        canvas.drawRect(220, 210, 400, 410, paint);

        // 텍스트
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(100);
        String message = "테스트할 문자 입력";
        canvas.drawText(message, 10, 500, paint);
    }
}
