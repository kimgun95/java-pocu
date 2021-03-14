package academy.pocu.comp2500.assignment3.app;

import academy.pocu.comp2500.assignment3.*;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
	    // write your code here
        SimulationManager simulationManager = SimulationManager.getInstance();

        Unit u0 = new Mine(new IntVector2D(12, 1), 2);
        Unit u1 = new Marine(new IntVector2D(0, 5));
        Unit u2 = new Turret(new IntVector2D(5, 6));
        Unit u3 = new Tank(new IntVector2D(2, 4));
        Unit u4 = new Marine(new IntVector2D(2, 4));
        Unit u5 = new Wraith(new IntVector2D(2, 7));

        ArrayList<Unit> units = new ArrayList<>();

        units.add(u0);
        units.add(u1);
        units.add(u2);
        units.add(u3);
        units.add(u4);
        units.add(u5);

        for (Unit unit : units) {
            simulationManager.spawn(unit);
        }

        SimulationVisualizer visualizer = new SimulationVisualizer(units);
        visualizer.visualize(0, simulationManager.getUnits());
    }
}
