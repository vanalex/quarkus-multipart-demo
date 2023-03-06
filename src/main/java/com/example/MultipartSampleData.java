package com.example;

import lombok.Data;

import java.io.InputStream;
import org.jboss.resteasy.reactive.PartType;
import org.jboss.resteasy.reactive.RestForm;

@Data
public class MultipartSampleData {
    @RestForm("file")
    @PartType("text/csv")
    InputStream part;

    @RestForm("test")
    String test;

    @RestForm("checked")
    boolean checked = false;

    @RestForm("choice")
    Choice choice = Choice.NO;

}
