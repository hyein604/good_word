package com.hyein.goodwords

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<String>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    // p0 = position
    // p1 = convertView
    // p2 = parent
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1

        if (convertView == null){
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item, p2, false)
        }

        val listViewText = convertView?.findViewById<TextView>(R.id.ListViewTextArea)
        listViewText!!.text = List[p0]

        return listViewText!!
    }
}