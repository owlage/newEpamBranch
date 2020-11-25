package xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Xml {

    public static String xmlAnalyzer(String xml) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = xml.split("\n\\s*");

        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - tag without body\n");
            }
            else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - opened tag\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - tag consists\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - closed tag\n");
            }

        }
        return strBuilder.toString();
    }
}
