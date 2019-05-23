package com.traning.suriya.coroutinesex.widget

import android.view.View
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.traning.suriya.coroutinesex.R

@EpoxyModelClass(layout = R.layout.item_post)
abstract class SingleNameModel: EpoxyModelWithHolder<SingleNameModel.NameHolder>(){

    @EpoxyAttribute
    var name: String? = ""

    override fun bind(holder: NameHolder) {
        holder.name.text = name
    }

    inner class NameHolder: EpoxyHolder(){

        lateinit var name : TextView

        override fun bindView(itemView: View) {
            name = itemView.findViewById(R.id.textName)
        }

    }
}