package com.pdfexport.pdfexport.service.impl;

import com.pdfexport.pdfexport.dto.StudentDTO;
import com.pdfexport.pdfexport.entity.Student;
import com.pdfexport.pdfexport.repo.StudentRepo;
import com.pdfexport.pdfexport.service.StudentService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
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

    @Override
    public void testYellow(HttpServletResponse response) throws IOException, JRException {
        List<Student> all = repo.findAll();
        List<Object> objects = new ArrayList<>();

        File file = ResourceUtils.getFile("src/main/resources/jasper/a4-yellow.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(all);

        String logo = "src/main/java/com/pdfexport/pdfexport/assets/4wd.png";
        String email = "src/main/java/com/pdfexport/pdfexport/assets/email.png";
        String phone = "src/main/java/com/pdfexport/pdfexport/assets/phone.png";
        String home = "src/main/java/com/pdfexport/pdfexport/assets/home.png";

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", "Sample");
        parameters.put("logoPath", logo);
        parameters.put("invoiceNo", "001");
        parameters.put("tot", "$2500");
        parameters.put("homeIcon", home);
        parameters.put("webSite", "www.sample.com");
        parameters.put("phoneIcon", phone);
        parameters.put("phoneNumber", "071 123-4564");
        parameters.put("emailIcon", email);
        parameters.put("email", "sample@sample.com");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                jasperReport, parameters, dataSource);

        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
        System.out.println("Yellow PDF-Create");
    }

    @Override
    public void mm54(HttpServletResponse response) throws IOException, JRException {
        List<Student> all = repo.findAll();

        File file = ResourceUtils.getFile("src/main/resources/jasper/54mm.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(all);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", "TITLE");
        parameters.put("address", "No:99 Galle Road Panadura ");
        parameters.put("contactNumber", "Tel : 071 1234-567");
        parameters.put("invoiceNo", "001");
        parameters.put("cashierName", "USHAN");
        parameters.put("subTot", "220.00");
        parameters.put("totAmount", "200.00");
        parameters.put("cash", "500.00");
        parameters.put("change", "300.00");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                jasperReport, parameters, dataSource);

        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());

        System.out.println("57mm PDF-Create");
    }

    @Override
    public void mm80(HttpServletResponse response) throws IOException, JRException {
        List<Student> all = repo.findAll();

        File file = ResourceUtils.getFile("src/main/resources/jasper/80mm.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(all);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("title", "TITLE");
        parameters.put("address", "No:99 Galle Road Panadura ");
        parameters.put("contactNumber", "Tel : 071 1234-567");
        parameters.put("invoiceNo", "001");
        parameters.put("cashierName", "USHAN");
        parameters.put("subTot", "220.00");
        parameters.put("totAmount", "200.00");
        parameters.put("cash", "500.00");
        parameters.put("change", "300.00");

        JasperPrint jasperPrint = JasperFillManager.fillReport(
                jasperReport, parameters, dataSource);

        JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
        System.out.println("80mm PDF-Create");
    }
}
