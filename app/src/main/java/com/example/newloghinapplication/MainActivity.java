package com.example.newloghinapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button loginButton, cancelButton;
    EditText username, password;
    TextView attempts, forgot_password, do_not_have_an_account, or_button, sign_in_button, text;
    int count = 3;


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
                validateCredentials(username.getText().toString(), password.getText().toString());
            }

            private void validateCredentials(String username, String password) {
                Log.i("MyApplication", "This is a magic log message!");
                Toast.makeText(getApplicationContext(), "It's magic!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

                if (username.equals("admin") && password.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
                    text.setVisibility(View.VISIBLE);
                    text.setBackgroundColor(Color.parseColor("#3F51B5"));

                    count--;
                    text.setText(Integer.toString(count));

                    if (count == 0) {
                        loginButton.setEnabled(false);
                    }
                }
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
