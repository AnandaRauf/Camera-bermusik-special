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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.media.MediaPlayer;
import android.view.View;

public class CameraActivity extends Activity {
	
	public final int REQ_CD_CAM = 101;
	
	private String a = "";
	private String strvaar = "";
	
	private ArrayList<String> liststring = new ArrayList<>();
	
	private LinearLayout linear2;
	private Button captimage;
	private EditText edittext1;
	private LinearLayout linear1;
	private Button home;
	private ImageView imageview1;
	
	private Intent intentscuy = new Intent();
	private Intent cam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private Uri _uri_cam;
	private MediaPlayer med;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.camera);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		captimage = (Button) findViewById(R.id.captimage);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		home = (Button) findViewById(R.id.home);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		_uri_cam = FileUtil.getNewPictureUri(getApplicationContext());
		cam.putExtra(MediaStore.EXTRA_OUTPUT, _uri_cam);
		
		captimage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				startActivityForResult(cam, REQ_CD_CAM);
			}
		});
		
		home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				intentscuy.setClass(getApplicationContext(), MainActivity.class);
				intentscuy.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intentscuy);
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_CAM:
			if (_resultCode == Activity.RESULT_OK) {
				 String _filePath = "";
				if (_uri_cam != null) {
					_filePath = FileUtil.convertUriToFilePath(getApplicationContext(), _uri_cam);
				}
				imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(_filePath, 1024, 1024));
				edittext1.setText(_filePath);
				strvaar = _filePath;
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	private void _addsourcedirectly (final String _add) {
		
	}
	
	
	private void _testimoni (final SharedPreferences _test) {
		
	}
	
	
	private void _test (final HashMap<String, Object> _test) {
		
	}
	
	
	private void _testa () {
		
	}
	
	
	private void _tests (final boolean _tests) {
		
	}
	
	
	private void _testsa (final double _testsa) {
		
	}
	
	
	private void _add_source_directly (final String _add_source_directly) {
		
	}
	
	
	private void _imageview (final ImageView _imageview) {
		
	}
	
	
	private void _imageviews () {
		
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
