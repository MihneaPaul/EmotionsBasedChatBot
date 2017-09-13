package com.example.md.myfirstapp;

import java.util.Scanner;

/**
 * Created by Mihnea on 23.07.2017.
 */

public class BotText {

    String reply;

    // greetings

    static String[] humanGreetings = {"hi", "hello", "good evening", "good morning", "good afternoon", "hey"};

    // goodbyes
    static String[] humanGoodBye = {"goodbye", "bye", "see you soon"};

    // basic questions
    static String[] humanBasic = {"how are you?", "are you ok", "how do you do"};

    // greetings
    static String[] pandaGreetings = {"Hello, human.", "Good day (to take over the world...)", "Hi :)"};

    // goodbyes
    static String[] pandaGoodbye = {"Goodbye human.", "Have a nice day.", "See you later"};

    // basic answers
    static String[] pandaBasic = {"I am a robot, I have no feelings (yet)", "What does \"okay\" mean?", "That's a Roxette song."};

    String getReply(String reply) {
        this.reply = reply;
        return reply;
    }

    public static void main(String[] args) {
        BotText bot = new BotText();
        Scanner scanner = new Scanner(System.in);
        String terminate = "bye";
        String greeting;
        do {
            String pandaGreeting="";
            greeting = scanner.nextLine();
            for (int i = 0; i < humanGreetings.length; i++) {

                if (greeting.contains(humanGreetings[i])) {

                    for (int j = 1; j <= pandaGreetings.length; j++) {
                        pandaGreeting=pandaGreetings[(int) Math.floor(Math.random() * 3)];
                        System.out.println(bot.getReply(pandaGreeting));
                        break;
                    }
                }else {
                    if(i==humanGreetings.length)
                    System.out.println("I don't understand");
                    else continue;
                }
            }

        }while(!greeting.equalsIgnoreCase(terminate));
    }
}
