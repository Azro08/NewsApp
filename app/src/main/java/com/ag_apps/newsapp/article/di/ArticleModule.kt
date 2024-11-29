package com.ag_apps.newsapp.article.di

import com.ag_apps.newsapp.article.presenation.ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val articleModule = module {
    viewModel { ArticleViewModel(get()) }
}