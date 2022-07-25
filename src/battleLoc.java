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
}
