package com.ewinner.hellospringboot.Common.Mappers;

import com.ewinner.hellospringboot.Common.Models.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IPeopleMapper {
    @Select("select * from People")
    List<People> getAllPeople();
}
