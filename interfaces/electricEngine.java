package interfaces;

public class electricEngine implements engine {

    @Override
    public void accelerator() {
        System.out.println("accelerate like an ev engine");
        
    }

    @Override
    public void start() {
        System.out.println("start like an ev engine");
        
    }

    @Override
    public void stop() {
        System.out.println("stop like an ev engine");
        
    }
    
}
