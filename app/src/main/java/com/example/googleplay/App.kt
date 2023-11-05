package com.example.googleplay

import androidx.annotation.DrawableRes

data class App(
    @DrawableRes val image : Int,
               val name : String ,
               val rank: String
)