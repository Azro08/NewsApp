package com.ag_apps.newsapp.article.presenation

sealed interface ArticleAction {
    data class LoadArticle(val articleId: String) : ArticleAction
}