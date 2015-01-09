package com.CicloVidaPacakge;

import android.os.Bundle;
import android.widget.TextView;



public class Tela2 extends ExemploCicloVida {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		TextView view = new TextView(this); 
		setContentView(view);
	}
}
