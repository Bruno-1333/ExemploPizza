package com.brunoleonardo.exemplopizza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.brunoleonardo.exemplopizza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // binding pour lier le
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var liste = arrayListOf<Etudiant>(
            Etudiant("AAAAA", "AAAAA", 20),
            Etudiant("BBBB", "BBBBB", 25),
            Etudiant("CCCC", "CCCCC", 30),
            Etudiant("DDDD", "DDDDD", 35),
        )

        binding.listeEtudiant.adapter = MonAdaptateur(this, liste)
    }
}