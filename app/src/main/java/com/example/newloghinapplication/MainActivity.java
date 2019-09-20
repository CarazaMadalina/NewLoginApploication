package com.example.newloghinapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    Button cancelButton;
    EditText username;
    EditText password;
    TextView attempts;
    TextView forgot_password;
    TextView do_not_have_an_account;
    TextView or_button;
    TextView sign_in_button;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.Login);
        cancelButton = findViewById(R.id.Cancel);
        username = findViewById(R.id.Username);
        password = findViewById(R.id.Password);
        attempts = findViewById(R.id.Attempt);
        forgot_password = findViewById(R.id.Forgot_Password);
        do_not_have_an_account = findViewById(R.id.Account);
        or_button = findViewById(R.id.Or);
        sign_in_button = findViewById(R.id.SignIn_Facebook_Login);
        text = findViewById(R.id.Text);
        text.setVisibility(View.GONE);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApplication", "This is a magic log message!");
                Toast.makeText(getApplicationContext(), "It's magic!", Toast.LENGTH_SHORT).show();


            }
        });


    }
}
