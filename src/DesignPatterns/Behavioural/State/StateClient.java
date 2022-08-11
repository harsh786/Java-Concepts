package DesignPatterns.Behavioural.State;

import DesignPatterns.Behavioural.State.Concretes.TrafficLightController;
import DesignPatterns.Behavioural.State.Concretes.TrafficLightTimerCalculationStartegy;
import DesignPatterns.Behavioural.State.Interfaces.ITrafficController;
//https://www.digitalocean.com/community/tutorials/state-design-pattern-java
public class StateClient {
    public static void main(String[] args) {
        ITrafficController controller=new TrafficLightController(1,5,
                new TrafficLightTimerCalculationStartegy());

        controller.start();
        controller.display();

    }
}
