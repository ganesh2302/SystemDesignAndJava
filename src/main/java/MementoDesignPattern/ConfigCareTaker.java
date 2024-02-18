package MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigCareTaker {
    List<ConfigMemento> history = new ArrayList<>();

    public void addMemento(ConfigMemento memento){
        history.add(memento);
    }

    public void printhistory(){
        for(ConfigMemento memento:history){
            System.out.println("List PV:"+memento.getProductVersion());
            System.out.println("List MT:"+memento.getMajorTag());
        }

        System.out.println();
    }

    public ConfigMemento undo(){
        if(!history.isEmpty()){
            int lastindex = history.size()-1;
            ConfigMemento lastmemento = history.get(lastindex);
            history.remove(lastindex);
            return lastmemento;
        }
        return null;
    }

}
