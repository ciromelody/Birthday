package org.altervista.ultimaprovaprimadi.ciromelody.birthday

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var date:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val edittext=findViewById<EditText>(R.id.editText)
        tv_autore.text="Corso su KOTLIN di MATTIA FERRIGUTTI su Udemy"
        button.setOnClickListener {
            date= editText.text.toString()
            if (date.isNotEmpty()){
                     result.text=caluculate_birthday(date.toInt()).toString()}
        }
    }
    fun caluculate_birthday(birthday:Int):Int{
        val year=Calendar.getInstance().get(Calendar.YEAR)
        Log.d("BIRT",year.toString())
        return year-birthday
    }
}


