package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button=(Button)findViewById(R.id.RandomXY);
		MyDraw mydraw=(MyDraw)findViewById(R.id.myDraw1);
		button.setOnClickListener(mydraw);
		Button button1=(Button)findViewById(R.id.RandomVXY);
		button1.setOnClickListener(mydraw);
		Button stopButton=(Button)findViewById(R.id.StopMove);
		stopButton.setOnClickListener(mydraw);

	}
}
