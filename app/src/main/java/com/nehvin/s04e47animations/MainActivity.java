package com.nehvin.s04e47animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView jerry = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jerry = (ImageView) findViewById(R.id.jerry);
        jerry.setTranslationX(-1500f);
        jerry.setTranslationY(-1500f);
    }

    public void fadeOut(View view)
    {
        jerry.animate().translationXBy(1500f).translationYBy(1500f).rotation(3600f).setDuration(2000);
    }

}