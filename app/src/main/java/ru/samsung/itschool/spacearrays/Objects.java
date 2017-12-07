package ru.samsung.itschool.spacearrays;

/**
 * Created by Asus on 07.12.2017.
 */

public abstract class Objects {
   public float x,y,vx,vy;

    Objects(float x, float y, float vx,float vy){
     this.x = x;
     this.y = y;
     this.vx = vx;
     this.vy = vy;
    }

    public abstract void setX(float x);
    public abstract void setY(float x);
    public abstract void setVx(float x);
    public abstract void setVy(float x);


}
