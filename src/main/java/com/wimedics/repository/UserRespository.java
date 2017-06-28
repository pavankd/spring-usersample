package com.wimedics.repository;

import org.springframework.data.repository.CrudRepository;

import com.wimedics.model.User;

public interface UserRespository extends CrudRepository<User, Long> {

}
