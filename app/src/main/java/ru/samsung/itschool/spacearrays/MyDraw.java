package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MyDraw extends View implements View.OnClickListener{

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		sky = new Sky();
		sky.makeSky();
		rocket = new Rocket(BitmapFactory.decodeResource(getResources(), R.drawable.rocket),400,500,1,1);
		ufo = new UFO(BitmapFactory.decodeResource(getResources(), R.drawable.ufo),250,500,1,1);
		meteor = new Meteor(BitmapFactory.decodeResource(getResources(), R.drawable.meteor),100,500,1,1);

	}
	Sky sky;
	Rocket rocket;
	UFO ufo;
	Meteor meteor;



	public static float getRandom(float a,float b){
		float res=(float)((Math.random()*(b-a)+a));
		return res;
	}
	Paint paint = new Paint();
	@Override
	protected void onDraw(Canvas canvas) {
		sky.draw(canvas);

		ufo.draw(canvas);
		ufo.move();
		rocket.draw(canvas);
		rocket.move();
		meteor.draw(canvas);
		meteor.move();


		invalidate();
	}









	@Override
	public void onClick(View v) {
		switch(v.getId()){
			case R.id.RandomXY:
				rocket.setX(getRandom(400,500));
				rocket.setY(getRandom(400,500));
				ufo.setX(getRandom(400,500));
				ufo.setX(getRandom(400,500));
				meteor.setX(getRandom(400,500));
				meteor.setX(getRandom(400,500));
				break;
				case R.id.RandomVXY:
					rocket.setVx(getRandom(-8,2));
					rocket.setVy(getRandom(-8,2));
					ufo.setVx(getRandom(-8,2));
					ufo.setVy(getRandom(-8,2));
					meteor.setVx(getRandom(-8,2));
					meteor.setVy(getRandom(-8,2));
					break;
			case R.id.StopMove:
				rocket.setVx(0);
				rocket.setVy(0);
				ufo.setVx(0);
				ufo.setVy(0);
				meteor.setVx(0);
				meteor.setVy(0);
		}
	}
}