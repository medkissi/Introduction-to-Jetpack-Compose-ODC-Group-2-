package com.medkissi.jetpackcompose

import androidx.annotation.DrawableRes

class President (
    val id:Int,
    val nom:String,
    val pays:String,
    @DrawableRes val photo:Int,
    val biographie:String
)

val presidents=  mutableListOf<President>(
    President(id = 1, nom="Mamamdi Doumbouya", pays = "Guinée Conakry",photo= R.drawable.mamadi_doumbouya,
        biographie ="Mamadi Doumbouya (Écouter), né le 4 mars 1980 à Bananköröda dans la ville de Kankan, est un militaire et homme d'État guinéen.\n" +
                "\n" +
                "Il est nommé commandant du Groupement des forces spéciales de l’armée guinéenne en 2018 et obtient le grade de colonel en 2020.\n" +
                "\n" +
                "En 2021, il conduibiographiet un coup d'État contre le président Alpha Condé et devient président du Comité national du rassemblement pour le développement (CNRD) et président de la Transition. " ),
    President(id = 2, nom="Nana Akufo-Addo", pays = "Ghana",photo= R.drawable.nana, biographie = ""),
    President(id = 3, nom="Alassane Ouattara", pays = "Côte d'ivoire",photo= R.drawable.ouattara,""),
    President(id = 4, nom="Macky Sall", pays = "Sénégal",photo= R.drawable.macky_sall,""),
    President(id = 5, nom="Adama Barro", pays = "Gambie",photo= R.drawable.adama_barro,""),
    President(id = 6, nom="Ibrahima Traore", pays = "Burkina Fasso",photo= R.drawable.ibrahima_traore,""),
    President(id = 7, nom="Assimi Goita", pays = "Mali",photo= R.drawable.assimi_goita,""),
    President(id = 8, nom="Oumar Cissoko Embalo", pays = "Guinée Bissau",photo= R.drawable.emballo,""),
)
