package com.codepath.articlesearch

import AppDatabase
import android.app.Application

class ArticleApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}