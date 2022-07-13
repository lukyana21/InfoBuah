package id.lukyana.infobuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    private var title: String = "Detail Informasi"

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_GAMBAR = "extra_gambar"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle(title)

        val tvDataNama: TextView = findViewById(R.id.tv_data_nama)
        val tvDataDetail : TextView = findViewById(R.id.tv_data_detail)
        val tvDataGambar : ImageView = findViewById(R.id.tv_data_gambar)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val gambar= intent.getIntExtra(EXTRA_GAMBAR, 0)
        val textNama = "$name"
        tvDataNama.text = textNama
        val textDetail = "$detail"
        tvDataDetail.text = textDetail
        tvDataGambar.setImageResource(gambar)
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}