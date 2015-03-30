package com.example.nokiaasha.callhistory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by NOKIA ASHA on 13/03/2015.
 */
public class Login extends Activity implements View.OnClickListener {
    EditText pass, phone;
    Button login, signUp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        phone=(EditText)findViewById(R.id.phone);
        pass=(EditText)findViewById(R.id.pass);

        login=(Button)findViewById(R.id.login);
        signUp=(Button)findViewById(R.id.signup);

        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent i;
        switch(id) {
            case R.id.login:
                                i=new Intent(Login.this,MainActivity.class);
                                startActivity(i);
                                break;

        }
    }
}
