package kea.stemmers;


import net.zemberek.erisim.Zemberek;
import net.zemberek.islemler.cozumleme.CozumlemeSeviyesi;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import net.zemberek.yapi.Kelime;

import java.io.Serializable;

/**
 * @author sekiz10
 */
public class TurkishStemmer extends Stemmer implements Serializable {

    private transient final Zemberek zemberek = new Zemberek(new TurkiyeTurkcesi());

    @Override
    public String stem(String str) {

        final Kelime[] cozumler = zemberek.kelimeCozumle(str, CozumlemeSeviyesi.TUM_KOKLER);
        if (cozumler.length == 0) return str;

       // System.out.println(cozumler[0].kok().icerik());

        return cozumler[0].kok().icerik();
    }

    public static void main(String[] args) {

        TurkishStemmer stemmer = new TurkishStemmer();
        System.out.println(stemmer.stem("kediler"));
    }

}