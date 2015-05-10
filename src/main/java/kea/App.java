package kea;

import kea.main.KEAKeyphraseExtractor;
import kea.main.KEAModelBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        train();

        test();


    }
    /**
     * This is test phase
     * If you've previously built a keyphrase extraction model you can now
     apply keyphrases for these documents using:

     java KEAKeyphraseExtractor -l <name_of_directory> -m <name_of_model>  -v <vocabulary_name> -f <skos|text>
     */
 /*
 -l <directory name>    Specifies name of directory.
 -m <model name>    Specifies name of model.
 -v <vocabulary name>   Specifies vocabulary name.
 -f <vocabulary format>     Specifies vocabulary format (text or skos or none).
 -i <document language>      Specifies document language (en (default), es, de, fr).
 -e <encoding>      Specifies encoding.
 -n      Specifies number of phrases to be output (default: 5).
 -t <name of stemmer class>     Set the stemmer to use (default: SremovalStemmer).
 -s <name of stopwords class>       Sets the list of stopwords to use (default: StopwordsEnglish).
 -d      Turns debugging mode on.
 -b      Builds global dictionaries for computing TFIDF from the test collection.
 -a      Also write stemmed phrase and score into ".key" file.
*/
    public static void test( )
    {


        String [] myArgs={
                "-l","/home/sekiz10/kea-app/testdocs/tr/testtrain/",
                "-m","/home/sekiz10/kea-app/models/turkishmodel",
                "-v","none",
                "-f", "none",
                "-i", "tr",
                "-e", "utf-8",
                "-t","TurkishStemmer",
                "-s","StopwordsTurkish",
        };
        KEAKeyphraseExtractor.main(myArgs);
    }
    /**
     * This is training phase
     */

    /**
     -l <directory name>    Specifies name of directory.
     -m <model name>    Specifies name of model.
     -v <vocabulary name>   Specifies vocabulary name.
     -f <vocabulary format>     Specifies vocabulary format (text or skos or none).
     -i <document language>     Specifies document language (en (default), es, de, fr).
     -e <encoding>      Specifies encoding.
     -d      Turns debugging mode on.
     -k      Use keyphrase frequency statistic.
     -p      Disallow internal periods.
     -x <length>    Sets the maximum phrase length (default: 5).
     -y <length>    Sets the minimum phrase length (default: 1).
     -o      Set the minimum number of occurences (default: 2).
     -s <name of stopwords class>       Sets the list of stopwords to use (default: StopwordsEnglish).
     -t <name of stemmer class>     Set the stemmer to use (default: SremovalStemmer).
     -n     Do not check for proper nouns.

     */

    public static void train( )
    {
        System.out.println("Hello World!");


        String [] myArgs={
                "-l","/home/sekiz10/kea-app/testdocs/tr/training_docs/",
                "-m","/home/sekiz10/kea-app/models/turkishmodel",
                "-v","none",
                "-f", "none",
                "-i", "tr",
                "-e", "utf-8",
                //"-y", "2",
                //"-o","1",
                "-t","TurkishStemmer",
                "-s","StopwordsTurkish",
                "-n"

        };
        KEAModelBuilder.main(myArgs);
    }
}



