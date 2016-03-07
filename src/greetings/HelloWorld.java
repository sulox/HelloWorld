package greetings;

import printing.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        Printer<ColorCartRidge> printer = new Printer<ColorCartRidge>(true, "Lexmark", new ColorCartRidge());
        //Printer<BWCartRidge> printer = new Printer<BWCartRidge>(true, "BWPRINTER", new BWCartRidge());

        printer.loadPaper(5);
        printer.print(3);
        printer.outputPage(2);
    }
        /*
        Map<String, List<Integer>> testScores = new HashMap<String, List<Integer>>();

        List<Integer> joeScores = new ArrayList<Integer>();
        joeScores.add(80);
        joeScores.add(60);
        joeScores.add(23);
        joeScores.add(55);
        joeScores.add(67);
        joeScores.add(11);
        joeScores.add(45);
        joeScores.add(82);
        joeScores.add(88);
        joeScores.add(23);
        joeScores.add(132);
        joeScores.add(123213);
        joeScores.add(123);
        testScores.put("Joe",joeScores);

        List<Integer> amyScores = new ArrayList<Integer>();
        amyScores.add(12);
        amyScores.add(13);
        amyScores.add(14);
        amyScores.add(15);
        amyScores.add(16);
        amyScores.add(17);
        amyScores.add(18);
        amyScores.add(19);
        amyScores.add(20);
        amyScores.add(21);
        amyScores.add(23);
        amyScores.add(25);
        amyScores.add(26);
        testScores.put("Amy",amyScores);

        List<Integer> fredScores = new ArrayList<Integer>();
        fredScores.add(31);
        fredScores.add(32);
        fredScores.add(33);
        fredScores.add(34);
        fredScores.add(35);
        fredScores.add(36);
        fredScores.add(37);
        fredScores.add(38);
        fredScores.add(39);
        fredScores.add(40);
        fredScores.add(41);
        fredScores.add(42);
        fredScores.add(43);
        testScores.put("Fred",fredScores);

        printScores("Joe",testScores);
    }

    public static void printScores (String studentName, Map<String, List<Integer>> scoresMap){
        List<Integer> scores = scoresMap.get(studentName);
        for (int score : scores) {
            System.out.println(score);
        }
    }

        Queue<String> myQueue = new LinkedList<String>();

        myQueue.offer("a");
        myQueue.offer("b");
        myQueue.offer("c");

        while (myQueue.peek() != null){
            System.out.println(myQueue.poll());
        }

        //printer.loadPaper(10);
        //printer.print(5);

        //printer.outputPage(2);
        /*
        File file = new File("C:\\test123123.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            printer.print(-1);
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }
        finally {
            printer.turnOff();
        }
        */

//        printOne(printerColor);

//        printerBW.printUsingCartridge(new ColorCartRidge(), "Hello!");

//        printerColor.print(1);
//        printerBW.print(1);

//        Printer myPrinter = new Printer(true, "Lexmark");
//        IMachine myMachine = new Printer(true, "Test");

//        myPrinter.loadPaper(5);
//        myPrinter.print(5);

//    public static void printOne(Printer<? extends ICartridge> printer) {
//        String fillPercentage = printer.getCartRidge().getFillPercentage();
//        System.out.println(fillPercentage);
//    }
}
