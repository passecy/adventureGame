import java.util.Scanner;

public class Game {
    private Scanner input=new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to the game.");
        System.out.println("Please, name your character:");

        String playerName=input.nextLine();

        Player player=new Player(playerName);
        System.out.println("Welcome "+player.getName());

        Location location=null;
        player.selectCharacter();
        while (true){

            player.printInfo();

            System.out.println("Locations:");
            System.out.println("1-Safe House");
            System.out.println("2-Tool Store");
            System.out.println("3-Cave");
            System.out.println("4-Forest");
            System.out.println("5-River");
            System.out.println("Choose the location you want to go:");
            int selectloc=input.nextInt();
            switch (selectloc){
                case 1:
                    location=new safeHouse(player);
                    break;
                case 2:
                    location=new toolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                default:
                    location=new safeHouse(player);


            }
            if(!location.onLocation()){
                System.out.println("Game over");
                break;

            }






    }

}
}
