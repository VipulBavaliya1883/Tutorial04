package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void OnClick(View view) {

        EditText et1 = findViewById(R.id.etusername);
        EditText et2 = findViewById(R.id.etpassword);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        if (s1.isEmpty() && s2.isEmpty()) ;
        Toast.makeText(this, "Please don't leave any field empty", Toast.LENGTH_SHORT).show();
        {
            if (!s1.equals("admin@gmail.com") && !s2.equals("admin")) ;
            Toast.makeText(this, "Username and Password Incorrect!!!", Toast.LENGTH_SHORT).show();
            {
                Intent a1 = new Intent(this, Welcome.class);
                a1.putExtra("username", s1);
                startActivity(a1);
            }
        }
    }
}
