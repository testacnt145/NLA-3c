package com.nearbylocation.menu;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.nearbylocation.foursquare.FourSquareActivity;
import com.nearbylocation.googleplaces.GooglePlacesActivity;
import com.nearbylocation.databinding.ActivityMainBinding;
import com.nearbylocation.R;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityContract.View mainActivityView = this;
        presenter = new MainActivityPresenter(mainActivityView);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(presenter);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
    }

    @Override
    public void startFourSquareActivity() {
        startActivity(new Intent(this, FourSquareActivity.class));
    }

    @Override
    public void startGooglePlacesActivity() {
        startActivity(new Intent(this, GooglePlacesActivity.class));
    }
}