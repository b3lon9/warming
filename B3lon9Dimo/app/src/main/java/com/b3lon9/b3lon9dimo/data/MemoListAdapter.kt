package com.b3lon9.b3lon9dimo.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.b3lon9.b3lon9dimo.R
import kotlinx.android.synthetic.main.item_memo.view.*
import java.text.SimpleDateFormat

class MemoListAdapter(private val list:MutableList<MemoData>) :
    RecyclerView.Adapter<ItemViewHolder>(){
    private val dateFormat = SimpleDateFormat("MM/dd HH:mm")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // item memo를 불러옴
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_memo, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        if (list[position].title.isNotEmpty()) {
            holder.containerView.titleView.visibility= View.VISIBLE
            holder.containerView.titleView.text = list[position].title
        } else {
            holder.containerView.titleView.visibility = View.GONE
        }

        holder.containerView.summaryView.text = list[position].summary
        holder.containerView.dateView.text = dateFormat.format(list[position].createAt)
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}