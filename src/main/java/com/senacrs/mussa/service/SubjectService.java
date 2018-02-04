package com.senacrs.mussa.service;

import com.senacrs.mussa.dao.SubjectRepository;
import com.senacrs.mussa.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepo;

    public void saveOrUpdate(Subject subject){
        subjectRepo.save(subject);
    }

    public void delete(Integer id){
        Subject sub = new Subject();
        sub.setId(id);
        subjectRepo.delete(sub);
    }
    public List<Subject> getAllSubjects(){
        return subjectRepo.findAll();
    }

    @PostConstruct
    public void populateDatabase(){
        Subject s = new Subject();
        s.setActive(true);
        s.setName("LP-I");
        subjectRepo.save(s);

        Subject ss = new Subject();
        ss.setActive(true);
        ss.setName("LP-I");
        subjectRepo.save(ss);
    }
}
