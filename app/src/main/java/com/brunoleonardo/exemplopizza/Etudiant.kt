package com.brunoleonardo.exemplopizza

import java.io.Serializable

class Etudiant (var nom : String, var prenom : String, var age : Int): Serializable {

    override fun toString(): String {
        return "Etudiant(nom='$nom', prenom='$prenom', age=$age)"
    }
}