package pe.com.ingenics.mobile.materialdrower.ui.favoritos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoritosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is favoritos Fragment"
    }
    val text: LiveData<String> = _text
}