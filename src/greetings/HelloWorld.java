package greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class HelloWorld {

    public static void main(String[] args) {
//        Printer myPrinter = new Printer(true, "Lexmark");
        IMachine myMachine = new Printer(true, "Test");

        myMachine.turnOn();

//        myPrinter.loadPaper(5);
//        myPrinter.print(5);
    }
}
