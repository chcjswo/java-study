package print;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPrintPage;

import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by chcjswo on 2020-04-12
 * Github: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */
public class PdfPrint {
    public static void main(String[] args) throws IOException, PrinterException {
        File f = new File("D:\\test.pdf");
        FileInputStream fis = new FileInputStream(f);
        FileChannel fc = fis.getChannel();
        ByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
        PDFFile pdfFile = new PDFFile(bb);
        PDFPrintPage pages = new PDFPrintPage(pdfFile);
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat pf = PrinterJob.getPrinterJob().defaultPage();
        pjob.setJobName(f.getName());
//        pjob.setPrintService();
        Book book = new Book();
        book.append(pages, pf, 1);
        pjob.setPageable(book);
        pjob.print();
    }
}
