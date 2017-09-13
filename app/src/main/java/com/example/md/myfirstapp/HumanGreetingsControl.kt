package com.example.md.myfirstapp

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class HumanGreetingsControl : AppCompatActivity() {

    private var buttonAdd: Button? = null
    private var buttonDelete: Button? = null
    private var editTextUserTextInput: EditText? = null
    private var textViewDB: TextView? = null
    private var pDB: PandaDBHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_human_greetings_control)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        /* Assigning visual components to their backend counterpart */
        buttonAdd = findViewById(R.id.buttonAdd) as Button
        buttonDelete = findViewById(R.id.buttonDelete) as Button
        editTextUserTextInput = findViewById(R.id.userTextInput) as EditText
        textViewDB = findViewById(R.id.textViewDB) as TextView
        pDB = PandaDBHelper(this,null,null,1)
        pDB!!.initPandaBotValues()

        printDatabase()

        buttonAdd!!.setOnClickListener {
            var hg = HumanGreetings(editTextUserTextInput!!.text.toString())
            pDB!!.addHumanGreetings(hg)
            printDatabase()
        }

        buttonDelete!!.setOnClickListener {
            var inputText = editTextUserTextInput!!.text.toString()
            pDB!!.deleteHumanGreetings(inputText)
            printDatabase()
        }

    }

    private fun printDatabase() {
        var dbString = pDB!!.databaseToString()
        textViewDB!!.setText(dbString)
        editTextUserTextInput!!.setText("")


    }


}
