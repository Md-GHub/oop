public class son extends parent {

    son(int age){
        super(18);
    }
    
    @Override
    void career(String name) {
        System.out.println("I want to be an "+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+" her age is "+age);
    }
    
}
