package org.example.DAO;

import org.example.AppUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppUserDAOCollection implements AppUserDAO{

    List<AppUser> appUserList = new ArrayList<AppUser>();

    @Override
    public AppUser persist(AppUser appUser) {
        appUserList.add(appUser);
        return appUser;
    }

    @Override
    public Optional<AppUser> findByUserName(String username) {

       /* for(AppUser appUser : appUserList){
            if(appUser.getUsername().equals(username)) return appUser;
        }*/

        return appUserList.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    @Override
    public List<AppUser> findAll() {
        return appUserList;
    }

    @Override
    public void remove(String username) {
        Optional<AppUser> appUser = findByUserName(username);
        appUserList.remove(appUser);
    }
}
