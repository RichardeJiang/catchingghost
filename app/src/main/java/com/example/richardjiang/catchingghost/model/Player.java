package com.example.richardjiang.catchingghost.model;

/**
 * Created by Richard Jiang on 6/29/2015.
 */
public class Player {

    private static final String TAG = "Player";

    private String playerName;
    private Secret secret;

    public Player() {
        this.playerName = null;
        this.secret = null;
    }

    public Player(String name, Secret assignedSecret) {
        this.playerName = name;
        this.secret = assignedSecret;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Secret getPlayerSecret() {
        return this.secret;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public void setPlayerSecrte(Secret secret) {
        this.secret = secret;
    }
}
