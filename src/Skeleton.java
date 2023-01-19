public class Skeleton extends Boss{

    int arrows;


    public Skeleton(int Health, int Damage, WeaponType WeaponType, String weaponName, int arrows) {
        super(Health, Damage, WeaponType, weaponName);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " arrows: " + this.getArrows();
    }
}
