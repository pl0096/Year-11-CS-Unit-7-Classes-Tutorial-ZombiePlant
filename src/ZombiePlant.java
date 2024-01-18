public class ZombiePlant {
    private int potency;
    private int treatments;
    public ZombiePlant(int potency, int treatments){
        this.potency = potency;
        this.treatments = treatments;
    }

    public int treatmentsNeeded(){
        return treatments;
    }
    public boolean isDangerous(){
        if(treatments > 0){
            return true;
        }
        return false;
    }
    public void treat(int potency){

        if(potency <= 0){
        }
        else if(potency > this.potency){
            treatments++;
        }
        else if(treatments == 0){

        }
        else{
            treatments--;
        }
    }
    public int getPotencyRequired(){
        return potency;
    }

}
