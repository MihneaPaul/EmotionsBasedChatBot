package com.example.md.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.md.myfirstapp.Feelings.FeelingAlive;

public class FeelingAliveControl extends AppCompatActivity {

    private Button buttonAdd;
    private Button buttonDelete;
    private EditText editTextUserInput;
    private TextView textViewDB;
    private PandaDBHelper pDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_alive_control);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        editTextUserInput = (EditText) findViewById(R.id.editTextUserInput);
        textViewDB = (TextView) findViewById(R.id.textViewDB);
        pDB = new PandaDBHelper(this,null,null,1);
        pDB.initPandaBotValues();

        printDatabase();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FeelingAlive fa = new FeelingAlive(editTextUserInput.getText().toString());
                pDB.addFeelingAlive(fa);
                printDatabase();
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fa = editTextUserInput.getText().toString();
                pDB.deleteFeelingAlive(fa);
                printDatabase();
            }
        });


    }

    private void printDatabase(){
        String dbString = pDB.databaseToString();
        textViewDB.setText(dbString);
        editTextUserInput.setText("");
    }

}
