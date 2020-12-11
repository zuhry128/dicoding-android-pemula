package com.example.mytransitionapp

object FoodData {
    private val foodNames = arrayOf(
        "Pancake",
        "Red velvet",
        "Spaghetti",
        "Baguette",
        "Bacon",
        "Steak",
        "Hamburger",
        "Sushi",
        "Pizza",
        "Tempura"
    )

    private val foodDetails = arrayOf(
            "Panekuk adalah kue dadar yang dibuat dari terigu, telur ayam, gula dan susu. Bahan-bahan dicampur dengan air membentuk adonan kental yang digoreng di atas wajan datar yang diolesi sedikit minyak. Setelah matang, panekuk bisa dihidangkan sewaktu masih hangat atau setelah dingin.",
            "Bolu red velvet atau kue red velvet biasanya adalah bolu lapis coklat berwarna merah, coklat kemerahan, atau kemerahan, yang dilapisi dengan keju krim putih.",
            "Kue Black Forest adalah jenis kue khas Jerman yang paling dikenal di dunia. Kue ini terbuat dari bolu coklat yang dilapisi krim segar, serutan coklat dan ceri yang direndam dalam Kirschwasser, schnapps ceri jernih khas daerah Schwarzwälder.",
            "Baguette (bəˈɡɛt) adalah roti yang biasanya berbentuk panjang dan ukurannya yang besar, dan memiliki tekstur sangat renyah ketika dimakan. Diameter standar baguette kira-kira 5 atau 6 cm, tetapi panjangnya dapat mencapai 1 m. Roti ini rata-rata memiliki berat 250 gram. Tekstur luarnya keras dan renyah, tetapi bagian dalamnya putih dan lembut.",
            "Bakon adalah produk daging yang terbuat dari babi. Bakon dibuat dari beberapa potongan daging. Hal ini biasanya terbuat dari samping dan belakang pemotongan daging babi, kecuali di Amerika Serikat, di mana ia hampir selalu dibuat dari perut babi (biasanya disebut sebagai \"bergaris-garis\", \"lemak\", atau \"gaya Amerika\" di luar AS dan Kanada). Sisi dipotong memiliki lebih banyak daging dan sedikit lemak dari perut.",
            "Steik adalah sepotong besar daging, biasanya daging sapi. Daging merah, dada ayam dan ikan sering kali dipotong menjadi steik. Kebanyakan steik dipotong tegak lurus dengan serat otot, menambah kelegitan daging. Steik biasanya dimasak dengan dipanggang, meskipun dapat digoreng atau di-broil.",
            "Hamburger adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombay. Sebagai sausnya, burger diberi berbagai jenis saus seperti mayones, saus tomat dan sambal serta mustard.",
            "Susyi atau sushi adalah makanan Jepang yang terdiri dari nasi yang dibentuk bersama lauk berupa makanan laut, daging, sayuran mentah atau sudah dimasak. Nasi susyi mempunyai rasa masam yang lembut karena dibumbui campuran cuka beras, garam, dan gula.",
            "Piza adalah hidangan gurih dari Italia sejenis adonan bundar dan pipih, yang dipanggang di oven dan biasanya dilumuri saus tomat serta keju dengan bahan makanan tambahan lainnya yang bisa dipilih. Keju yang dipakai biasanya mozzarella atau \"keju pizza\", bisa juga keju parmesan dan beberapa keju lainnya.",
            "Tempura atau tenpura adalah makanan Jepang berupa makanan laut, sayur-sayuran, atau tanaman liar yang dicelup ke dalam adonan berupa tepung terigu dan kuning telur yang diencerkan dengan air bersuhu dingin lalu digoreng dengan minyak goreng yang banyak hingga berwarna kuning muda."
    )

    private val foodsImages = intArrayOf(
        R.drawable.pancake,
        R.drawable.red_velvet,
        R.drawable.spaghetti,
        R.drawable.baguette,
        R.drawable.bacon,
        R.drawable.steak,
        R.drawable.hamburger,
        R.drawable.sushi,
        R.drawable.pizza,
        R.drawable.tempura
    )


    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val hero = Food()
                hero.name = foodNames[position]
                hero.detail = foodDetails[position]
                hero.photo = foodsImages[position]
                list.add(hero)
            }
            return list
        }
}