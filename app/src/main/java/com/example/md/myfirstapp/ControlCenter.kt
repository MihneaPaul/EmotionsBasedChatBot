package com.example.md.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ControlCenter : AppCompatActivity() {

    private var btnFeelingAngryCC: Button? = null
    private var buttonBack: Button? = null
    private var btnFeelingHappy: Button? = null
    private var btnFeelingDepressed: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_center)

        /* Assigning visual components to their backend counterpart */
        btnFeelingAngryCC = findViewById(R.id.buttonFeelingAngryCC) as Button
        btnFeelingHappy = findViewById(R.id.buttonFeelingHappyCC) as Button
        btnFeelingDepressed = findViewById(R.id.buttonFeelingDepressedCC) as Button
        buttonBack = findViewById(R.id.buttonBack) as Button

        btnFeelingAngryCC!!.setOnClickListener {
            val thread = object : Thread() {
                override fun run() {
                    try {
                        val intent = Intent(applicationContext, FeelingAngryControl::class.java)
                        startActivity(intent)
                        finish()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }
            thread.start()

        }

        btnFeelingHappy!!.setOnClickListener {
            val thread = object : Thread() {
                override fun run() {
                    try {
                        val intent = Intent(applicationContext, FeelingHappyControl::class.java)
                        startActivity(intent)
                        finish()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }
            thread.start()

        }

        btnFeelingDepressed!!.setOnClickListener {
            val thread = object : Thread() {
                override fun run() {
                    try {
                        val intent = Intent(applicationContext, FeelingDepressedControl::class.java)
                        startActivity(intent)
                        finish()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }
            thread.start()

        }

        buttonBack!!.setOnClickListener {
            val thread = object : Thread() {
                override fun run() {
                    try {
                        val intent = Intent(applicationContext, MainActivity::class.java)
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
}
