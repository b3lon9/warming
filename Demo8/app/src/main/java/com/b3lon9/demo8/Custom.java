package com.b3lon9.demo8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
        paint.setColor(Color.GREEN);

        // 원 그리기 cy:원의 중심점, radius:반지름
        canvas.drawCircle(500, 500, 300, paint);
    }
}
