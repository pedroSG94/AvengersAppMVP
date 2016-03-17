package com.example.pedro.pruebadagger.ui.main.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.ui.main.adapter.CustomAdapter;
import com.example.pedro.pruebadagger.data.model.Vengadores;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Necesario un presenter por activity
 */
public class MainActivity extends BaseActivity implements MainView {

    private List<Vengadores> avengerList = new ArrayList<>();
    private CustomAdapter adapter;

    @Inject
    MainPresenter presenter;

    @Bind(R.id.lv_avengers) ListView lvAvengers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectView(R.layout.activity_main);

        adapter = new CustomAdapter(this, avengerList);
        lvAvengers.setAdapter(adapter);
    }

    @OnClick({R.id.b_All, R.id.b_active, R.id.b_inactive})
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_All:
                presenter.onClickAll(this);
                break;
            case R.id.b_active:
                presenter.onClickActive(this);
                break;
            case R.id.b_inactive:
                presenter.onClickInactive(this);
                break;
        }
    }

    @Override
    public void takeAllListAvengers(final List<Vengadores> avengersList) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                avengerList.clear();
                for (Vengadores vengadores : avengersList) {
                    avengerList.add(vengadores);
                }
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void takeActiveListAvengers(final List<Vengadores> avengersListActive) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                avengerList.clear();
                for (Vengadores vengadores : avengersListActive) {
                    avengerList.add(vengadores);
                }
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void takeInactiveListAvengers(final List<Vengadores> avengersListInactive) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                avengerList.clear();
                for (Vengadores vengadores : avengersListInactive) {
                    avengerList.add(vengadores);
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
}
