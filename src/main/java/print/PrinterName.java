package print;

import javax.print.PrintService;
import java.awt.print.PrinterJob;

/**
 * Created by chcjswo on 2020-04-12
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */

public class PrinterName {
    public static void main(String[] args) {
        // Lookup for the available print services.
        PrintService[] printServices = PrinterJob.lookupPrintServices();

        // Iterates the print services and print out its name.
        for (PrintService printService : printServices) {;
            String name = printService.getName();
            System.out.println("Name = " + name);
        }
    }
}
