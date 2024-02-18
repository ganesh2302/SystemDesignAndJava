package MementoDesignPattern;

import NullDesignPattern.Car;

public class Main {
    public static void main(String args[]){

        ConfigCareTaker careTaker = new ConfigCareTaker();

        ConfigOriginator originator = new ConfigOriginator(10,5);
        ConfigMemento snapshot1 = originator.createMemento();
        careTaker.addMemento(snapshot1);
        careTaker.printhistory();

        originator.setProductVersion(11);
        originator.setMajorTag(6);

        ConfigMemento snapshot2 = originator.createMemento();
        careTaker.addMemento(snapshot2);

        careTaker.printhistory();

        originator.setProductVersion(12);
        originator.setMajorTag(0);

        ConfigMemento snapshot3 = originator.createMemento();
        careTaker.addMemento(snapshot3);

        careTaker.printhistory();

        ConfigMemento restore = careTaker.undo();
        careTaker.printhistory();
        ConfigMemento restore2 = careTaker.undo();
        careTaker.printhistory();


        originator.restoreMemento(restore2);

        System.out.println("PV:"+originator.getProductVersion());
        System.out.println("MT:"+originator.getMajorTag());





    }
}
