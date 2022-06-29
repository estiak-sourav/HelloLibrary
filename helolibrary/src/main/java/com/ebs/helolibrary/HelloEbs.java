package com.ebs.helolibrary;

import android.content.Context;
import android.widget.Toast;

public class HelloEbs {

    public static void showToast (Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static int addon(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b){
        return a + b;
    }


}
