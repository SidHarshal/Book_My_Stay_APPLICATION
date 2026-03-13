import java.util.*;


class UseCase2RoomInitialization{


    public static void welcomeMessage(){
        System.out.println("=================================================");
        System.out.println("              WELCOME TO BOOK MY STAY            ");
        System.out.println("=================================================");
        System.out.println("Find and book the perfect stay for your trip!");
        System.out.println();
        System.out.println("Author: Harshal");
        System.out.println("Version: 2.1");
        System.out.println("-------------------------------------------------");

    }
    public static void main(String[] args){
        welcomeMessage();
        SingleRoom SngR = new SingleRoom();
        DoubleRoom DnR = new DoubleRoom();
        SuiteRoom StR = new SuiteRoom();
    }
}