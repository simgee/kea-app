package kea.stopwords;

import kea.stopwords.Stopwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 * Created by sekiz10 on 31.03.2015.
 */
public class StopwordsTurkish extends Stopwords {
    private static final long serialVersionUID = 1L;


    /** The hashtable containing the list of stopwords */
    private static Hashtable m_Stopwords = null;


    static {

        if (m_Stopwords == null) {
            m_Stopwords = new Hashtable();
            Double dummy = new Double(0);
            File txt = new File("data/stopwords/stopwords_tr.txt");
            InputStreamReader is;
            String sw = null;
            try {
                is = new InputStreamReader(new FileInputStream(txt), "UTF-8");
                BufferedReader br = new BufferedReader(is);
                while ((sw=br.readLine()) != null)  {
                    m_Stopwords.put(sw, dummy);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    /**
     * Returns true if the given string is a stop word.
     */
    public boolean isStopword(String str) {

        return m_Stopwords.containsKey(str.toLowerCase());
    }

}
