
package com.fallingscalemedia.Noah360;
import com.MyCompany.AwesomeGame.*;
import com.fallingscalemedia.Noah360.*;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

public class Cocos2dxVideo extends Activity {

	private static final String TAG = "Cocos2dxVideo";
	private Cocos2dxVideo me;

	public native int onOver();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cocos2dx_video);

		me = this;
		System.out.println("Now Playing");
		
		VideoView vv = (VideoView) findViewById(R.id.videoPlayer);
		vv.setMediaController(null);
		vv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/"
				+ R.raw.samplevideo));
		
		vv.start();
		vv.requestFocus();

		vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
			@Override
			public void onCompletion(MediaPlayer mp) {
				// me.onOver();
				me.finish();
			};
		});

		vv.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// me.onOver();
				// me.finish();
				return false;
			}
		});
	}

}