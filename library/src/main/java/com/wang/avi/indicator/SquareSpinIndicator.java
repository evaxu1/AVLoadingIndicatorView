package com.wang.avi.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.PropertyValuesHolder;

/**
 * Created by Jack on 2015/10/16.
 */
public class SquareSpinIndicator extends BaseIndicatorController {

    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawRect(new RectF(getWidth()/5,getHeight()/5,getWidth()*4/5,getHeight()*4/5),paint);
    }

    @Override
    public void createAnimation() {
        PropertyValuesHolder rotation5=PropertyValuesHolder.ofFloat("rotationX",0,180,180,0,0);
        PropertyValuesHolder rotation6=PropertyValuesHolder.ofFloat("rotationY",0,0,180,180,0);
        ObjectAnimator animator=ObjectAnimator.ofPropertyValuesHolder(getTarget(), rotation6,rotation5);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(-1);
        animator.setDuration(2500);
        animator.start();
        addAnimation(animator);
    }
}
