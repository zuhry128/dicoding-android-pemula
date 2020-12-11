package com.example.mytransitionapp

object AboutMeData {

    private val userName = arrayOf(
            "Muhammad rofif Az-zuhry"
    )
    private val userEmail = arrayOf(
            "muhammadazzuhry03@gmail.com"
    )

    private val userPhoto = arrayOf(
            R.drawable.profile_picture
    )

    val aboutData: ArrayList<About>
        get() {
            val aboutData = arrayListOf<About>()
            for (position in userName.indices) {
                val about = About()
                about.userName = userName[position]
                about.userEmail = userEmail[position]
                about.userPhoto = userPhoto[position]
                aboutData.add(about)
            }
            return aboutData
        }

}