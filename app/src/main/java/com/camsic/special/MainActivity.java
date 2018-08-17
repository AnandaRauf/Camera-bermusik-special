package com.camsic.special;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.media.MediaPlayer;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends Activity {
	
	
	private double click = 0;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private Button menu;
	private WebView webview2;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private Button camera;
	private Button galery;
	private Button play;
	private Button pause;
	private Button supportcompany;
	private Button contacts;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	
	private ObjectAnimator ani = new ObjectAnimator();
	private MediaPlayer med;
	private Intent intentcoks = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		menu = (Button) findViewById(R.id.menu);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		camera = (Button) findViewById(R.id.camera);
		galery = (Button) findViewById(R.id.galery);
		play = (Button) findViewById(R.id.play);
		pause = (Button) findViewById(R.id.pause);
		supportcompany = (Button) findViewById(R.id.supportcompany);
		contacts = (Button) findViewById(R.id.contacts);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		
		menu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				click++;
				if (click == 1) {
					ani.setTarget(linear4);
					ani.setPropertyName("translationX");
					ani.setFloatValues((float)(SketchwareUtil.getDip(getApplicationContext(), (int)(-200)) - SketchwareUtil.getDisplayWidthPixels(getApplicationContext())), (float)(0 - SketchwareUtil.getDisplayWidthPixels(getApplicationContext())));
					ani.setDuration((int)(500));
					ani.setRepeatMode(ValueAnimator.REVERSE);
					ani.setRepeatCount((int)(0));
					ani.setInterpolator(new AccelerateInterpolator());
					ani.start();
				}
				else {
					if (click == 2) {
						ani.setTarget(linear4);
						ani.setFloatValues((float)(0 - SketchwareUtil.getDisplayWidthPixels(getApplicationContext())), (float)(SketchwareUtil.getDip(getApplicationContext(), (int)(-200)) - SketchwareUtil.getDisplayWidthPixels(getApplicationContext())));
						ani.start();
						click = 0;
					}
				}
			}
		});
		
		webview2.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		camera.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				intentcoks.setClass(getApplicationContext(), CameraActivity.class);
				intentcoks.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intentcoks);
				finish();
			}
		});
		
		galery.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				intentcoks.setAction(Intent.ACTION_VIEW);
				intentcoks.setData(Uri.parse("content://media/sd card/images/media"));
				startActivity(intentcoks);
				finish();
			}
		});
		
		play.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				med = MediaPlayer.create(getApplicationContext(), R.raw.agusri);
				med.start();
			}
		});
		
		pause.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_Mediaplayer(med);
				med.pause();
			}
		});
		
		supportcompany.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				webview2.loadUrl("https://www.instagram.com/mrvd02");
			}
		});
		
		contacts.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				webview2.loadUrl("https://www.instagram.com/anandarauf08");
			}
		});
	}
	private void initializeLogic() {
		click = 0;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _CmrasActivity () {
		
	}
	
	
	private void _Mediaplayer (final MediaPlayer _pause) {
		
	}
	
	
	private void _Addsourcedirectly () {
		
	}
	
	
	private void _addsourcedirectly (final String _source) {
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
