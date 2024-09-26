package LivingBeingObjDetails;

public class Fish extends LivingBeing{
    public Fish(LivingBeingObj obj){
        super(obj);
    }
    @Override
    public void breeth() {
        obj.breeth();
    }
}
