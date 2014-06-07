package com.example.bicycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginact);		
		
		final EditText editUserName=(EditText)findViewById(R.id.LoginAct_Username);
		final EditText editPassWord=(EditText)findViewById(R.id.LoginAct_Password);
		
		Button loginButton = (Button)findViewById(R.id.LoginAct_Login);
		loginButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//��½��ť�Ĵ�������
				String a = "Name:" + editUserName.getText() + "\nPassword:" + editPassWord.getText();
				Toast.makeText(LoginAct.this, a, Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(LoginAct.this, ActionAct.class);  
			    startActivity(intent); 
			}
		});
		
		//ע��
		
		Button registerBut = (Button)findViewById(R.id.LoginAct_Register);
		registerBut.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ע�ᰴť�Ĵ�������
				Intent intent = new Intent(LoginAct.this,RegisterAct.class);  
			    startActivity(intent); 
			}
		});
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return true;
      }

}
