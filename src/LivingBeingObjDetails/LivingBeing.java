package LivingBeingObjDetails;

public abstract   class LivingBeing {
    LivingBeingObj obj;
    public LivingBeing(LivingBeingObj obj){
        this.obj = obj;
    }

    abstract public void breeth();

}
