package com.example.adja.mobilebankinok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText txtLogin, txtPassword;
    private Button btnConnect;
    private String login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLogin =(EditText) findViewById(R.id.txtLogin);
        txtPassword =(EditText) findViewById(R.id.txtPassword);
        btnConnect =(Button) findViewById(R.id.btnConnect);


        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login=txtLogin.getText().toString().trim();
                password=txtPassword.getText().toString().trim();
                if (login.isEmpty()||password.isEmpty())
                {
                    Toast.makeText(MainActivity.this, getString(R.string.error_field), Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }


            }
        });


    }
}