package com.iramelectronics.colortoastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iramelectronics.iram_colorful_toast.IRAM_Colorful_Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IRAM_Colorful_Toast iToast = new IRAM_Colorful_Toast(this);
       // iToast.errorToast("sdf");
        iToast.customToast("message", com.iramelectronics.iram_colorful_toast.R.color.Black,
                com.iramelectronics.iram_colorful_toast.R.drawable.ic_arrow_btn_pxby, com.iramelectronics.iram_colorful_toast.R.drawable.custom_success_toast_bg);

        iToast.customToast("message", R.color.myTry,
                R.drawable.help_btn_rb, R.drawable.toast_test_bg);
    }
}