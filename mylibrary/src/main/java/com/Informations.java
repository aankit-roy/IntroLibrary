package com;

import android.content.Context;
import android.widget.Toast;

public class Informations {
    public static void Toaster(Context context,String ms){

        Toast.makeText(context,ms,Toast.LENGTH_SHORT).show();
    }
}
