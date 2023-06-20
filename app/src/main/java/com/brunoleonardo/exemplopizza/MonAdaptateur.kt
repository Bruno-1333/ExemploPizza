package com.brunoleonardo.exemplopizza

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MonAdaptateur (var context : Activity, var liste : ArrayList<Etudiant>): ArrayAdapter<Etudiant>(context, R.layout.liste_item, liste) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
       var rowview = context.layoutInflater.inflate(R.layout.liste_item, null, true)
        rowview.findViewById<TextView>(R.id.txtNom).text = liste[position].nom.toString()
        rowview.findViewById<TextView>(R.id.txtPrenom).text = liste[position].prenom.toString()
        rowview.findViewById<TextView>(R.id.txtAge).text = liste[position].age.toString()
        rowview.findViewById<ImageView>(R.id.image).setImageResource(R.drawable.smile)


        return rowview
    }
}