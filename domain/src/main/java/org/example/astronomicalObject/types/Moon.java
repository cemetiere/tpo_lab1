package org.example.astronomicalObject.types;

import org.example.astronomicalObject.params.ObjectColor;
import org.example.utils.Coordinate;
import org.example.utils.TimeOfDay;

public class Moon extends AbstractObject {

    public Moon(int x, int y) {
        super(x, y);
        this.setColor(ObjectColor.RED);
    }

    @Override
    public double move(Coordinate to) throws Exception {

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
            this.setColor(ObjectColor.BLACK);
        }
    }

}
