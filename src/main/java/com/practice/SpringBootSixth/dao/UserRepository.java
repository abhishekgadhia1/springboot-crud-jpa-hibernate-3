package com.practice.SpringBootSixth.dao;

import org.springframework.data.repository.CrudRepository;

import com.practice.SpringBootSixth.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
