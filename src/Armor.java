public class Armor {
    private int id;
    private int block;
    private int money;

    private String name;

    public Armor(String name,int id,int block,int money){
        this.id=id;
        this.block=block;
        this.money=money;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static Armor[]armors(){
        Armor[]armorlist=new Armor[3];
        armorlist[0]=new Armor("light Armor",1,1,15);
        armorlist[1]=new Armor("Medium Armor",2,3,25);
        armorlist[2]=new Armor("Heavy Armor",3,5,35);
        return armorlist;
    }
    public static Armor getArmorObjById(int id){
        for(Armor a:Armor.armors()){
            if(a.getId()==id){
                return a;
            }
        }
        return null;
    }
}
