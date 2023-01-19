public class Boss extends GameEntity {

    private WeaponType WeaponType;
    private String weaponName;


public Boss(int Health, int Damage, WeaponType WeaponType, String weaponName){
    super();
    this.setHealth(Health);
    this.setDamage(Damage);
    this.WeaponType = WeaponType;
    this.weaponName = weaponName;


}

    public WeaponType getWeaponTypeBoss() {
        return WeaponType;
    }

    public void setWeaponTypeBoss(WeaponType weaponTypeBoss) {
        this.WeaponType = weaponTypeBoss;
    }

    public String getWeaponNameBoss() {
        return weaponName;
    }


    public void setWeaponNameBoss(String weaponNameBoss) {
        this.weaponName = weaponNameBoss;
    }

    public String printInfo() { return
        "Health: " + this.getHealth() + " Damage: " + this.getDamage() + " Weapon type: "
                + this.getWeaponTypeBoss() + " Weapon name: " + this.getWeaponNameBoss();
    }
}
