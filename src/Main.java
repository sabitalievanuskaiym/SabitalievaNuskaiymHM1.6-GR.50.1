public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.setName("Boss");
        boss.setHealth(500);
        boss.setDamage(80);
        boss.setSuperPower("Magic");
        boss.weapon.setWeaponsType(WeaponType.RIFLES);
        boss.weapon.setWeaponsName("Daewoo usas-12");

        /*System.out.println("Weapon:"+boss.weapon.getWeaponsType()+" "+boss.weapon.getWeaponsName()
                + " Health:"+boss.getHealth()+ " Damage:"+boss.getDamage()
                + " Super Power:"+boss.getSuperPower());*/
        //boss.printInfo();
        System.out.println(boss.printInfo());


        Skeleton skeleton = new Skeleton();
        skeleton.setName("Skeleton");
        skeleton.setHealth(100);
        skeleton.setDamage(30);
        skeleton.setSuperPower("Physical");
        skeleton.weapon.setWeaponsType(WeaponType.PISTOLS);
        skeleton.weapon.setWeaponsName("Glock 17");
        skeleton.setNumberOfArrows(30);

        System.out.println(skeleton.printInfo());


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeleton");
        skeleton2.setHealth(100);
        skeleton2.setDamage(30);
        skeleton2.setSuperPower("Physical");
        skeleton2.weapon.setWeaponsType(WeaponType.PISTOLS);
        skeleton2.weapon.setWeaponsName("Glock 17");
        skeleton2.setNumberOfArrows(30);

        System.out.println(skeleton.printInfo());

    }
}