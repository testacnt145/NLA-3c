package com.nearbylocation.googleplaces;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.nearbylocation.app.App;
import com.nearbylocation.R;
import com.nearbylocation.googleplaces.adapter.GooglePlacesAdapter;
import com.nearbylocation.repository.remote.Repository;
import com.nearbylocation.repository.remote.model.foursquare.Venue;
import com.nearbylocation.repository.remote.model.googleplaces.Result;

import java.util.List;
import javax.inject.Inject;

public class GooglePlacesActivity extends AppCompatActivity implements GooglePlacesActivityContract.View {

    @Inject
    Repository repository;
    GooglePlacesActivityPresenter presenter;

    private RecyclerView recyclerView;
    List<Result> items;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_places);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_google_places);
        setSupportActionBar(toolbar);

        ((App)getApplication()).getAppComponent().inject(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_google_places);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar_google_places);

        GooglePlacesActivityContract.View googlePlacesActivityView = this;
        presenter = new GooglePlacesActivityPresenter(googlePlacesActivityView, repository);
        presenter.loadLocation();
    }


    @Override
    public void displayLocation(List<Result> venues) {
        progressBar.setVisibility(View.GONE);
        items = venues;
        RecyclerView.Adapter mAdapter = new GooglePlacesAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public void displayInternetError() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, R.string.network_not_available, Toast.LENGTH_SHORT).show();
    }

    //______________________________________________________________________________________________ LIFECYCLE
    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unsubscribe();
    }
}
