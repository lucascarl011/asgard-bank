package me.dio.asgard_bank.service;

import me.dio.asgard_bank.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
