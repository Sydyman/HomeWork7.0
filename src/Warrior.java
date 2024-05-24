public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {

    }
    public Warrior(){
        super(500, 99, " Double Damage");
        System.out.println("Воин применил супер способность" + superPower);
    }
}
