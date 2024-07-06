package de.nielshoppe.maumau;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private Player[] players;
    private GameState state;

    public Game(String[] players) {
        Player[] newPlayer = new Player();
        // Objekt im Konstruktor instanziieren, damit ich die Instanzen in das Array packe
        // darunter eine Schleife, die i++ und wenn ein Objekt erstellt wurde, wird es ins Array gepackt
        this.state = state;
    }

    public String[] getPlayer(int i) {
        return players[i];
    }

    public String[] getPlayers() {
        for (int i = 0; i < players.length; i++) {
            return players[i];
        }
    
        
    }
     
}

