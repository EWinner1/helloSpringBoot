package com.ewinner.hellospringboot.Common.Mappers;

import com.ewinner.hellospringboot.Common.Models.People;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IPeopleMapperXML {
    List<People> getAllPeople();
}
