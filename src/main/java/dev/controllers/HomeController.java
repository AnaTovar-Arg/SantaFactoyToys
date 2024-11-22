package dev.santafactorytoys.controllers;

import dev.santafactorytoys.views.HomeView;

public class HomeController {


    public HomeController(){
        index();
    }
    
    public void index() {
       HomeView.index();        
    }

}
