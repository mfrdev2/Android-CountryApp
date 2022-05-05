package com.mfrdev.countriesapp.di;

import com.mfrdev.countriesapp.model.CountriesApi;
import com.mfrdev.countriesapp.model.CountriesService;
import com.mfrdev.countriesapp.model.ProfileApi;
import com.mfrdev.countriesapp.model.ProfileService;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {

    @Singleton
    @Provides
    public CountriesApi provideCountriesApi(@Named("retrofit") Retrofit retrofit) {
        return retrofit
                .create(CountriesApi.class);
    }

    @Singleton
    @Provides
    public ProfileApi provideProfileApi(@Named("retrofit2") Retrofit retrofit) {
        return retrofit
                .create(ProfileApi.class);
    }

    @Provides
    public CountriesService provideCountriesService() {
        return CountriesService.getInstance();
    }


    @Provides
    public ProfileService provideProfileService() {
        return ProfileService.getInstance();
    }
}
