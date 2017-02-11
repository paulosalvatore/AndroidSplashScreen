package com.example.paulo.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity
{
	private final int SPLASH_DISPLAY_LENGTH = 3500;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		new Handler().postDelayed(new Runnable()
		{
			@Override
			public void run()
			{
				Intent intent = new Intent(SplashScreenActivity.this,
						MenuActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
				startActivity(intent);
				SplashScreenActivity.this.finish();
			}
		}, SPLASH_DISPLAY_LENGTH);
	}
}
