package id.lukyana.infobuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBuah: RecyclerView
    private var list: ArrayList<Buah> = arrayListOf()
    private var title: String = "Daftar Buah"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvBuah = findViewById(R.id.rv_buah)
        rvBuah.setHasFixedSize(true)

        list.addAll(DataBuah.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvBuah.layoutManager = LinearLayoutManager(this)
        val listBuahAdapter = ListBuahAdapter(list)
        rvBuah.adapter = listBuahAdapter

        listBuahAdapter.setOnItemClickCallback(object : ListBuahAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Buah) {
                showSelectedBuah(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when (selectedMode){
            R.id.action_cardview -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showSelectedBuah(buah: Buah) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, buah.name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, buah.detail)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_GAMBAR, buah.photo)
        startActivity(moveWithDataIntent)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}