
interface maternal {

    void car();
}
interface paternal{
    void house();
    void car();
}

class child implements paternal, maternal{
    public void house(){
        System.out.println("house is ready villa");
    }
    public void car(){
        System.out.println("car is ready Honda Amaze");
    }
}
public class property {
    public static void main(String [] args){
        child c;
        c = new child();
        c.house();
        c.car();
    }
    
}


