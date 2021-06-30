package com.z8q.controller;

import com.z8q.dto.ArrNumDto;
import com.z8q.model.ArrayModel;
import com.z8q.service.FindNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumController {

    @Autowired
    private FindNumberService findNumberService;

    @PostMapping("/")
    public ResponseEntity handleJson(@RequestBody ArrNumDto arrNumDto) {

        //ArrayModel arrayModel = new ArrayModel();

        String numArray = arrNumDto.getNumArray();
        int number = arrNumDto.getNumber();

        int response = findNumberService.showNumber(numArray, number);

        findNumberService.saveData(arrNumDto, numArray, number);

        return ResponseEntity.ok(response);
    }
}
