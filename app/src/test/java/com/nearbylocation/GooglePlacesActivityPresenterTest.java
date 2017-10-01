package com.nearbylocation;

import com.nearbylocation.googleplaces.GooglePlacesActivityContract;
import com.nearbylocation.googleplaces.GooglePlacesActivityPresenter;
import com.nearbylocation.repository.remote.Repository;
import com.nearbylocation.repository.remote.GeneralCallback;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class GooglePlacesActivityPresenterTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    Repository repository;

    @Mock
    GooglePlacesActivityContract.View view;

    @Mock
    GeneralCallback<String> callback;

    private GooglePlacesActivityPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new GooglePlacesActivityPresenter(view, repository);
    }

    @After
    public void cleanUp() {
        //do nothing
    }

    @Test
    public void shouldHandleLocationFound() {
        //when(repository.getLocationFromGooglePlaces(callback));
//        doNothing().when(repository).getLocationFromGooglePlaces(callback);
//        presenter.loadLocation();
//        verify(view).displayLocation("");
    }

    @Test
    public void shouldHandleNoLocationFound() {
//        when(repository.getLocationFromGooglePlaces(callback));
//        presenter.loadLocation();
//        verify(view).displayInternetError();
    }

}