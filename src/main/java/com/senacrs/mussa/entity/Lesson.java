package com.senacrs.mussa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Lesson extends GenericEntity{


    @OneToMany (mappedBy = "lesson")
    private List<Content> contents;


    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

}
