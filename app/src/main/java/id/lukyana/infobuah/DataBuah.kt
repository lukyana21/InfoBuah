package id.lukyana.infobuah

object DataBuah {
    private val namaBuah = arrayOf("Anggur",
            "Apel",
            "Durian",
            "Jeruk",
            "Melon",
            "Naga",
            "Pir",
            "Pisang",
            "Salak",
            "Semangka")

    private val detailBuah = arrayOf("Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus anggur dan kismis, atau dimakan langsung. Buah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme tubuh, serta mencegah terbentuknya sel kanker dan berbagai penyakit lainnya.",
            "Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulitnya berwarna hijau atau kuning. kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji didalamnya.",
            "Durian adalah nama tumbuhan tropis yag berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. sebutan populernya adalah raja dari segala buah. Durian adalah buah yang kontroversial. meskipun banyak orang yang menyukainya, tetapi sebagiannya kurang menyukai aromanya.",
            "Jeruk atau limau adalah semua tumbuhan berbungan anggota genus Citrus dari famili Rutaceae (suku jeruk-jerukan). Anggitanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak diantara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.",
            "Melon merupakan nama buah sekaligus tanaman yang menghasilkannya yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. Bagian yang dimakan adalah daging buah (mesokarp). Teksturnya lunak, berwarna putih sampai merah, tergantung kultivarnya.",
            "Buah naga adalah buah dari beberapa jenis kaktus dari genus Hylocereus dan Selenicereus. Buah ini berasal dari Meksiko, Amerika Tengah dan Amerika Selatan namun sekarang juga dibudidayakan di negara-negara Asia seperti taiwan, Vietnam, Filipina, Indonesia dan malaysia. Buah ini juga dapat ditemukan di Okinawa, Israel, Australia Utara dan Tiongkok selatan. Hylocereus hanya mekar pada malam hari.",
            "Pir adalah pohon yang berasal dari daerah beriklim tropis di Eropa barat, Adia dan Afrika Utara. Pohon berketinggian sedang, bisa mencapai 10-17 meter tapi sebagian spesies merupakan pohon yang pendek yang memiliki daun yang rimbun. Daun berselang-seling, berbentuk lonjong lebar tapi bisa juga berbentuk membujur panjang (lanceolate) yang langsing.",
            "Pisang adalah nama umum yang diberikan pada tumbuhan terna berukuran besar dengan daun memanjang dan besar yang tumbuh langsung dari bagian tangkai. batang pisang bersifat lunak karena terbentuk dari lapisan pelepah yang lunak dan panjang. Batanag yang agak keras berada di bagian permukaan tanah. Pisang memiliki daun bertangkau yang berpencar dan mudah robek dengan bagian batang yang meruncing.",
            "Salak adalah sejenis palma dengan buah yang biasa dimakan. dalam bahasa Inggris disebut salak atau snake fruit, sementara nama ilmiahnya adalah Sallaca zalacca. BUah ini disebut snake fruit karena kulitnya mirip dengan sisik ular. Palma berbentuk perdu hampir tidak berbatang, berduri banyak, melata dan beranak banyak, tumbuh menjadi rumpun yang rapat dan kuat.",
            "Semangka adaah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan. semangka biasa dipanen buahnya untuk dimakan segar atau jus. Biji semangka  yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci. sebagaimana anggota suku ketimun-ketimunan lainnya, habitus tanaman ini merambat, tetapi dia tidak dapat membentuk akar adventif dan tidak dapat memanjat.")

    private val gambarBuah = intArrayOf(R.drawable.anggur,
            R.drawable.apel,
            R.drawable.durian,
            R.drawable.jeruk,
            R.drawable.melon,
            R.drawable.naga,
            R.drawable.pir,
            R.drawable.pisang,
            R.drawable.salak,
            R.drawable.semangka)

    val listData: ArrayList<Buah>
    get() {
        val list = arrayListOf<Buah>()
        for (position in namaBuah.indices){
            val buah = Buah()
            buah.name = namaBuah[position]
            buah.detail = detailBuah[position]
            buah.photo = gambarBuah[position]
            list.add(buah)
        }
        return list
    }
}