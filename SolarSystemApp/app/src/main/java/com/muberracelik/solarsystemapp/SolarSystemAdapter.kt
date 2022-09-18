package com.muberracelik.solarsystemapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_main.view.*

class SolarSystemAdapter(private val marsList: List<SolarSystemModel>) :RecyclerView.Adapter<SolarSystemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view  = LayoutInflater.from(parent.context).inflate(R.layout.recycler_solar_system,parent,false)

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return marsList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("Response", "List Count :${marsList.size} ")

        return holder.bind(marsList[position])

    }
    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {


        var imageView = itemView.findViewById<ImageView>(R.id.imgSrc)
        var priceText = itemView.findViewById<TextView>(R.id.price)
        var idText = itemView.findViewById<TextView>(R.id.id)
        var typeText = itemView.findViewById<TextView>(R.id.type)
        fun bind(mars: SolarSystemModel) {

            priceText.text = mars.price.toString()+" $"
            idText.text = mars.id
            typeText.text = "For "+mars.type.replaceFirstChar { it.uppercase() }
            val replaceImage = mars.img_src.replace("http","https")

            Log.d("Response", "List Count :${replaceImage} ")
            //Picasso.get().load(replaceImage).into(imageView);
                Picasso.get()
               .load(replaceImage)
               .resize(200, 250)
                .centerCrop()
                .into(imageView)
        }

    }


}