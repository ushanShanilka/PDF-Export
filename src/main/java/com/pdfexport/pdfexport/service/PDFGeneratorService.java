package com.pdfexport.pdfexport.service;

import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.layout.LayoutArea;
import com.itextpdf.layout.layout.LayoutContext;
import com.itextpdf.layout.layout.LayoutResult;
import com.itextpdf.layout.renderer.IRenderer;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@Service
public class PDFGeneratorService {
    public void export(HttpServletResponse response) throws IOException{


//        String dest = "D:/itextExamples/sample.pdf";
//        PdfWriter writer = new PdfWriter(response.getOutputStream());
//        PdfDocument pdfDoc = new PdfDocument(writer);
//        pdfDoc.addNewPage();
//        pdfDoc.setDefaultPageSize(PageSize.A1);
//        Rectangle one = new Rectangle(700, 10);
//        Document document = new Document(pdfDoc, new PageSize(PageSize.A10));
//        document.setBottomMargin(0);
//        document.setTopMargin(0);
//
//
//
//        Paragraph paragraph = new Paragraph("Intelleon");
//        paragraph.setTextAlignment(TextAlignment.CENTER);
//        paragraph.setFontSize(18F);
//
//        Paragraph sample = new Paragraph("This is Sample");
//        sample.setTextAlignment(TextAlignment.LEFT);
//
//
//
//        document.add(paragraph);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.add(sample);
//        document.close();

        int x = 200;

        PdfDocument pdf = new PdfDocument(new PdfWriter(response.getOutputStream()));
        Rectangle one = new Rectangle(100f,x);
        Rectangle two = new Rectangle(700,400);
        Document document = new Document(pdf,new PageSize(one));
        document.setTopMargin(0);
        document.setBottomMargin(0);
        Paragraph p = new Paragraph("Hi");

        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
        document.add(p);
//        document.add(new AreaBreak(new PageSize(two)));
//        document.setMargins(20, 20, 20, 20);
//        document.add(p);
        document.close();

//        Rectangle pagesize = new Rectangle(288, 720);
//        Document document = new Document(pagesize);
//        PdfWriter.getInstance(document,response.getOutputStream());
//
//        document.setMargins(0,0,0,0);
//
//        document.open();
//        com.lowagie.text.Font fontForTitle = FontFactory.getFont(FontFactory.COURIER);
//        fontForTitle.setSize(30);
//
//        Paragraph paragraph = new Paragraph("Title of the PDF.", fontForTitle);
//        paragraph.setAlignment(Paragraph.ALIGN_CENTER);
//
//
//
//        Font fontForParagraph = FontFactory.getFont(FontFactory.HELVETICA);
//        fontForParagraph.setSize(16);
//
//        Paragraph paragraph1 = new Paragraph("Paragraph is here.");
//        paragraph1.setAlignment(Paragraph.ALIGN_LEFT);
//
//        document.add(paragraph);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.add(paragraph1);
//        document.close();
    }

}
