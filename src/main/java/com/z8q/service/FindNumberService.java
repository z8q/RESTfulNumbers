package com.z8q.service;

import com.z8q.dto.ArrNumDto;
import com.z8q.model.ArrayModel;
import com.z8q.repository.NumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLOutput;
import java.util.*;

@Service
public class FindNumberService {

    @Autowired
    private NumRepo numRepo;

    private int theClosestNumber;

    public List<ArrayModel> list() {
        return numRepo.findAll();
    }

    public Integer showNumber(String arr, int number) {

        String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                System.out.println("Something wrong with parsing");
            };
        }

        Map<Integer, Integer> tenMinusElement = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < items.length; i++) {
            int x = Math.abs(results[i] - number);
            tenMinusElement.put(results[i], x);
        }
        int x = Collections.min(tenMinusElement.values());

        for (Map.Entry element : tenMinusElement.entrySet()) {
            if (element.getValue().equals(x)) {
                list.add((Integer) element.getKey());
            }
        }
        this.theClosestNumber = Collections.max(list);
        return Collections.max(list);
    }

    public void saveData(ArrNumDto arrNumDto, String numArray, int number, int resultNumber) {

        arrNumDto.setNumArray(numArray);
        arrNumDto.setNumber(number);
        arrNumDto.setResultNumber(theClosestNumber);
        numRepo.save(arrNumDto.toArrayModel());
    }
}

