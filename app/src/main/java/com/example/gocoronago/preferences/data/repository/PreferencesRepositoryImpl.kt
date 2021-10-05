package com.example.gocoronago.preferences.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.gocoronago.base.IDispatcherProvider
import com.example.gocoronago.preferences.domain.constants.ColorTheme
import com.example.gocoronago.preferences.domain.constants.Language
import com.example.gocoronago.preferences.domain.entity.UserPreferences
import com.example.gocoronago.preferences.domain.repository.IPreferencesRepository
import kotlinx.coroutines.flow.Flow


val Context.preferencesDataStore: DataStore<Preferences>
        by preferencesDataStore(name = "user_prefs")

class PreferencesRepositoryImpl(
    preferencesDataStore: DataStore<Preferences>,
    dispatcherProvider: IDispatcherProvider
) : IPreferencesRepository {
    override val filterPreferencesFlow: Flow<UserPreferences>
        get() = TODO("Not yet implemented")

    override suspend fun updateLanguage(language: Language) {
        TODO("Not yet implemented")
    }

    override suspend fun updateCountry(country: String) {
        TODO("Not yet implemented")
    }

    override suspend fun updateTheme(theme: ColorTheme) {
        TODO("Not yet implemented")
    }
}