package interfaces;

public class supercar {
    private engine Engine;
    private media player;

    public supercar(){
        this.Engine = new powerEngine();
        this.player = new mediaClass();
    }

    public supercar(engine Engine){
        this.Engine = Engine;
        this.player = new mediaClass();
    }

    public void start(){
        Engine.start();
    }

    public void stop(){
        Engine.stop();
    }

    public void play(){
        player.start();
    }

    public void pause(){
        player.stop();
    }
}
