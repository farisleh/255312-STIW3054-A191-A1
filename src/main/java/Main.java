import com.sun.org.apache.bcel.internal.generic.LDIV;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Main {


    public static void main(String[] args) {


        System.out.println("List Of Student: ");
        List_of_Student list = new List_of_Student();
        list.showList();
        System.out.println(" ");

        GithubAcc acc = new GithubAcc();
        acc.showAcc();
        System.out.println(" ");
        NotSubmit acc1 = new NotSubmit();
        acc1.showAcc1();
        System.out.println(" ");


        String myString = " ";
        String matric = "https://github.com/STIW3054-A191/Assignments/wiki/List_of_Student";
        Boolean result = new Compare().isMatch(myString, matric);

        ExcelWriter save = new ExcelWriter();
        save.convertData();

        System.out.println(" ");
        System.out.println("Writing data into excel");
        System.out.println("Success");


    }

}

