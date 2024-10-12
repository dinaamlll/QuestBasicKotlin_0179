package com.example.questbasickotlin_0179



// Data Class
// Data Class adalah class yang digunakan untuk menyimpan data
// Data Class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), dan toString()
// Data Class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan


data class DataClass(
    val id: Int,
    var email: String
)


fun main () {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

//Fungsi Equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) // false

}