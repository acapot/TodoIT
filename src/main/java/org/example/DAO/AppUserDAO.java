package org.example.DAO;

import org.example.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);
    Optional<AppUser> findByUserName(String username);
    List<AppUser>findAll();
    void remove(String username);
}