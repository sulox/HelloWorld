package printing;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Suliky on 22.3.2015.
 */

@PrintingDevice(defaultPrintMethod = "print",defaultNumberOfCopies = 5)
public class Printer<T extends ICartridge> implements IMachine {

//    private boolean isOn;
    private String modelNumber;
    private PaperTray paperTray = new PaperTray();
    private Machine machine;
    private T cartRidge;
    //private List<PAge> pages = new ArrayList<PAge>();
    private Map<Integer, PAge> pAgeMap = new HashMap<Integer, PAge>();

    public Printer (boolean isOn, String modelNumber, T cartRidge)
    {
        machine = new Machine(isOn);
        this.modelNumber = modelNumber;
        this.cartRidge = cartRidge;
    }

    public void print(int copies) {

        //checkCopies(copies);

        System.out.println(cartRidge.getFillPercentage());

        String onStatus = "";

        if (machine.isOn()) {
            onStatus = " is ON! ";
        } else {
            onStatus = " is OFF! ";
        }

        //String modelStatus = modelNumber + onStatus;
        //String textToPrint = modelNumber + onStatus;
        String textToPrint = getTextFromFile();
        int pageNumber = 1;

        while (copies > 0 && !paperTray.isEmpty())
        {
            //System.out.println(modelStatus + (paperTray.pages) + " pages in tray. Printing... " + (paperTray.pages - 1) + " pages still left!");
            pAgeMap.put(pageNumber, new PAge(textToPrint + ":" + pageNumber));
            copies--;
            pageNumber++;
            paperTray.usePage();
        }

        if (paperTray.isEmpty()) {
            System.out.println("Load paper!");
        }
    }

    private String getTextFromFile() {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        CapitalizationReader capReader = null;
        String allText = "";

        try {
          fileReader  = new FileReader("D:\\downloads\\olalala.txt");
          bufferedReader = new BufferedReader(fileReader);
            capReader = new CapitalizationReader(bufferedReader);
            String line;

            try {
                while ((line = capReader.readLine()) != null) {
                    allText += line + "\n";
                }
                return allText;

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (capReader != null){
                try {
                    capReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return "";
    }

    /*public void outputPages() {
        for (PAge currentPage : pages) {
            System.out.println(currentPage.getText());
        }
    }*/
    public void outputPage (int pageNumber) {

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("D:\\Downloads\\olalala_out.txt"));
            writer.println(pAgeMap.get(pageNumber).getText());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null)
                writer.close();
        }
        //System.out.println(pAgeMap.get(pageNumber).getText());
    }

    private void checkCopies(int copies) {
        if (copies < 0) {
            throw new IllegalArgumentException("Can't print less than 0 copies");
        }
    }

    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message) {
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.toString());
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
        System.out.println("Machines is turned off!");
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

    public T getCartRidge() {
        return cartRidge;
    }

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

