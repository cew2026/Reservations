public class Reservation {
    public Reservation(String pName, int pNumPeople, int pTime, int pTimeMade, int pKey) {
        name = pName;
        numPeople = pNumPeople;
        time = pTime;
        timeMade = pTimeMade;
        key = pKey;
    }

    int numPeople;
    int time;
    int timeMade;
    int key;
    String name;
    String resName;
    int answer;
    String ansName;
    int ansNumppl;
    int ansTime;









    public String toString(){
        return ("Key: " + key + " Name: " + this.name + "\n Number of People: " + this.numPeople + "\n Time Requested: " + this.time + "\n timeMade: "+ this.timeMade+"\n");
    }


}