package com.z8q.service;

import com.z8q.model.ArrayModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FindNumberServiceTest {

    @Autowired
    private FindNumberService findNumberService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<ArrayModel> arrayModels = findNumberService.list();
        Assert.assertEquals(arrayModels.size(), 0);
    }

}