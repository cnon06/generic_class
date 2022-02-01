package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle




class diziYaz<Tip> (var dizi:Array<Tip>)

{

    fun dizi_yazdir()
    {
        for(i in dizi) println(i)
    }

}






class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var integerDizi = arrayOf(4,5,6,67,89,47)
        var stringDizi= arrayOf("er","yu","n","kl")

        println(".............. Integer Dizi Yazdır ..............")

        var id1 = diziYaz(integerDizi)
        id1.dizi_yazdir()

        println(".............. String Dizi Yazdır ..............")

        var sd1 = diziYaz(stringDizi)
        sd1.dizi_yazdir()



    }
}