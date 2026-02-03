package edu.icet.service.impl;

import edu.icet.dto.TimetableDto;
import edu.icet.entity.TimetableEntity;
import edu.icet.repository.TimetableRepository;
import edu.icet.service.TimetableService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TimetableServiceImpl implements TimetableService {

    final TimetableRepository repository;

    final ModelMapper mapper;

    @Override
    public void addTimetable(TimetableDto timetableDto) {
        repository.save(mapper.map(timetableDto, TimetableEntity.class));
    }

    @Override
    public void updateTimetable(TimetableDto timetableDto) {
        repository.save(mapper.map(timetableDto, TimetableEntity.class));
    }

    @Override
    public void deleteTimetable(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public TimetableDto searchTimetableById(Integer id) {
        TimetableEntity all = repository.findById(id).get();
        TimetableDto timetableDto = mapper.map(all,TimetableDto.class);

        return timetableDto;
    }

    @Override
    public List<TimetableDto> getAll() {
        List<TimetableEntity> all = repository.findAll();
        List<TimetableDto> timetableDto = new ArrayList<>();

        all.forEach(timetableEntity -> {
            timetableDto.add(mapper.map(timetableEntity,TimetableDto.class));
        });
        return timetableDto;
    }
}
