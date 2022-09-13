package com.example.myalertdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitButton = findViewById(R.id.buttonId);
        exitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //for setting title
        alertDialogBuilder.setTitle(R.string.title_text);

        //for setting text
        alertDialogBuilder.setMessage(R.string.message_text);

        //for setting icon
        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();

            }
        }); alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this , "You have clicked on no button", Toast.LENGTH_SHORT).show();

            }
        });
         alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this , "You have clicked on no cancel button", Toast.LENGTH_SHORT).show();

            }
        });


        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}









