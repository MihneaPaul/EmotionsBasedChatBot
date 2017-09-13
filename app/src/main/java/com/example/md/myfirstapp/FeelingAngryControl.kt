package com.example.md.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.example.md.myfirstapp.Feelings.FeelingAngry

class FeelingAngryControl : AppCompatActivity() {

    private var buttonAdd: Button? = null
    private var buttonDelete: Button? = null
    private var editTextUserInput: EditText? = null
    private var textViewDB: TextView? = null
    private var pDB: PandaDBHelper? = null
    private val buttonBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeling_angry_control)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        buttonAdd = findViewById(R.id.buttonAdd) as Button
        buttonDelete = findViewById(R.id.buttonDelete) as Button
        editTextUserInput = findViewById(R.id.editTextUserInput) as EditText
        textViewDB = findViewById(R.id.textViewDB) as TextView
        buttonAdd = findViewById(R.id.buttonBack) as Button
        pDB = PandaDBHelper(this, null, null, 1)
        pDB!!.initPandaBotValues()

        printDatabase()

        buttonAdd!!.setOnClickListener {
            val fa = FeelingAngry(editTextUserInput!!.text.toString())
            pDB!!.addFeelingAngry(fa)
            printDatabase()
        }
        buttonDelete!!.setOnClickListener {
            val fa = editTextUserInput!!.text.toString()
            pDB!!.deleteFeelingAngry(fa)
            printDatabase()
        }

        buttonBack!!.setOnClickListener {
            val thread = object : Thread() {
                override fun run() {
                    try {
                        val intent = Intent(applicationContext, ControlCenter::class.java)
                        startActivity(intent)
                        finish()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }
            thread.start()

        }


    }

    private fun printDatabase() {
        val dbString = pDB!!.databaseToString()
        textViewDB!!.text = dbString
        editTextUserInput!!.setText("")
    }

}

