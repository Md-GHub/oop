package interfaces;

public class car implements brake , engine , media {

    @Override
    public void stop() {
        System.out.println("stops normal car");
    }

    @Override
    public void accelerator() {
        System.out.println("acc normal car");
    }

    @Override
    public void start() {
        System.out.println("starts normal car");
    }
    
}
