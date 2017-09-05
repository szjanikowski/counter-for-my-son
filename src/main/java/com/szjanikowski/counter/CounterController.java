package com.szjanikowski.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/counters")
public class CounterController {

    private final CounterRepository counterRepository;

    @Autowired
    public CounterController(CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @RequestMapping(method= RequestMethod.POST)
    public void addCounter(@RequestBody Counter counter) {
        counterRepository.save(counter);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Counter> getCounters() {
        return counterRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Counter getCounter(@PathVariable(value = "id") String id) {
        return counterRepository.findOne(id);
    }


}
