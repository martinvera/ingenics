package pe.com.ingenics.mobile.materialdrower.ui.inicio

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pe.com.ingenics.mobile.materialdrower.R

class InicioFragment : Fragment() {

    private lateinit var inicioViewModel: InicioViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        /*
        inicioViewModel = ViewModelProviders.of(this).get(InicioViewModel::class.java)
        inicioViewModel.text.observe(viewLifecycleOwner, Observer {
            //   textView.text = it
        })

         */

        val root = inflater.inflate(R.layout.fragment_inicio, container, false)
        val cdAgregados: CardView = root.findViewById(R.id.cdAgregados)
        cdAgregados.setOnClickListener {

            val gridContenedor:GridLayout=root.findViewById(R.id.gridContenedor)
            gridContenedor.removeAllViews()



            Toast.makeText(activity,"Agregados", Toast.LENGTH_SHORT).show()
        }

        return root
    }
}