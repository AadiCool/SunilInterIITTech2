package iitkgp.com.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		Objects.requireNonNull(getSupportActionBar()).hide();
		
		ImageView imageView = findViewById(R.id.splash_screen);
		Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
		animation.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) { }
			
			@Override
			public void onAnimationEnd(Animation animation) {
				startActivity(new Intent(SplashActivity.this, MainActivity.class));
				finish();
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) { }
		});
		imageView.startAnimation(animation);
	}
}
