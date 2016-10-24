package com.github.jade;

import android.os.Bundle;
import android.support.v4.view.TwowayViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.jade.adapter.SampleAdapter;

public class MainActivity extends AppCompatActivity {
    private TwowayViewPager VPager, HPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VPager = (TwowayViewPager) findViewById(R.id.vertical_pager);
        HPager = (TwowayViewPager) findViewById(R.id.horizontal_pager);
        // 设置ViewPager方向
        VPager.setOrientation(TwowayViewPager.VERTICAL);
        HPager.setOrientation(TwowayViewPager.HORIZONTAL);

        VPager.setAdapter(new SampleAdapter(getSupportFragmentManager(), TwowayViewPager.VERTICAL));
        HPager.setAdapter(new SampleAdapter(getSupportFragmentManager(), TwowayViewPager.HORIZONTAL));

        VPager.addOnPageChangeListener(new VPageChangeListener());
        HPager.addOnPageChangeListener(new HPageChangeListener());

    }

    private class VPageChangeListener implements TwowayViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            Toast.makeText(MainActivity.this, "竖向第" + position + "个被选中。", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }

    private class HPageChangeListener implements TwowayViewPager.OnPageChangeListener {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            Toast.makeText(MainActivity.this, "横向第" + position + "个被选中。", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
