public class Skeleton extends Boss {
    public int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    @Override
    public String printInfo(){
        return "Name:"+getName()+" Weapon:"+weapon.getWeaponsType()+" "+weapon.getWeaponsName()
                + " Health:"+getHealth()+ " Damage:"+getDamage()+ " Super Power:"
                +getSuperPower()+ " Number of arrows:"+ getNumberOfArrows();
    }
}