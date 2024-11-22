package dev.santafactorytoys.singlentons;

import dev.santafactorytoys.repository.ToyRepository;

public class ToyRepositorySinglenton {
    private static final ToyRepository INSTANCE = new ToyRepository();

    private ToyRepositorySinglenton(){

    }

    public static ToyRepository getInstance(){
        return INSTANCE;
    }

}
