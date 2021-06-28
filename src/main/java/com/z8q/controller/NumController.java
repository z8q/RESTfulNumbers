package com.z8q.controller;

import com.z8q.dto.ArrNumDto;
import com.z8q.service.FindNumberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumController {

    @PostMapping("/")
    public ResponseEntity handleJson(@RequestBody ArrNumDto arrNumDto) {

        int[] numArray = arrNumDto.getNumArray();
        int number = arrNumDto.getNumber();

        FindNumberService findNumberService = new FindNumberService();
        int response = findNumberService.showNumber(numArray, number);



        return ResponseEntity.ok(response);
    }
}
