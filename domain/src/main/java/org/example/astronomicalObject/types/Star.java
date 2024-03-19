package org.example.astronomicalObject.types;

import lombok.Getter;
import lombok.Setter;
import org.example.astronomicalObject.params.ObjectColor;
import org.example.exceptions.SunCanNotMoveException;
import org.example.utils.Coordinate;
import org.example.utils.TimeOfDay;

@Getter @Setter
public class Star extends AbstractObject{
    private String name;
    public Star(int x, int y, String name){
        super(x, y);
        this.name = name;
        this.setColor(ObjectColor.RED);
    }
    @Override
    public double move(Coordinate to) throws Exception { //todo test distance
        double distance = Math.sqrt(Math.pow(to.getX()-this.getCoordinate().getX(),2)
                + Math.pow(to.getY() - this.getCoordinate().getY(), 2));
        this.setCoordinate(to);
        return distance;
    }

    @Override
    public void changeTimeOfDay(TimeOfDay tod) {
        if(tod == TimeOfDay.DAY){
            this.setColor(ObjectColor.RED);
        } else
        if(tod == TimeOfDay.NIGHT){
            this.setColor(ObjectColor.BLUE);
        }
    }
}
