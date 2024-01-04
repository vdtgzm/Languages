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



     private void computer()
    {
        packet_name = "Bilgisayar - Yazılım";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Scanner";
        translate="Tarayıcı";
        insertData(word,translate,prmkey,database);
        word = "Touch-Screen";
        translate="Dokunmatik ekran";
        insertData(word,translate,prmkey,database);
        word = "Mauszeiger";
        translate="İmleç";
        insertData(word,translate,prmkey,database);
        word = "Dropdown-Menü";
        translate="Açılır menü";
        insertData(word,translate,prmkey,database);
        word = "Schnittstelle";
        translate="Arayüz";
        insertData(word,translate,prmkey,database);
        word = "Laden";
        translate="Yüklemek";
        insertData(word,translate,prmkey,database);
        word = "Zum Verschlüsseln";
        translate="Şifrelemek";
        insertData(word,translate,prmkey,database);
        word = "Zum Codieren";
        translate="Kod yazmak";
        insertData(word,translate,prmkey,database);
        word = "Befehl";
        translate="Emir";
        insertData(word,translate,prmkey,database);
        word = "Browser";
        translate="Tarayıcı";
        insertData(word,translate,prmkey,database);
        word = "Insekt";
        translate="Yazılım hatası";
        insertData(word,translate,prmkey,database);
        word = "Sicherung";
        translate="Yedekleme";
        insertData(word,translate,prmkey,database);
        word = "Zwischenspeicher";
        translate="Önbellek";
        insertData(word,translate,prmkey,database);
        word = "Sicherheitscode";
        translate="Güvenlik kodu";
        insertData(word,translate,prmkey,database);
        word = "Online";
        translate="Çevrimiçi";
        insertData(word,translate,prmkey,database);
        word = "Offline";
        translate="Çevrimdışı";
        insertData(word,translate,prmkey,database);
        word = "Passwort";
        translate="Parola";
        insertData(word,translate,prmkey,database);
        word = "Plug-in";
        translate="Eklenti";
        insertData(word,translate,prmkey,database);
        word = "Neustart";
        translate="Tekrar başlatmak";
        insertData(word,translate,prmkey,database);
        word = "Auflösung";
        translate="Çözünürlük";
        insertData(word,translate,prmkey,database);
        word = "Suchmaschine";
        translate="Arama motoru";
        insertData(word,translate,prmkey,database);
        word = "Software";
        translate="Yazılım";
        insertData(word,translate,prmkey,database);
        word = "Lagerung";
        translate="Depolama";
        insertData(word,translate,prmkey,database);
        word = "Virtuell";
        translate="Sanal";
        insertData(word,translate,prmkey,database);
        word = "Importieren";
        translate="İçe aktar";
        insertData(word,translate,prmkey,database);
        word = "Hardware";
        translate="Donanım";
        insertData(word,translate,prmkey,database);
        word = "Stichwort";
        translate="Anahtar kelime";
        insertData(word,translate,prmkey,database);
        word = "Symbolleiste";
        translate="Araç çubuğu";
        insertData(word,translate,prmkey,database);
        word = "Vorlage";
        translate="Şablon";
        insertData(word,translate,prmkey,database);
        word = "Konvertieren";
        translate="Dönüştürmek";
        insertData(word,translate,prmkey,database);
    }


    private void country()
    {
        difficult ="0";
        packet_name = "Ülkeler";
        prmkey = random();
        createPacket(packet_name,prmkey,difficult,database);

        word = "Schottland";
        translate="İskoçya";
        insertData(word,translate,prmkey,database);
        word = "Russland";
        translate="Rusya";
        insertData(word,translate,prmkey,database);
        word = "Irland";
        translate="İrlanda";
        insertData(word,translate,prmkey,database);
        word = "Japan";
        translate="Japonya";
        insertData(word,translate,prmkey,database);
        word = "Dänemark";
        translate="Danimarka";
        insertData(word,translate,prmkey,database);
        word = "Finnland";
        translate="Finlandiya";
        insertData(word,translate,prmkey,database);
        word = "Norwegen";
        translate="Norveç";
        insertData(word,translate,prmkey,database);
        word = "Schweden";
        translate="İsveç";
        insertData(word,translate,prmkey,database);
        word = "Schweiz";
        translate="İsviçre";
        insertData(word,translate,prmkey,database);
        word = "Frankreich";
        translate="Fransa";
        insertData(word,translate,prmkey,database);
        word = "Deutschland";
        translate="Almanya";
        insertData(word,translate,prmkey,database);
        word = "Niederlande";
        translate="Hollanda";
        insertData(word,translate,prmkey,database);
        word = "Ukraine";
        translate="Ukrayna";
        insertData(word,translate,prmkey,database);
        word = "Bulgarien";
        translate="Bulgaristan";
        insertData(word,translate,prmkey,database);
        word = "Portugal";
        translate="Portekiz";
        insertData(word,translate,prmkey,database);
        word = "Türkei";
        translate="Türkiye";
        insertData(word,translate,prmkey,database);
        word = "India";
        translate="Hindistan";
        insertData(word,translate,prmkey,database);
        word = "Griechenland";
        translate="Yunanistan";
        insertData(word,translate,prmkey,database);
        word = "Ungarn";
        translate="Macaristan";
        insertData(word,translate,prmkey,database);
        word = "Asien";
        translate="Asya";
        insertData(word,translate,prmkey,database);
        word = "Europa";
        translate="Avrupa";
        insertData(word,translate,prmkey,database);
        word = "Amerika";
        translate="Amerika";
        insertData(word,translate,prmkey,database);
        word = "Afrika";
        translate="Afrika";
        insertData(word,translate,prmkey,database);
        word = "Antarktis";
        translate="Antarktika";
        insertData(word,translate,prmkey,database);
        word = "Türkisch";
        translate="Türkçe";
        insertData(word,translate,prmkey,database);
        word = "Spanisch";
        translate="İspanyolca";
        insertData(word,translate,prmkey,database);
        word = "Griechisch";
        translate="Yunanca";
        insertData(word,translate,prmkey,database);
        word = "Armenisch";
        translate="Ermenice";
        insertData(word,translate,prmkey,database);
        word = "Arabisch";
        translate="Arapça";
        insertData(word,translate,prmkey,database);
        word = "Hindi";
        translate="Hintçe";
        insertData(word,translate,prmkey,database);
        word = "Chinesisch";
        translate="Çince";
        insertData(word,translate,prmkey,database);
        word = "Portugiesisch";
        translate="Portekizce";
        insertData(word,translate,prmkey,database);
        word = "Russisch";
        translate="Rusça";
        insertData(word,translate,prmkey,database);
        word = "Französisch";
        translate="Fransızca";
        insertData(word,translate,prmkey,database);
        word = "Italienisch";
        translate="İtalyanca";
        insertData(word,translate,prmkey,database);
        word = "japanisch";
        translate="Japonca";
        insertData(word,translate,prmkey,database);
        word = "Deutsch";
        translate="Almanca";
        insertData(word,translate,prmkey,database);
    }

     private void days()
    {
        packet_name = "Günler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        
        word = "Montag";
        translate="Pazartesi";
        insertData(word,translate,prmkey,database);
        word = "Dienstag";
        translate="Salı";
        insertData(word,translate,prmkey,database);
        word = "Mittwoch";
        translate="Çarşamba";
        insertData(word,translate,prmkey,database);
        word = "Donnerstag";
        translate="Perşembe";
        insertData(word,translate,prmkey,database);
        word = "Freitag";
        translate="Cuma";
        insertData(word,translate,prmkey,database);
        word = "Samstag";
        translate="Cumartesi";
        insertData(word,translate,prmkey,database);
        word = "Sonntag";
        translate="Pazar";
        insertData(word,translate,prmkey,database);

    }

     private void drinks()
    {
        packet_name = "İçecekler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Tee";
        translate="Çay";
        insertData(word,translate,prmkey,database);
        word = "Koks";
        translate="Kola";
        insertData(word,translate,prmkey,database);
        word = "Fruchtsaft";
        translate="Meyve Suyu";
        insertData(word,translate,prmkey,database);
        word = "Limonade";
        translate="Limonata";
        insertData(word,translate,prmkey,database);
        word = "Wein";
        translate="Şarap";
        insertData(word,translate,prmkey,database);
        word = "Bier";
        translate="Bira";
        insertData(word,translate,prmkey,database);
        word = "Cocktail";
        translate="Kokteyl";
        insertData(word,translate,prmkey,database);
        word = "Wasser";
        translate="Su";
        insertData(word,translate,prmkey,database);
        word = "Eistee";
        translate="Soğuk çay";
        insertData(word,translate,prmkey,database);
    }

}
