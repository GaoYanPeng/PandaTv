package com.gaoyanpeng.pandatv.game;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.gaoyanpeng.pandatv.R;
import com.gaoyanpeng.pandatv.api.Api;
import com.gaoyanpeng.pandatv.base.BaseFragment;
import com.gaoyanpeng.pandatv.networkdata.NetTool;
import com.gaoyanpeng.pandatv.networkdata.onHttpCallBack;

/**游戏
 * Created by 高研鹏 on 2016/12/17.
 */

public class GameFm extends BaseFragment{
    private RecyclerView mGameRecyclerView;
    private GameAdapter mGameAdapter;

    @Override
    protected int initLayout() {
        return R.layout.fm_game;
    }

    @Override
    protected void initView() {
//        绑定ID
        mGameRecyclerView = getFindView(R.id.game_ryl);
        //初始化适配器
        mGameAdapter = new GameAdapter(getContext());
        //RecyclerView 管理器
        GridLayoutManager manager = new GridLayoutManager(getContext(),3);
        //RecyclerView 设置管理器
        mGameRecyclerView.setLayoutManager(manager);
    }

    @Override
    protected void initData() {
        //Ok
        NetTool.getInstance().startRequest(Api.CAME, GameBean.class, new onHttpCallBack<GameBean>() {
            @Override
            public void onSuccess(GameBean response) {
                mGameAdapter.setGameBean(response);
                mGameRecyclerView.setAdapter(mGameAdapter);
            }
            @Override
            public void onError(Throwable e) {

            }
        });

    }
}
