package pillars;

public class boxWeight extends box {
    public int weight;
    public int l;

    public boxWeight(int weigth){
        this.b=-1;
        this.l=-1;
        this.w=-1;
        this.weight=weight;
    }

    public boxWeight(int l,int b,int w,int weigth){
        super(l,b,w);  //calls the parent class constructor;
        this.weight=weight;
    }
    @Override
    public void info(){
        System.out.println("boxweight is running");
    }
}
