package Review3_LinkedList;

public class CarTestApp {
    public static void main(String[] args) {
        String a="BMW";
        Car car1=new Car("BMW",2020);
        Car car2=new Car("BMW",2023);
        Car car3=new Car("BMW",2024);
        Car car4=new Car("BMW",2019);
        Car car6=new Car("BMW",2018);
        Car car5=new Car("BMW",2012);


        car1.nextCarObject=car2;
        car2.nextCarObject=car3;
        car3.nextCarObject=car4;
        car4.nextCarObject=car5;
        car5.nextCarObject=car6;
       //
        Car head=car1;
        Car current=head;
        while (current!=null){
            System.out.println(current.year);
            current=current.nextCarObject;
        }
        //System.out.println(head.year);
    }
}
