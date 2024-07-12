package pillars;

public class box  {
    public int l;
    public int w;
    public int b;
    
    public box(){
        this.l=20;
        this.w=20;
        this.b=20;
    }
    public box(int l,int w,int b){
        this.l=l;
        this.w=w;
        this.b=b;
    }

    public box(box old){
        this.l=old.l;
        this.w=old.w;
        this.b=old.b;
    }

    public void info(){
        System.out.println("box class is running");
    }
}
