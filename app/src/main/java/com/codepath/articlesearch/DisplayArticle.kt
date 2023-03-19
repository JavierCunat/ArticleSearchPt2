package com.codepath.articlesearch

data class DisplayArticle(
    val headline: String?,
    val abstract: String?,
    val byline: String?,
    val mediaImageUrl: String?
) : java.io.Serializable

//Update DetailsActivity, MainActivity and ArticleAdapter to use our new data class for all UI related tasks