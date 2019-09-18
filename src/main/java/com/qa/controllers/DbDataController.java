package com.qa.controllers;
import com.qa.models.DbData;
import com.qa.repository.DbDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin()
public class DbDataController {
    @Autowired
    private DbDataRepository repository;

    @RequestMapping(value = "dice", method = RequestMethod.GET)
    public List<DbData> listAllDice(){return repository.findAll();}

    @RequestMapping(value = "dice", method = RequestMethod.POST)
    public DbData addDice(@RequestBody DbData DbData){
        return repository.saveAndFlush(DbData);
    }

    @RequestMapping(value = "dice/{id}", method = RequestMethod.GET)
    public DbData getDice(@PathVariable Long id){
        return repository.findOne(id);
    }

    @RequestMapping(value = "dice/{id}", method = RequestMethod.DELETE)
    public DbData deleteDice(@PathVariable Long id){
        DbData existing = repository.findOne(id);
        repository.delete(existing);
        return existing;
    }

    @RequestMapping(value = "dice/{id}", method = RequestMethod.PUT)
    public DbData updateDice(@PathVariable Long id, @RequestBody DbData dice){
        DbData existing = repository.findOne(id);

        existing.setAmount(dice.getAmount());
        existing.setColour(dice.getColour());
        existing.setMaterial(dice.getMaterial());
        existing.setType(dice.getType());

        return existing;
    }
}