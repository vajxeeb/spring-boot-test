package com.example.Bill_Project.controller;

import com.example.Bill_Project.entity.Unit;
import com.example.Bill_Project.service.UnitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("unit")
public class UnitController {
    @Autowired
    private final UnitService unitService;

    @PostMapping()
    public Unit saveUnit(@RequestBody Unit unit) {
        return unitService.saveUnit(unit);
    }

    @PutMapping()
    public Unit updateUnit(@RequestBody Unit unit) {
        return unitService.updateUnit(unit);
    }

    @GetMapping()
    public List<Unit> getUnit() {
        return unitService.getUnits();
    }

    @DeleteMapping("/{id}")
    public String deleteUnit(@PathVariable int id) {
        return unitService.deleteUnit(id);
    }
}
