public class toolStore extends normalLocation{
    public toolStore(Player player) {
        super(player, "market");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the shop");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("""                                  
                               1-weapons                                       
                               2-armors                                        
                               3-Exit
                               """);

            System.out.println("Select:");


            int selectcase = input.nextInt();
            while (selectcase < 1 || selectcase > 3) {
                System.out.println("Error!!");
                System.out.println("Select:");
                selectcase = input.nextInt();

            }
            switch (selectcase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    showMenu=false;
                    break;

            }



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
        System.out.println("0-Exit");
        


    }

    public void buyWeapon(){
        System.out.println("Select:");
        int selectWeapon= input.nextInt();
        while (selectWeapon<0||selectWeapon>Weapon.weapons().length){
            System.out.println("Error!!");
            selectWeapon= input.nextInt();;
        }
        if(selectWeapon!=0){
            Weapon selectedWeapon=Weapon.getWeaponobjByid(selectWeapon);
            if(selectedWeapon!=null){
        }       if(selectedWeapon.getPrice()> getPlayer().getMoney()){
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
        for (Armor a:Armor.armors()){
            System.out.println("Id:"+a.getId()+
                    "\tName:" + a.getName()+
                    "\tBlock:"+a.getBlock()+
                    "\tMoney:"+a.getMoney());
        }
        System.out.println("0-Exit");
    }

    public void buyArmor(){
        System.out.println("Select:");
        int selectArmor= input.nextInt();
        while (selectArmor<0||selectArmor>Weapon.weapons().length){
            System.out.println("Error!!");
            selectArmor= input.nextInt();;
        }
        if(selectArmor!=0){
            Armor selectedArmor=Armor.getArmorObjById(selectArmor);
            if(selectedArmor!=null){
        }       if(selectedArmor.getMoney()> getPlayer().getMoney()){
                    System.out.println("You don't have enough money!");
                }else{
                    System.out.println(selectedArmor.getName()+" added to inventory");
                    int balance= getPlayer().getMoney()- selectedArmor.getMoney();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Remaining money:"+getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);

                }
        }

    }
}

