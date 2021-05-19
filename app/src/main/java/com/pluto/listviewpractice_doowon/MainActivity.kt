package com.pluto.listviewpractice_doowon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pluto.listviewpractice_doowon.datas.Students

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Students>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Students("허두원", 1994))
        mStudentList.add(Students("김철수", 1992))
        mStudentList.add(Students("박영희", 1996))
        mStudentList.add(Students("이기영", 1999))
        mStudentList.add(Students("신수진", 1998))
        mStudentList.add(Students("장영수", 1991))
    }
}