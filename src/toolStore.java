public class toolStore extends normalLocation{
    public toolStore(Player player) {
        super(player, "market");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Welcome to the shop");
        System.out.println("""
                1-weapons
                2-armors
                3-Exit""");

        System.out.println("Select:");



        int selectcase= input.nextInt();
        while (selectcase < 1||selectcase>3){
            System.out.println("Error!!");
            System.out.println("Select:");
            selectcase= input.nextInt();

        }
        switch (selectcase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                return true;

        }
        return true;

    }
    public void printWeapon(){
        System.out.println("Weapons:");
        for(Weapon w:Weapon.weapons()){
            System.out.println("id:"+w.getId()
                    +"\tname:"+w.getName()
                    +"\tdamage:"+w.getDamage()
                    +"\tprice:"+w.getPrice());
        }


    }

    public void buyWeapon(){
        System.out.println("Select:");
        int selectWeapon= input.nextInt();
        while (selectWeapon<1||selectWeapon>Weapon.weapons().length){
            System.out.println("Error!!");
            selectWeapon= input.nextInt();;
        }
        Weapon selectedWeapon=Weapon.getWeaponobjByid(selectWeapon);
        if(selectedWeapon!=null){
            if(selectedWeapon.getPrice()> getPlayer().getMoney()){
                System.out.println("You don't have enough money!");
            }else{
                System.out.println(selectedWeapon.getName()+" added to inventory");
                int balance= getPlayer().getMoney()- selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Remaining money:"+getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);

            }

        }

    }

    public void printArmor(){
        System.out.println("Armors:");
    }
}
