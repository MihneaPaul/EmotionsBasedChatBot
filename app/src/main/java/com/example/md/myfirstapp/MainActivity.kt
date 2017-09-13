package com.example.md.myfirstapp

import android.app.Activity
import android.content.Context
import android.support.v7.app.ActionBarActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.*
import android.R.attr.name
import android.content.Intent
import android.support.design.widget.FloatingActionButton
import android.widget.Toast
import java.sql.Timestamp


class MainActivity : AppCompatActivity() {


    private var getReplyFromPanda: Button? = null
    private var btnControlCenter: Button? = null
    //    private var btnSendMail: Button? = null
    private var btnMail: FloatingActionButton? = null
    private var editTextUserTextInput: EditText? = null
    private var editTextPandaReply: TextView? = null
    private var viewUserText: TextView? = null
    private var pDB: PandaDBHelper? = null

    private var conversationHistory: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /* Assigning visual components to their backend counterpart */
        getReplyFromPanda = findViewById(R.id.getReplyFromPanda) as Button
        btnControlCenter = findViewById(R.id.buttonControlCenter) as Button
//        btnSendMail = findViewById(R.id.buttonSendMail) as Button
        editTextUserTextInput = findViewById(R.id.userTextInput) as EditText
        editTextPandaReply = findViewById(R.id.pandaReply) as TextView
        viewUserText = findViewById(R.id.userTextAppear) as TextView
        btnMail = findViewById(R.id.buttonMail) as FloatingActionButton

        pDB = PandaDBHelper(this, null, null, 1)
        pDB!!.initPandaBotValues()

        editTextPandaReply!!.text = "Hello human, how are you feeling right now?"

        /* Setting a Listener for the button, in order to it to perform a certain action */
        getReplyFromPanda!!.setOnClickListener {
            /* passing the user text input getPandaReply() function in order to compute the result */

            getPandaReply(editTextUserTextInput!!.text.toString())


//            System.out.println("All human greetings from database: " + pDB!!.fetchData("HumanGreetings"))
//            System.out.println("All feelings angry from database: " + pDB!!.fetchData("FeelingAngry"))
        }

        btnControlCenter!!.setOnClickListener {
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

        btnMail!!.setOnClickListener {

            val timestamp = Timestamp(System.currentTimeMillis())

            val i = Intent(Intent.ACTION_SEND)
            i.type = "message/rfc822"
            i.putExtra(Intent.EXTRA_SUBJECT, "Panda Bot Conversation History")
            i.putExtra(Intent.EXTRA_TEXT, "Conversation from " + timestamp + "\n" + conversationHistory)

            try {
                startActivity(Intent.createChooser(i, "Send mail..."))
            } catch (ex: android.content.ActivityNotFoundException) {
                System.out.println("NO EMAIL CLIENTS INSTALLED")
            }

        }

    }


    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        if (currentFocus != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        }
        return super.dispatchTouchEvent(ev)
    }

    private fun getPandaReply(userInputMessageTemp: String?) {

        viewUserText!!.text = "You: " + userInputMessageTemp
        var userInputMessage = " " + userInputMessageTemp
        /* interpreting user text input */

        var feelingAngryStrings = pDB!!.fetchData("FeelingAngry").split(",")
        var feelingDepressedStrings = pDB!!.fetchData("FeelingDepressed").split(",")
        var feelingHappyStrings = pDB!!.fetchData("FeelingHappy").split(",")

        var concatAll = feelingAngryStrings + feelingDepressedStrings + feelingHappyStrings

        var pandaResponse = pDB!!.fetchData("PandaResponse").split(",")
        var replyFromPanda = pandaResponse[Math.floor(Math.random() * pandaResponse.size).toInt()]


        /* Validation*/

        var userInputMessageFoundStatus = false

        for (s in concatAll) {
            System.out.println("Looking for keyword [ " + s + " ] in user input message [ " + userInputMessage.toString() + " ]")
            if (userInputMessage!!.indexOf(s.trim { it <= ' ' }) > 0) {
                System.out.println(" !!!!!!!!!!!!!!!!!!!! FOUND IT !!!!!!!!!!!!!!!!!!!! ")
                userInputMessageFoundStatus = true
            }
        }

        if (userInputMessageFoundStatus == false) {

            var fullReply = "I am not familiar with what you said, sorry ..."

            editTextPandaReply!!.text = fullReply

            conversationHistory = conversationHistory + "\n" + "User: " + userInputMessage + "\n" + "PandaBot: " + fullReply


            /* Reset User Text Input*/
            editTextUserTextInput!!.setText("")

            /* Stop execution of the program, anything else below here is redundant in this moment*/
            return

        }

        for (s in feelingAngryStrings) {
            if (userInputMessage!!.indexOf(s.trim { it <= ' ' }) > 0) {

                var fullReply = "Try to calm down. " + replyFromPanda

                editTextPandaReply!!.text = fullReply

                conversationHistory = conversationHistory + "\n" + "User: " + userInputMessage + "\n" + "PandaBot: " + fullReply

            }

        }

        for (s in feelingDepressedStrings) {

            if (userInputMessage!!.indexOf(s.trim { it <= ' ' }) > 0) {

                var fullReply = replyFromPanda + " Don't do anything too hasty. "

                editTextPandaReply!!.text = fullReply

                conversationHistory = conversationHistory + "\n" + "User: " + userInputMessage + "\n" + "PandaBot: " + fullReply

            }


        }


        for (s in feelingHappyStrings) {
            if (userInputMessage!!.indexOf(s.trim { it <= ' ' }) > 0) {

                var fullReply = replyFromPanda + " Spread the joy."

                editTextPandaReply!!.text = fullReply

                conversationHistory = conversationHistory + "\n" + "User: " + userInputMessage + "\n" + "PandaBot: " + fullReply

            }

        }


        /* Reset User Text Input*/
        editTextUserTextInput!!.setText("")

    }

    companion object {

        internal var humanGreetings = arrayOf("hi", "hello", "good evening", "good morning", "good afternoon", "hey")

        // goodbyes
        internal var humanGoodbye = arrayOf("goodbye", "bye", "see you soon")

        // basic questions
        internal var humanBasic = arrayOf("how are you", "are you ok", "how do you do")

        // what can the bot do
        internal var functionsQuestions = arrayOf("what can you", "helpful", "good for", "your skills", "your purpose")

        // greetings
        internal var pandaGreetings = arrayOf("Hello, human.", "Good day (to take over the world...)", "Hi :)", "Welcome, human", "Hello, my name is PandaBot")

        // goodbyes
        internal var pandaGoodbye = arrayOf("Goodbye human.", "Have a nice day.", "See you later")

        // basic answers
        internal var pandaBasic = arrayOf("I am a robot, I have no feelings (yet)", "What does \"okay\" mean?")

        //what can the bot do
        internal var functionsReponse = arrayOf("I am here to keep you company.", "I am a cute small bot. I cannot do much", "I am not Siri, Bixby or Google Assistant.", "I don't have any true purpose")


    }
}
