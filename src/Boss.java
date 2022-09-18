
    public class Boss extends GameEntity {
        Weapon weapon = new Weapon();

        public Weapon getWeapon() {
            return weapon;
        }
        public void setWeapon(Weapon weapon) {
            this.weapon = weapon;
        }
        public String printInfo(){
            return "Name:"+getName()+" Weapon:"+weapon.getWeaponsType()+" "+weapon.getWeaponsName()
                    + " Health:"+getHealth()+ " Damage:"+getDamage()+ " Super Power:"+getSuperPower();
        }
    }

