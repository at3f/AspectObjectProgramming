package com.example.aspectobjectprogramming.repository;

import com.example.aspectobjectprogramming.aspect.ThrowGlobalError;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {
    @ThrowGlobalError
    public String getName() throws Exception {
        if(!true){
            throw new Exception();
        }
        return "Ahmed";
    }
    @ThrowGlobalError
    public String getAge() throws Exception {
        if(true){
            throw new Exception();
        }
        return "25";
    }
}
