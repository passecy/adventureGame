public class Obstacle {
    private int id;

    private String name;
    private int damage;
    private int health;

    private int baseHealth;

    private int award;
    public Obstacle(int id,int damage,int health,String name,int award,int baseHealth){
        this.damage=damage;
        this.health=health;
        this.id=id;
        this.name=name;
        this.award=award;
        this.baseHealth=baseHealth;

    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getAward() {
        return award;
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
        if(health<0){
            health=0;
        }
        this.health = health;
    }

}
