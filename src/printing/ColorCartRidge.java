package printing;

/**
 * Created by Suliky on 29.3.2015.
 */
public class ColorCartRidge implements ICartridge {

    @Override
    public String toString() {
        return "Color cartridge!";
    }

    @Override
    public String getFillPercentage() {
        return "100%";
    }
}
