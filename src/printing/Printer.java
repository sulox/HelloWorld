package printing;

/**
 * Created by Suliky on 22.3.2015.
 */

public class Printer implements IMachine {

//    private boolean isOn;
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;

    public Printer (boolean isOn, String modelNumber)
    {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
    }

    public void print(int copies) {

        String onStatus = "";

        if (machine.isOn()) {
            onStatus = " is ON! ";
        } else {
            onStatus = " is OFF! ";
        }

        String modelStatus = modelNumber + onStatus;

        while (copies > 0 && !paperTray.isEmpty())
        {
            System.out.println(modelStatus + (paperTray.pages) + " pages in tray. Printing... " + (paperTray.pages - 1) + " pages still left!");
            copies--;
            paperTray.usePage();
        }

        if (paperTray.isEmpty()) {
            System.out.println("Load paper!");
        }
    }

    @Override
    public void turnOn() {
//        System.out.println("Warming up engines!");
//        isOn = true;
        machine.turnOn();
    }

    @Override
    public void turnOff() {
//        isOn = false;
        machine.turnOff();
    }

    @Override
    public boolean isOn() {
        return machine.isOn();
    }

    /*
    public void foreachPrinter() {
        for (Printer currentPrinter : Printer) {

        }
    }
    */
    public void printColors() {
        String[] colors = new String[] {"Red","Green","Blue"};

        for (String currentColor : colors) {
            System.out.println(currentColor);
        }
    }

        /*
        switch (copies) {
                case 0:
                break;
                case 2:
                    if (isOn) {
                        System.out.println(modelNumber + " is on!");
                        System.out.println(modelNumber + " is on!");
                    } else {
                        System.out.println(modelNumber + " is off!");
                        System.out.println(modelNumber + " is off!");
                    }
                    break;
                default: {
                    if (isOn) {
                        System.out.println(modelNumber + " is on -> default case!");
                        System.out.println(modelNumber + " is on -> default case!");
                    } else {
                        System.out.println(modelNumber + " is off -> default case!");
                        System.out.println(modelNumber + " is off -> default case!");
                    }
                    break;
                }
            }
        }
        */

    private void print(String text)
    {
        System.out.println(text);
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

    public void loadPaper(int count) {
        paperTray.addPaper(count);
    }
}

