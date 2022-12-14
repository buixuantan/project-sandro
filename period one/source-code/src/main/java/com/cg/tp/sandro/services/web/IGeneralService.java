package com.cg.tp.sandro.services.web;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {

    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);

}
