package com.example.livroandroidcap4;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ExemploCicloVida extends Activity {

	protected static final String CATEGORIA = "livro";

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		Log.i(CATEGORIA, getClassName() + ".onCreate() chamado: " + icicle);
		TextView t = new TextView(this);
		t.setText("exemplo do ciclo de vida. \nConsulte os logs no LogCat");
		setContentView(t);
	}

	
	protected void onStart() {
		super.onStart();
		Log.i(CATEGORIA, getClassName() + ".onStart() chamado.");
	}

	protected void onRestart() {
		super.onRestart();
		Log.i(CATEGORIA, getClassName() + ".onRestart() chamado.");
	}

	protected void onResume() {
		super.onResume();
		Log.i(CATEGORIA, getClassName() + ".onResume() chamado");
	}

	protected void onPause() {
		super.onPause();
		Log.i(CATEGORIA, getClassName() + ".onPause() chamado");
	}

	protected void onStop() {
		super.onPause();
		Log.i(CATEGORIA, getClassName() + ".onStop() chamado");
	}

	protected void onDestroy() {
		super.onDestroy();
		Log.i(CATEGORIA, getClassName() + ".onDestroy() chamado");
	}
	
	private String getClassName() {
		// TODO Auto-generated method stub
		String s = getClass().getName();
		return s.substring(s.lastIndexOf("."));

	}


}
