import java.util.ArrayList;
import java.util.Scanner;
public class ReservationSystem {
    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();


    //cancel revervation
    //changer reservation
    //public void SortReservation;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to add reservation information");
            System.out.println("Enter 2 to cancel a reservation");
            System.out.println("Enter 3 to sort the list of Reservations");
            System.out.println("Enter 4 to edit your reservation");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //make reservations
                    System.out.println("Reservation Name: ");
                    String name = scanner.next();
                    System.out.print("How many people in your party?");
                    int numPeople = scanner.nextInt();
                    System.out.print("What time would you like your reservation");
                    int time = scanner.nextInt();
                    System.out.println("What time is it where you are?");
                    int timeMade = scanner.nextInt();
                    System.out.println("What number in line are you?");
                    int keY = scanner.nextInt();
                    addReservation(name, numPeople, time, timeMade, keY);
                    displayReservation();
                    break;
                case 2:
                    //canceling reservation
                    System.out.println("Please enter the key of the Reservation");
                    int resIndex = scanner.nextInt();
                    for (int n = resIndex; n < reservations.size(); n++) {
                        if(reservations.get(n+1) != null){
                            reservations.set(n, reservations.get(n+1));
                            reservations.remove(n+1);
                        }else{
                            System.out.println("hello");
                        }
                        }
                        break;
                case 3:
                    System.out.println("sorting info...");
                        sortReservations();
                        displayReservation();
                        break;
                case 4:
                    //changing reservation
                    System.out.println("What name is your Reservation?");
                    Scanner scanner1 = new Scanner(System.in);
                    String ansName = scanner1.nextLine();
                    for(int i = 0; i<= reservations.size(); i+=1) {
                        System.out.println("Enter 5 if you want to change the number of people in your party  \n Enter 6 if you want to change the time of your reservation");
                        int answer = scanner.nextInt();
                        if (answer == 5) {
                            System.out.println("What is the new party size of reservation?");
                            int ansNumppl = Integer.parseInt(scanner.next());
                            reservations.get(i).numPeople = ansNumppl;
                            displayReservation();
                        } else
                            System.out.println("What is the new time of reservation?");
                        int ansTime = scanner.nextInt();
                        reservations.get(i).time = ansTime;
                        displayReservation();
                    }
                        break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR 404");
                    }


            }
        }



    public static void addReservation(String name, int numPeople, int time, int timeMade, int keY) {
        reservations.add(new Reservation(name, numPeople, time, timeMade, keY));

    }

    public static void displayReservation() {
        for(int i =0; i < reservations.size(); i++){
            System.out.println(reservations.get(i).toString());

        }
            }
    public static void sortReservations(){
        int i, j;
        Reservation temp;
        boolean swapped;
        for(i = 0; i < reservations.size() - 1; i++){
            swapped = false;
            for(j = 0; j < reservations.size() - 1; j++){
                if(reservations.get(j).time > reservations.get(j+1).time){
                    temp = reservations.get(j);
                    reservations.set(j, reservations.get(j + 1))  ;
                    reservations.set((j + 1), temp);
                    swapped = true;
                }
            }
        }
    }



        }
















