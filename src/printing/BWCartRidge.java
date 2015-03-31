package printing;

/**
 * Created by Suliky on 29.3.2015.
 */
public class BWCartRidge implements ICartridge {

    @Override
    public String toString() {
        return "BW cartridge!";
    }

    @Override
    public String getFillPercentage() {
        return "50%";
    }
}
