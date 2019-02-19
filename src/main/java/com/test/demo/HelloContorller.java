package com.test.demo;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

class SomeObject {
    int id;
    String description;
    Date date;

    public SomeObject(int i, String description, Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


@RestController
public class HelloContorller {

    @RequestMapping("/")
    @ResponseBody
    public SomeObject index() {
        return new SomeObject(1001, "Shileto MATAFAKAAA", new Date());
    }
}