package com.example.android_user.codecamp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android_user.codecamp.R;

public class ImageActivity extends AppCompatActivity {
    private Button btPic1;
    private Button btPic2;
    private Button btPic3;
    private ImageView imgPic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        buttonbleppp();
    }

    private void buttonbleppp()
    {
        imgPic = findViewById(R.id.imgPic);
        btPic1 = findViewById(R.id.btPic1);
        btPic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPic.setImageDrawable(getDrawable(R.drawable.heyya));
            }
        });
        btPic2 = findViewById(R.id.btPic2);
        btPic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPic.setImageDrawable(getDrawable(R.drawable.hmmmmm));
            }
        });
        btPic3 = findViewById(R.id.btPic3);
        btPic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPic.setImageDrawable(getDrawable(R.drawable.reeeeeeeee));
            }
        });


    }
}
