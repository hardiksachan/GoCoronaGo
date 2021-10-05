package com.example.gocoronago.preferences.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.gocoronago.base.IDispatcherProvider
import com.example.gocoronago.preferences.domain.constants.ColorTheme
import com.example.gocoronago.preferences.domain.constants.Language
import com.example.gocoronago.preferences.domain.repository.IPreferencesRepository

val Context.preferencesDataStore: DataStore<Preferences>
        by preferencesDataStore(name = "user_prefs")

class PreferencesRepositoryImpl(
    preferencesDataStore: DataStore<Preferences>,
    dispatcherProvider: IDispatcherProvider
) : IPreferencesRepository {

    override val userPreferencesFlow = TODO()

    override suspend fun updateLanguage(language: Language) {
        TODO("Not yet implemented")
    }

    override suspend fun updateCountry(country: String) {
        TODO("Not yet implemented")
    }

    override suspend fun updateTheme(theme: ColorTheme) {
        TODO("Not yet implemented")
    }

    private object PreferencesKeys {
        val LANGUAGE = stringPreferencesKey("language")
        val COUNTRY = stringPreferencesKey("country")
        val THEME = stringPreferencesKey("theme")
    }
}