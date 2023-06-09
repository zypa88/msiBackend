package com.example.msiproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnalysisDTO {
    private Long id;
    private String name;
    private Date date;
    private String result;

}
