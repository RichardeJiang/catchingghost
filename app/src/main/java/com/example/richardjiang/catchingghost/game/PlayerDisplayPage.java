package com.example.richardjiang.catchingghost.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.richardjiang.catchingghost.R;
import com.example.richardjiang.catchingghost.helper.PlayerCardAdapter;

/**
 * Created by Richard Jiang on 7/7/2015.
 */
public class PlayerDisplayPage extends Activity {

    private static final String TAG = "PlayerDisplayPage";

    private GridView cards;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_players);

        cards = (GridView) findViewById(R.id.playerCards);
        cards.setAdapter(new PlayerCardAdapter(this));

        cards.setOnItemSelectedListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
