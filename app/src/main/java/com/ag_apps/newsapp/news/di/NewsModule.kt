package com.ag_apps.newsapp.news.di

import com.ag_apps.newsapp.news.prensentation.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val newsModule = module {
    viewModel { NewsViewModel(get()) }
}