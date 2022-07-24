import java.util.Scanner;

public class Player {
    private Scanner input=new Scanner(System.in);
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;

    private Inventory inventory;

    public Player(String name){
        this.name=name;
        this.inventory=new Inventory();
    }

    public int getDamage(){
        return damage+this.inventory.getWeapon().getDamage();
    }

    public void setDamage(int damage){
        this.damage=damage;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) { this.health=health;}

    public int getMoney(){return money;}

    public void setMoney(int money){this.money=money;}

    public String getCharName(){return charName;}

    public void setCharName(String charName){this.charName=charName;}

    public String getName(){return name;}

    public void setName(String name){this.name=name;}

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectCharacter(){

        Gamechare[] charlist={new Samurai(),new Knight(),new Archer()};

        System.out.println("Please choose your warrior!");

        for(Gamechare gamechar:charlist){
            System.out.println("\tId:"+gamechar.getId()+
                               "\tName:"+gamechar.getName()+
                               "\tHealth:"+gamechar.getHealth()+
                               "\tDamage:"+gamechar.getDamage()+
                               "\tMoney:"+gamechar.getMoney());



        }
        System.out.println("Character ID:");
        int selectChar=input.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;



        }
        /*
        System.out.println("name:"+this.charName+
                " \tHealth:"+this.getHealth()+
                " \tDamage:"+this.getDamage()+
                " \tMoney:" +this.getMoney());
                */






    }


    public void initPlayer(Gamechare gamechare){
        this.setDamage(gamechare.getDamage());
        this.setCharName(gamechare.getName());
        this.setHealth(gamechare.getHealth());
        this.setMoney(gamechare.getMoney());
    }

    public void printInfo(){
        System.out.println("name:"+this.charName+
                " \tHealth:"+this.getHealth()+
                " \tDamage:"+this.getDamage()+
                " \tMoney:" +this.getMoney()+
                " \tweapon:"+this.getInventory().getWeapon().getName());


    }





}

