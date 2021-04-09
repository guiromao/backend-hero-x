package com.herox.backend.services;

import com.herox.backend.model.HeroManager;
import com.herox.backend.model.ObjectsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    private List<HeroManager> managersList = ObjectsConstructor.generateManagers();

    public void addManager(HeroManager manager){
        managersList.add(manager);
    }

    public HeroManager getManager(int index){
        return managersList.get(index-1);
    }

    public List<HeroManager> getManagersList(){
        return managersList;
    }

    public HeroManager login(String username, String password){
        HeroManager manager = findManager(username);

        if(manager.getPassword().equals(password)){
            return manager;
        }
        return null;
    }

    public int getHeroIndex(HeroManager manager){
        return managersList.indexOf(manager) + 1;
    }

    private HeroManager findManager(String login){
        for(HeroManager manager: managersList){
            if(login.equals(manager.getLogin())){
                return manager;
            }
        }
        return null;
    }



}
