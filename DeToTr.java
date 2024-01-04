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

        /*
    
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

   private void colors()
    {
        packet_name = "Renkler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,difficult,database);
        word = "Rot";
        translate="Kırmızı";
        insertData(word,translate,prmkey,database);
        word = "Blau";
        translate="Mavi";
        insertData(word,translate,prmkey,database);
        word = "Gelb";
        translate="Sarı";
        insertData(word,translate,prmkey,database);
        word = "Schwarz";
        translate="Siyah";
        insertData(word,translate,prmkey,database);
        word = "Weiß";
        translate="Beyaz";
        insertData(word,translate,prmkey,database);
        word = "Grau";
        translate="Gri";
        insertData(word,translate,prmkey,database);
        word = "Lila";
        translate="Mor";
        insertData(word,translate,prmkey,database);
        word = "Navy blau";
        translate="Lacivert";
        insertData(word,translate,prmkey,database);
        word = "Türkis";
        translate="Turkuaz";
        insertData(word,translate,prmkey,database);
        word = "Violett";
        translate="Eflatun";
        insertData(word,translate,prmkey,database);
        word = "Farbig";
        translate="Renkli";
        insertData(word,translate,prmkey,database);
        word = "Bunt";
        translate="Rengarenk";
        insertData(word,translate,prmkey,database);

    }


     private void communicate()
    {
        packet_name = "İletişim";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,difficult,database);

        word = "Werbung";
        translate="Reklam";
        insertData(word,translate,prmkey,database);
        word = "Massenmedien";
        translate="Kitle iletişim araçları";
        insertData(word,translate,prmkey,database);
        word = "Sozialen Medien";
        translate="Sosyal Medya";
        insertData(word,translate,prmkey,database);
        word = "Radiosender";
        translate="Radyo istasyonu";
        insertData(word,translate,prmkey,database);
        word = "Nachricht";
        translate="Haberler";
        insertData(word,translate,prmkey,database);
        word = "Soziales Netzwerk";
        translate="Sosyal Ağ";
        insertData(word,translate,prmkey,database);
        word = "Bekannt geben";
        translate="Duyurmak";
        insertData(word,translate,prmkey,database);
        word = "Hörer";
        translate="Dinleyici";
        insertData(word,translate,prmkey,database);
        word = "Publikum";
        translate="İzleyici";
        insertData(word,translate,prmkey,database);
        word = "Journalist";
        translate="Gazeteci";
        insertData(word,translate,prmkey,database);
        word = "Reporter";
        translate="Muhabir";
        insertData(word,translate,prmkey,database);
        word = "Dokumentarfilm";
        translate="Belgesel";
        insertData(word,translate,prmkey,database);
        word = "Übertragen";
        translate="Yayın";
        insertData(word,translate,prmkey,database);
        word = "Zeitung";
        translate="Gazete";
        insertData(word,translate,prmkey,database);
        word = "Broschüre";
        translate="Broşür";
        insertData(word,translate,prmkey,database);
        word = "Untertitel";
        translate="Altyazı";
        insertData(word,translate,prmkey,database);
        word = "Zensur";
        translate="Sansür";
        insertData(word,translate,prmkey,database);
        word = "Nachricht";
        translate="Mesaj";
        insertData(word,translate,prmkey,database);
        word = "Brief";
        translate="Mektup";
        insertData(word,translate,prmkey,database);
        word = "Fernsehen";
        translate="Televizyon";
        insertData(word,translate,prmkey,database);
    }

}
