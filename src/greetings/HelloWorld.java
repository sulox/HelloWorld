package greetings;

import printing.ColorCartRidge;
import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class HelloWorld {

    public static void main(String[] args) {
        Printer<ColorCartRidge> printer = new Printer<ColorCartRidge>(true, "Lexmark", new ColorCartRidge());
//        Printer myPrinter = new Printer(true, "Lexmark");
//        IMachine myMachine = new Printer(true, "Test");

//        myMachine.turnOn();

//        myPrinter.loadPaper(5);
//        myPrinter.print(5);
    }
}
