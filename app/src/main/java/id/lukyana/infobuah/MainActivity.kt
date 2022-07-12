package id.lukyana.infobuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBuah: RecyclerView
    private var list: ArrayList<Buah> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBuah = findViewById(R.id.rv_buah)
        rvBuah.setHasFixedSize(true)

        list.addAll(DataBuah.listData)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rvBuah.layoutManager = LinearLayoutManager(this)
        val listBuahAdapter = ListBuahAdapter(list)
        rvBuah.adapter = listBuahAdapter
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
            R.id.action_list -> {

            }

            R.id.action_cardview -> {

            }
        }
    }
}