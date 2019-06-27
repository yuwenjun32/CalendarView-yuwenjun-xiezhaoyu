package com.haibin.calendarviewproject.yindaoye;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.haibin.calendarviewproject.MainActivity;
import com.haibin.calendarviewproject.R;

public class YinDaoYeActivity extends AppCompatActivity {
    private TextView tv_yingdaoye;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yin_dao_ye);
        tv_yingdaoye=(TextView)findViewById(R.id.tv_regou);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.yidaoye_item);
        tv_yingdaoye.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(YinDaoYeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}
