package com.example.pedro.pruebadagger.UI.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.pedro.pruebadagger.APP.base.BaseActivity;
import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.UI.model.Vengadores;
import com.example.pedro.pruebadagger.UI.presenter.MainPresenter;
import com.example.pedro.pruebadagger.UI.presenter.TakeList;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements Button.OnClickListener, TakeList{

    private List<Vengadores> avengerList = new ArrayList<>();
    private CustomAdapter adapter;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bAll = (Button) findViewById(R.id.b_All);
        bAll.setOnClickListener(this);
        Button bActive = (Button) findViewById(R.id.b_active);
        bActive.setOnClickListener(this);
        Button bInactive = (Button) findViewById(R.id.b_inactive);
        bInactive.setOnClickListener(this);

        ListView lvAvengers = (ListView) findViewById(R.id.lv_avengers);
        adapter = new CustomAdapter(this, avengerList);
        lvAvengers.setAdapter(adapter);

    }

    @Override
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
