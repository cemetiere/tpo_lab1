package org.example.astronomicalObject.types;

import org.example.astronomicalObject.params.ObjectColor;
import org.example.exceptions.SunCanNotMoveException;
import org.example.utils.Coordinate;
import org.example.utils.TimeOfDay;

public class Sun extends AbstractObject{
    public Sun(int x, int y) {
        super(x, y);
        this.setColor(ObjectColor.RED);
    }

    @Override
    public double move(Coordinate to) throws Exception {
        throw new SunCanNotMoveException();
    }

    @Override
    public void changeTimeOfDay(TimeOfDay tod) {
        System.out.println("Sun is always red!");
    }
}
