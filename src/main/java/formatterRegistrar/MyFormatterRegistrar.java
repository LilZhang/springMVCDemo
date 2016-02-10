package formatterRegistrar;

import formatter.SimpleFormatter;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created by Administrator on 2016/2/10.
 */
public class MyFormatterRegistrar implements FormatterRegistrar {
    private String datePattern;

    public MyFormatterRegistrar(String datePattern) {
        this.datePattern = datePattern;
    }

    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new SimpleFormatter(datePattern));
    }
}
