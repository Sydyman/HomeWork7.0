public class Main {
    public static void main(String[] args) {
        Hero[] herores = {new Medic(), new Magic(), new Warrior()};
        for(Hero hero : herores) {
            hero.applySuperAbility();
            if (hero instanceof  Medic){
                ((Medic)hero).increaseExperience();
                System.out.println("Опыт лечения медика" + ((Medic)hero).getHealPoint());
            }
        }

    }

}