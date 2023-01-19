public class Boss extends GameEntity {

    private WeaponType weaponTypeBoss;
    private String weaponNameBoss;


public Boss(int Health, int Damage, WeaponType WeaponTypeBoss, String weaponNameBoss){
    super();
    this.setHealth(Health);
    this.setDamage(Damage);
    this.weaponTypeBoss = WeaponTypeBoss;
    this.weaponNameBoss = weaponNameBoss;


}

    public WeaponType getWeaponTypeBoss() {
        return weaponTypeBoss;
    }

    public void setWeaponTypeBoss(WeaponType weaponTypeBoss) {
        this.weaponTypeBoss = weaponTypeBoss;
    }

    public String getWeaponNameBoss() {
        return weaponNameBoss;
    }


    public void setWeaponNameBoss(String weaponNameBoss) {
        this.weaponNameBoss = weaponNameBoss;
    }
}
