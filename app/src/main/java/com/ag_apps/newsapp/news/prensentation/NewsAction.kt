package com.ag_apps.newsapp.news.prensentation


sealed interface NewsAction {
    data object Paginate: NewsAction
}