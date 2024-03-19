package org.example.astronomicalObject.types;

import lombok.Getter;
import lombok.Setter;
import org.example.astronomicalObject.params.ObjectColor;
import org.example.astronomicalObject.params.ObjectSize;
import org.example.utils.Coordinate;
import org.example.utils.TimeOfDay;

@Getter @Setter
public abstract class AbstractObject {
    private Coordinate coordinate;
    private ObjectSize size;
    private ObjectColor color;
    public AbstractObject(int x, int y){
        this.coordinate = new Coordinate(x,y);
    }
    public abstract double move(Coordinate to) throws Exception;
    public abstract void changeTimeOfDay(TimeOfDay tod);
}
