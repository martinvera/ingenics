package pe.com.ingenics.mobile.materialdrower.ui.calculosGuardados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pe.com.ingenics.mobile.materialdrower.R

class CalculosGuradadosFragment : Fragment() {

    private lateinit var calculosGuradadosViewModel: CalculosGuradadosViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        calculosGuradadosViewModel = ViewModelProviders.of(this).get(CalculosGuradadosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_calculosguardados, container, false)
        val textView: TextView = root.findViewById(R.id.text_calculosGuardados)
        calculosGuradadosViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}