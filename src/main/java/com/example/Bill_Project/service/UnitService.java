package com.example.Bill_Project.service;

import com.example.Bill_Project.entity.Unit;
import com.example.Bill_Project.repository.UnitRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UnitService {
    @Autowired
    private final UnitRepository unitRepository;

    ///////Save unit/////
    public Unit saveUnit(Unit unit) {
        log.info("Saving new unit", unit);
        return unitRepository.save(unit);
    }
    //////Get units////
    public List<Unit> getUnits() {
        log.info("Get list of unit");
        return unitRepository.findAll();
    }
    /////Update unit////
    public Unit updateUnit(Unit unit) {
        log.info("Update new unit", unit.getUnit_name());
        Unit existingUnit = unitRepository.findById(unit.getUnit_id()).orElse(null);
        existingUnit.setUnit_name(unit.getUnit_name());
        return unitRepository.save(existingUnit);
    }
    /////Delete unit////
    public String deleteUnit(int id) {
        log.info("Delete unit by {}", id);
        unitRepository.deleteById(id);
        return "Unit was deleted by: " + id;
    }
}
