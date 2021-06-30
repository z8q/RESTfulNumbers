package com.z8q.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.z8q.model.ArrayModel;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrNumDto {
    private Long id;
    private String numArray;
    private int number;

    public ArrayModel toArrayModel() {
        ArrayModel arrayModel = new ArrayModel();
        arrayModel.setId(id);
        arrayModel.setNumArray(numArray);
        arrayModel.setNumber(number);

        return arrayModel;
    }

    public static ArrNumDto fromArrayModel(ArrayModel arrayModel) {
        ArrNumDto arrNumDto = new ArrNumDto();
        arrNumDto.setId(arrayModel.getId());
        arrNumDto.setNumArray(arrayModel.getNumArray());
        arrNumDto.setNumber(arrayModel.getNumber());

        return arrNumDto;
    }
}
