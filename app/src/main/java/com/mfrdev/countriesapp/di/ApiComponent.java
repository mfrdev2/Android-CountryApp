package com.mfrdev.countriesapp.di;

import com.mfrdev.countriesapp.model.CountriesService;
import com.mfrdev.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
