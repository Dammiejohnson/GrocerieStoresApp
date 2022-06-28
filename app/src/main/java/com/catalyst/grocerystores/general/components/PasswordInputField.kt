package com.catalyst.grocerystores.general.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.catalyst.grocerystores.R

@Composable
fun PasswordInputField(
    value: String,
    onValueChange: (String) -> Unit, //this will only be triggered when you start typing in this field
    onFocusChange: (FocusState) -> Unit, //this will remain unfocused until onvaluechange changed, this is when it is triggered
    modifier: Modifier,
    headerText: String,
    hasError: Boolean,
    errorMessage: String,
    imeAction: ImeAction = ImeAction.Next,
) {

    val touched = remember {
        mutableStateOf(false)
    }
    val passwordVisible = remember {
        mutableStateOf(false)
    }

    Column(modifier = modifier) {
        OutlinedTextField(
            value = "",
            onValueChange ={
                touched.value = true
                onValueChange(it)
            },
            modifier = Modifier.fillMaxWidth().onFocusChanged {
                if (touched.value) onFocusChange(it)
            },
            label = {
                Text(text = headerText)
            },
            keyboardOptions = KeyboardOptions(

                imeAction = imeAction
            ),
            trailingIcon = {
                IconButton(onClick = {passwordVisible.value= !passwordVisible.value}) {
                    Icon(painter = painterResource(
                        id = if (passwordVisible.value){
                            R.drawable.ic_baseline_visibility_24}
                        else{
                            R.drawable.ic_baseline_visibility_off_24

                        }), contentDescription = "")
                }
            },
            visualTransformation = if (passwordVisible.value){
                VisualTransformation.None
            }else{
                PasswordVisualTransformation()
            },
        )
        if (hasError){
            Text(text = errorMessage)
        }

    }
}