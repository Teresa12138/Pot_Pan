package com.example.ziyang.potpan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by wxx on 2016/5/18.
 */
public class wxx_finalhelp extends Fragment {

    public Button vpbackbutton2;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.wxx_example, container, false);

        Button vpbackbutton2 = (Button)view.findViewById(R.id.vpbackbutton2);
        vpbackbutton2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),wxx_main.class);

                startActivity(i);

            }
        });




        return view;
    }


}
