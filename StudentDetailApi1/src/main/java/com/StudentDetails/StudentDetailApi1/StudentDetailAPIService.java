package com.StudentDetails.StudentDetailApi1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentdetail")
public class StudentDetailAPIService
{
    StudentDetail studentDetail;

    @GetMapping
    public StudentDetail getStudentDetail( String rollNo)
    {
//        return studentDetail;
        return new StudentDetail("kalyani","7","2345","Bsc.It");

    }

}
