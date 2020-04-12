package print;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * Created by chcjswo on 2020-04-12
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class Printer implements Printable {
    public int print(Graphics g, PageFormat pf, int pageIndex) {
        if (pageIndex != 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D outline = new Rectangle2D.Double(pf.getImageableX(), pf
            .getImageableY(), pf.getImageableWidth(), pf
            .getImageableHeight());
        g2.setPaint(Color.black);
        g2.draw(outline);
        return PAGE_EXISTS;
    }
    public static void main(String[] args) {
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new Printer());
        if (pj.printDialog()) {
            try {
                pj.print();
            } catch (PrinterException e) {
                System.out.println(e);
            }
        }
    }
}
