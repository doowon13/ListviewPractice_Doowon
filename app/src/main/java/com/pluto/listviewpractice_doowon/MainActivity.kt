package com.pluto.listviewpractice_doowon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pluto.listviewpractice_doowon.adapters.StudentAdapter
import com.pluto.listviewpractice_doowon.datas.Students
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Students>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Students("허두원", 1994))
        mStudentList.add(Students("김철수", 1992))
        mStudentList.add(Students("박영희", 1996))
        mStudentList.add(Students("이기영", 1999))
        mStudentList.add(Students("신수진", 1998))
        mStudentList.add(Students("장영수", 1991))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]
            Toast.makeText(this, "${clickedStudent.name}이 클릭 됨", Toast.LENGTH_SHORT).show()
        }

        studentListView.setOnItemLongClickListener { parent, view, position, id ->

            mStudentList.removeAt(position)

            mAdapter.notifyDataSetChanged()

            return@setOnItemLongClickListener true
        }
    }
}