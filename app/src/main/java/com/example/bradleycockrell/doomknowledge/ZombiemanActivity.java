package com.example.bradleycockrell.doomknowledge;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ZombiemanActivity  {



    protected Button zombieman_correct_hp;

    protected Button zombieman_incorrect_hp1;

    protected Button zombieman_incorrect_hp2;

    protected Button zombieman_incorrect_hp3;

}


    public static ZombiemanActivity newInstance() {

        Bundle args = new Bundle();

        ZombiemanActivity fragment = new ZombiemanActivity();
        fragment.setArguments(args);
        return fragment;
