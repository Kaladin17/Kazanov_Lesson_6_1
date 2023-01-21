public class Weapon {

    private Enum weaponType;
    private String WeaponName;

    public Weapon(Enum weaponType, String weaponName) {
        this.setWeaponType(weaponType);
        this.setWeaponName(weaponName);
    }

    public Enum getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Enum weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return WeaponName;
    }


    public void setWeaponName(String weaponName) {

        WeaponName = weaponName;
    }
}
