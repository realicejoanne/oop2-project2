package com.shofi.uascihuy;


import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment5Pengobatan extends Fragment {

    public Fragment5Pengobatan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment5_pengobatan, container,
                false);

        TextView pengobatan = rootView.findViewById(R.id.pengobatan);
        final RelativeLayout rl1 = rootView.findViewById(R.id.rl_operasi);


        String text = "Pengobatan yang dapat dilakukan: pembedahan, kemoterapi, radioterapi";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {

                View popupView = LayoutInflater.from(getActivity()).inflate(R.layout.popupoperasi, null);
                final PopupWindow popupWindow = new PopupWindow(popupView, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);


                // Set an elevation value for popup window
                // Call requires API level 21
                if(Build.VERSION.SDK_INT>=21){
                    popupWindow.setElevation(5.0f);
                }

                ImageButton closeButton = (ImageButton) rootView.findViewById(R.id.buttonClose);

                // Set a click listener for the popup window close button
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Dismiss the popup window
                        popupWindow.dismiss();
                    }
                });
                popupWindow.showAtLocation(rl1, Gravity.CENTER,0,0);
            }
        };

        ss.setSpan(clickableSpan1, 33, 43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        pengobatan.setText(ss);
        pengobatan.setMovementMethod(LinkMovementMethod.getInstance());


        return rootView;
    }
}