public class StoneMonster extends Monster {
    StoneMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
