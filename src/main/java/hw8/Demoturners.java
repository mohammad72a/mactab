package hw8;

public class Demoturners {
    public static void main (String[] args){
        Turner t=new Leaf();
        Turner t1=new Page();
        Turner t2 =new Pancake();
        Turner t3= new LastPage();
        Turner t4=new Run();
        t.turn();
        t1.turn();
        t2.turn();
        t3.turn();
        t4.turn();
    }
}
