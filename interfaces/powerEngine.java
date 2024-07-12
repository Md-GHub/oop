package interfaces;

public class powerEngine implements engine{

    @Override
    public void accelerator() {
        System.out.println("accelerate like an powerengine");
        
    }

    @Override
    public void start() {
        System.out.println("start like an power engine");
        
    }

    @Override
    public void stop() {
        System.out.println("stops like an power engine");
        
    }
    
}
