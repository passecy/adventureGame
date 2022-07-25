import java.util.Locale;
import java.util.Random;

public class battleLoc extends Location{
    private Obstacle obstacle;
    private String award;

    private int maxObstacle;

    public battleLoc(Player player, String name,Obstacle obstacle,String award,int maxObstacle) {
        super(player, name);
        this.award=award;
        this.obstacle=obstacle;
        this.maxObstacle=maxObstacle;
    }

    @Override
    boolean onLocation() {
        System.out.println("Your are in the:"+this.getName());
        int obsNumber=this.randomObstacle();
        System.out.println("There are "+obsNumber+" "+this.getObstacle().getName()+"s");
        System.out.println("(F)ight or (R)un:");
        String selectcase=input.nextLine();
        selectcase=selectcase.toUpperCase();
        if(selectcase.equals("F")){
            if(combat(obsNumber)){
                System.out.println("You leaved the area");
            }


        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("Game over!!");
            return false;
        }
        return true;





    }
    public int randomObstacle(){

        Random r=new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }


    public void setAward(String award) {
        this.award = award;
    }

    public String getAward() {
        return award;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public boolean combat(int obsnumber){
        for (int i = 0; i <obsnumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getBaseHealth());
            System.out.println();
            playerStats();
            System.out.println();
            obstacleStats(i+1);
            System.out.println();

            while (this.getPlayer().getHealth()>0&&this.getObstacle().getHealth()>0){
                System.out.println("(H)it or (R)un:");
                String selectCombat=input.nextLine();
                selectCombat=selectCombat.toUpperCase();

                if (selectCombat.equals("H")){
                    System.out.println("You hit the "+this.getObstacle().getName());
                    obstacle.setHealth(this.obstacle.getHealth()-this.getPlayer().getDamage());
                    afterHit();

                    if(this.getObstacle().getHealth()>0){
                        int obstacleDamage=this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();


                        if (obstacleDamage<0){
                            obstacleDamage=0;
                        }
                        System.out.println();
                        System.out.println(this.getObstacle().getName()+" hit you!!");
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);



                    }
                    System.out.println();

                    afterHit();


                }else {return true;}


            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("You killed the "+this.getObstacle().getName());
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
            }
            else{
                return false;
            }


        }
        return true;
    }
    public void afterHit(){
        System.out.println("Player:"+this.getPlayer().getHealth()+"Hp");
        System.out.println(this.getObstacle().getName()+":"+this.getObstacle().getHealth()+"Hp");
    }

    public void playerStats(){
        System.out.println("Player:");
        System.out.println("Health:"+this.getPlayer().getHealth());
        System.out.println();
    }

    public void obstacleStats(int i){

        System.out.println(i+"."+this.getObstacle().getName()+":");
        System.out.println("Health:"+this.getObstacle().getHealth());
        System.out.println("Award:"+this.getObstacle().getAward());
    }
}
