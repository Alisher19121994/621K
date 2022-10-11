package com.example.a621k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.a621k.managers.PrefsManager

class MainActivity : AppCompatActivity() {

    lateinit var save: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val editText_age: EditText = findViewById(R.id.editTextDataAge_id)
        val editText_salary: EditText = findViewById(R.id.editTextDataSalary_id)
        val editText_workH: EditText = findViewById(R.id.editTextDataWorkH_id)
        val editText_adayoff: EditText = findViewById(R.id.editTextDataAdayOff_id)

        save = findViewById(R.id.b_1_saveData_id)

        save.setOnClickListener {

            val editA = editText_age.text.toString().trim()
            val editS = editText_salary.text.toString().trim()
            val editW = editText_workH.text.toString().trim()
            val editAD = editText_adayoff.text.toString().trim()

            val user = User()
            user.age = editA.toInt()
            user.salary = editS.toDouble()
            user.workH = editW.toLong()
            user.dayOff = editAD.toBoolean()


            PrefsManager.getInstance(this)?.saveDate(user)
        }

    }
}