package com.kronosapp.lugapp.Languages.toTr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.UUID;

public class DeToTr {
    private Context context;
    private SQLiteDatabase database;
    private String packet_name,prmkey;
    private String word,translate,difficult;

    public DeToTr(Context context, SQLiteDatabase database) {
        this.context=context;
        this.database=database;
    }

    private String random()
    {
        String rand =   UUID.randomUUID().toString();
        String temp = rand.replaceAll("-","");
        String temp2 = temp.substring(0,25);
        return temp2;
    }

    private void createPacket(String pack_name, String prmkey,String  difficult, SQLiteDatabase database)
    {
        pack_name =  pack_name.replace("'","''");
        database.execSQL("insert into packets(packet_name,prmkey,ifShared,difficult) values('"+pack_name+"','"+prmkey+"','0','"+difficult+"')");
    }

    private void insertData(String word, String translate, String prmkey, SQLiteDatabase database)
    {
        word =  word.replace("'","&apostrophe");
        translate =  translate.replace("'","&apostrophe");
        database.execSQL("insert into words(word,translate,prmkey,favCard,learned) values('"+word+"','"+translate+"','"+prmkey+"','0','0')");
    }

    public void fill()
    {

        adjectives();
     /* animal();
        appearance();
        art();
        body();
        colors();
        communicate();
        computer();
        country();
        days();
        drinks();
        electronic_dev();
        emotion();
        exm_senteces();
        family();
        fruitAndVegetable();
        future_tense();
        health();
        home();
        jobs();
        law();
        meeting();
        months();
        music();
        number();
        office();
        personality();
        question();
        religion();
        shopping();
        space();
        sport();
        times();
        tools();
        trade();
        trip();
        verbs();
        view();
        workLife();

         */
    }

    private void adjectives()
    {
        packet_name = "Sıfatlar";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,difficult, database);

        word = "Neu";
        translate="Yeni";
        insertData(word,translate,prmkey,database);

        word = "Alt";
        translate="Eski";
        insertData(word,translate,prmkey,database);

        word = "Groß";
        translate="Büyük";
        insertData(word,translate,prmkey,database);

        word = "Klein";
        translate="Küçük";
        insertData(word,translate,prmkey,database);

        word = "Groß";
        translate="Geniş";
        insertData(word,translate,prmkey,database);

        word = "Anders";
        translate="Farklı";
        insertData(word,translate,prmkey,database);

        word = "Wenig";
        translate="Az";
        insertData(word,translate,prmkey,database);

        word = "Lang";
        translate="Uzun";
        insertData(word,translate,prmkey,database);

        word = "Wichtig";
        translate="Önemli";
        insertData(word,translate,prmkey,database);

        word = "Am besten";
        translate="En iyi";
        insertData(word,translate,prmkey,database);

        word = "Niedrig";
        translate="Düşük";
        insertData(word,translate,prmkey,database);

        word = "Hart";
        translate="Zor";
        insertData(word,translate,prmkey,database);

        word = "Wirtschaftlich";
        translate="Ekonomik";
        insertData(word,translate,prmkey,database);

        word = "Stark";
        translate="Güçlü";
        insertData(word,translate,prmkey,database);

        word = "Berühmt";
        translate="Ünlü";
        insertData(word,translate,prmkey,database);

        word = "Besonders";
        translate="Özel";
        insertData(word,translate,prmkey,database);

        word = "Einfach";
        translate="Kolay";
        insertData(word,translate,prmkey,database);

        word = "Clever";
        translate="Zeki";
        insertData(word,translate,prmkey,database);

        word = "Schwierig";
        translate="Zor";
        insertData(word,translate,prmkey,database);

        word = "Kurz";
        translate="Kısa";
        insertData(word,translate,prmkey,database);

        word = "Ehrlich";
        translate="Dürüst";
        insertData(word,translate,prmkey,database);

        word = "Privat";
        translate="Özel";
        insertData(word,translate,prmkey,database);

        word = "Arm";
        translate="Yoksul";
        insertData(word,translate,prmkey,database);

        word = "Natürlich";
        translate="Doğal";
        insertData(word,translate,prmkey,database);
    }

}
