package converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LilZhang on 2016/2/10.
 */
public class SimpleConverter implements Converter<String, Date> {

    private String datePattern;

    public SimpleConverter(String datePattern) {
        this.datePattern = datePattern;
    }

    public Date convert(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
            dateFormat.setLenient(false);
            return dateFormat.parse(s);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Format should be : yyyy-MM-dd");
        }

    }
}
