package dev.santafactorytoys.singlentons;

import dev.santafactorytoys.db.GoodToyDatabase;

public class GoodToyDatabaseSinglenton {

    private static GoodToyDatabase INSTANCE;

    private GoodToyDatabaseSinglenton(){}

    public static GoodToyDatabase getInstance(){
        if(INSTANCE == null) 
            INSTANCE = new GoodToyDatabase();
        return INSTANCE;

    }

}
