package com.pdfexport.pdfexport.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ushan Shanilka <ushanshanilka80@gmail.com>
 * @since 5/18/2022
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name = "student")
public class Student {
    @Id
    private Long id;
    private String name;
    private String address;
}
