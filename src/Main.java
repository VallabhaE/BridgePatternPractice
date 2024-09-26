import LivingBeingObjDetails.Fish;
import LivingBeingObjDetails.LivingBeing;
import LivingBeingObjDetails.LivingBeingObj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LivingBeing obj = new Fish(new Water());

        obj.breeth();
    }
}


class Water implements LivingBeingObj {

    @Override
    public void breeth() {
        System.out.println("TakeCO2AndWater");
    }
}

class Land implements LivingBeingObj {

    @Override
    public void breeth() {
        System.out.println("NOSE AND AIR");
    }
}

class Tree implements LivingBeingObj {

    @Override
    public void breeth() {
        System.out.println("ThroughLeavsandgiveO2");
    }
}