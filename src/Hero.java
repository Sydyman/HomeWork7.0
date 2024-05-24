public abstract class  Hero implements HavingSuperAbility {
    int Health;
    int Damage;
    String superPower;

    public Hero(int health, int damage, String superPower) {
        this.Health = health;
        this.Damage = damage;
        this.superPower = superPower;
    }
}
