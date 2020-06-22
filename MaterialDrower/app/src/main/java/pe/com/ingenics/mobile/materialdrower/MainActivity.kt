package pe.com.ingenics.mobile.materialdrower

import android.os.Bundle
import android.view.Menu
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    //Parte standar en cualquier plantilla de andoroid studio
    //->
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                                                //<-

        // obtiene el objeto de id = "toolbar" que esta en res/layout/app_bar_main.xml
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        //imprime el nombre de la aplicación y que aparezca los 3 puntitos verticales en el extremo derecho de la misma.
        setSupportActionBar(toolbar)

        // obtiene el objeto de id = "fab" que esta en res/layout/app_bar_main.xml
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->     //muestra ele mensaje en la parte inferior
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // obtiene el objeto de id = "drawer_layout" que esta en res/layout/activity_main.xml
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        // obtiene el objeto de id = "nav_view" que esta en res/layout/activity_main.xml
        val navView: NavigationView = findViewById(R.id.nav_view)

        // obtiene el objeto de id = "nav_host_fragment" que esta en res/layout/content_main.xml
        val navController = findNavController(R.id.nav_host_fragment)
        // a su ves "nav_host_fragment" hace referencia de res/navigation/mobile_navigation.xml

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        //, R.id.nav_slideshow  nav_prueba

        appBarConfiguration = AppBarConfiguration(setOf(R.id.nav_inicio, R.id.nav_favoritos, R.id.nav_calculosguardados, R.id.nav_notificaciones), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.

        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}