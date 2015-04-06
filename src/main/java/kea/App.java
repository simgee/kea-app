package kea;

import kea.main.KEAModelBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        String [] myArgs={
                "-l","/home/sekiz10/kea-app/testdocs/tr/training_docs/",
                "-m","/home/sekiz10/trmodel",
                "-v","none",
                "-f", "none",
                "-i", "en",
                "-e", "default",
                "-y", "2",
                "-o","1",

              //  "-t","TurkishStemmer",
                "-n"
        };

        KEAModelBuilder.main(myArgs);
    }
}
