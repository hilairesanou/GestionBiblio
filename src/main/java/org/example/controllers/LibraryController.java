package org.example.controllers;

import org.example.db.SQLiteConnection;

public class LibraryController {
    public void initialize() {
        // Logique d'initialisation
        SQLiteConnection.connect(); // Connexion à la base de données
    }

    // Méthodes pour gérer les livres (ajout, suppression, emprunt, etc.)
}
