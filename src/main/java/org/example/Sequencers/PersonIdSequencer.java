package org.example.Sequencers;

public class PersonIdSequencer {

    private static int currentid;

    public  int getCurrentid() {
        return currentid;
    }

    public void setCurrentid(int currentid) {
        this.currentid = currentid;
    }

    public static int nextId(){
        return ++currentid;
    }

 /*   int getCurrentid(){
        return currentid;
    }

    void setCurrentid(int ci){
        currentid = ci;
    }*/
}
