package com.CicloVidaPacakge;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExemploCiclovidaAbrirTela extends ExemploCicloVida implements
		OnClickListener {

	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		Button b = new Button(this);
		b.setText("clique aqui para abrir a tela.");
		b.setOnClickListener(this);
		setContentView(b);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent it = new Intent(this,Tela2.class);
		startActivity(it);
	}
}
