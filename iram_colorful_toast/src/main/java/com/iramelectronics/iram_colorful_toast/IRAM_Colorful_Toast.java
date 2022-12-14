package com.iramelectronics.iram_colorful_toast;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class IRAM_Colorful_Toast {

    private Context context;
    private  Dialog successToast_Dialog;
    private Toast toast;
    private ImageView toast_Icon;
    private TextView toast_Txt;
    private LinearLayout toast_Layout;
    private Integer toast_gravity, toast_duration;

    public IRAM_Colorful_Toast() {
        // don't remove this empty constructor..............if nesessary create another constructor and use that
    }

    public IRAM_Colorful_Toast(Context context, int toast_gravity, int toast_duration) {
        this.context = context;
        this.toast_gravity = toast_gravity;
        this.toast_duration = toast_duration;
        initializeUI();
    }

    public IRAM_Colorful_Toast(Context context) {
        this.context = context;
        this.toast_gravity = Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL;
        this.toast_duration = Toast.LENGTH_LONG;
        initializeUI();
    }

    private void initializeUI () {
        // for this two i need activity instance.......which I can't get from the SmsReceiver class
      //  inflater = most_used_data.getActivity().getLayoutInflater();
    //   layout = inflater.inflate(R.layout.my_custom_toast, (ViewGroup) most_used_data.getActivity().findViewById(R.id.myCustom_ToastRoot));

        // this two line are  for test

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = View.inflate(context, R.layout.my_custom_toast, null);

        toast_Icon = layout.findViewById(R.id.myCustom_ToastIcon);
        toast_Txt = layout.findViewById(R.id.myCustom_ToastTxt);
        toast_Layout = layout.findViewById(R.id.myCustom_ToastLayoutBg);

        toast = new Toast(context);
        toast.setGravity(toast_gravity, 0, 0);
        toast.setDuration(toast_duration);
        toast.setView(layout);
    }


    public void customToast(String msg, int colors, int image, int background) {
        if (toast != null) { toast.cancel(); }
        initializeUI();

        toast_Txt.setText(msg);
        toast_Txt.setTextColor( context.getResources().getColor( colors ));
        toast_Icon.setImageResource( image );
        toast_Layout.setBackgroundResource( background );
        toast.show();
    }



    public void successToast(String str) {
        if (toast != null) { toast.cancel(); }
        initializeUI();


        toast_Txt.setText(str);
        toast_Txt.setTextColor(context.getResources().getColor(R.color.Black));
        toast_Icon.setImageResource(R.drawable.ic_arrow_btn_pxby);
        toast_Layout.setBackgroundResource(R.drawable.custom_success_toast_bg);
        toast.show();
    }

    public void errorToast(String str) {
        if (toast != null) { toast.cancel(); }
        initializeUI();

        toast_Txt.setText(str);
        toast_Txt.setTextColor(context.getResources().getColor(R.color.White));
        toast_Icon.setImageResource(R.drawable.ic_warning_sign_pxby);
        toast_Layout.setBackgroundResource(R.drawable.custom_error_toast_bg);
        toast.show();
    }

    public void warningToast(String str) {
        if (toast != null) { toast.cancel(); }
        initializeUI();

        toast_Txt.setText(str);
        toast_Txt.setTextColor(context.getResources().getColor(R.color.Black));
        toast_Icon.setImageResource(R.drawable.ic_warning_sign_white_pxby);
        toast_Layout.setBackgroundResource(R.drawable.custom_warning_toast_bg);
        toast.show();
    }


}
