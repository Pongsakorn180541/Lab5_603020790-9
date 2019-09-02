package com.example.lab5lntent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_secon.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon)

        var data =intent.extras
        var newStudent =data?.getParcelable<Student>("stdData")
        idText.text="Student ID : ${newStudent?.id}"
        nameText.text="Student Name : ${newStudent?.name}"
        ageText.text="Student Age : ${newStudent?.age}"

    }
    fun onClickClose(v: View){
        finish()
    }
}
