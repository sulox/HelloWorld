package printing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Suliky on 08.03.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintingDevice {
    String defaultPrintMethod();
    int defaultNumberOfCopies();
}
