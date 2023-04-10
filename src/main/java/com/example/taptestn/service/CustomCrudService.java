package com.example.taptestn.service;

import org.springframework.stereotype.Service;

public interface CustomCrudService<T> {
    public T create(T t);
    public T update(T t);
    public boolean delete(T t);
}
