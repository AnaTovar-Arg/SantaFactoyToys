package dev.santafactorytoys.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.santafactorytoys.models.GoodToy;

public class GoodToyDatabase implements IDatabase<GoodToy> {

 
    private List<GoodToy> goodToys;

    public GoodToyDatabase(){
        initDB();
    }

    public List<GoodToy> geToys(){
        
        return goodToys;
    }

    public void save(GoodToy toy){  
              
        goodToys.add(toy);
        
        
    }

    public void delete(GoodToy toy) {
        System.out.println("juguete que llego");
        
        goodToys.remove(toy);        
        
    }

    private void initDB() {
        this.goodToys = new ArrayList<>(Arrays.asList(new GoodToy("juguete primero", "lego", 10, "construccion")));
        
    }

}
