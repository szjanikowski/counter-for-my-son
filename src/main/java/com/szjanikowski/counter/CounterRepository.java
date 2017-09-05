package com.szjanikowski.counter;

import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<Counter, String>{}
