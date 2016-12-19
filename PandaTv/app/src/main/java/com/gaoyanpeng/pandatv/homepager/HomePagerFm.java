package com.gaoyanpeng.pandatv.homepager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.gaoyanpeng.pandatv.R;
import com.gaoyanpeng.pandatv.base.BaseFragment;

/**首页
 * Created by 高研鹏 on 2016/12/17.
 */

public class HomePagerFm extends BaseFragment {
    @Override
    protected int initLayout() {
        return R.layout.fm_home_pager;
    }

    @Override
    protected void initView() {
        TabLayout mTab = getFindView(R.id.home_tab);
        ViewPager mVp = getFindView(R.id.home_vp);


    }

    @Override
    protected void initData() {

    }
}
