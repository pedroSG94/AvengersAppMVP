package com.example.pedro.pruebadagger.ui.description.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pedro.pruebadagger.R;
import com.example.pedro.pruebadagger.app.base.BaseActivity;
import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.domain.model.IronMan;
import com.example.pedro.pruebadagger.ui.description.presenter.DescriptionPresenter;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

public class DescriptionActivity extends BaseActivity implements DescriptionView {

    @Inject
    DescriptionPresenter descriptionPresenter;

    @Bind(R.id.imageView_description) ImageView imageView;
    @Bind(R.id.tv_character_description) TextView tvCharacter;
    @Bind(R.id.tv_name_description) TextView tvName;
    @Bind(R.id.tv_description) TextView tvDescription;
    private IronMan ironMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        descriptionPresenter.chargeIronMan();
    }

    @Override
    public BasePresenter bindPresenter() {
        return descriptionPresenter;
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_description;
    }

    @OnClick(R.id.imageView_description)
    @Override
    public void onClick(View v) {
        descriptionPresenter.changeImage(ironMan);
    }

    @Override
    public void chargeData(IronMan ironMan){
        this.ironMan = ironMan;
        Picasso.with(getApplicationContext()).load(ironMan.getImages().get(0).image).into(imageView);
        tvCharacter.setText(ironMan.getCharacter());
        tvName.setText(ironMan.getName());
        tvDescription.setText(ironMan.getDescription());
    }

    @Override
    public void changeImage(String image) {
        Picasso.with(getApplicationContext()).load(image).into(imageView);
    }
}
