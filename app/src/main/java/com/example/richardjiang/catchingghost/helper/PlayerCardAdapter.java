package com.example.richardjiang.catchingghost.helper;

import android.content.Context;
import android.widget.BaseAdapter;

import com.example.richardjiang.catchingghost.model.Player;

/**
 * Created by Richard Jiang on 7/7/2015.
 */
public class PlayerCardAdapter extends BaseAdapter {

    private static final String TAG = "PlayerCardAdapter";

    private Context context;
    private final Player[] players;

    @Override
    public int getCount() {
        return players.length;
    }
}
