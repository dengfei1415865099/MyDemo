package com.example.a24783.mydemo;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AppBarLayout.OnOffsetChangedListener {
    private AppBarLayout appBar;
    private RelativeLayout rl_one;
    private RelativeLayout rl_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_text = findViewById(R.id.tv_text);
        rl_one = findViewById(R.id.rl_one);
        rl_two = findViewById(R.id.rl_two);
        appBar = findViewById(R.id.appBar);
        appBar.addOnOffsetChangedListener(this);
        tv_text.setText("你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的" +
                "打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊" +
                "你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打" +
                "啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打" +
                "啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打" +
                "啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打" +
                "啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的" +
                "打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊你的打啊");
    }

    @Override
    public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        int offset = Math.abs(verticalOffset);
        rl_one.setAlpha((offset/282f));
        rl_two.setAlpha((1-offset/282f));
    }
}
