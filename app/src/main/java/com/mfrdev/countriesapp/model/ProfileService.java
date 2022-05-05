package com.mfrdev.countriesapp.model;

import com.mfrdev.countriesapp.di.DaggerApiComponent;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class ProfileService {

    private static ProfileService instance;

    @Inject
    public ProfileApi api;

    private ProfileService() {
        DaggerApiComponent.create().inject(this);
    }

    public static ProfileService getInstance() {
        if(instance == null) {
            instance = new ProfileService();
        }
        return instance;
    }

    public Single<List<CountryModel>> getCountries() {
        return api.getCountries();
    }
}
