package com.example.atm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btn;

    EditText username;
    EditText Password;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = findViewById(R.id.edt1);
        Password = findViewById(R.id.edt2);
        btn=(Button) findViewById(R.id.button);



    }

    public void name(View view) {
        if(username.getText().toString().equals("admin")&& Password.getText().toString().equals("12345")){
            Toast.makeText(this, "redirect", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Please check again", Toast.LENGTH_SHORT).show();
        }
    }

    public void a1(View view) {
        txt.setText("please check the password");
        btn.setEnabled(true);
        startActivity(new Intent());
    }
}