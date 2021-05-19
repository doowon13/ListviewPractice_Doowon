package com.pluto.listviewpractice_doowon.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.pluto.listviewpractice_doowon.datas.Students

class StudentAdapter(
    val mContext : Context,
    val resID : Int,
    val mList : ArrayList<Students>) : ArrayAdapter<Students>(mContext, resID, mList) {
}