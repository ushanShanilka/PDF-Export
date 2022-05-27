package com.pdfexport.pdfexport.service;

import com.pdfexport.pdfexport.dto.StudentDTO;
import net.sf.jasperreports.engine.JRException;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 5/18/2022
 **/
public interface StudentService {
    public String save(StudentDTO studentDTO);
    public List<StudentDTO> getAll();
    public void test(HttpServletResponse response) throws IOException, JRException;
    public void testYellow(HttpServletResponse response) throws IOException, JRException;
    public void mm54(HttpServletResponse response) throws IOException, JRException;
    public void mm80(HttpServletResponse response) throws IOException, JRException;
}
