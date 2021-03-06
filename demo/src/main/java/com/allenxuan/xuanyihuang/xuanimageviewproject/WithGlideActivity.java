package com.allenxuan.xuanyihuang.xuanimageviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.allenxuan.xuanyihuang.xuanimageview.XuanImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class WithGlideActivity extends AppCompatActivity {
    private XuanImageView xuanImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_glide);

        xuanImageView = (XuanImageView) findViewById(R.id.withGlide_ImageView);
    }

    @Override
    protected void onStart() {
        super.onStart();


        Glide.with(this)
                .load("http://i.imgur.com/5yeBVeM.jpg")
                .into(xuanImageView);
    }
}
