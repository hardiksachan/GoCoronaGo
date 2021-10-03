package com.example.gocoronago.tipspage.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gocoronago.tipspage.model.Tip
import com.example.gocoronago.tipspage.model.tipList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class TipsViewModel: ViewModel() {
    private val _tips: MutableStateFlow<List<Tip>> = MutableStateFlow(tipList)
    val tips: StateFlow<List<Tip>> = _tips
}