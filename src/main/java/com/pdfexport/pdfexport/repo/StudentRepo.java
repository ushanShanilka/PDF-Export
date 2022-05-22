package com.pdfexport.pdfexport.repo;


import com.pdfexport.pdfexport.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 5/18/2022
 **/
public interface StudentRepo extends JpaRepository<Student, Long> {
}
