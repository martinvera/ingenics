package pe.com.ingenics.mobile.materialdrower.ui.sugerencias

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.com.ingenics.mobile.materialdrower.R

class SugerenciasFragment : Fragment() {

    companion object {
        fun newInstance() =
            SugerenciasFragment()
    }

    private lateinit var viewModel: SugerenciasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sugerencias_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SugerenciasViewModel::class.java)
        // TODO: Use the ViewModel
    }

}