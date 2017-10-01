package com.nearbylocation.foursquare;

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
import com.nearbylocation.foursquare.adapter.FourSquareAdapter;
import com.nearbylocation.repository.remote.Repository;
import com.nearbylocation.repository.remote.model.foursquare.Venue;

import java.util.List;
import javax.inject.Inject;

public class FourSquareActivity extends AppCompatActivity implements FourSquareActivityContract.View {

    @Inject
    Repository repository;
    FourSquareActivityPresenter presenter;

    private RecyclerView recyclerView;
    List<Venue> items;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_square);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_four_square);
        setSupportActionBar(toolbar);

        ((App)getApplication()).getAppComponent().inject(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_four_square);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar_four_square);

        FourSquareActivityContract.View fourSquareActivityView = this;
        presenter = new FourSquareActivityPresenter(fourSquareActivityView, repository);
        presenter.loadLocation();
    }


    @Override
    public void displayLocation(List<Venue> venues) {
        progressBar.setVisibility(View.GONE);
        items = venues;
        RecyclerView.Adapter mAdapter = new FourSquareAdapter(items);
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
