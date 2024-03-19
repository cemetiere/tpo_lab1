package org.example;

import org.example.astronomicalObject.types.Moon;
import org.example.astronomicalObject.types.Star;
import org.example.components.Screen;
import org.example.utils.Coordinate;
import org.example.utils.TimeOfDay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Screen screen = new Screen(100,200);
        Star star = new Star(1, 20, "star");
        Moon moon = new Moon(10, 50);
        screen.addAstronomicalObject(star);
        screen.addAstronomicalObject(moon);
        System.out.println(screen.getTod() + ": " + star.getColor().toString());
        System.out.println(screen.getTod() + ": " + moon.getColor().toString());
        screen.setTimeOfDay(TimeOfDay.NIGHT);
        System.out.println(screen.getTod() + ": " + star.getColor().toString());
        System.out.println(screen.getTod() + ": " + moon.getColor().toString());

        System.out.println(star.move(new Coordinate(3,76)));

    }
}
