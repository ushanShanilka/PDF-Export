package com.pdfexport.pdfexport.service.impl;


import com.lowagie.text.pdf.PdfWriter;
import com.pdfexport.pdfexport.controller.PDFExportController;
import com.pdfexport.pdfexport.dto.StudentDTO;
import com.pdfexport.pdfexport.entity.Student;
import com.pdfexport.pdfexport.repo.StudentRepo;
import com.pdfexport.pdfexport.service.StudentService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 5/18/2022
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public String save(StudentDTO studentDTO) {
        return null;
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> all = repo.findAll();
        return mapper.map(all,new TypeToken<ArrayList<StudentDTO>>(){}.getType () );
    }

    @Override
    public void test(HttpServletResponse response) throws IOException, JRException {
        List<Student> all = repo.findAll();

        File file = ResourceUtils.getFile("src/main/resources/jasper/a4.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(all);

        String path = "https://logopond.com/logos/99162f0084f18f57585d18ea8913e1b3.png";

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("logoPath", path);
        parameters.put("tot", "$25000");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                jasperReport, parameters, dataSource);

        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());

//        JasperExportManager.exportReportToPdfFile(jasperPrint,"D:\\Working Directory\\pdfexport\\sample.pdf");
        System.out.println("PDF-Create");
    }
}
