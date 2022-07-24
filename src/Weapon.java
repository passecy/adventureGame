public class Weapon {
    private String name;
    private int damage;
    private int price;
    private int id;

    public Weapon(String name,int damage,int price,int id){
        this.name=name;
        this.damage=damage;
        this.id=id;
        this.price=price;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponslist=new Weapon[3];
        weaponslist[0]=new Weapon("Knife",2,25,1);
        weaponslist[1]=new Weapon("Sword",3,35,2);
        weaponslist[2]=new Weapon("Shotgun",7,45,3);
        return weaponslist;
    }

    public int getDamage(){
        return damage;
    }
    public int getId(){
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public static Weapon getWeaponobjByid(int id){

        for(Weapon w:Weapon.weapons()){
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }
}
