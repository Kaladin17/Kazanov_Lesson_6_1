public class Weapon {
    private WeaponType WeaponType;
    private String WeaponName;

    public Weapon(WeaponType weaponType, String weaponName) {
        this.WeaponType = weaponType;
        this.WeaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return WeaponType;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public void setWeaponType(WeaponType weaponType) {

        WeaponType = weaponType;
    }

    public void setWeaponName(String weaponName) {

        WeaponName = weaponName;
    }
}
