package com.example.logonrm.minhabiblioteca;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by logonrm on 02/08/2017.
 */

public class CustomToast {

    public void showToast(Context context, String mensagem){
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customToastView = layoutInflater.inflate(R.layout.layout_toast,null);

        Toast toast = new Toast(context);
        toast.setView(customToastView);
        TextView textView = (TextView) customToastView.findViewById(R.id.tvTexto);
        textView.setText(mensagem);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0,0);
        toast.show();
    }
}
