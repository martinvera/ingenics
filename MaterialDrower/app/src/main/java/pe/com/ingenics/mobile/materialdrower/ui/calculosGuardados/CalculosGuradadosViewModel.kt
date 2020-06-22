package pe.com.ingenics.mobile.materialdrower.ui.calculosGuardados

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculosGuradadosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is calculos guradados Fragment"
    }
    val text: LiveData<String> = _text
}