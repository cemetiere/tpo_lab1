package org.example.components;

import lombok.Getter;
import lombok.Setter;
import org.example.astronomicalObject.types.AbstractObject;
import org.example.utils.TimeOfDay;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Screen {
    private int width;
    private int height;
    private int size;
    private TimeOfDay tod;
    private final HashSet<AbstractObject> astronomicalObjects;

    public Screen(int width, int height){
        this.height = height;
        this.width = width;
        this.size = width*height;
        this.astronomicalObjects = new HashSet<>();
        this.tod = TimeOfDay.DAY;
    }
    public void setWidth(int width){ //todo test that size changes too correctly
        this.width = width;
        this.size = this.height * width;
    }
    public void setHeight(int height){ //todo test that size changes too correctly
        this.height = height;
        this.size = this.width * height;
    }
    public void addAstronomicalObject(AbstractObject obj){ //todo test (object adds after screen tod changes)
        obj.changeTimeOfDay(this.tod);
        astronomicalObjects.add(obj);
    }
    public void setTimeOfDay(TimeOfDay tod){ //todo test that object colors change
        this.tod = tod;
        for(AbstractObject obj:astronomicalObjects){
            obj.changeTimeOfDay(tod);
        }
    }
}
