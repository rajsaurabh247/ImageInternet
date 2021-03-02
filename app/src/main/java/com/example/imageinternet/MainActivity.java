package com.example.imageinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);

        String uri="https://www.blueosa.com/wp-content/uploads/2020/07/butter-chicken-Chicken-Makhani.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.avatar).into(imageView1);
        Picasso.get().load("https://www.blueosa.com/wp-content/uploads/2020/07/Indian-Cauliflower-Potatoe.jpg").placeholder(R.drawable.avatar).into(imageView2);

    }
}