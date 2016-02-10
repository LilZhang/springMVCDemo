package formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by LilZhang on 2016/2/10.
 */
public class SimpleFormatter implements Formatter<Date> {
    private String datePattern;
    private SimpleDateFormat dateFormat;

    public SimpleFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
    }

    public Date parse(String s, Locale locale) throws ParseException {
        try {
            return dateFormat.parse(s);
        } catch(ParseException e) {
            throw new IllegalArgumentException("Format should be : yyyy-MM-dd");
        }
    }

    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}
