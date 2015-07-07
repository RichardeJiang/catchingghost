package com.example.richardjiang.catchingghost.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.richardjiang.catchingghost.R;

/**
 * Created by Richard Jiang on 7/7/2015.
 */
public class WelcomePage extends Activity {

    private static final String TAG = "WelcomePage";
    private final Context context = this;
    private EditText result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnEnterNum = (Button) findViewById(R.id.btnEnterNum);
        btnEnterNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();

            }
        });

        Button btnWelcomeStart = (Button) findViewById(R.id.btnWelcomeStart);
        btnWelcomeStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PlayerDisplayPage.class);
                startActivity(intent);
            }
        });

    }

    private void showInputDialog() {
        LayoutInflater li = LayoutInflater.from(context);
        View promptView = li.inflate(R.layout.prompt_enter_num, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(promptView);
        final EditText input = (EditText) promptView.findViewById(R.id.editNum);

        builder
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                result.setText(input.getText());
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

        //create the dialog
        AlertDialog alertDialog = builder.create();

        //show the dialog
        alertDialog.show();
    }
}
