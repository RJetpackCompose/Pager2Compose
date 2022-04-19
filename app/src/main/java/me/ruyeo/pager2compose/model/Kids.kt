package me.ruyeo.pager2compose.model

import me.ruyeo.pager2compose.R

data class Kids(
    val title: String,
    val rating: Float,
    val desc: String,
    val imgUri: Int
)

val kidsList = listOf(
    Kids(
        title = "Something",
        rating = 4.0f,
        desc = "Something Something Something",
        imgUri = R.drawable.ic_launcher_background
    ),
    Kids(
        title = "Something",
        rating = 4.0f,
        desc = "Something Something Something",
        imgUri = R.drawable.ic_launcher_background
    ),
    Kids(
        title = "Something",
        rating = 4.0f,
        desc = "Something Something Something",
        imgUri = R.drawable.ic_launcher_background
    )
)