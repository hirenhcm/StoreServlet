package com.sample;

import com.sample.model.GameType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class GameService {

    public List<String> getAvailableBrands(GameType type){

        List<String> brands = new ArrayList<String>();

        if(type.equals(GameType.FPS)){
            brands.add("Call of Duty: Warzone");
            brands.add(("Apex Legend"));

        }else if(type.equals(GameType.STRATAGY)){
            brands.add("Age of Empire");
            brands.add("Cities");

        }else if(type.equals(GameType.RACING)){
            brands.add("Need for Speed");
            brands.add("Asphalt");

        }else {
            brands.add("No Games Available");
        }
    return brands;
    }
}
