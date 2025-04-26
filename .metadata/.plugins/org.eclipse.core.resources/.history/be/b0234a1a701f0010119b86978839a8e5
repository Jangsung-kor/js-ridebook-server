package com.jangsung.js_ridebook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jangsung.js_ridebook.dto.CycleLogDto;

@Mapper
public interface CycleLogMapper
{
    List<CycleLogDto> selectAll();

    CycleLogDto selectById(Long id);

    int insert(CycleLogDto dto);

    int update(CycleLogDto dto);

    int delete(Long id);
}
