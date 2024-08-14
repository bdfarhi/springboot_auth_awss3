package com.example.demo.s3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "aws.s3.buckets")
public class S3Buckets {

    private String Student ;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}

