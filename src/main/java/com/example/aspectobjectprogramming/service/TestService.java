package com.example.aspectobjectprogramming.service;

import com.example.aspectobjectprogramming.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;
    public String method() throws Exception {
        return testRepository.getName();
    }
    public String method2() throws Exception {
        return testRepository.getAge();
    }
}
