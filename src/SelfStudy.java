import com.ngits.domain.Interface.Bmw;
import com.ngits.domain.Interface.Mercedes;

public class SelfStudy {

    public static void main(String args[]) {


        //INTERFACE
        Mercedes myCar1 = new Mercedes();
        Bmw myCar2 = new Bmw();
        System.out.println(myCar1.showCar());
        System.out.println(myCar1.showCarAdvanced());
        System.out.println(myCar2.showCar());
        System.out.println(myCar2.showCarAdvanced());

    }
}
