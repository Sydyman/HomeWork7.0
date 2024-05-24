public class Medic extends Hero{
    int healPoint;
    @Override
    public void applySuperAbility() {

    }
    void increaseExperience(){
        healPoint += (int)(healPoint * 0.1);
    }
    public Medic (){
        super(200,50, " Healing");
        System.out.println("Медик применил супер способность" + superPower);
    }

    public int getHealPoint() {
        return healPoint;
    }
}
