package com.example.richardjiang.catchingghost.model;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Richard Jiang on 6/29/2015.
 */
public class Side {

    private static final String TAG = "Side";

    private String label;
    private ArrayList<Player> players;
    private Secret secretOfTheSide;

    public int getSideNum() {
        return players.size();
    }

    public void setSideLabel(String label) {
        this.label = label;
    }

    public void addPlayer(Player newPlayer) {
        this.players.add(newPlayer);
    }

    public void assignSecretToPlayers(Secret secret) {
        for(Player player: players) {
            player.setPlayerSecrte(secret);
        }
    }

    public void setSideSecrte(Secret secret) {
        this.secretOfTheSide = secret;
    }

    public void killPlayer(Player player) {
        if(players.contains(player)) {
            players.remove(player);
        }
        else {
            Log.d(TAG, "player not in the side");
            return;
        }
    }
}
