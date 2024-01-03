package com.kronosapp.lugapp.Languages.toTr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.UUID;

public class EnToTr {
    private Context context;
    private SQLiteDatabase database;
    private String packet_name,prmkey,difficult;
    private String word,translate;
    public EnToTr(Context context, SQLiteDatabase database) {
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

    private void createPacket(String pack_name, String prmkey, SQLiteDatabase database, String difficult)
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
        animal();
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

    }
    private void workLife()
    {

        packet_name = "İş Dünyası";
        difficult = "2";
        prmkey = random();
        createPacket(packet_name,prmkey,database,difficult);

        word = "Agency";
        translate="Acenta";
        insertData(word,translate,prmkey,database);

        word = "Corporation";
        translate="Şirket";
        insertData(word,translate,prmkey,database);

        word = "Curriculum Vitae";
        translate="Özgeçmiş";
        insertData(word,translate,prmkey,database);

        word = "CEO";
        translate="Yönetim kurulu başkanı";
        insertData(word,translate,prmkey,database);

        word = "Chairman";
        translate="Patron";
        insertData(word,translate,prmkey,database);

        word = "Entrepreneur";
        translate="Girişimci";
        insertData(word,translate,prmkey,database);

        word = "Resign";
        translate="İstifa etmek";
        insertData(word,translate,prmkey,database);

        word = "Income";
        translate="Gelir";
        insertData(word,translate,prmkey,database);

        word = "Insurance";
        translate="Sigorta";
        insertData(word,translate,prmkey,database);

        word = "Market research";
        translate="Market araştırması";
        insertData(word,translate,prmkey,database);

        word = "Partnership";
        translate="Ortaklık";
        insertData(word,translate,prmkey,database);

        word = "Stockholder";
        translate="Hissedar";
        insertData(word,translate,prmkey,database);

        word = "Tax evasion";
        translate="Vergi kaçakçılığı";
        insertData(word,translate,prmkey,database);

        word = "Shipment";
        translate="Sevkiyat";
        insertData(word,translate,prmkey,database);

        word = "Budget";
        translate="Bütçe";
        insertData(word,translate,prmkey,database);

        word = "Certification";
        translate="Ruhsat";
        insertData(word,translate,prmkey,database);

        word = "Lending";
        translate="Borç vermek";
        insertData(word,translate,prmkey,database);

        word = "Senior";
        translate="Kıdemli";
        insertData(word,translate,prmkey,database);

        word = "Junior";
        translate="Kıdemsiz";
        insertData(word,translate,prmkey,database);
    }
    private void family()
    {
        difficult ="0";
        packet_name = "Aile";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);
        word = "Family";
        translate="Aile";
        insertData(word,translate,prmkey,database);
        word = "Father";
        translate="Baba";
        insertData(word,translate,prmkey,database);
        word = "Mother";
        translate="Anne";
        insertData(word,translate,prmkey,database);
        word = "Son";
        translate="Oğul";
        insertData(word,translate,prmkey,database);
        word = "Daughter";
        translate="Kız çocuk";
        insertData(word,translate,prmkey,database);
        word = "Parent";
        translate="Ebeveyn";
        insertData(word,translate,prmkey,database);
        word = "Child";
        translate="Çocuk";
        insertData(word,translate,prmkey,database);
        word = "Children";
        translate="Çocuklar";
        insertData(word,translate,prmkey,database);
        word = "Husband";
        translate="Eş ( Erkek )";
        insertData(word,translate,prmkey,database);
        word = "Wife";
        translate="Eş ( Kadın )";
        insertData(word,translate,prmkey,database);
        word = "Brother";
        translate="Erkek kardeş";
        insertData(word,translate,prmkey,database);
        word = "Sister";
        translate="Kız kardeş";
        insertData(word,translate,prmkey,database);
        word = "Uncle";
        translate="Amca - Dayı";
        insertData(word,translate,prmkey,database);
        word = "Aunt";
        translate="Hala - Teyze";
        insertData(word,translate,prmkey,database);
        word = "Cousin";
        translate="Kuzen";
        insertData(word,translate,prmkey,database);
        word = "Grandfather";
        translate="Dede - Büyükbaba";
        insertData(word,translate,prmkey,database);
        word = "Grandmother";
        translate="Nine - Büyükanne";
        insertData(word,translate,prmkey,database);
        word = "Marriage";
        translate="Evlilik";
        insertData(word,translate,prmkey,database);
        word = "Engaged";
        translate="Nişanlı";
        insertData(word,translate,prmkey,database);
        word = "Stepmother";
        translate="Üvey Anne";
        insertData(word,translate,prmkey,database);
        word = "Stepdaughter";
        translate="Üvey kız";
        insertData(word,translate,prmkey,database);
        word = "Stepson";
        translate="Üvey oğul";
        insertData(word,translate,prmkey,database);
    }
    private void tools()
    {
        packet_name = "Aletler";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Tools";
        translate="Aletler";
        insertData(word,translate,prmkey,database);
        word = "Equipment";
        translate="Ekipmanlar";
        insertData(word,translate,prmkey,database);
        word = "Paintbrush";
        translate="Boya fırçası";
        insertData(word,translate,prmkey,database);
        word = "Paint";
        translate="Boya";
        insertData(word,translate,prmkey,database);
        word = "Stepladder";
        translate="Merdiven";
        insertData(word,translate,prmkey,database);
        word = "Hammer";
        translate="Çekiç";
        insertData(word,translate,prmkey,database);
        word = "Nail";
        translate="Çivi";
        insertData(word,translate,prmkey,database);
        word = "Screw";
        translate="Vida";
        insertData(word,translate,prmkey,database);
        word = "Screwdriver";
        translate="Tornavida";
        insertData(word,translate,prmkey,database);
        word = "Drill";
        translate="Matkap";
        insertData(word,translate,prmkey,database);
        word = "Pliers";
        translate="Kerpeten";
        insertData(word,translate,prmkey,database);
        word = "Toolbox";
        translate="Alet kutusu";
        insertData(word,translate,prmkey,database);
        word = "Axe";
        translate="Balta";
        insertData(word,translate,prmkey,database);
        word = "Cutter";
        translate="Maket bıçağı";
        insertData(word,translate,prmkey,database);
        word = "Broom";
        translate="Süpürge";
        insertData(word,translate,prmkey,database);
        word = "Bucket";
        translate="Kova";
        insertData(word,translate,prmkey,database);
        word = "Scissors";
        translate="Makas";
        insertData(word,translate,prmkey,database);
        word = "Flashlight";
        translate="El feneri";
        insertData(word,translate,prmkey,database);
    }
    private void emotion()
    {
        packet_name = "Duygular";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Happy";
        translate="Mutlu";
        insertData(word,translate,prmkey,database);

        word = "Unhappy";
        translate="Mutsuz";
        insertData(word,translate,prmkey,database);

        word = "Sad";
        translate="Üzgün";
        insertData(word,translate,prmkey,database);

        word = "Good";
        translate="İyi";
        insertData(word,translate,prmkey,database);

        word = "Alone";
        translate="Yalnız";
        insertData(word,translate,prmkey,database);

        word = "Reliable";
        translate="Güvenilir";
        insertData(word,translate,prmkey,database);

        word = "Terrible";
        translate="Korkunç";
        insertData(word,translate,prmkey,database);

        word = "Confused";
        translate="Şaşkın";
        insertData(word,translate,prmkey,database);

        word = "Upset";
        translate="Üzgün";
        insertData(word,translate,prmkey,database);

        word = "Shy";
        translate="Utangaç";
        insertData(word,translate,prmkey,database);

        word = "Angry";
        translate="Kızgın";
        insertData(word,translate,prmkey,database);

        word = "Nervous";
        translate="Sinirli";
        insertData(word,translate,prmkey,database);

        word = "Worried";
        translate="Endişeli";
        insertData(word,translate,prmkey,database);

        word = "Aggressive";
        translate="Agresif";
        insertData(word,translate,prmkey,database);

        word = "Indecisive";
        translate="Kararsız";
        insertData(word,translate,prmkey,database);

        word = "Embarrassed";
        translate="Mahçup";
        insertData(word,translate,prmkey,database);

        word = "Uneasy";
        translate="Huzursuz";
        insertData(word,translate,prmkey,database);

        word = "Pessimistic";
        translate="Kötümser";
        insertData(word,translate,prmkey,database);

        word = "Helpless";
        translate="Çaresiz";
        insertData(word,translate,prmkey,database);

        word = "Insensitive";
        translate="Duyarsız";
        insertData(word,translate,prmkey,database);

        word = "Optimistic";
        translate="İyimser";
        insertData(word,translate,prmkey,database);

        word = "Quiet";
        translate="Sessiz";
        insertData(word,translate,prmkey,database);

        word = "Calm";
        translate="Sakin";
        insertData(word,translate,prmkey,database);

        word = "Wonderful";
        translate="Müthiş";
        insertData(word,translate,prmkey,database);

        word = "Cheerful";
        translate="Neşeli";
        insertData(word,translate,prmkey,database);

        word = "Lucky";
        translate="Şanslı";
        insertData(word,translate,prmkey,database);

        word = "Afflicted";
        translate="Dertli";
        insertData(word,translate,prmkey,database);
    }
    private void months()
    {
        packet_name = "Aylar";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "January";
        translate="Ocak";
        insertData(word,translate,prmkey,database);
        word = "February";
        translate="Şubat";
        insertData(word,translate,prmkey,database);
        word = "March";
        translate="Mart";
        insertData(word,translate,prmkey,database);
        word = "April";
        translate="Nisan";
        insertData(word,translate,prmkey,database);
        word = "May";
        translate="Mayıs";
        insertData(word,translate,prmkey,database);
        word = "June";
        translate="Haziran";
        insertData(word,translate,prmkey,database);
        word = "July";
        translate="Temmuz";
        insertData(word,translate,prmkey,database);
        word = "August";
        translate="Ağustos";
        insertData(word,translate,prmkey,database);
        word = "September";
        translate="Eylül";
        insertData(word,translate,prmkey,database);
        word = "October";
        translate="Ekim";
        insertData(word,translate,prmkey,database);
        word = "November";
        translate="Kasım";
        insertData(word,translate,prmkey,database);
        word = "December";
        translate="Aralık";
        insertData(word,translate,prmkey,database);


    }
    private void personality()
    {
        packet_name = "Kişilik";
        difficult = "2";
        prmkey = random();
        createPacket(packet_name,prmkey,database,"2");

        word = "Able";
        translate="Yetenekli";
        insertData(word,translate,prmkey,database);
        word = "Absurd";
        translate="Saçma";
        insertData(word,translate,prmkey,database);
        word = "Alert";
        translate="Uyanık";
        insertData(word,translate,prmkey,database);
        word = "Brainy";
        translate="Zeki - Akıllı";
        insertData(word,translate,prmkey,database);
        word = "Brutal";
        translate="Acımasız";
        insertData(word,translate,prmkey,database);
        word = "Competent";
        translate="Yetkin";
        insertData(word,translate,prmkey,database);

        word = "Bad-tempered";
        translate="Huysuz";
        insertData(word,translate,prmkey,database);
        word = "Cheeky";
        translate="Arsız";
        insertData(word,translate,prmkey,database);

        word = "Conceited";
        translate="Kendini beğenmiş";
        insertData(word,translate,prmkey,database);
        word = "Coward";
        translate="Ödlek";
        insertData(word,translate,prmkey,database);
        word = "Chickenshit";
        translate="Korkak";
        insertData(word,translate,prmkey,database);
        word = "Harsh";
        translate="Sert";
        insertData(word,translate,prmkey,database);
        word = "Infamous";
        translate="Adı kötüye çıkmış";
        insertData(word,translate,prmkey,database);
        word = "Intolerant";
        translate="Müsamahasız";
        insertData(word,translate,prmkey,database);
        word = "Insensitive";
        translate="Duygusuz";
        insertData(word,translate,prmkey,database);
        word = "Narrow-minded";
        translate="Dar kafalı";
        insertData(word,translate,prmkey,database);
        word = "Assertive";
        translate="İddialı";
        insertData(word,translate,prmkey,database);
        word = "Attentive";
        translate="Özenli";
        insertData(word,translate,prmkey,database);
        word = "Charitable";
        translate="Merhametli";
        insertData(word,translate,prmkey,database);
        word = "Compassionate";
        translate="Şefkatli";
        insertData(word,translate,prmkey,database);
        word = "Faithful";
        translate="Sadık";
        insertData(word,translate,prmkey,database);
        word = "Frank";
        translate="Dürüst";
        insertData(word,translate,prmkey,database);
        word = "Hospitable";
        translate="Konuksever";
        insertData(word,translate,prmkey,database);
        word = "Jolly";
        translate="Keyifli";
        insertData(word,translate,prmkey,database);
    }
    private void appearance()
    {
        packet_name = "Görünüş";
        difficult = "2";
        prmkey = random();
        createPacket(packet_name,prmkey,database,difficult);

        word = "Alike";
        translate="Benzer";
        insertData(word,translate,prmkey,database);
        word = "Awkward";
        translate="Garip / rahatsız";
        insertData(word,translate,prmkey,database);
        word = "Delicate";
        translate="Narin";
        insertData(word,translate,prmkey,database);
        word = "Elegant";
        translate="Şık";
        insertData(word,translate,prmkey,database);
        word = "Mature";
        translate="Olgun";
        insertData(word,translate,prmkey,database);
        word = "Shabby";
        translate="Eski püskü";
        insertData(word,translate,prmkey,database);
        word = "Upright";
        translate="Dik";
        insertData(word,translate,prmkey,database);
        word = "Suntanned";
        translate="Bronzlaşmış";
        insertData(word,translate,prmkey,database);
        word = "Scruffy";
        translate="Kirli sakallı";
        insertData(word,translate,prmkey,database);
        word = "Slender";
        translate="İnce ( Vücut )";
        insertData(word,translate,prmkey,database);
        word = "Muscular";
        translate="Kaslı";
        insertData(word,translate,prmkey,database);
        word = "Appealing";
        translate="Çekici";
        insertData(word,translate,prmkey,database);
        word = "Magnificent";
        translate="Görkemli";
        insertData(word,translate,prmkey,database);
        word = "Charming";
        translate="Büyüleyici";
        insertData(word,translate,prmkey,database);
        word = "Plump";
        translate="Tombul";
        insertData(word,translate,prmkey,database);
        word = "Wrinkly";
        translate="Kırış kırış";
        insertData(word,translate,prmkey,database);
        word = "Petite";
        translate="Zarif";
        insertData(word,translate,prmkey,database);
        word = "Big-boned";
        translate="İri kemikli";
        insertData(word,translate,prmkey,database);
        word = "Stout";
        translate="İri yapılı";
        insertData(word,translate,prmkey,database);
        word = "Presentable";
        translate="Düzgün görünüşlü";
        insertData(word,translate,prmkey,database);
        word = "Hideous";
        translate="Çirkin ve berbat";
        insertData(word,translate,prmkey,database);
        word = "Graceful";
        translate="Zarif - Ağırbaşlı";
        insertData(word,translate,prmkey,database);

    }
    private void space()
    {
        packet_name = "Uzay";
        difficult = "1";
        prmkey = random();
        createPacket(packet_name,prmkey,database,difficult);
        word = "Planet";
        translate="Gezegen";
        insertData(word,translate,prmkey,database);
        word = "Star";
        translate="Yıldız";
        insertData(word,translate,prmkey,database);
        word = "The Sun";
        translate="Güneş";
        insertData(word,translate,prmkey,database);
        word = "The Moon";
        translate="Ay";
        insertData(word,translate,prmkey,database);
        word = "Galaxy";
        translate="Galaksi";
        insertData(word,translate,prmkey,database);
        word = "Space";
        translate="Uzay, boşluk";
        insertData(word,translate,prmkey,database);
        word = "Solar system";
        translate="Güneş sistemi";
        insertData(word,translate,prmkey,database);
        word = "Earth";
        translate="Dünya";
        insertData(word,translate,prmkey,database);
        word = "Mercury";
        translate="Merkür";
        insertData(word,translate,prmkey,database);
        word = "Venus";
        translate="Venüs";
        insertData(word,translate,prmkey,database);
        word = "Mars";
        translate="Mars";
        insertData(word,translate,prmkey,database);
        word = "Jupiter";
        translate="Jüpiter";
        insertData(word,translate,prmkey,database);
        word = "Saturn";
        translate="Satürn";
        insertData(word,translate,prmkey,database);
        word = "Uranus";
        translate="Uranüs";
        insertData(word,translate,prmkey,database);
        word = "Neptune";
        translate="Neptün";
        insertData(word,translate,prmkey,database);
        word = "Pluto";
        translate="Plüton";
        insertData(word,translate,prmkey,database);
        word = "Sky";
        translate="Gökyüzü";
        insertData(word,translate,prmkey,database);
        word = "Comet";
        translate="Kuyruklu yıldız";
        insertData(word,translate,prmkey,database);
        word = "Orbit";
        translate="Yörünge";
        insertData(word,translate,prmkey,database);
        word = "Asteroid";
        translate="Asteroit";
        insertData(word,translate,prmkey,database);
        word = "Meteor";
        translate="Gök taşı";
        insertData(word,translate,prmkey,database);
        word = "Satellite";
        translate="Uydu";
        insertData(word,translate,prmkey,database);
        word = "Telescope";
        translate="Teleskop";
        insertData(word,translate,prmkey,database);
        word = "The Milky Way";
        translate="Samanyolu";
        insertData(word,translate,prmkey,database);
    }
    private void religion()
    {
        packet_name = "Din";
        prmkey = random();
        difficult = "2";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Religion";
        translate="Din";
        insertData(word,translate,prmkey,database);
        word = "Mosque";
        translate="Cami";
        insertData(word,translate,prmkey,database);
        word = "Church";
        translate="Kilise";
        insertData(word,translate,prmkey,database);
        word = "Chapel";
        translate="Mescit";
        insertData(word,translate,prmkey,database);
        word = "Synagogue";
        translate="Sinagog";
        insertData(word,translate,prmkey,database);
        word = "God";
        translate="Tanrı";
        insertData(word,translate,prmkey,database);

        word = "Demon";
        translate="İblis";
        insertData(word,translate,prmkey,database);
        word = "Bell";
        translate="Çan";
        insertData(word,translate,prmkey,database);
        word = "Qoran";
        translate="Kuran";
        insertData(word,translate,prmkey,database);
        word = "Bible";
        translate="İncil";
        insertData(word,translate,prmkey,database);
        word = "Cross";
        translate="Haç";
        insertData(word,translate,prmkey,database);
        word = "Crescent";
        translate="Hilal";
        insertData(word,translate,prmkey,database);
        word = "Cathedral";
        translate="Katedral";
        insertData(word,translate,prmkey,database);
        word = "Priest";
        translate="Rahip";
        insertData(word,translate,prmkey,database);
        word = "Prophet";
        translate="Peygamber";
        insertData(word,translate,prmkey,database);
        word = "Worship";
        translate="İbadet";
        insertData(word,translate,prmkey,database);
        word = "Buddhist";
        translate="Budist";
        insertData(word,translate,prmkey,database);
        word = "Muslim";
        translate="Müslüman";
        insertData(word,translate,prmkey,database);
        word = "Christian";
        translate="Hristiyan";
        insertData(word,translate,prmkey,database);
        word = "Jewish";
        translate="Yahudi";
        insertData(word,translate,prmkey,database);
        word = "Islam";
        translate="İslam";
        insertData(word,translate,prmkey,database);
        word = "Secular";
        translate="Laik";
        insertData(word,translate,prmkey,database);
        word = "Faith";
        translate="İnanç";
        insertData(word,translate,prmkey,database);
    }
    private void question()
    {
        packet_name = "Soru cümleleri";
        difficult ="0";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);

        word = "What?";
        translate="Ne?";
        insertData(word,translate,prmkey,database);
        word = "Which?";
        translate="Hangi?";
        insertData(word,translate,prmkey,database);
        word = "Who?";
        translate="Kim?";
        insertData(word,translate,prmkey,database);
        word = "Whom?";
        translate="Kime?";
        insertData(word,translate,prmkey,database);
        word = "Whose?";
        translate="Kimin?";
        insertData(word,translate,prmkey,database);

        word = "How can I go to the Bank?";
        translate="Bankaya nasıl gidebilirim?";
        insertData(word,translate,prmkey,database);

        insertData(word,translate,prmkey,database);
        word = "Who called me last night?";
        translate="Dün gece beni kim aradı?";
        insertData(word,translate,prmkey,database);
        word = "Who made this beautiful painting?";
        translate="Bu güzel tabloyu kim yaptı?";
        insertData(word,translate,prmkey,database);
        word = "Who is your favourite singer?";
        translate="Favori şarkıcınız kim?";
        insertData(word,translate,prmkey,database);
        word = "Who will be attending the meeting?";
        translate="Toplantıya kim katılacak?";
        insertData(word,translate,prmkey,database);
        word = "To whom should I address this letter?";
        translate="Bu mektubu kime ithafen yazmalıyım?";
        insertData(word,translate,prmkey,database);
        word = "With whom are you going to the concert?";
        translate="Kiminle konsere gidiyorsun?";
        insertData(word,translate,prmkey,database);
        word = "Whom did you see at the store?";
        translate="Dün mağazada kimi gördün?";
        insertData(word,translate,prmkey,database);
        word = "By whom was this book written?";
        translate="Bu kim tarafından yazıldı?";
        insertData(word,translate,prmkey,database);
        word = "For whom is this package?";
        translate="Bu paket kime ait?";
        insertData(word,translate,prmkey,database);
        word = "Whose coat is this?";
        translate="Bu kimin ceketi?";
        insertData(word,translate,prmkey,database);
        word = "Whose idea was it to go on a trip?";
        translate="Seyahate çıkmak kimin fikriydi?";
        insertData(word,translate,prmkey,database);
        word = "Whose books are these?";
        translate="Bunlar kimin kitapları?";
        insertData(word,translate,prmkey,database);
        word = "Which movie do you want to watch?";
        translate="Hangi filmi izlemek istersin?";
        insertData(word,translate,prmkey,database);
        word = "Which of these shirts do you like the most?";
        translate="Bu gömleklerden en çok hangisini beğeniyorsun?";
        insertData(word,translate,prmkey,database);
        word = "Which road should we take?";
        translate="Hangi yoldan gitmeliyim?";
        insertData(word,translate,prmkey,database);
        word = "Which one is yours?";
        translate="Hangisi senin?";
        insertData(word,translate,prmkey,database);
        word = "Which dessert would you like?";
        translate="Hangi tatlıyı istersin?";
        insertData(word,translate,prmkey,database);
        word = "What happened here?";
        translate="Burada ne oldu?";
        insertData(word,translate,prmkey,database);
        word = "Who is the author of this book?";
        translate="Bu kitabın yazarı kim?";
        insertData(word,translate,prmkey,database);
        word = "Whom did you meet at the party?";
        translate="Partide kiminle tanıştın?";
        insertData(word,translate,prmkey,database);
        word = "Who made the cake?";
        translate="Bu keki kim yaptı?";
        insertData(word,translate,prmkey,database);
        word = "To whom did you give the book?";
        translate="Kitabı kime verdin?";
        insertData(word,translate,prmkey,database);
        word = "Who will be the next speaker?";
        translate="Bir sonraki konuşmacı kim?";
        insertData(word,translate,prmkey,database);


    }
    private void number()
    {
        packet_name = "Sayılar";
        prmkey = random();
        difficult="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "One";
        translate="Bir";
        insertData(word,translate,prmkey,database);
        word = "Two";
        translate="İki";
        insertData(word,translate,prmkey,database);
        word = "Three";
        translate="Üç";
        insertData(word,translate,prmkey,database);
        word = "Four";
        translate="Dört";
        insertData(word,translate,prmkey,database);
        word = "Five";
        translate="Beş";
        insertData(word,translate,prmkey,database);
        word = "Six";
        translate="Altı";
        insertData(word,translate,prmkey,database);
        word = "Seven";
        translate="Yedi";
        insertData(word,translate,prmkey,database);
        word = "Eight";
        translate="Sekiz";
        insertData(word,translate,prmkey,database);
        word = "Nine";
        translate="Dokuz";
        insertData(word,translate,prmkey,database);
        word = "Ten";
        translate="On";
        insertData(word,translate,prmkey,database);
        word = "Eleven";
        translate="Onbir";
        insertData(word,translate,prmkey,database);
        word = "Twelve";
        translate="Oniki";
        insertData(word,translate,prmkey,database);
        word = "Thirteen";
        translate="Onüç";
        insertData(word,translate,prmkey,database);
        word = "Fourteen";
        translate="Ondört";
        insertData(word,translate,prmkey,database);
        word = "Fifteen";
        translate="Onbeş";
        insertData(word,translate,prmkey,database);
        word = "Sixteen";
        translate="Onaltı";
        insertData(word,translate,prmkey,database);
        word = "Seventeen";
        translate="Onyedi";
        insertData(word,translate,prmkey,database);
        word = "Eighteen";
        translate="Onsekiz";
        insertData(word,translate,prmkey,database);
        word = "Nineteen";
        translate="Ondokuz";
        insertData(word,translate,prmkey,database);
        word = "Twenty";
        translate="Yirmi";
        insertData(word,translate,prmkey,database);
        word = "Thirty";
        translate="Otuz";
        insertData(word,translate,prmkey,database);
        word = "Forty";
        translate="Kırk";
        insertData(word,translate,prmkey,database);
        word = "Fifty";
        translate="Elli";
        insertData(word,translate,prmkey,database);
        word = "Sixty";
        translate="Altmış";
        insertData(word,translate,prmkey,database);
        word = "Seventy";
        translate="Yetmiş";
        insertData(word,translate,prmkey,database);
        word = "Seventy-five";
        translate="Yetmiş beş";
        insertData(word,translate,prmkey,database);
        word = "Eighty";
        translate="Seksen";
        insertData(word,translate,prmkey,database);
        word = "Ninety";
        translate="Doksan";
        insertData(word,translate,prmkey,database);
        word = "One hundred";
        translate="Yüz";
        insertData(word,translate,prmkey,database);
        word = "One million";
        translate="Bir milyon";
        insertData(word,translate,prmkey,database);
        word = "First";
        translate="Birinci";
        insertData(word,translate,prmkey,database);
        word = "Second";
        translate="İkinci";
        insertData(word,translate,prmkey,database);
        word = "Third";
        translate="Üçüncü";
        insertData(word,translate,prmkey,database);
        word = "Fourth";
        translate="Dördüncü";
        insertData(word,translate,prmkey,database);
        word = "Fifth";
        translate="Beşinci";
        insertData(word,translate,prmkey,database);
        word = "Sixth";
        translate="Altıncı";
        insertData(word,translate,prmkey,database);
        word = "Seventh";
        translate="Yedinci";
        insertData(word,translate,prmkey,database);
        word = "Eighth";
        translate="Sekizinci";
        insertData(word,translate,prmkey,database);
        word = "Ninth";
        translate="Dokuzuncu";
        insertData(word,translate,prmkey,database);
        word = "Tenth";
        translate="Onuncu";
        insertData(word,translate,prmkey,database);
    }
    private void view()
    {
        packet_name = "Manzara";
        prmkey = random();
        difficult="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Canyon";
        translate="Kanyon";
        insertData(word,translate,prmkey,database);
        word = "River";
        translate="Nehir";
        insertData(word,translate,prmkey,database);
        word = "Mountain";
        translate="Dağ";
        insertData(word,translate,prmkey,database);
        word = "Bridge";
        translate="Köprü";
        insertData(word,translate,prmkey,database);
        word = "Ocean";
        translate="Okyanus";
        insertData(word,translate,prmkey,database);
        word = "Lake";
        translate="Göl";
        insertData(word,translate,prmkey,database);
        word = "Field";
        translate="Tarla";
        insertData(word,translate,prmkey,database);
        word = "Tunnel";
        translate="Tünel";
        insertData(word,translate,prmkey,database);
        word = "City";
        translate="Şehir";
        insertData(word,translate,prmkey,database);
        word = "Road";
        translate="Yol";
        insertData(word,translate,prmkey,database);
        word = "Sea";
        translate="Deniz";
        insertData(word,translate,prmkey,database);
        word = "Plains";
        translate="Düzlükler";
        insertData(word,translate,prmkey,database);
        word = "Woods";
        translate="Orman";
        insertData(word,translate,prmkey,database);
        word = "Town";
        translate="Kasaba";
        insertData(word,translate,prmkey,database);
        word = "Village";
        translate="Köy";
        insertData(word,translate,prmkey,database);
        word = "Volcano";
        translate="Volkan";
        insertData(word,translate,prmkey,database);
        word = "Iceberg";
        translate="Buzdağı";
        insertData(word,translate,prmkey,database);
        word = "Forest";
        translate="Orman";
        insertData(word,translate,prmkey,database);
        word = "Desert";
        translate="Çöl";
        insertData(word,translate,prmkey,database);
        word = "Island";
        translate="Ada";
        insertData(word,translate,prmkey,database);

        word = "Waterfall";
        translate="Şelale";
        insertData(word,translate,prmkey,database);
        word = "Cliff";
        translate="Uçurum";
        insertData(word,translate,prmkey,database);
        word = "Creek";
        translate="Dere";
        insertData(word,translate,prmkey,database);
        word = "Swamp";
        translate="Bataklık";
        insertData(word,translate,prmkey,database);
        word = "Moor";
        translate="Bozkır";
        insertData(word,translate,prmkey,database);
    }
    private void health()
    {
        packet_name = "Sağlık";
        prmkey = random();
        difficult="2";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Health";
        translate="Sağlık";
        insertData(word,translate,prmkey,database);
        word = "Midwife";
        translate="Ebe";
        insertData(word,translate,prmkey,database);
        word = "Patient";
        translate="Hasta";
        insertData(word,translate,prmkey,database);
        word = "Surgeon";
        translate="Cerrah";
        insertData(word,translate,prmkey,database);
        word = "Hospital";
        translate="Hastahane";
        insertData(word,translate,prmkey,database);
        word = "Go on a diet";
        translate="Diyet yapmak";
        insertData(word,translate,prmkey,database);
        word = "Eye drops";
        translate="Göz damlası";
        insertData(word,translate,prmkey,database);
        word = "Syringe";
        translate="Şırınga";
        insertData(word,translate,prmkey,database);
        word = "Syrup";
        translate="Şurup";
        insertData(word,translate,prmkey,database);
        word = "Drugs";
        translate="İlaçlar";
        insertData(word,translate,prmkey,database);
        word = "Painkiller";
        translate="Ağrı kesici";
        insertData(word,translate,prmkey,database);
        word = "Pill";
        translate="Hap";
        insertData(word,translate,prmkey,database);
        word = "Tranquilizer";
        translate="Sakinleştirici";
        insertData(word,translate,prmkey,database);
        word = "Allergy";
        translate="Alerji";
        insertData(word,translate,prmkey,database);

        word = "Disease";
        translate="Hastalık";
        insertData(word,translate,prmkey,database);
        word = "Earache";
        translate="Kulak ağrısı";
        insertData(word,translate,prmkey,database);
        word = "Flu";
        translate="Grip";
        insertData(word,translate,prmkey,database);
        word = "Headache";
        translate="Baş ağrısı";
        insertData(word,translate,prmkey,database);
        word = "Heart attack";
        translate="Kalp krizi";
        insertData(word,translate,prmkey,database);
        word = "Sunburn";
        translate="Güneş yanığı";
        insertData(word,translate,prmkey,database);
        word = "Antibiotic";
        translate="Antibiyotik";
        insertData(word,translate,prmkey,database);
        word = "Pulse";
        translate="Nabız";
        insertData(word,translate,prmkey,database);
        word = "Pregnancy";
        translate="Gebelik";
        insertData(word,translate,prmkey,database);
        word = "Physiotherapy";
        translate="Fizyoterapi";
        insertData(word,translate,prmkey,database);


        word = "Pneumonia";
        translate="Zatürre";
        insertData(word,translate,prmkey,database);
        word = "Blind";
        translate="Kör";
        insertData(word,translate,prmkey,database);
        word = "Deaf";
        translate="Sağır";
        insertData(word,translate,prmkey,database);
        word = "Treatment";
        translate="Tedavi";
        insertData(word,translate,prmkey,database);
        word = "Examine";
        translate="Muayene etmek";
        insertData(word,translate,prmkey,database);
        word = "Backache";
        translate="Sırt ağrısı";
        insertData(word,translate,prmkey,database);
        word = "Nosebleed";
        translate="Burun kanaması";
        insertData(word,translate,prmkey,database);
        word = "Jaundice";
        translate="Sarılık";
        insertData(word,translate,prmkey,database);
        word = "Hypothermia";
        translate="Hipotermi";
        insertData(word,translate,prmkey,database);
        word = "Fracture";
        translate="Kırık";
        insertData(word,translate,prmkey,database);
        word = "Dizziness";
        translate="Baş dönmesi";
        insertData(word,translate,prmkey,database);
        word = "Cramp";
        translate="Kramp";
        insertData(word,translate,prmkey,database);
        word = "Diabetes";
        translate="Diyabet";
        insertData(word,translate,prmkey,database);

        word = "Fatigue";
        translate="Yorgunluk";
        insertData(word,translate,prmkey,database);
        word = "Painful";
        translate="Acı";
        insertData(word,translate,prmkey,database);
    }
    private void sport()
    {
        packet_name = "Spor";
        difficult="0";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);
        word = "Athletics";
        translate="Atletizm";
        insertData(word,translate,prmkey,database);
        word = "Baseball";
        translate="Beyzbol";
        insertData(word,translate,prmkey,database);
        word = "Basketball";
        translate="Basketbol";
        insertData(word,translate,prmkey,database);
        word = "Billiards";
        translate="Bilardo";
        insertData(word,translate,prmkey,database);
        word = "Diving";
        translate="Dalış";
        insertData(word,translate,prmkey,database);
        word = "Football";
        translate="Futbol";
        insertData(word,translate,prmkey,database);
        word = "Gymnastics";
        translate="Jimnastik";
        insertData(word,translate,prmkey,database);
        word = "Horse racing";
        translate="At yarışı";
        insertData(word,translate,prmkey,database);
        word = "Jogging";
        translate="Koşu";
        insertData(word,translate,prmkey,database);
        word = "Paragliding";
        translate="Yamaç paraşütü";
        insertData(word,translate,prmkey,database);
        word = "Rowing";
        translate="Kürek çekme";
        insertData(word,translate,prmkey,database);
        word = "Volleyball";
        translate="Voleybol";
        insertData(word,translate,prmkey,database);
        word = "Weightlifting";
        translate="Ağırlık kaldırma";
        insertData(word,translate,prmkey,database);
    }
    private void office()
    {
        packet_name = "Ofis";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Office";
        translate="Ofis";
        insertData(word,translate,prmkey,database);
        word = "Paper";
        translate="Kağıt";
        insertData(word,translate,prmkey,database);
        word = "File";
        translate="Dosya";
        insertData(word,translate,prmkey,database);
        word = "Folder";
        translate="Klasör";
        insertData(word,translate,prmkey,database);
        word = "Cupboard";
        translate="Dolap";
        insertData(word,translate,prmkey,database);
        word = "Printer";
        translate="Yazıcı";
        insertData(word,translate,prmkey,database);
        word = "Plant";
        translate="Bitki";
        insertData(word,translate,prmkey,database);
        word = "Telephone";
        translate="Telefon";
        insertData(word,translate,prmkey,database);
        word = "Chair";
        translate="Sandalye";
        insertData(word,translate,prmkey,database);
        word = "Photocopier";
        translate="Fotokopi makinası";
        insertData(word,translate,prmkey,database);
        word = "Briefcase";
        translate="Evrak çantası";
        insertData(word,translate,prmkey,database);
        word = "Pen";
        translate="Kalem";
        insertData(word,translate,prmkey,database);
        word = "Calculator";
        translate="Hesap makinası";
        insertData(word,translate,prmkey,database);
        word = "Stapler";
        translate="Zımba";
        insertData(word,translate,prmkey,database);
        word = "Hole punch";
        translate="Delgeç";
        insertData(word,translate,prmkey,database);
        word = "Desk";
        translate="Masa";
        insertData(word,translate,prmkey,database);
        word = "Projector";
        translate="Projektör";
        insertData(word,translate,prmkey,database);
        word = "Safe";
        translate="Kasa";
        insertData(word,translate,prmkey,database);
        word = "Seal";
        translate="Mühür";
        insertData(word,translate,prmkey,database);
        word = "Stamp";
        translate="Kaşe";
        insertData(word,translate,prmkey,database);
        word = "Eraser";
        translate="Silgi";
        insertData(word,translate,prmkey,database);
        word = "Notepad";
        translate="Not defteri";
        insertData(word,translate,prmkey,database);
        word = "Board markers";
        translate="Tahta kalemi";
        insertData(word,translate,prmkey,database);
        word = "Pushpin";
        translate="Raptiye";
        insertData(word,translate,prmkey,database);
        word = "Waste basket";
        translate="Çöp kutusu";
        insertData(word,translate,prmkey,database);
        word = "Pencil sharpener";
        translate="Kalemtraş";
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
        word = "Touchscreen";
        translate="Dokunmatik ekran";
        insertData(word,translate,prmkey,database);
        word = "Cursor";
        translate="İmleç";
        insertData(word,translate,prmkey,database);
        word = "Drop-down menu";
        translate="Açılır menü";
        insertData(word,translate,prmkey,database);
        word = "Interface";
        translate="Arayüz";
        insertData(word,translate,prmkey,database);
        word = "To load";
        translate="Yüklemek";
        insertData(word,translate,prmkey,database);
        word = "To encode";
        translate="Şifrelemek";
        insertData(word,translate,prmkey,database);
        word = "To code";
        translate="Kod yazmak";
        insertData(word,translate,prmkey,database);
        word = "Command";
        translate="Emir";
        insertData(word,translate,prmkey,database);
        word = "Browser";
        translate="Tarayıcı";
        insertData(word,translate,prmkey,database);
        word = "Bug";
        translate="Yazılım hatası";
        insertData(word,translate,prmkey,database);
        word = "Backup";
        translate="Yedekleme";
        insertData(word,translate,prmkey,database);
        word = "Cache";
        translate="Önbellek";
        insertData(word,translate,prmkey,database);
        word = "Captcha code";
        translate="Güvenlik kodu";
        insertData(word,translate,prmkey,database);
        word = "Online";
        translate="Çevrimiçi";
        insertData(word,translate,prmkey,database);
        word = "Offline";
        translate="Çevrimdışı";
        insertData(word,translate,prmkey,database);
        word = "Password";
        translate="Parola";
        insertData(word,translate,prmkey,database);
        word = "Plug-in";
        translate="Eklenti";
        insertData(word,translate,prmkey,database);
        word = "Reboot";
        translate="Tekrar başlatmak";
        insertData(word,translate,prmkey,database);
        word = "Resolution";
        translate="Çözünürlük";
        insertData(word,translate,prmkey,database);
        word = "Search engine";
        translate="Arama motoru";
        insertData(word,translate,prmkey,database);
        word = "Software";
        translate="Yazılım";
        insertData(word,translate,prmkey,database);
        word = "Storage";
        translate="Depolama";
        insertData(word,translate,prmkey,database);
        word = "Virtual";
        translate="Sanal";
        insertData(word,translate,prmkey,database);
        word = "Import";
        translate="İçe aktar";
        insertData(word,translate,prmkey,database);
        word = "Hardware";
        translate="Donanım";
        insertData(word,translate,prmkey,database);
        word = "Keyword";
        translate="Anahtar kelime";
        insertData(word,translate,prmkey,database);
        word = "Toolbar";
        translate="Araç çubuğu";
        insertData(word,translate,prmkey,database);
        word = "Template";
        translate="Şablon";
        insertData(word,translate,prmkey,database);
        word = "Convert";
        translate="Dönüştürmek";
        insertData(word,translate,prmkey,database);
    }
    private void art()
    {
        packet_name = "Sanat";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Art";
        translate="Sanat";
        insertData(word,translate,prmkey,database);
        word = "Art gallery";
        translate="Sanat galerisi";
        insertData(word,translate,prmkey,database);
        word = "Artist";
        translate="Sanatçı";
        insertData(word,translate,prmkey,database);
        word = "Classic";
        translate="Klasik";
        insertData(word,translate,prmkey,database);
        word = "Collection";
        translate="Koleksiyon";
        insertData(word,translate,prmkey,database);
        word = "Colour";
        translate="Renk";
        insertData(word,translate,prmkey,database);
        word = "Crafts";
        translate="El sanatları";
        insertData(word,translate,prmkey,database);
        word = "Culture";
        translate="Kültür";
        insertData(word,translate,prmkey,database);
        word = "Design";
        translate="Dizayn";
        insertData(word,translate,prmkey,database);
        word = "Exhibit";
        translate="Sergilemek";
        insertData(word,translate,prmkey,database);
        word = "Focus";
        translate="Odak";
        insertData(word,translate,prmkey,database);
        word = "Background";
        translate="Arka plan";
        insertData(word,translate,prmkey,database);
        word = "Graphic";
        translate="Grafik";
        insertData(word,translate,prmkey,database);
        word = "Imagination";
        translate="Hayal gücü";
        insertData(word,translate,prmkey,database);
        word = "Oil paint";
        translate="Yağlı boya";
        insertData(word,translate,prmkey,database);
        word = "Outline";
        translate="Taslak";
        insertData(word,translate,prmkey,database);
        word = "Painter";
        translate="Ressam";
        insertData(word,translate,prmkey,database);
        word = "Portrait";
        translate="Portre";
        insertData(word,translate,prmkey,database);
        word = "Popular";
        translate="Popüler";
        insertData(word,translate,prmkey,database);
        word = "Skill";
        translate="Beceri";
        insertData(word,translate,prmkey,database);
        word = "Technique ";
        translate="Teknik";
        insertData(word,translate,prmkey,database);
        word = "Tone";
        translate="Ton";
        insertData(word,translate,prmkey,database);
        word = "Visual";
        translate="Görsel";
        insertData(word,translate,prmkey,database);
        word = "Landscape";
        translate="Manzara";
        insertData(word,translate,prmkey,database);
        word = "Emotion";
        translate="Duygu";
        insertData(word,translate,prmkey,database);
        word = "Composition";
        translate="Kompozisyon";
        insertData(word,translate,prmkey,database);
        word = "Canvas";
        translate="Tuval";
        insertData(word,translate,prmkey,database);
        word = "Perspective";
        translate="Perspektif";
        insertData(word,translate,prmkey,database);
        word = "Dramatic";
        translate="Dramatik";
        insertData(word,translate,prmkey,database);
        word = "Celebrity";
        translate="Şöhret";
        insertData(word,translate,prmkey,database);
        word = "Abstract";
        translate="Soyut";
        insertData(word,translate,prmkey,database);
        word = "Realistic";
        translate="Gerçekçi";
        insertData(word,translate,prmkey,database);
        word = "Shadow";
        translate="Gölge";
        insertData(word,translate,prmkey,database);
        word = "Texture";
        translate="Doku";
        insertData(word,translate,prmkey,database);
        word = "Unique";
        translate="Benzersiz";
        insertData(word,translate,prmkey,database);
        word = "Viewpoint";
        translate="Bakış açısı";
        insertData(word,translate,prmkey,database);
        word = "Statue";
        translate="Heykel";
        insertData(word,translate,prmkey,database);
    }
    private void trade()
    {
        packet_name = "Ticaret";
        prmkey = random();
        difficult ="2";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Advantage";
        translate="Avantaj";
        insertData(word,translate,prmkey,database);
        word = "Advertise";
        translate="Duyurmak";
        insertData(word,translate,prmkey,database);
        word = "Advice";
        translate="Tavsiye Etmek";
        insertData(word,translate,prmkey,database);
        word = "Authorization";
        translate="Yetki";
        insertData(word,translate,prmkey,database);
        word = "Brand";
        translate="Marka";
        insertData(word,translate,prmkey,database);
        word = "Commission";
        translate="Komisyon";
        insertData(word,translate,prmkey,database);
        word = "Customer";
        translate="Müşteri";
        insertData(word,translate,prmkey,database);
        word = "Creditor";
        translate="Alacaklı";
        insertData(word,translate,prmkey,database);
        word = "Deadline";
        translate="Son tarih";
        insertData(word,translate,prmkey,database);
        word = "Debt";
        translate="Borç";
        insertData(word,translate,prmkey,database);
        word = "Description";
        translate="Tanım";
        insertData(word,translate,prmkey,database);
        word = "Disadvantage";
        translate="Dezavantaj";
        insertData(word,translate,prmkey,database);
        word = "Employee";
        translate="İşçi";
        insertData(word,translate,prmkey,database);
        word = "Employer";
        translate="İşveren";
        insertData(word,translate,prmkey,database);
        word = "Experience";
        translate="Deneyim";
        insertData(word,translate,prmkey,database);
        word = "Factory";
        translate="Fabrika";
        insertData(word,translate,prmkey,database);
        word = "Goal";
        translate="Hedef";
        insertData(word,translate,prmkey,database);
        word = "Industry";
        translate="Sanayi";
        insertData(word,translate,prmkey,database);
        word = "Instructions";
        translate="Talimatlar";
        insertData(word,translate,prmkey,database);
        word = "Invoice";
        translate="Fatura";
        insertData(word,translate,prmkey,database);
        word = "Order";
        translate="Sipariş";
        insertData(word,translate,prmkey,database);
        word = "Payment";
        translate="Ödeme";
        insertData(word,translate,prmkey,database);
        word = "Production";
        translate="Üretim";
        insertData(word,translate,prmkey,database);
        word = "Product";
        translate="Ürün";
        insertData(word,translate,prmkey,database);
        word = "Profit";
        translate="Kar";
        insertData(word,translate,prmkey,database);
        word = "Purchase";
        translate="Satın almak";
        insertData(word,translate,prmkey,database);
        word = "Pay";
        translate="Ödemek";
        insertData(word,translate,prmkey,database);
        word = "Transport";
        translate="Taşıma";
        insertData(word,translate,prmkey,database);
        word = "Interest";
        translate="Faiz";
        insertData(word,translate,prmkey,database);
    }
    private void law()
    {
        packet_name = "Hukuk ve Kanun";
        prmkey = random();
        difficult ="2";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Law";
        translate="Kanun";
        insertData(word,translate,prmkey,database);
        word = "Arrest";
        translate="Tutuklama";
        insertData(word,translate,prmkey,database);
        word = "Assault";
        translate="Saldırı";
        insertData(word,translate,prmkey,database);
        word = "Claim";
        translate="İddia";
        insertData(word,translate,prmkey,database);
        word = "Complaint";
        translate="Şikayet";
        insertData(word,translate,prmkey,database);
        word = "Confess";
        translate="İtiraf etmek";
        insertData(word,translate,prmkey,database);
        word = "Constitution";
        translate="Anayasa";
        insertData(word,translate,prmkey,database);
        word = "Court";
        translate="Mahkeme";
        insertData(word,translate,prmkey,database);
        word = "Criminal";
        translate="Sabıkalı";
        insertData(word,translate,prmkey,database);
        word = "Custody";
        translate="Gözaltı";
        insertData(word,translate,prmkey,database);
        word = "Defendant";
        translate="Sanık";
        insertData(word,translate,prmkey,database);
        word = "Ethics";
        translate="Ahlak";
        insertData(word,translate,prmkey,database);
        word = "Evidence";
        translate="Kanıt";
        insertData(word,translate,prmkey,database);
        word = "Fraud";
        translate="Dolandırıcılık";
        insertData(word,translate,prmkey,database);
        word = "Handcuff";
        translate="Kelepçe";
        insertData(word,translate,prmkey,database);
        word = "Hearsay";
        translate="Söylenti";
        insertData(word,translate,prmkey,database);
        word = "Jail";
        translate="Hapis";
        insertData(word,translate,prmkey,database);
        word = "Justice";
        translate="Adalet";
        insertData(word,translate,prmkey,database);
        word = "Theft";
        translate="Hırsızlık";
        insertData(word,translate,prmkey,database);
        word = "Prison";
        translate="Cezaevi";
        insertData(word,translate,prmkey,database);
        word = "Police station";
        translate="Polis merkezi";
        insertData(word,translate,prmkey,database);
        word = "Lawsuit";
        translate="Dava";
        insertData(word,translate,prmkey,database);
        word = "Murder";
        translate="Cinayet";
        insertData(word,translate,prmkey,database);
        word = "Petition";
        translate="Dilekçe";
        insertData(word,translate,prmkey,database);
    }
    private void future_tense()
    {
        packet_name = "Gelecek Zaman";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "I will not eat lunch.";
        translate="Ben öğle yemeği yemeyeceğim";
        insertData(word,translate,prmkey,database);
        word = "She will go to school on this monday.";
        translate="O, bu pazartesi okula gidecek";
        insertData(word,translate,prmkey,database);
        word = "They will get marry in the future.";
        translate="Onlar gelecekte evlenecek.";
        insertData(word,translate,prmkey,database);
        word = "He will use my computer.";
        translate="O, benim bilgisayarımı kullanacak.";
        insertData(word,translate,prmkey,database);
        word = "Will you stay in hotel?";
        translate="Otelde kalacak mısınız?";
        insertData(word,translate,prmkey,database);
        word = "They will not give you a gift.";
        translate="Onlar sana hediye vermeyecek.";
        insertData(word,translate,prmkey,database);
        word = "Is your friend going to come with you?";
        translate="Arkadaşın seninle gelecek mi?";
        insertData(word,translate,prmkey,database);
        word = "When are you going to graduate?";
        translate="Ne zaman mezun olacaksın?";
        insertData(word,translate,prmkey,database);
        word = "Who is going to send the letter?";
        translate="Mektubu kim gönderecek?";
        insertData(word,translate,prmkey,database);
        word = "I am going to send the letter.";
        translate="Mektubu ben göndereceğim.";
        insertData(word,translate,prmkey,database);
        word = "Why are you going to learn English?";
        translate="Neden İngilizce öğreneceksin?";
        insertData(word,translate,prmkey,database);
    }
    private void home()
    {
        packet_name = "Ev";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Sofa";
        translate="Kanepe";
        insertData(word,translate,prmkey,database);
        word = "Coffee table";
        translate="Sehpa";
        insertData(word,translate,prmkey,database);
        word = "Dining table";
        translate="Yemek masası";
        insertData(word,translate,prmkey,database);
        word = "Wardrobe";
        translate="Gardırop";
        insertData(word,translate,prmkey,database);
        word = "Bookshelf ";
        translate="Kitaplık";
        insertData(word,translate,prmkey,database);
        word = "Dresser";
        translate="Şifonyer";
        insertData(word,translate,prmkey,database);
        word = "Nightstand";
        translate="Komodin";
        insertData(word,translate,prmkey,database);
        word = "Lampshade";
        translate="Abajur";
        insertData(word,translate,prmkey,database);
        word = "Knife";
        translate="Bıçak";
        insertData(word,translate,prmkey,database);
        word = "Fork";
        translate="Çatal";
        insertData(word,translate,prmkey,database);
        word = "Spoon";
        translate="Kaşık";
        insertData(word,translate,prmkey,database);
        word = "Plate";
        translate="Tabak";
        insertData(word,translate,prmkey,database);
        word = "Rug";
        translate="Halı";
        insertData(word,translate,prmkey,database);
        word = "Mirror";
        translate="Ayna";
        insertData(word,translate,prmkey,database);
        word = "Bedroom";
        translate="Yatak odası";
        insertData(word,translate,prmkey,database);
        word = "Living room";
        translate="Oturma odası";
        insertData(word,translate,prmkey,database);
        word = "Kitchen";
        translate="Mutfak";
        insertData(word,translate,prmkey,database);
        word = "Bathroom";
        translate="Banyo";
        insertData(word,translate,prmkey,database);
    }
    private void music()
    {
        difficult ="0";
        packet_name = "Müzik";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);
        word = "Violin";
        translate="Keman";
        insertData(word,translate,prmkey,database);
        word = "Saxophone";
        translate="Saksafon";
        insertData(word,translate,prmkey,database);
        word = "Clarinet";
        translate="Klarnet";
        insertData(word,translate,prmkey,database);
        word = "Beat";
        translate="Tempo";
        insertData(word,translate,prmkey,database);
        word = "Tune";
        translate="Melodi";
        insertData(word,translate,prmkey,database);
        word = "Acoustic";
        translate="Akustik";
        insertData(word,translate,prmkey,database);
        word = "Headphones";
        translate="Kulaklık";
        insertData(word,translate,prmkey,database);
        word = "Guitar";
        translate="Gitar";
        insertData(word,translate,prmkey,database);
    }
    private void country()
    {
        difficult ="0";
        packet_name = "Ülkeler";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);

        word = "Scotland";
        translate="İskoçya";
        insertData(word,translate,prmkey,database);
        word = "Russia";
        translate="Rusya";
        insertData(word,translate,prmkey,database);
        word = "Ireland";
        translate="İrlanda";
        insertData(word,translate,prmkey,database);
        word = "Japan";
        translate="Japonya";
        insertData(word,translate,prmkey,database);
        word = "Denmark";
        translate="Danimarka";
        insertData(word,translate,prmkey,database);
        word = "Finland";
        translate="Finlandiya";
        insertData(word,translate,prmkey,database);
        word = "Norway";
        translate="Norveç";
        insertData(word,translate,prmkey,database);
        word = "Sweden";
        translate="İsveç";
        insertData(word,translate,prmkey,database);
        word = "Switzerland";
        translate="İsviçre";
        insertData(word,translate,prmkey,database);
        word = "France";
        translate="Fransa";
        insertData(word,translate,prmkey,database);
        word = "Germany";
        translate="Almanya";
        insertData(word,translate,prmkey,database);
        word = "Netherlands";
        translate="Hollanda";
        insertData(word,translate,prmkey,database);
        word = "Ukraine";
        translate="Ukrayna";
        insertData(word,translate,prmkey,database);
        word = "Bulgaria";
        translate="Bulgaristan";
        insertData(word,translate,prmkey,database);
        word = "Portugal";
        translate="Portekiz";
        insertData(word,translate,prmkey,database);
        word = "Turkey";
        translate="Türkiye";
        insertData(word,translate,prmkey,database);
        word = "India";
        translate="Hindistan";
        insertData(word,translate,prmkey,database);
        word = "Greece";
        translate="Yunanistan";
        insertData(word,translate,prmkey,database);
        word = "Hungary";
        translate="Macaristan";
        insertData(word,translate,prmkey,database);
        word = "Asia";
        translate="Asya";
        insertData(word,translate,prmkey,database);
        word = "Europe";
        translate="Avrupa";
        insertData(word,translate,prmkey,database);
        word = "America";
        translate="Amerika";
        insertData(word,translate,prmkey,database);
        word = "Africa";
        translate="Afrika";
        insertData(word,translate,prmkey,database);
        word = "Antarctica";
        translate="Antarktika";
        insertData(word,translate,prmkey,database);
        word = "Turkish";
        translate="Türkçe";
        insertData(word,translate,prmkey,database);
        word = "Spanish";
        translate="İspanyolca";
        insertData(word,translate,prmkey,database);
        word = "Greek";
        translate="Yunanca";
        insertData(word,translate,prmkey,database);
        word = "Armenian";
        translate="Ermenice";
        insertData(word,translate,prmkey,database);
        word = "Arabic";
        translate="Arapça";
        insertData(word,translate,prmkey,database);
        word = "Hindi";
        translate="Hintçe";
        insertData(word,translate,prmkey,database);
        word = "Chinese";
        translate="Çince";
        insertData(word,translate,prmkey,database);
        word = "Portuguese";
        translate="Portekizce";
        insertData(word,translate,prmkey,database);
        word = "Russian";
        translate="Rusça";
        insertData(word,translate,prmkey,database);
        word = "French";
        translate="Fransızca";
        insertData(word,translate,prmkey,database);
        word = "Italian";
        translate="İtalyanca";
        insertData(word,translate,prmkey,database);
        word = "Japanese";
        translate="Japonca";
        insertData(word,translate,prmkey,database);
        word = "German";
        translate="Almanca";
        insertData(word,translate,prmkey,database);
    }
    private void shopping()
    {
        packet_name = "Alış Veriş";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Shopping";
        translate="Alışveriş";
        insertData(word,translate,prmkey,database);
        word = "Shopping centre";
        translate="Alışveriş merkezi";
        insertData(word,translate,prmkey,database);
        word = "How much is it?";
        translate="Fiyatı nedir?";
        insertData(word,translate,prmkey,database);
        word = "Have you got this in different colours?";
        translate="Bunun farklı renkleri var mı?";
        insertData(word,translate,prmkey,database);
        word = "Is this the last price for this shirt?";
        translate="Bu gömlek için son fiyat bu mudur?";
        insertData(word,translate,prmkey,database);
        word = "Can you make a reduction for the dress?";
        translate="Bu elbise için indirim yapabilir misiniz?";
        insertData(word,translate,prmkey,database);
        word = "Can I pay by card?";
        translate="Kartla ödeyebilir miyim?";
        insertData(word,translate,prmkey,database);
        word = "Could gift-wrap it?";
        translate="Hediye paketi yapabilir misiniz?";
        insertData(word,translate,prmkey,database);
        word = "It is too tight";
        translate="Çok dar.";
        insertData(word,translate,prmkey,database);
        word = "It is too loose.";
        translate="Çok geniş";
        insertData(word,translate,prmkey,database);
        word = "How can I help you?";
        translate="Size nasıl yardımcı olabilirim?";
        insertData(word,translate,prmkey,database);
        word = "Can you help me?";
        translate="Bana yardım edebilir misiniz?";
        insertData(word,translate,prmkey,database);
        word = "I want to return this.";
        translate="Bunu iade etmek istiyorum";
        insertData(word,translate,prmkey,database);
        word = "Where is the fitting room?";
        translate="Deneme kabini nerede?";
        insertData(word,translate,prmkey,database);
        word = "What size do you wear?";
        translate="Kaç beden giyiyorsunuz?";
        insertData(word,translate,prmkey,database);
        word = "Do you have this in different sizes?";
        translate="Bunun başka bedenleri var mıdır?";
        insertData(word,translate,prmkey,database);
        word = "My size is medium";
        translate="Medium beden giyiyorum.";
        insertData(word,translate,prmkey,database);
        word = "How does it look?";
        translate="Nasıl görünüyor?";
        insertData(word,translate,prmkey,database);
        word = "How would you like to pay?";
        translate="Nasıl ödemek istersiniz?";
        insertData(word,translate,prmkey,database);
        word = "Will that be cash or credit?";
        translate="Nakit mi kredi kartı mı?";
        insertData(word,translate,prmkey,database);
        word = "We do not have it in your size.";
        translate="Bunun size göre olan bedeni yok.";
        insertData(word,translate,prmkey,database);
        word = "Thank you, I am just looking.";
        translate="Teşekkürler, sadece bakıyorum.";
        insertData(word,translate,prmkey,database);
        word = "That is too expensive.";
        translate="Çok pahalı.";
        insertData(word,translate,prmkey,database);
        word = "That looks nice on you";
        translate="Üzerinizde güzel durdu";
        insertData(word,translate,prmkey,database);
    }
    private void exm_senteces()
    {
        packet_name = "Örnek Cümleler";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Smoking is harmful to health.";
        translate="Sigara sağlığa zararlıdır.";
        insertData(word,translate,prmkey,database);
        word = "The photo you shared on Instagram is very beautiful.";
        translate="Instagram'da paylaştığın fotoğraf çok güzel.";
        insertData(word,translate,prmkey,database);
        word = "I lost my pen.";
        translate="Kalemimi kaybettim";
        insertData(word,translate,prmkey,database);
        word = "It's too late, let's go home now..";
        translate="Çok geç oldu, artık eve gidelim.";
        insertData(word,translate,prmkey,database);
        word = "I am drinking coffee";
        translate="Kahve içiyorum.";
        insertData(word,translate,prmkey,database);
        word = "You are so handsome.";
        translate="Çok yakışıklısın.";
        insertData(word,translate,prmkey,database);
        word = "I love you.";
        translate="Seni seviyorum";
        insertData(word,translate,prmkey,database);
        word = "Are you coming with me?";
        translate="Benimle geliyor musun?";
        insertData(word,translate,prmkey,database);
        word = "What do you need?";
        translate="Neye ihtiyacın var?";
        insertData(word,translate,prmkey,database);
        word = "What happened?";
        translate="Ne oldu?";
        insertData(word,translate,prmkey,database);
        word = "I admire you.";
        translate="Sana hayranım.";
        insertData(word,translate,prmkey,database);
        word = "I got it.";
        translate="Anladım";
        insertData(word,translate,prmkey,database);
        word = "I hope so.";
        translate="Umarım.";
        insertData(word,translate,prmkey,database);
        word = "Nice to meet you.";
        translate="Tanıştığıma memnun oldum";
        insertData(word,translate,prmkey,database);
        word = "See you later.";
        translate="Sonra görüşürüz.";
        insertData(word,translate,prmkey,database);
        word = "I have no idea.";
        translate="Fikrim yok.";
        insertData(word,translate,prmkey,database);
        word = "I am not hungry.";
        translate="Aç değilim.";
        insertData(word,translate,prmkey,database);
        word = "Are you okay? You look pale.";
        translate="İyi misin? Yorgun görünüyorsun.";
        insertData(word,translate,prmkey,database);
        word = "You broke my favorite necklace.";
        translate="En sevdiğim kolyemi kırdın.";
        insertData(word,translate,prmkey,database);
        word = "I will call you.";
        translate="Seni arayacağım.";
        insertData(word,translate,prmkey,database);
        word = "I feel good.";
        translate="İyi hissediyorum.";
        insertData(word,translate,prmkey,database);
        word = "I am so busy.";
        translate="Çok yoğunum.";
        insertData(word,translate,prmkey,database);
    }
    private void communicate()
    {
        packet_name = "İletişim";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Advertisement";
        translate="Reklam";
        insertData(word,translate,prmkey,database);
        word = "Mass media";
        translate="Kitle iletişim araçları";
        insertData(word,translate,prmkey,database);
        word = "Social Media";
        translate="Sosyal Medya";
        insertData(word,translate,prmkey,database);
        word = "Radio station";
        translate="Radyo istasyonu";
        insertData(word,translate,prmkey,database);
        word = "News";
        translate="Haberler";
        insertData(word,translate,prmkey,database);
        word = "Social network";
        translate="Sosyal Ağ";
        insertData(word,translate,prmkey,database);
        word = "Announce";
        translate="Duyurmak";
        insertData(word,translate,prmkey,database);
        word = "Listener";
        translate="Dinleyici";
        insertData(word,translate,prmkey,database);
        word = "Audience";
        translate="İzleyici";
        insertData(word,translate,prmkey,database);
        word = "Journalist";
        translate="Gazeteci";
        insertData(word,translate,prmkey,database);
        word = "Reporter";
        translate="Muhabir";
        insertData(word,translate,prmkey,database);
        word = "Documentary";
        translate="Belgesel";
        insertData(word,translate,prmkey,database);
        word = "Broadcast";
        translate="Yayın";
        insertData(word,translate,prmkey,database);
        word = "Newspaper";
        translate="Gazete";
        insertData(word,translate,prmkey,database);
        word = "Brochure";
        translate="Broşür";
        insertData(word,translate,prmkey,database);
        word = "Subtitles";
        translate="Altyazı";
        insertData(word,translate,prmkey,database);
        word = "Censorship";
        translate="Sansür";
        insertData(word,translate,prmkey,database);
        word = "Message";
        translate="Mesaj";
        insertData(word,translate,prmkey,database);
        word = "Letter";
        translate="Mektup";
        insertData(word,translate,prmkey,database);
        word = "Television";
        translate="Televizyon";
        insertData(word,translate,prmkey,database);
    }
    private void electronic_dev()
    {
        packet_name = "Elektronik Aletler";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Computer";
        translate="Bilgisayar";
        insertData(word,translate,prmkey,database);
        word = "Database";
        translate="Veritabanı";
        insertData(word,translate,prmkey,database);
        word = "Firewall";
        translate="Güvenlik duvarı";
        insertData(word,translate,prmkey,database);
        word = "Processor";
        translate="İşlemci";
        insertData(word,translate,prmkey,database);
        word = "Device";
        translate="Cihaz";
        insertData(word,translate,prmkey,database);
        word = "Fridge";
        translate="Buzdolabı";
        insertData(word,translate,prmkey,database);
        word = "Deep freezer";
        translate="Derin dondurucu";
        insertData(word,translate,prmkey,database);
        word = "Microwave oven";
        translate="Mikrodalga fırın";
        insertData(word,translate,prmkey,database);
        word = "Washing machine";
        translate="Çamaşır Makinası";
        insertData(word,translate,prmkey,database);
        word = "Dryer";
        translate="Kurutma makinası";
        insertData(word,translate,prmkey,database);
        word = "Oven";
        translate="Fırın";
        insertData(word,translate,prmkey,database);
        word = "İron";
        translate="Ütü";
        insertData(word,translate,prmkey,database);
        word = "Speaker";
        translate="Hoparlör";
        insertData(word,translate,prmkey,database);
        word = "Keyboard";
        translate="Klavye";
        insertData(word,translate,prmkey,database);
        word = "Smartphone";
        translate="Akıllı telefon";
        insertData(word,translate,prmkey,database);
        word = "Printer";
        translate="Yazıcı";
        insertData(word,translate,prmkey,database);
        word = "Screen";
        translate="Ekran";
        insertData(word,translate,prmkey,database);
        word = "Memory card";
        translate="Hafıza kartı";
        insertData(word,translate,prmkey,database);
    }
    private void body()
    {
        packet_name = "Vücut";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Head";
        translate="Baş";
        insertData(word,translate,prmkey,database);
        word = "Body";
        translate="Vücut";
        insertData(word,translate,prmkey,database);
        word = "Hair";
        translate="Saç";
        insertData(word,translate,prmkey,database);
        word = "Eye";
        translate="Göz";
        insertData(word,translate,prmkey,database);
        word = "Mouth";
        translate="Ağız";
        insertData(word,translate,prmkey,database);
        word = "Tooth";
        translate="Diş";
        insertData(word,translate,prmkey,database);
        word = "Teeth";
        translate="Dişler";
        insertData(word,translate,prmkey,database);
        word = "Knee";
        translate="Diz";
        insertData(word,translate,prmkey,database);
        word = "Hand";
        translate="El";
        insertData(word,translate,prmkey,database);
        word = "Face";
        translate="Yüz";
        insertData(word,translate,prmkey,database);
        word = "Ear";
        translate="Kulak";
        insertData(word,translate,prmkey,database);
        word = "Finger";
        translate="Parmak";
        insertData(word,translate,prmkey,database);
        word = "Ankle";
        translate="Ayak bileği";
        insertData(word,translate,prmkey,database);
        word = "Back";
        translate="Sırt";
        insertData(word,translate,prmkey,database);
        word = "Hip";
        translate="Kalça";
        insertData(word,translate,prmkey,database);
        word = "Beard";
        translate="Sakal";
        insertData(word,translate,prmkey,database);
        word = "Blood";
        translate="Kan";
        insertData(word,translate,prmkey,database);
        word = "Bone";
        translate="Kemik";
        insertData(word,translate,prmkey,database);
        word = "Cheek";
        translate="Yanak";
        insertData(word,translate,prmkey,database);
        word = "Chin";
        translate="Çene";
        insertData(word,translate,prmkey,database);
        word = "Elbow";
        translate="Dirsek";
        insertData(word,translate,prmkey,database);
        word = "Foot";
        translate="Ayak";
        insertData(word,translate,prmkey,database);
        word = "Feet";
        translate="Ayaklar";
        insertData(word,translate,prmkey,database);
        word = "Leg";
        translate="Bacak";
        insertData(word,translate,prmkey,database);
        word = "Lip";
        translate="Dudak";
        insertData(word,translate,prmkey,database);
        word = "Nose";
        translate="Burun";
        insertData(word,translate,prmkey,database);
        word = "Shoulder";
        translate="Omuz";
        insertData(word,translate,prmkey,database);
        word = "Skin";
        translate="Cilt";
        insertData(word,translate,prmkey,database);
        word = "Tongue";
        translate="Dil";
        insertData(word,translate,prmkey,database);
    }
    private void adjectives()
    {
        packet_name = "Sıfatlar";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "New";
        translate="Yeni";
        insertData(word,translate,prmkey,database);
        word = "Old";
        translate="Eski";
        insertData(word,translate,prmkey,database);
        word = "Big";
        translate="Büyük";
        insertData(word,translate,prmkey,database);
        word = "Small";
        translate="Küçük";
        insertData(word,translate,prmkey,database);
        word = "Large";
        translate="Geniş";
        insertData(word,translate,prmkey,database);
        word = "Different";
        translate="Farklı";
        insertData(word,translate,prmkey,database);
        word = "Little";
        translate="Az";
        insertData(word,translate,prmkey,database);
        word = "Long";
        translate="Uzun";
        insertData(word,translate,prmkey,database);
        word = "Important";
        translate="Önemli";
        insertData(word,translate,prmkey,database);
        word = "Best";
        translate="En iyi";
        insertData(word,translate,prmkey,database);
        word = "Low";
        translate="Düşük";
        insertData(word,translate,prmkey,database);
        word = "Hard";
        translate="Zor";
        insertData(word,translate,prmkey,database);
        word = "Economic";
        translate="Ekonomik";
        insertData(word,translate,prmkey,database);
        word = "Strong";
        translate="Güçlü";
        insertData(word,translate,prmkey,database);
        word = "Famous";
        translate="Ünlü";
        insertData(word,translate,prmkey,database);
        word = "Special";
        translate="Özel";
        insertData(word,translate,prmkey,database);
        word = "Easy";
        translate="Kolay";
        insertData(word,translate,prmkey,database);
        word = "Clever";
        translate="Zeki";
        insertData(word,translate,prmkey,database);
        word = "Difficult";
        translate="Zor";
        insertData(word,translate,prmkey,database);
        word = "Short";
        translate="Kısa";
        insertData(word,translate,prmkey,database);
        word = "Honest";
        translate="Dürüst";
        insertData(word,translate,prmkey,database);
        word = "Private";
        translate="Özel";
        insertData(word,translate,prmkey,database);
        word = "Poor";
        translate="Yoksul";
        insertData(word,translate,prmkey,database);
        word = "Natural";
        translate="Doğal";
        insertData(word,translate,prmkey,database);
    }
    private void animal()
    {
        packet_name = "Hayvanlar";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Breed";
        translate="Irk";
        insertData(word,translate,prmkey,database);
        word = "Species";
        translate="Tür";
        insertData(word,translate,prmkey,database);
        word = "Owl";
        translate="Baykuş";
        insertData(word,translate,prmkey,database);
        word = "Squirrel";
        translate="Sincap";
        insertData(word,translate,prmkey,database);
        word = "Feather";
        translate="Tüy";
        insertData(word,translate,prmkey,database);
        word = "Paw";
        translate="Pati";
        insertData(word,translate,prmkey,database);
        word = "Venom";
        translate="Zehir";
        insertData(word,translate,prmkey,database);
        word = "Pack";
        translate="Sürü";
        insertData(word,translate,prmkey,database);
        word = "Reptile";
        translate="Sürüngen";
        insertData(word,translate,prmkey,database);
        word = "Extinct";
        translate="Nesli tükenmiş";
        insertData(word,translate,prmkey,database);
        word = "Domestic";
        translate="Evcil";
        insertData(word,translate,prmkey,database);
        word = "Polar bear";
        translate="Kutup ayısı";
        insertData(word,translate,prmkey,database);
        word = "Cat";
        translate="Kedi";
        insertData(word,translate,prmkey,database);
        word = "Kitten";
        translate="Kedi yavrusu";
        insertData(word,translate,prmkey,database);
        word = "Dog";
        translate="Köpek";
        insertData(word,translate,prmkey,database);
        word = "Budgie";
        translate="Muhabbet kuşu";
        insertData(word,translate,prmkey,database);
        word = "Parrot";
        translate="Papağan";
        insertData(word,translate,prmkey,database);
        word = "Canary";
        translate="Kanarya";
        insertData(word,translate,prmkey,database);
        word = "Goldfish";
        translate="Akvaryum balığı";
        insertData(word,translate,prmkey,database);
        word = "Puppy";
        translate="Köpek yavrusu";
        insertData(word,translate,prmkey,database);
        word = "Rabbit";
        translate="Tavşan";
        insertData(word,translate,prmkey,database);
        word = "Lion";
        translate="Aslan";
        insertData(word,translate,prmkey,database);
        word = "Tiger";
        translate="Kaplan";
        insertData(word,translate,prmkey,database);
        word = "Elephant";
        translate="Fil";
        insertData(word,translate,prmkey,database);
        word = "Hippo";
        translate="Su aygırı";
        insertData(word,translate,prmkey,database);
        word = "Rhino";
        translate="Gergedan";
        insertData(word,translate,prmkey,database);
        word = "Wolf";
        translate="Kurt";
        insertData(word,translate,prmkey,database);
        word = "Fox";
        translate="Tilki";
        insertData(word,translate,prmkey,database);
        word = "Hyena";
        translate="Sırtlan";
        insertData(word,translate,prmkey,database);
        word = "Cheetah";
        translate="Çita";
        insertData(word,translate,prmkey,database);
        word = "Panther";
        translate="Panter";
        insertData(word,translate,prmkey,database);
        word = "Lynx";
        translate="Vaşak";
        insertData(word,translate,prmkey,database);
        word = "Bear";
        translate="Ayı";
        insertData(word,translate,prmkey,database);
        word = "Giraffe";
        translate="Zürafa";
        insertData(word,translate,prmkey,database);
        word = "Deer";
        translate="Geyik";
        insertData(word,translate,prmkey,database);
        word = "Chimpanzee";
        translate="Şempaze";
        insertData(word,translate,prmkey,database);
        word = "Monkey";
        translate="Maymun";
        insertData(word,translate,prmkey,database);
        word = "Gorilla";
        translate="Goril";
        insertData(word,translate,prmkey,database);
        word = "Snake";
        translate="Yılan";
        insertData(word,translate,prmkey,database);
        word = "Kangaroo";
        translate="Kanguru";
        insertData(word,translate,prmkey,database);
        word = "Crocodile";
        translate="Timsah";
        insertData(word,translate,prmkey,database);
        word = "Chick";
        translate="Civciv";
        insertData(word,translate,prmkey,database);
        word = "Chicken";
        translate="Tavuk";
        insertData(word,translate,prmkey,database);
        word = "Cow";
        translate="İnek";
        insertData(word,translate,prmkey,database);
        word = "Horse";
        translate="At";
        insertData(word,translate,prmkey,database);
        word = "Sheep";
        translate="Koyun";
        insertData(word,translate,prmkey,database);
    }
    private void trip()
    {
        packet_name = "Seyahat";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Airplane";
        translate="Uçak";
        insertData(word,translate,prmkey,database);

        word = "Airport";
        translate="Havalimanı";
        insertData(word,translate,prmkey,database);

        word = "Backpack";
        translate="Sırt çantası";
        insertData(word,translate,prmkey,database);

        word = "Baggage";
        translate="Bagaj";
        insertData(word,translate,prmkey,database);

        word = "Bag";
        translate="Çanta";
        insertData(word,translate,prmkey,database);

        word = "Beach";
        translate="Plaj";
        insertData(word,translate,prmkey,database);

        word = "Boat";
        translate="Tekne";
        insertData(word,translate,prmkey,database);

        word = "Bus";
        translate="Otobüs";
        insertData(word,translate,prmkey,database);

        word = "Campground";
        translate="Kamp alanı";
        insertData(word,translate,prmkey,database);

        word = "Car";
        translate="Araba";
        insertData(word,translate,prmkey,database);

        word = "Cruise Ship";
        translate="Gemi gezisi";
        insertData(word,translate,prmkey,database);

        word = "Currency Exchange";
        translate="Döviz bürosu";
        insertData(word,translate,prmkey,database);

        word = "Sight";
        translate="Manzara";
        insertData(word,translate,prmkey,database);

        word = "Explore";
        translate="Keşfetmek";
        insertData(word,translate,prmkey,database);

        word = "Subway";
        translate="Metro";
        insertData(word,translate,prmkey,database);

        word = "Suitcase";
        translate="Bavul";
        insertData(word,translate,prmkey,database);

        word = "Sunscreen";
        translate="Güneş kremi";
        insertData(word,translate,prmkey,database);

        word = "Swim";
        translate="Yüzmek";
        insertData(word,translate,prmkey,database);

        word = "Holiday";
        translate="Tatil";
        insertData(word,translate,prmkey,database);

        word = "Tourist";
        translate="Turist";
        insertData(word,translate,prmkey,database);

        word = "Travel";
        translate="Seyahat";
        insertData(word,translate,prmkey,database);

        word = "Visa";
        translate="Vize";
        insertData(word,translate,prmkey,database);

        word = "Museum";
        translate="Müze";
        insertData(word,translate,prmkey,database);

        word = "Transportation";
        translate="Toplu taşıma";
        insertData(word,translate,prmkey,database);

        word = "Ticket";
        translate="Bilet";
        insertData(word,translate,prmkey,database);
    }
    private void jobs()
    {
        packet_name = "Meslekler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Accountant";
        translate="Muhasebeci";
        insertData(word,translate,prmkey,database);

        word = "Author";
        translate="Yazar";
        insertData(word,translate,prmkey,database);

        word = "Baker";
        translate="Fırıncı";
        insertData(word,translate,prmkey,database);

        word = "Hairdresser";
        translate="Kuaför";
        insertData(word,translate,prmkey,database);

        word = "Beautician";
        translate="Güzellik uzmanı";
        insertData(word,translate,prmkey,database);

        word = "Butcher";
        translate="Kasap";
        insertData(word,translate,prmkey,database);

        word = "Carpenter";
        translate="Marangoz";
        insertData(word,translate,prmkey,database);

        word = "Cashier";
        translate="Kasiyer";
        insertData(word,translate,prmkey,database);

        word = "Dentist";
        translate="Dişçi";
        insertData(word,translate,prmkey,database);

        word = "Doctor";
        translate="Doktor";
        insertData(word,translate,prmkey,database);

        word = "Engineer";
        translate="Mühendis";
        insertData(word,translate,prmkey,database);

        word = "Farmer";
        translate="Çiftçi";
        insertData(word,translate,prmkey,database);

        word = "Lawyer";
        translate="Avukat";
        insertData(word,translate,prmkey,database);

        word = "Musician";
        translate="Müzisyen";
        insertData(word,translate,prmkey,database);

        word = "Nurse";
        translate="Hemşire";
        insertData(word,translate,prmkey,database);

        word = "Pharmacist";
        translate="Eczacı";
        insertData(word,translate,prmkey,database);

        word = "Policeman";
        translate="Polis";
        insertData(word,translate,prmkey,database);

        word = "Politician";
        translate="Politikacı";
        insertData(word,translate,prmkey,database);

        word = "Postman";
        translate="Postacı";
        insertData(word,translate,prmkey,database);

        word = "Scientist";
        translate="Bilim insanı";
        insertData(word,translate,prmkey,database);

        word = "Soldier";
        translate="Asker";
        insertData(word,translate,prmkey,database);

        word = "Tailor";
        translate="Terzi";
        insertData(word,translate,prmkey,database);

        word = "Teacher";
        translate="Öğretmen";
        insertData(word,translate,prmkey,database);

        word = "Technician";
        translate="Teknisyen";
        insertData(word,translate,prmkey,database);

        word = "Vet";
        translate="Veteriner";
        insertData(word,translate,prmkey,database);
    }
    private void verbs()
    {
        packet_name = "Fiiler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Count";
        translate="Saymak";
        insertData(word,translate,prmkey,database);

        word = "Write";
        translate="Yazmak";
        insertData(word,translate,prmkey,database);

        word = "Create";
        translate="Yaratmak";
        insertData(word,translate,prmkey,database);

        word = "Cry";
        translate="Ağlamak";
        insertData(word,translate,prmkey,database);

        word = "Cut";
        translate="Kesmek";
        insertData(word,translate,prmkey,database);

        word = "Develop";
        translate="Geliştirmek";
        insertData(word,translate,prmkey,database);

        word = "Discover";
        translate="Keşfetmek";
        insertData(word,translate,prmkey,database);

        word = "Do";
        translate="Yapmak";
        insertData(word,translate,prmkey,database);

        word = "Draw";
        translate="Çizmek";
        insertData(word,translate,prmkey,database);

        word = "Drink";
        translate="İçmek";
        insertData(word,translate,prmkey,database);

        word = "Drive";
        translate="Sürmek";
        insertData(word,translate,prmkey,database);

        word = "Earn";
        translate="Kazanmak";
        insertData(word,translate,prmkey,database);

        word = "Eat";
        translate="Yemek";
        insertData(word,translate,prmkey,database);

        word = "Discuss";
        translate="Tartışmak";
        insertData(word,translate,prmkey,database);

        word = "Disagree";
        translate="Aynı fikirde olmamak";
        insertData(word,translate,prmkey,database);

        word = "Educate";
        translate="Eğitmek";
        insertData(word,translate,prmkey,database);

        word = "Enjoy";
        translate="Zevk almak";
        insertData(word,translate,prmkey,database);

        word = "Exercise";
        translate="Egzersiz yapmak";
        insertData(word,translate,prmkey,database);

        word = "Expand";
        translate="Genişletmek";
        insertData(word,translate,prmkey,database);

        word = "Explain";
        translate="Açıklamak";
        insertData(word,translate,prmkey,database);

        word = "Fall";
        translate="Düşmek";
        insertData(word,translate,prmkey,database);

        word = "Fail";
        translate="Başarısız Olmak";
        insertData(word,translate,prmkey,database);

        word = "Feel";
        translate="Hissetmek";
        insertData(word,translate,prmkey,database);

        word = "Fear";
        translate="Korkmak";
        insertData(word,translate,prmkey,database);

        word = "Fill";
        translate="Doldurmak";
        insertData(word,translate,prmkey,database);

        word = "Find";
        translate="Bulmak";
        insertData(word,translate,prmkey,database);

        word = "Finish";
        translate="Bitirmek";
        insertData(word,translate,prmkey,database);

        word = "Fly";
        translate="Uçmak";
        insertData(word,translate,prmkey,database);

        word = "Follow";
        translate="Takip etmek";
        insertData(word,translate,prmkey,database);

        word = "Forbid";
        translate="Yasaklamak";
        insertData(word,translate,prmkey,database);

        word = "Forget";
        translate="Unutmak";
        insertData(word,translate,prmkey,database);

        word = "Forgive";
        translate="Affetmek";
        insertData(word,translate,prmkey,database);

        word = "Force";
        translate="Zorlamak";
        insertData(word,translate,prmkey,database);

        word = "Freeze";
        translate="Donmak";
        insertData(word,translate,prmkey,database);

        word = "Fry";
        translate="Kızartmak";
        insertData(word,translate,prmkey,database);

        word = "Get";
        translate="Almak";
        insertData(word,translate,prmkey,database);

        word = "Give";
        translate="Vermek";
        insertData(word,translate,prmkey,database);

        word = "Go";
        translate="Gitmek";
        insertData(word,translate,prmkey,database);

        word = "Guess";
        translate="Tahmin etmek";
        insertData(word,translate,prmkey,database);

        word = "Hate";
        translate="Nefret etmek";
        insertData(word,translate,prmkey,database);

        word = "Harm";
        translate="Zarar vermek";
        insertData(word,translate,prmkey,database);

        word = "Heal";
        translate="İyileşmek";
        insertData(word,translate,prmkey,database);

        word = "Hear";
        translate="Duymak";
        insertData(word,translate,prmkey,database);

        word = "Help";
        translate="Yardım etmek";
        insertData(word,translate,prmkey,database);

        word = "Hide";
        translate="Gizlemek / Saklamak";
        insertData(word,translate,prmkey,database);

        word = "Hope";
        translate="Umut etmek";
        insertData(word,translate,prmkey,database);

        word = "Hurry";
        translate="Acele etmek";
        insertData(word,translate,prmkey,database);

        word = "Imagine";
        translate="Hayal etmek";
        insertData(word,translate,prmkey,database);

        word = "Interest";
        translate="İlgi uyandırmak";
        insertData(word,translate,prmkey,database);

        word = "Invite";
        translate="Davet etmek";
        insertData(word,translate,prmkey,database);

        word = "Jump";
        translate="Zıplamak";
        insertData(word,translate,prmkey,database);

        word = "Kiss";
        translate="Öpmek";
        insertData(word,translate,prmkey,database);

        word = "Know";
        translate="Bilmek";
        insertData(word,translate,prmkey,database);

        word = "Learn";
        translate="Öğrenmek";
        insertData(word,translate,prmkey,database);

        word = "Listen";
        translate="Dinlemek";
        insertData(word,translate,prmkey,database);

        word = "Look";
        translate="Bakmak";
        insertData(word,translate,prmkey,database);

        word = "Lose";
        translate="Kaybetmek";
        insertData(word,translate,prmkey,database);

        word = "Make";
        translate="Yapmak";
        insertData(word,translate,prmkey,database);

        word = "Miss";
        translate="Özlemek / kaçırmak";
        insertData(word,translate,prmkey,database);

        word = "Need";
        translate="İhtiyaç duymak";
        insertData(word,translate,prmkey,database);

        word = "Observe";
        translate="İncelemek";
        insertData(word,translate,prmkey,database);

        word = "Pass";
        translate="Geçmek";
        insertData(word,translate,prmkey,database);

        word = "Pay";
        translate="Ödemek";
        insertData(word,translate,prmkey,database);

        word = "Pray";
        translate="Dua etmek";
        insertData(word,translate,prmkey,database);

        word = "Produce";
        translate="Üretmek";
        insertData(word,translate,prmkey,database);

        word = "Pull";
        translate="Çekmek";
        insertData(word,translate,prmkey,database);

        word = "Remember";
        translate="Hatırlamak";
        insertData(word,translate,prmkey,database);

        word = "Repair";
        translate="Tamir etmek";
        insertData(word,translate,prmkey,database);

        word = "Search";
        translate="Araştırmak";
        insertData(word,translate,prmkey,database);

        word = "Shake";
        translate="Sallamak";
        insertData(word,translate,prmkey,database);

        word = "Show";
        translate="Göstermek";
        insertData(word,translate,prmkey,database);

        word = "Sleep";
        translate="Uyumak";
        insertData(word,translate,prmkey,database);
    }
    private void fruitAndVegetable()
    {
        packet_name = "Meyveler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Strawberry";
        translate="Çilek";
        insertData(word,translate,prmkey,database);
        word = "Apple";
        translate="Elma";
        insertData(word,translate,prmkey,database);
        word = "Apricot";
        translate="Kayısı";
        insertData(word,translate,prmkey,database);
        word = "Avocado";
        translate = "Avokado";
        insertData(word, translate, prmkey, database);
        word = "Banana";
        translate="Muz";
        insertData(word,translate,prmkey,database);
        word = "Blackberry";
        translate="Böğürtlen";
        insertData(word,translate,prmkey,database);
        word = "Cherry";
        translate="Kiraz";
        insertData(word,translate,prmkey,database);
        word = "Coconut";
        translate="Hindistan cevizi";
        insertData(word,translate,prmkey,database);
        word = "Fig";
        translate="İncir";
        insertData(word,translate,prmkey,database);
        word = "Grape";
        translate="Üzüm";
        insertData(word,translate,prmkey,database);
        word = "Grapefruit";
        translate="Greyfurt";
        insertData(word,translate,prmkey,database);
        word = "Peach";
        translate="Şeftali";
        insertData(word,translate,prmkey,database);
        word = "Orange";
        translate="Portakal";
        insertData(word,translate,prmkey,database);
        word = "Plum";
        translate="Erik";
        insertData(word,translate,prmkey,database);
        word = "Quince";
        translate="Ayva";
        insertData(word,translate,prmkey,database);
        word = "Watermelon";
        translate="Karpuz";
        insertData(word,translate,prmkey,database);
        word = "Pineapple";
        translate="Ananas";
        insertData(word,translate,prmkey,database);
        word = "Melon";
        translate="Kavun";
        insertData(word,translate,prmkey,database);


        packet_name = "Sebzeler";
        prmkey = random();
        createPacket(packet_name,prmkey,database, difficult);
        word = "Potato";
        translate="Patates";
        insertData(word,translate,prmkey,database);
        word = "Tomato";
        translate="Domates";
        insertData(word,translate,prmkey,database);
        word = "Cucumber";
        translate="Salatalık";
        insertData(word,translate,prmkey,database);
        word = "Onion";
        translate="Soğan";
        insertData(word,translate,prmkey,database);
        word = "Garlic";
        translate="Sarımsak";
        insertData(word,translate,prmkey,database);
        word = "Pepper";
        translate="Biber";
        insertData(word,translate,prmkey,database);
        word = "Peas";
        translate="Bezelye";
        insertData(word,translate,prmkey,database);
        word = "Beans";
        translate="Fasulye";
        insertData(word,translate,prmkey,database);
        word = "Kidney beans";
        translate="Barbunya";
        insertData(word,translate,prmkey,database);
        word = "Zucchini";
        translate="Kabak";
        insertData(word,translate,prmkey,database);
        word = "Aubergine";
        translate="Patlıcan";
        insertData(word,translate,prmkey,database);
        word = "Corn";
        translate="Mısır";
        insertData(word,translate,prmkey,database);
        word = "Carrot";
        translate="Havuç";
        insertData(word,translate,prmkey,database);
        word = "Mushroom";
        translate="Mantar";
        insertData(word,translate,prmkey,database);
        word = "Marrow";
        translate="Kabak";
        insertData(word,translate,prmkey,database);
        word = "Cauliflower";
        translate="Karnabahar";
        insertData(word,translate,prmkey,database);
        word = "Celery";
        translate="Kereviz";
        insertData(word,translate,prmkey,database);
        word = "Spinach";
        translate="Ispanak";
        insertData(word,translate,prmkey,database);
        word = "Turnip";
        translate="Turp";
        insertData(word,translate,prmkey,database);
        word = "Broccoli";
        translate="Brokoli";
        insertData(word,translate,prmkey,database);
        word = "Artichoke";
        translate="Enginar";
        insertData(word,translate,prmkey,database);
        word = "Arugula";
        translate="Roka";
        insertData(word,translate,prmkey,database);
        word = "Lettuce";
        translate="Marul";
        insertData(word,translate,prmkey,database);
    }
    private void meeting()
    {
        packet_name = "Tanışmak";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Do you use instagram?";
        translate="Instagram kullanıyor musun?";
        insertData(word,translate,prmkey,database);

        word = "Hello";
        translate="Merhaba";
        insertData(word,translate,prmkey,database);

        word = "Maybe we can have coffee together sometime.";
        translate="Belki bir ara birlikte kahve içebiliriz.";
        insertData(word,translate,prmkey,database);

        word = "Can I have your mobile number?";
        translate="Cep numaranı alabilir miyim?";
        insertData(word,translate,prmkey,database);

        word = "What are your hobbies?";
        translate="Hobilerin neler?";
        insertData(word,translate,prmkey,database);

        word = "How are you?";
        translate="Nasılsın?";
        insertData(word,translate,prmkey,database);

        word = "I am fine.";
        translate="İyiyim.";
        insertData(word,translate,prmkey,database);

        word = "Thank you";
        translate="Teşekkür ederim";
        insertData(word,translate,prmkey,database);

        word = "Are you student?";
        translate="Öğrenci misin?";
        insertData(word,translate,prmkey,database);

        word = "I am from Germany";
        translate="Ben Almanyalıyım.";
        insertData(word,translate,prmkey,database);

        word = "Where do you live?";
        translate="Nerede yaşıyorsun?";
        insertData(word,translate,prmkey,database);

        word = "I live in Turkey.";
        translate="Türkiye'de yaşıyorum.";
        insertData(word,translate,prmkey,database);

        word = "What do you do?";
        translate="Ne iş yapıyorsun?";
        insertData(word,translate,prmkey,database);

        word = "How old are you?";
        translate="Kaç yaşındasın?";
        insertData(word,translate,prmkey,database);

        word = "I am twenty years old.";
        translate="Ben yirmi yaşındayım.";
        insertData(word,translate,prmkey,database);

        word = "I work in London.";
        translate="Londra''da çalışıyorum.";
        insertData(word,translate,prmkey,database);

        word = "Where are you from?";
        translate="Nerelisin?";
        insertData(word,translate,prmkey,database);

        word = "I am an engineer.";
        translate="Ben mühendisim.";
        insertData(word,translate,prmkey,database);

        word = "Is there any cafe near here?";
        translate="Buraya yakın bir kafe var mı?";
        insertData(word,translate,prmkey,database);

        word = "I have a cat.";
        translate="Benim bir kedim var.";
        insertData(word,translate,prmkey,database);

        word = "Do you smoke?";
        translate="Sigara içiyor musun?";
        insertData(word,translate,prmkey,database);

        word = "What kind of music do you listen to?";
        translate="Ne tarz müzikler dinlersin?";
        insertData(word,translate,prmkey,database);

        word = "Shall we get some drinks?";
        translate="Birşeyler içelim mi?";
        insertData(word,translate,prmkey,database);

        word = "My eyes are black.";
        translate="Göz rengim siyahtır.";
        insertData(word,translate,prmkey,database);

        word = "I like coffee.";
        translate="Kahve severim.";
        insertData(word,translate,prmkey,database);

        word = "Are you single or married?";
        translate="Evli misin bekar mı?";
        insertData(word,translate,prmkey,database);

        word = "I don&apostrophet know";
        translate="Bilmiyorum.";
        insertData(word,translate,prmkey,database);

        word = "I know";
        translate="Biliyorum.";
        insertData(word,translate,prmkey,database);

        word = "What did you say?";
        translate="Ne dediniz?";
        insertData(word,translate,prmkey,database);

        word = "Where do you reside?";
        translate="Nerede oturuyorsun?";
        insertData(word,translate,prmkey,database);

        word = "How is it going?";
        translate="Nasıl gidiyor?";
        insertData(word,translate,prmkey,database);

        word = "I like going shopping with my friends.";
        translate="Arkadaşlarımla alışverişe çıkmayı seviyorum.";
        insertData(word,translate,prmkey,database);

        word = "I study economics.";
        translate="Ekonomi okuyorum.";
        insertData(word,translate,prmkey,database);

        word = "I am single.";
        translate="Bekarım.";
        insertData(word,translate,prmkey,database);

        word = "Have a good day.";
        translate="İyi günler.";
        insertData(word,translate,prmkey,database);

        word = "Gladly";
        translate="Seve seve";
        insertData(word,translate,prmkey,database);

        word = "You are welcome.";
        translate="Rica ederim";
        insertData(word,translate,prmkey,database);

        word = "What's wrong?";
        translate="Sorun nedir?";
        insertData(word,translate,prmkey,database);

    }
    private void days()
    {
        packet_name = "Günler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);

        word = "Monday";
        translate="Pazartesi";
        insertData(word,translate,prmkey,database);
        word = "Tuesday";
        translate="Salı";
        insertData(word,translate,prmkey,database);
        word = "Wednesday";
        translate="Çarşamba";
        insertData(word,translate,prmkey,database);
        word = "Thursday";
        translate="Perşembe";
        insertData(word,translate,prmkey,database);
        word = "Friday";
        translate="Cuma";
        insertData(word,translate,prmkey,database);
        word = "Saturday";
        translate="Cumartesi";
        insertData(word,translate,prmkey,database);
        word = "Sunday";
        translate="Pazar";
        insertData(word,translate,prmkey,database);

    }
    private void times()
    {
        packet_name = "Zamanlar";
        prmkey = random();
        difficult ="1";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Age";
        translate="Çağ";
        insertData(word,translate,prmkey,database);
        word = "Beforehand";
        translate="Önceden";
        insertData(word,translate,prmkey,database);
        word = "Forthcoming";
        translate="Önümüzdeki";
        insertData(word,translate,prmkey,database);
        word = "Indefinitely";
        translate="Süresiz olarak";
        insertData(word,translate,prmkey,database);
        word = "To date";
        translate="Şimdiye kadar";
        insertData(word,translate,prmkey,database);
        word = "Occasionally";
        translate="Zaman zaman";
        insertData(word,translate,prmkey,database);
        word = "Calendar";
        translate="Takvim";
        insertData(word,translate,prmkey,database);
        word = "To schedule";
        translate="Planlamak";
        insertData(word,translate,prmkey,database);
        word = "Era";
        translate="Devir";
        insertData(word,translate,prmkey,database);
        word = "Fortnight";
        translate="İki hafta";
        insertData(word,translate,prmkey,database);
        word = "Time zone";
        translate="Zaman kuşağı";
        insertData(word,translate,prmkey,database);
        word = "Hourglass";
        translate="Kum saati";
        insertData(word,translate,prmkey,database);
        word = "Twilight";
        translate="Alacakaranlık";
        insertData(word,translate,prmkey,database);
        word = "Chronological";
        translate="Kronolojik";
        insertData(word,translate,prmkey,database);
        word = "Instant";
        translate="Anlık";
        insertData(word,translate,prmkey,database);
        word = "Lately";
        translate="Son zamanlarda";
        insertData(word,translate,prmkey,database);
        word = "For the moment";
        translate="Şimdilik";
        insertData(word,translate,prmkey,database);
        word = "Beyond";
        translate="Akabinde";
        insertData(word,translate,prmkey,database);
        word = "Local time";
        translate="Yerel zaman";
        insertData(word,translate,prmkey,database);
        word = "Today";
        translate="Bugün";
        insertData(word,translate,prmkey,database);
        word = "Month";
        translate="Ay";
        insertData(word,translate,prmkey,database);
        word = "Tomorrow";
        translate="Yarın";
        insertData(word,translate,prmkey,database);
        word = "Night";
        translate="Akşam";
        insertData(word,translate,prmkey,database);
        word = "Morning";
        translate="Sabah";
        insertData(word,translate,prmkey,database);
        word = "Week";
        translate="Hafta";
        insertData(word,translate,prmkey,database);
        word = "Day";
        translate="Gün";
        insertData(word,translate,prmkey,database);
        word = "Winter";
        translate="Kış";
        insertData(word,translate,prmkey,database);
        word = "Spring";
        translate="İlkbahar";
        insertData(word,translate,prmkey,database);
        word = "Summer";
        translate="Yaz";
        insertData(word,translate,prmkey,database);
        word = "Autumn";
        translate="Sonbahar";
        insertData(word,translate,prmkey,database);
    }
    private void colors()
    {
        packet_name = "Renkler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Red";
        translate="Kırmızı";
        insertData(word,translate,prmkey,database);
        word = "Blue";
        translate="Mavi";
        insertData(word,translate,prmkey,database);
        word = "Yellow";
        translate="Sarı";
        insertData(word,translate,prmkey,database);
        word = "Black";
        translate="Siyah";
        insertData(word,translate,prmkey,database);
        word = "White";
        translate="Beyaz";
        insertData(word,translate,prmkey,database);
        word = "Gray";
        translate="Gri";
        insertData(word,translate,prmkey,database);
        word = "Purple";
        translate="Mor";
        insertData(word,translate,prmkey,database);
        word = "Navy blue";
        translate="Lacivert";
        insertData(word,translate,prmkey,database);
        word = "Turquoise";
        translate="Turkuaz";
        insertData(word,translate,prmkey,database);
        word = "Violet";
        translate="Eflatun";
        insertData(word,translate,prmkey,database);
        word = "Colored";
        translate="Renkli";
        insertData(word,translate,prmkey,database);
        word = "Colorful";
        translate="Rengarenk";
        insertData(word,translate,prmkey,database);

    }

    private void drinks()
    {
        packet_name = "İçecekler";
        prmkey = random();
        difficult ="0";
        createPacket(packet_name,prmkey,database, difficult);
        word = "Tea";
        translate="Çay";
        insertData(word,translate,prmkey,database);
        word = "Coke";
        translate="Kola";
        insertData(word,translate,prmkey,database);
        word = "Fruit juice";
        translate="Meyve Suyu";
        insertData(word,translate,prmkey,database);
        word = "Lemonade";
        translate="Limonata";
        insertData(word,translate,prmkey,database);
        word = "Wine";
        translate="Şarap";
        insertData(word,translate,prmkey,database);
        word = "Beer";
        translate="Bira";
        insertData(word,translate,prmkey,database);
        word = "Cocktail";
        translate="Kokteyl";
        insertData(word,translate,prmkey,database);
        word = "Water";
        translate="Su";
        insertData(word,translate,prmkey,database);
        word = "Ice tea";
        translate="Soğuk çay";
        insertData(word,translate,prmkey,database);
    }
}
