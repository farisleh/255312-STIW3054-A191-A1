import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.IOException;

public class GithubAcc {
    private final String githubLink = "https://github.com/STIW3054-A191/Main-Issues/issues/1";
    private final String myString = "Matric: ";
    private final String myString1 = "Matric:";
    private final String myString2 = "Matric : ";
    private final String myString3 = "matrix :";
    private final String myString4 = "Matric no: ";
    private Document doc;
    private Compare compare;
    private int total;


    public void showAcc() {
        compare = new Compare();

        try {
            doc = Jsoup.connect(githubLink).get();
            System.out.println("Who Has Submit The Github Account: ");


            Elements links = doc.getElementsByClass("js-timeline-item js-timeline-progressive-focus-container");
            for (Element link : links) {
                final String theLink = link.getElementsByTag("p").text();
                if (compare.isMatch(myString, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                } else if (compare.isMatch(myString1, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                } else if (compare.isMatch(myString2, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                }else if (compare.isMatch(myString3, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                }else if (compare.isMatch(myString4, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                }
            }

            System.out.println("Total Who Submit Github Account = " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



