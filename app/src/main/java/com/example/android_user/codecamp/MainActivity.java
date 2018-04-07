package com.example.android_user.codecamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etPass;
    private Button btGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        btGreet = findViewById(R.id.btGreet);
        btGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a =0,b = 0,c;

                a = Integer.parseInt(etName.getText().toString());
                b = Integer.parseInt(etPass.getText().toString());

                c=a+b;

                Toast.makeText(MainActivity.this,"sum: "+ c,Toast.LENGTH_SHORT).show();

                //Toast.makeText(MainActivity.this, "shieeeet " + etName.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
