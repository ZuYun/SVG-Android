package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_location_off extends SVGRenderer {

    public ic_location_off(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 6.5f);
        mPath.rCubicTo(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        mPath.rCubicTo(0.0f, 0.74f, -0.33f, 1.39f, -0.83f, 1.85f);
        mPath.rLineTo(3.63f, 3.63f);
        mPath.rCubicTo(0.98f, -1.86f, 1.7f, -3.8f, 1.7f, -5.48f);
        mPath.rCubicTo(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        mPath.rCubicTo(-1.98f, 0.0f, -3.76f, 0.83f, -5.04f, 2.15f);
        mPath.rLineTo(3.19f, 3.19f);
        mPath.rCubicTo(0.46f, -0.52f, 1.11f, -0.84f, 1.85f, -0.84f);
        mPath.close();
        mPath.moveTo(12.0f, 6.5f);
        mPath.rMoveTo(4.37f, 9.6f);
        mPath.rLineTo(-4.63f, -4.63f);
        mPath.rLineTo(-0.11f, -0.11f);
        mPath.lineTo(3.27f, 3.0f);
        mPath.lineTo(2.0f, 4.27f);
        mPath.rLineTo(3.18f, 3.18f);
        mPath.cubicTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        mPath.rCubicTo(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        mPath.rCubicTo(0.0f, 0.0f, 1.67f, -1.85f, 3.38f, -4.35f);
        mPath.lineTo(18.73f, 21.0f);
        mPath.lineTo(20.0f, 19.73f);
        mPath.rLineTo(-3.63f, -3.63f);
        mPath.close();
        mPath.moveTo(16.369999f, 16.1f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}