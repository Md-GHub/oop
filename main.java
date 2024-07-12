import interfaces.car;
import interfaces.media;
import interfaces.supercar;
import pillars.*;

public class main {
    public static void main(String[] args) {
        //accessing the varible of parent class via child class:

        // boxWeight box = new boxWeight(10,10,10,100);

        // System.out.println("Length: "+box.l);
        // System.out.println("Weight: "+box.w);
        // System.out.println("Breath:"+box.b);

        // box b1 = new boxWeight(10,10,10,10); // box type reference which points to the object of type boxWeight
        // b1.weight -> cannot be accessed becz the reference type deceides that which elements can we accessed
        

        //about super keyword : 

        /*
         *
         *super keyword have 2 ability:
         * one is if we want to access parent class constructor from the chiled (i.e..super(l,w,b,h)); 
         * other is to access variable from the class of parent (i.e..super.h)
         * 
         */
    

        //  box b1 = new boxWeight(1,2,3,10);
        //  //System.out.println(b1.weight); -> doesnt work!!
        //  b1.info();



        // car mycar = new car();
        // mycar.accelerator();
        // mycar.start();
        // mycar.stop();


        // media car1 = new car();

        // car1.start();
        // car1.stop();   weired things will happen


        supercar bmw = new supercar();

        bmw.start();
        bmw.stop();
        bmw.play();
        bmw.pause();
    }    
}  