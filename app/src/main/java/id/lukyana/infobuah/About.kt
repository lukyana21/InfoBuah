package id.lukyana.infobuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class About : AppCompatActivity() {
    private var title: String = "Halaman Profil"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}