package printing;

/**
 * Created by Suliky on 26.3.2015.
 */

public class Machine implements IMachine {

    private boolean isOn;

    public Machine (boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Machine is on!");
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
