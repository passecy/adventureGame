public class normalLocation extends Location{
    public normalLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
