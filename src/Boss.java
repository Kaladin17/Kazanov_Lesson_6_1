public class Boss extends GameEntity {

    private Weapon bossWeapon;


public Boss(int Health, int Damage){
    super();
    this.setHealth(Health);
    this.setDamage(Damage);

}

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo() { return
        "Health: " + this.getHealth() + " Damage: " + this.getDamage() + " Weapon boss: "
                + this.bossWeapon.getWeaponType() + " " + this.bossWeapon.getWeaponName();
    }
}
