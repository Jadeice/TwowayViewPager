# 双向滚动的ViewPager
TwowayViewPager can be used on Mobile and TV

简单使用
   
    <android.support.v4.view.TwowayViewPager
    ....
    />
    
    VPager = (TwowayViewPager) findViewById(R.id.vertical_pager);
    HPager = (TwowayViewPager) findViewById(R.id.horizontal_pager);
    // 设置ViewPager方向
    VPager.setOrientation(TwowayViewPager.VERTICAL);    // 竖向
    HPager.setOrientation(TwowayViewPager.HORIZONTAL);  // 横向

Adapter

    public class SampleAdapter extends TwowayFragmentStatePagerAdapter{.....}
