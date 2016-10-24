package com.github.jade.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.TwowayFragmentStatePagerAdapter;
import android.support.v4.view.TwowayViewPager;

import com.github.jade.fragment.SampleFragment;

/**
 * Created by Jade on 2016/10/24.
 */

public class SampleAdapter extends TwowayFragmentStatePagerAdapter {
    private final int mOrientation;

    public SampleAdapter(FragmentManager fm, int orientation) {
        super(fm);
        this.mOrientation = orientation;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        args.putInt("index", position);
        if (mOrientation == TwowayViewPager.HORIZONTAL) {
            args.putString("color", "#FF0000");
        } else {
            args.putString("color", "#00FF00");
        }
        return SampleFragment.newInstance(args);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
