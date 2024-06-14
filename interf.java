class adit{
    private int age = 30;
    public int salary = 10000;
    public void patna(){
        System.out.println("age is :" + age*2+6);
    }
}


public class interf{
    public static void main(String[] args) {
        adit a = new adit();
        a.patna();
       // System.out.println(a.age);
    }
}