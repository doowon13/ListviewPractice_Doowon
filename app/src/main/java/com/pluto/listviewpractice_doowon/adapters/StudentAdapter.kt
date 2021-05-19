package com.pluto.listviewpractice_doowon.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.pluto.listviewpractice_doowon.R
import com.pluto.listviewpractice_doowon.datas.Students

class StudentAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Students>) : ArrayAdapter<Students>(mContext, resID, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        val studentData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name

        val koreanAge = 2021 - studentData.birthYear + 1

        birthYearTxt.text = "(${koreanAge}세)"

        return row
    }
}