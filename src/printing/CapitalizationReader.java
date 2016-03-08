package printing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Suliky on 08.03.2016.
 */
public class CapitalizationReader extends BufferedReader {

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();

        if (line != null)
            return line.toUpperCase();

        return null;
    }

    public CapitalizationReader(Reader in) {
        super(in);
    }
}
