package com.example.latestrepositories.view.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.latestrepositories.model.entity.Repositories
import android.graphics.drawable.Drawable
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.GradientDrawable

import android.graphics.drawable.ShapeDrawable
import androidx.appcompat.widget.AppCompatImageView
import com.example.latestrepositories.R

class RepoListViewHolder(v: View):RecyclerView.ViewHolder(v) {
    val title = v.findViewById<TextView>(com.example.latestrepositories.R.id.title)
    val desc = v.findViewById<TextView>(R.id.desc)
    val lang = v.findViewById<TextView>(R.id.lang)
    val starCount = v.findViewById<TextView>(R.id.star_count)
    val langColor = v.findViewById<AppCompatImageView>(R.id.circle_icon)

    fun bind(obj: Repositories, position: Int){
        title.text = obj.name
        desc.text = obj.description
        lang.text = obj.language
        starCount.text = obj.stars.toString()
        val drawable = itemView.context.resources.getDrawable(R.drawable.circle) as GradientDrawable
        drawable.setColor(Color.parseColor(obj.languageColor))
        langColor.setImageDrawable(drawable)
//        langColor.background.setColorFilter(Color.parseColor("#343434"), PorterDuff.Mode.SRC_ATOP)
//        val background: Drawable = langColor.background
//        val shapeDrawable = background as ShapeDrawable
//        shapeDrawable.paint.color = Color.parseColor(obj.languageColor)
    }
}