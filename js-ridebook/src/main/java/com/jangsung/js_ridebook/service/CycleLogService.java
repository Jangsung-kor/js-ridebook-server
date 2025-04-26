package com.jangsung.js_ridebook.service;

import java.util.List;

import com.jangsung.js_ridebook.dto.CycleLogDto;

public interface CycleLogService
{
    List<CycleLogDto> getCycleLogs();

    CycleLogDto getLogDetailById(Long id);

    void addCycleLog(CycleLogDto dto);

    void updateCycleLog(CycleLogDto dto);

    void deleteCycleLog(Long id);
}
