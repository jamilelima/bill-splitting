package dev.jamile.ui

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AddPeopleAdapter(private val dataset: Array<Pair<String, String>>) : RecyclerView.Adapter<AddPeopleAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddPeopleAdapter.ViewHolder {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AddPeopleAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    inner class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}