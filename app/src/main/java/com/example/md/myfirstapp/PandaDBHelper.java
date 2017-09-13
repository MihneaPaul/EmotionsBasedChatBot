package com.example.md.myfirstapp;

import com.example.md.myfirstapp.Feelings.*;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.md.myfirstapp.Feelings.FeelingAngry;
import com.example.md.myfirstapp.Feelings.FeelingConfused;
import com.example.md.myfirstapp.Feelings.FeelingDepressed;

/**
 * Created by Mihnea on 21.08.2017.
 */

public class PandaDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "PandaDB";

    public static final String TABLE_HUMANGREETINGS = "HumanGreetings";
    public static final String TABLE_HUMANGREETINGS_COLUMN_ID="_id";
    public static final String TABLE_HUMANGREETINGS_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGANGRY = "FeelingAngry";
    public static final String TABLE_FEELINGANGRY_COLUMN_ID="_id";
    public static final String TABLE_FEELINGANGRY_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGCONFUSED = "FeelingConfused";
    public static final String TABLE_FEELINGCONFUSED_COLUMN_ID="_id";
    public static final String TABLE_FEELINGCONFUSED_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGHELPLESS = "FeelingHelpless";
    public static final String TABLE_FEELINGHELPLESS_COLUMN_ID="_id";
    public static final String TABLE_FEELINGHELPLESS_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGINDIFFERENT = "FeelingIndifferent";
    public static final String TABLE_FEELINGINDIFFERENT_COLUMN_ID="_id";
    public static final String TABLE_FEELINGINDIFFERENT_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGHURT = "FeelingHurt";
    public static final String TABLE_FEELINGHURT_COLUMN_ID="_id";
    public static final String TABLE_FEELINGHURT_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGSAD = "FeelingSad";
    public static final String TABLE_FEELINGSAD_COLUMN_ID="_id";
    public static final String TABLE_FEELINGSAD_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGJUDGEMENTAL = "FeelingJudgemental";
    public static final String TABLE_FEELINGJUDGEMENTAL_COLUMN_ID="_id";
    public static final String TABLE_FEELINGJUDGEMENTAL_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGOPEN = "FeelingOpen";
    public static final String TABLE_FEELINGOPEN_COLUMN_ID="_id";
    public static final String TABLE_FEELINGOPEN_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGLOVING = "FeelingLoving";
    public static final String TABLE_FEELINGLOVING_COLUMN_ID="_id";
    public static final String TABLE_FEELINGLOVING_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGHAPPY = "FeelingHappy";
    public static final String TABLE_FEELINGHAPPY_COLUMN_ID="_id";
    public static final String TABLE_FEELINGHAPPY_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGINTERESTED = "FeelingInterested";
    public static final String TABLE_FEELINGINTERESTED_COLUMN_ID="_id";
    public static final String TABLE_FEELINGINTERESTED_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGALIVE = "FeelingAlive";
    public static final String TABLE_FEELINGALIVE_COLUMN_ID="_id";
    public static final String TABLE_FEELINGALIVE_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGPOSITIVE = "FeelingPositive";
    public static final String TABLE_FEELINGPOSITIVE_COLUMN_ID="_id";
    public static final String TABLE_FEELINGPOSITIVE_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGPEACEFUL = "FeelingPeaceful";
    public static final String TABLE_FEELINGPEACEFUL_COLUMN_ID="_id";
    public static final String TABLE_FEELINGPEACEFUL_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGSTRONG = "FeelingStrong";
    public static final String TABLE_FEELINGSTRONG_COLUMN_ID="_id";
    public static final String TABLE_FEELINGSTRONG_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGRELAXED = "FeelingRelaxed";
    public static final String TABLE_FEELINGRELAXED_COLUMN_ID="_id";
    public static final String TABLE_FEELINGRELAXED_COLUMN_CONTENT="_content";

    public static final String TABLE_FEELINGDEPRESSED = "FeelingDepressed";
    public static final String TABLE_FEELINGDEPRESSED_COLUMN_ID="_id";
    public static final String TABLE_FEELINGDEPRESSED_COLUMN_CONTENT="_content";

    /* ---------- Panda Response ---------- */

    public static final String TABLE_PANDARESPONSE = "PandaResponse";
    public static final String TABLE_PANDARESPONSE_COLUMN_ID="_id";
    public static final String TABLE_PANDARESPONSE_COLUMN_CONTENT="_content";





    public PandaDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db){
        String query = "CREATE TABLE " + TABLE_HUMANGREETINGS + " (" +
                TABLE_HUMANGREETINGS_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_HUMANGREETINGS_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGANGRY + " (" +
                TABLE_FEELINGANGRY_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGANGRY_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGCONFUSED + " (" +
                TABLE_FEELINGCONFUSED_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGCONFUSED_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGHELPLESS + " (" +
                TABLE_FEELINGHELPLESS_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGHELPLESS_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGINDIFFERENT + " (" +
                TABLE_FEELINGINDIFFERENT_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGINDIFFERENT_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGHURT + " (" +
                TABLE_FEELINGHURT_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGHURT_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGSAD + " (" +
                TABLE_FEELINGSAD_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGSAD_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGJUDGEMENTAL + " (" +
                TABLE_FEELINGJUDGEMENTAL_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGJUDGEMENTAL_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGOPEN + " (" +
                TABLE_FEELINGOPEN_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGOPEN_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGLOVING + " (" +
                TABLE_FEELINGLOVING_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGLOVING_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGHAPPY + " (" +
                TABLE_FEELINGHAPPY_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGHAPPY_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGINTERESTED + " (" +
                TABLE_FEELINGINTERESTED_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGINTERESTED_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGALIVE + " (" +
                TABLE_FEELINGALIVE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGALIVE_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGPOSITIVE + " (" +
                TABLE_FEELINGPOSITIVE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGPOSITIVE_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGPEACEFUL + " (" +
                TABLE_FEELINGPEACEFUL_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGPEACEFUL_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGSTRONG + " (" +
                TABLE_FEELINGSTRONG_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGSTRONG_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGRELAXED + " (" +
                TABLE_FEELINGRELAXED_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGRELAXED_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_FEELINGDEPRESSED + " (" +
                TABLE_FEELINGDEPRESSED_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_FEELINGDEPRESSED_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

        query = "CREATE TABLE " + TABLE_PANDARESPONSE + " (" +
                TABLE_PANDARESPONSE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TABLE_PANDARESPONSE_COLUMN_CONTENT + " TEXT UNIQUE" +
                ");";

        db.execSQL(query);

    }

    public void initPandaBotValues(){

        String[] humanGreetings = {"hi", "hello", "good evening", "good morning", "good afternoon", "hey"};

        String[] feelingAngry = {"irritated","enraged","hostile","insulting","insulted","annoyed","upset","hateful","unpleasant",
                "offensive","aggresive","bitter","frustrated","controlling","resentful","hotheaded","malicious","infuriated","critical","mean-spirited",
                "violent","vindictive","sadistic","mean","spiteful","antagonistic","repulsed","mad","cross","incensed","loud","reactive","swearing",
                "abrupt","quarrelsome","venomous","irate","short-tempered","stubborn","rebellious","exasperated","impatient","contrary","condemning",
                "seething","scornful","sarcastic","overbearing","sharp","poisonous","disrespectful","disrespected","jealous","ticked off","hitting",
                "yelling","screaming","revengeful","retaliating","reprimanding","envious","angry"};

        String[] feelingDepressed = {"disappointed","discouraged","ashamed","powerless","diminished","guilty","dissatisfied","miserable",
                "despicable","self-denigrating","self-hating","sulky","low","terrible","lousy","desperate","alienated","bad","pessimistic","dejected",
                "bummed out","self-critical","self-deprecating","gloomy","glum","disheartened","down","despondent","cheerless","rotten","masochistic",
                "stuck","contracted","tight","blocked","despairing","hopeless","tight","blocked","grouchy","off","moody","crabby","crappy","crap",
                "faultfinding","resistant","punishing","morose","cranky","grumpy","burdened","negative","closed","out of sorts","no energy","in hell",
                "touchy","haggard","drawn","slumped","slouching","achy","depressed"};

        String[] feelingConfused ={"doubtful","uncertain","indecisive","perplexed","embarrassed","hesitant","shy","disillusioned",
                "distrustful","misgiving","lost","unsure","uneasy","tense","stressed","uncomfortable","comparing","dishonest","superior","disdainful",
                "manipulative","judgmental","argumentative","authoritative","condescending","demanding","confounded","distracted","disoriented",
                "off-kilter","frenzied","blushing","awkward","confused"};

        String[] feelingHelpless ={"incapable","alone","paralyzed","fatigued","useless","inferior","vulnerable","empty","distressed",
                "pathetic","distraught","doomed","overwhelmed","incompetent","inept","shut down","incapacitated","cut off","trapped","weak","sick",
                "nauseated","fidgety","trembling","craving","hungry","squirming","jittery","woozy","twitching","compulsive","helpless"};

        String[] feelingIndifferent ={"insensitive","dull","reserved","weary","bored","preoccupied","cold","lifeless","uncaring","uninterested",
                "unresponsive","tired","robotic","slow","sluggish","indifferent"};

        String[] feelingHurt ={"crushed","tormented","deprived","pained","tortured","rejected","injured","offended","afflicted","aching",
                "victimized","heartbroken","agonized","appalled","wronged","humiliated","insulted","withdrawn","miffed","indignant","suffering",
                "distant","invaded","bulldozed","bullied","secretive","slighted","smothered","belittled","hurt"};

        String[] feelingSad ={"tearful","sad","sorrowful","anguished","desolate","unhappy","lonely","grieved","mournful","dismayed",
                "downhearted","oversensitive","dirty","remorseful","sullen","sour","self-castigating","unworthy","fragile","disconnected",
                "devastated","blindsided","discontented","crying","groaning","moaning"};

        String[] feelingJudgemental ={"judgmental","stony","serious","stern","frowning","recoiling","glaring","disgusted","unfair",
                "attacked","tactless","hurtful","bossy","stilted","stiff","brutal","combative","pushy","neglectful","stonewalling","rude","ranting",
                "scolding","shrill","hard","fake","phony","shallow","taut","territorial","complaining","obsessive","blunt"};

        String[] feelingOpen ={"open","understanding","confident","easy","connected","free","sympathetic","interested","satisfied",
                "receptive","accepting","kind","harmonious","empathetic","tolerant","friendly","approachable","outgoing","flowing","flexible",
                "present","listening","welcoming","embracing"};

        String[] feelingLoving ={"loving","considerate","affectionate","sensitive","tender","devoted","attracted","passionate","admiring",
                "warm","touched","close","loved","sweet","gentle","compassionate","caring","allowing","nonjudgmental","appreciative","respectful",
                "humble","gracious","patient","honoring","expansive","kind","kindly","grateful"};

        String[] feelingHappy ={"happy","blissful","joyful","joyous","delighted","overjoyed","gleeful","thankful","festive","ecstatic",
                "satisfied","glad","cheerful","sunny","elated","jubilant","jovial","fun-loving","lighthearted","easygoing","mellow","happy-go-lucky",
                "glorious","innocent","child-like","gratified","euphoric","rapturous","in good humor","in heaven","on top of the world"};

        String[] feelingInterested ={"interested","fascinated","intrigued","absorbed","inquisitive","engrossed","curious","amazed",
                "involved","attentive","observant","amused","thoughtful","courteous","intent","focused"};

        String[] feelingAlive ={"alive","playful","courageous","energetic","liberated","optimistic","frisky","animated","spirited",
                "thrilled","wonderful","funny","great","giving","sharing","intelligent","exhilarated","equal","excited","enjoying","communicative",
                "active","spunky","youthful","vigorous","tickled"};

        String[] feelingPositive ={"eager","keen","earnest","positive","inspired","enthusiastic","bold","brave","daring","hopeful",
                "upbeat","beautiful","creative","constructive","helpful","resourceful","motivated","cooperative","productive","exuberant","in the zone",
                "responsive","conscientious","approving","honored","privileged","adaptable"};

        String[] feelingPeaceful ={"calm","peaceful","peacefull","at ease","comfortable","pleased","encouraged","surprised","content",
                "quiet","certain","relaxed","serene","bright","blessed","assured","clear","balanced","fine","okay","grateful","carefree","adequate",
                "fulfilled","genuine","authentic","forgiving","sincere","uplifted","unburdened","confident","self-sufficient"};

        String[] feelingStrong ={"strong","reliable","sure","unique","dynamic","tenacious","hardy","secure","stable","honest","composed",
                "self-affirming","truthful","supportive","excellent","persevering","responsible","energized","sane","complete","mature","solid"};

        String[] feelingRelaxed ={"relaxed","glowing","radiant","beaming","reflective","smiling","grounded","unhurried","open-minded",
                "efficient","non-controlling","unassuming","trusting","supported","fluid","light","spontaneous","aware","healthy","meditative","still",
                "rested","waiting","laughing","graceful","natural","steady","centered","placid"};

        String[] generalResponses = {"Human lives are quite interesting.","Why are you humans so complex?","This takes me by surprise.","Do you want a medal for that?","I think I feel the same way.",
        "Let me ask one of my Panda friends what you can do...","Never don't give up!","Have no ragrets.","You can add some music to that.","Do your followers know?","Share your feelings with the world sonny boy!"};

        for(String x: humanGreetings){
            HumanGreetings hg = new HumanGreetings(x);
            addHumanGreetings(hg);
        }

        for(String x: feelingAngry){
            FeelingAngry fg = new FeelingAngry(x);
            addFeelingAngry(fg);
        }

        for(String x: feelingDepressed){
            FeelingDepressed fd = new FeelingDepressed(x);
            addFeelingDepressed(fd);
        }

        for(String x: feelingConfused){
            FeelingConfused fc = new FeelingConfused(x);
            addFeelingConfused(fc);
        }

        for(String x: feelingHelpless){
            FeelingHelpless fh = new FeelingHelpless(x);
            addFeelingHelpless(fh);
        }

        for(String x: feelingIndifferent){
            FeelingIndifferent fi = new FeelingIndifferent(x);
            addFeelingIndifferent(fi);
        }

        for(String x: feelingHurt){
            FeelingHurt fh = new FeelingHurt(x);
            addFeelingHurt(fh);
        }

        for(String x: feelingSad){
            FeelingSad fs = new FeelingSad(x);
            addFeelingSad(fs);
        }

        for(String x: feelingJudgemental){
            FeelingJudgemental fj = new FeelingJudgemental(x);
            addFeelingJudgemental(fj);
        }

        for(String x: feelingOpen){
            FeelingOpen fo = new FeelingOpen(x);
            addFeelingOpen(fo);
        }

        for(String x: feelingLoving){
            FeelingLoving fl = new FeelingLoving(x);
            addFeelingLoving(fl);
        }

        for(String x: feelingHappy){
            FeelingHappy fh = new FeelingHappy(x);
            addFeelingHappy(fh);
        }

        for(String x: feelingInterested){
            FeelingInterested fi = new FeelingInterested(x);
            addFeelingInterested(fi);
        }

        for(String x: feelingAlive){
            FeelingAlive fa = new FeelingAlive(x);
            addFeelingAlive(fa);
        }

        for(String x: feelingPositive){
            FeelingPositive fp = new FeelingPositive(x);
            addFeelingPositive(fp);
        }

        for(String x: feelingPeaceful){
            FeelingPeaceful fp = new FeelingPeaceful(x);
            addFeelingPeaceful(fp);
        }

        for(String x: feelingStrong){
            FeelingStrong fs = new FeelingStrong(x);
            addFeelingStrong(fs);
        }

        for(String x: feelingRelaxed){
            FeelingRelaxed fr = new FeelingRelaxed(x);
            addFeelingRelaxed(fr);
        }

        for(String x: generalResponses){
            PandaResponse pr = new PandaResponse(x);
            addPandaResponse(pr);
        }

    }




    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVerson, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_HUMANGREETINGS);
        onCreate(db);
    }

    //Add a HumanGreetings to the database
    public void addHumanGreetings(HumanGreetings hg) {
        ContentValues values = new ContentValues();
        values.put(TABLE_HUMANGREETINGS_COLUMN_CONTENT,hg.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_HUMANGREETINGS,null,values);
        db.close();
    }
    public void addFeelingDepressed(FeelingDepressed fd) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGDEPRESSED_COLUMN_CONTENT,fd.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGDEPRESSED,null,values);
        db.close();
    }

    //Add a FeelingAngry to the database
    public void addFeelingConfused(FeelingConfused fc) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGCONFUSED_COLUMN_CONTENT,fc.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGCONFUSED,null,values);
        db.close();
    }

    public void addFeelingHelpless(FeelingHelpless fh) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGHELPLESS_COLUMN_CONTENT,fh.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGHELPLESS,null,values);
        db.close();
    }

    public void addFeelingIndifferent(FeelingIndifferent fi) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGINDIFFERENT_COLUMN_CONTENT,fi.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGINDIFFERENT,null,values);
        db.close();
    }

    public void addFeelingHurt(FeelingHurt fh) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGHURT_COLUMN_CONTENT,fh.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGHURT,null,values);
        db.close();
    }

    public void addFeelingSad(FeelingSad fs) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGSAD_COLUMN_CONTENT,fs.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGSAD,null,values);
        db.close();
    }

    public void addFeelingJudgemental(FeelingJudgemental fj) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGJUDGEMENTAL_COLUMN_CONTENT,fj.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGJUDGEMENTAL,null,values);
        db.close();
    }

    public void addFeelingOpen(FeelingOpen fo) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGOPEN_COLUMN_CONTENT,fo.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGOPEN,null,values);
        db.close();
    }

    public void addFeelingHappy(FeelingHappy fh) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGHAPPY_COLUMN_CONTENT,fh.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGHAPPY,null,values);
        db.close();
    }

    public void addFeelingInterested(FeelingInterested fi) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGINTERESTED_COLUMN_CONTENT,fi.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGINTERESTED,null,values);
        db.close();
    }

    public void addFeelingAlive(FeelingAlive fa) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGALIVE_COLUMN_CONTENT,fa.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGALIVE,null,values);
        db.close();
    }

    public void addFeelingPositive(FeelingPositive fp) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGPOSITIVE_COLUMN_CONTENT,fp.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGPOSITIVE,null,values);
        db.close();
    }

    public void addFeelingPeaceful(FeelingPeaceful fp) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGPEACEFUL_COLUMN_CONTENT,fp.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGPEACEFUL,null,values);
        db.close();
    }

    public void addFeelingStrong(FeelingStrong fs) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGSTRONG_COLUMN_CONTENT,fs.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGSTRONG,null,values);
        db.close();
    }

    public void addFeelingRelaxed(FeelingRelaxed fr) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGRELAXED_COLUMN_CONTENT,fr.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGRELAXED,null,values);
        db.close();
    }

    public void addFeelingLoving(FeelingLoving fl) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGLOVING_COLUMN_CONTENT,fl.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGLOVING,null,values);
        db.close();
    }

    public void addFeelingAngry(FeelingAngry fa) {
        ContentValues values = new ContentValues();
        values.put(TABLE_FEELINGANGRY_COLUMN_CONTENT,fa.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_FEELINGANGRY,null,values);
        db.close();
    }

    public void addPandaResponse(PandaResponse pr) {
        ContentValues values = new ContentValues();
        values.put(TABLE_PANDARESPONSE_COLUMN_CONTENT,pr.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PANDARESPONSE,null,values);
        db.close();
    }


    //Delete a HumanGreetings from the database
    public void deleteHumanGreetings(String hgName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_HUMANGREETINGS + " WHERE " + TABLE_HUMANGREETINGS_COLUMN_CONTENT + "=\"" + hgName + "\";");
    }

    //Delete a FeelingAngry from the database
    public void deleteFeelingAngry(String faName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGANGRY + " WHERE " + TABLE_FEELINGANGRY_COLUMN_CONTENT + "=\"" + faName + "\";");
    }

    public void deleteFeelingDepressed(String fdName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGDEPRESSED + " WHERE " + TABLE_FEELINGDEPRESSED_COLUMN_CONTENT + "=\"" + fdName + "\";");
    }

    public void deleteFeelingConfused(String fcName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGCONFUSED + " WHERE " + TABLE_FEELINGCONFUSED_COLUMN_CONTENT + "=\"" + fcName + "\";");
    }

    public void deleteFeelingHelpless(String fhName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGHELPLESS + " WHERE " + TABLE_FEELINGHELPLESS_COLUMN_CONTENT + "=\"" + fhName + "\";");
    }

    public void deleteFeelingIndifferent(String fiName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGINDIFFERENT + " WHERE " + TABLE_FEELINGINDIFFERENT_COLUMN_CONTENT + "=\"" + fiName + "\";");
    }

    public void deleteFeelingHurt(String fhName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGHURT + " WHERE " + TABLE_FEELINGHURT_COLUMN_CONTENT + "=\"" + fhName + "\";");
    }

    public void deleteFeelingSad(String fsName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGSAD + " WHERE " + TABLE_FEELINGSAD_COLUMN_CONTENT + "=\"" + fsName + "\";");
    }

    public void deleteFeelingJudgemental(String fjName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGJUDGEMENTAL + " WHERE " + TABLE_FEELINGJUDGEMENTAL_COLUMN_CONTENT + "=\"" + fjName + "\";");
    }

    public void deleteFeelingOpen(String foName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGOPEN + " WHERE " + TABLE_FEELINGOPEN_COLUMN_CONTENT + "=\"" + foName + "\";");
    }

    public void deleteFeelingLoving(String flName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGLOVING + " WHERE " + TABLE_FEELINGLOVING_COLUMN_CONTENT + "=\"" + flName + "\";");
    }

    public void deleteFeelingHappy(String fhName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGHAPPY + " WHERE " + TABLE_FEELINGHAPPY_COLUMN_CONTENT + "=\"" + fhName + "\";");
    }

    public void deleteFeelingInterested(String fiName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGINTERESTED + " WHERE " + TABLE_FEELINGINTERESTED_COLUMN_CONTENT + "=\"" + fiName + "\";");
    }

    public void deleteFeelingAlive(String faName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGALIVE + " WHERE " + TABLE_FEELINGALIVE_COLUMN_CONTENT + "=\"" + faName + "\";");
    }

    public void deleteFeelingPositive(String fpName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGPOSITIVE + " WHERE " + TABLE_FEELINGPOSITIVE_COLUMN_CONTENT + "=\"" + fpName + "\";");
    }

    public void deleteFeelingPeaceful(String fpName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGPEACEFUL + " WHERE " + TABLE_FEELINGPEACEFUL_COLUMN_CONTENT + "=\"" + fpName + "\";");
    }

    public void deleteFeelingStrong(String fsName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGSTRONG + " WHERE " + TABLE_FEELINGSTRONG_COLUMN_CONTENT + "=\"" + fsName + "\";");
    }

    public void deleteFeelingRelaxed(String frName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_FEELINGRELAXED + " WHERE " + TABLE_FEELINGRELAXED_COLUMN_CONTENT + "=\"" + frName + "\";");
    }

    public void deletePandaResponse(String frName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PANDARESPONSE + " WHERE " + TABLE_PANDARESPONSE_COLUMN_CONTENT + "=\"" + frName + "\";");
    }

    //Fetches certain information from database
    public String fetchData(String dataToFetch){

        String dbString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + dataToFetch + " WHERE 1";

        //Cursor point to a location in your results
        Cursor c = db.rawQuery(query,null);
        //Move to the first row in results
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("_content")) != null){
                dbString += c.getString(c.getColumnIndex("_content"));
                dbString += ",";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }

    //Print out the database as a string
    public String databaseToString(){

        String dbString="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_HUMANGREETINGS + " WHERE 1";



        //Cursor point to a location in your results
        Cursor c = db.rawQuery(query,null);
        //Move to the first row in results
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("_content")) != null){
                dbString += c.getString(c.getColumnIndex("_content"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;

    }


}
