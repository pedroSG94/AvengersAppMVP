package com.example.pedro.pruebadagger.ui.main.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.ui.main.adapter.CustomAdapter;
import com.example.pedro.pruebadagger.domain.model.Avengers;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Necesario un mainPresenter por activity
 */
public class MainActivity extends BaseActivity implements MainView, ListView.OnItemClickListener {

    private List<Avengers> avengerList = new ArrayList<>();
    private CustomAdapter adapter;

    @Inject
    MainPresenter mainPresenter;

    @Bind(R.id.lv_avengers) ListView lvAvengers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPresenter.onClickAll();
        adapter = new CustomAdapter(this, avengerList);
        lvAvengers.setAdapter(adapter);
        lvAvengers.setOnItemClickListener(this);
    }

    @Override
    public BasePresenter bindPresenter() {
        return mainPresenter;
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_main;
    }

    @OnClick({R.id.b_All, R.id.b_active, R.id.b_inactive})
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_All:
                mainPresenter.onClickAll();
                break;
            case R.id.b_active:
                mainPresenter.onClickActive();
                break;
            case R.id.b_inactive:
                mainPresenter.onClickInactive();
                break;
        }
    }
    @Override
    public void takeAllListAvengers(final List<Avengers> avengersList) {
        avengerList.clear();
        for (Avengers vengadores : avengersList) {
            avengerList.add(vengadores);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void takeActiveListAvengers(final List<Avengers> avengersListActive) {
        avengerList.clear();
        for (Avengers vengadores : avengersListActive) {
            avengerList.add(vengadores);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void takeInactiveListAvengers(final List<Avengers> avengersListInactive) {
        avengerList.clear();
        for (Avengers vengadores : avengersListInactive) {
            avengerList.add(vengadores);
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mainPresenter.onItemClickListView();
    }
}
