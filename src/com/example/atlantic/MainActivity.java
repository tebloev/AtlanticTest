package com.example.atlantic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	static public EditText mEditD;
	
	@Override	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText mEditA = (EditText)findViewById(R.id.editText1);
		final EditText mEditB = (EditText)findViewById(R.id.editText2);
		final EditText mEditC = (EditText)findViewById(R.id.editText3);
		mEditD = (EditText)findViewById(R.id.editText4);
		mEditD.setKeyListener(null);

		Button mButton = (Button)findViewById(R.id.button1);
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {		
				int a = Integer.parseInt(mEditA.getText().toString());
				int b = Integer.parseInt(mEditB.getText().toString());
				int c = Integer.parseInt(mEditC.getText().toString());
				Intent i= new Intent(MainActivity.this, SumService.class);
				i.putExtra("a", a);
				i.putExtra("b", b);
				i.putExtra("c", c);
				startService(i);
			}
		});
		
	}

}
