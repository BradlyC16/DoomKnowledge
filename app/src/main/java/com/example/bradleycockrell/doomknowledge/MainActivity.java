package com.example.bradleycockrell.doomknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @OnClick(R.id.begin_button)
    private void BeginClicked() {

        zombiemanActivity = ZombiemanActivity.newInstance();
    }
}
