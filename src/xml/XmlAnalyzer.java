package xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlAnalyzer {
    private static Pattern pOpen = Pattern.compile("<\\w.+?>");
    private static Pattern pClose = Pattern.compile("</\\w+>");
    private static Pattern pBody = Pattern.compile(">.+?<");
    private static Pattern pEmpty = Pattern.compile("<\\w.+?/>");

    public String analyze(String xml) {
        StringBuilder strBuilder = new StringBuilder();

        String[] lines = xml.split("\n\\s*");

        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - tag without body\n");
            } else if (mOpen.find()) {
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
