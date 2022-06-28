package com.catalyst.grocerystores.auth

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.catalyst.grocerystores.auth.state.AuthState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor() : ViewModel()
