package greetings;

import printing.ColorCartRidge;
import printing.BWCartRidge;
import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class HelloWorld {

    public static void main(String[] args) {
        Printer<ColorCartRidge> printerColor = new Printer<ColorCartRidge>(true, "Lexmark", new ColorCartRidge());
        Printer<BWCartRidge> printerBW = new Printer<BWCartRidge>(true, "BWPRINTER", new BWCartRidge());

        printerBW.printUsingCartridge(new ColorCartRidge(), "Hello!");

//        printerColor.print(1);
//        printerBW.print(1);

//        Printer myPrinter = new Printer(true, "Lexmark");
//        IMachine myMachine = new Printer(true, "Test");

//        myPrinter.loadPaper(5);
//        myPrinter.print(5);
    }
}
