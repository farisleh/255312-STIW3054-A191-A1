import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compare {

    public boolean isMatch(String pattern, String link) {


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(link);

        if (m.find())
            return true;
        else
            return false;
    }


    }






