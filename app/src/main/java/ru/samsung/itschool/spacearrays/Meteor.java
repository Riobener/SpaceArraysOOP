package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;


public class Meteor extends Objects implements Moveable, Drawable {



    Meteor(Bitmap pic,float x, float y,float vx, float vy){
        super(x,y,vx,vy);


        this.pic = pic;
    }
    public void move(){
        this.x += this.vx;
        this.y += this.vy;
    }

    Paint paint = new Paint();
    Matrix matrix = new Matrix();
    Bitmap pic;
    public void draw(Canvas canvas){
        matrix.setScale(0.2f, 0.2f);
        matrix.postRotate((float)Math.toDegrees(Math.atan2(this.vy, this.vx)) + 45);
        matrix.postTranslate(this.x, this.y);
        paint.setAlpha(255);
        canvas.drawBitmap(pic, matrix, paint);
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void setVx(float vx) {
        this.vx = vx;
    }

    @Override
    public void setVy(float vy) {
        this.vy = vy;
    }


}