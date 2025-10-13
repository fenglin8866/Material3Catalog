package androidx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.catalog.library.Material3CatalogApp
import androidx.compose.material3.demos.Material3Demo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //Material3CatalogApp(null)
            Material3Demo()
        }
    }
}