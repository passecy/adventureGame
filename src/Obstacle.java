public class Obstacle {
    private int id;

    private String name;
    private int damage;
    private int health;
    public Obstacle(int id,int damage,int health,String name){
        this.damage=damage;
        this.health=health;
        this.id=id;
        this.name=name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
