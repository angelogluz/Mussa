package com.senacrs.mussa.controller;

import com.senacrs.mussa.entity.Subject;
import com.senacrs.mussa.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/services")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }
}
