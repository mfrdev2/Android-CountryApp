package com.mfrdev.countriesapp.di;

import com.mfrdev.countriesapp.model.CountriesService;
import com.mfrdev.countriesapp.model.ProfileService;
import com.mfrdev.countriesapp.viewmodel.ListViewModel;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = {RetrofitModule.class,ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);
    void inject(ProfileService service);
    void inject(ListViewModel viewModel);
}
