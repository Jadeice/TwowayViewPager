package com.github.jade.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.jade.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SampleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SampleFragment extends Fragment {
    private Bundle mArgs;
    private View view;
    private String mColor = "#000000";
    private int mIndex = 0;

    public SampleFragment() {
        // Required empty public constructor
    }

    public static SampleFragment newInstance(Bundle args) {
        SampleFragment fragment = new SampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mArgs = getArguments();
            mColor = mArgs.getString("color");
            mIndex = mArgs.getInt("index");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sample, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_fragment);
        textView.setTextColor(Color.parseColor(mColor));
        textView.setText("This is No." + mIndex + " fragment.");
        return view;
    }

}
