public class safeHouse extends normalLocation{
    public safeHouse(Player player) {
        super(player, "safe house");
    }
    @Override
    public boolean onLocation(){
        System.out.println("You are in the safe house.");
        System.out.println("You got healed.");
        this.getPlayer().setHealth(this.getPlayer().getBaseHealth());
        return true;
    }
}
