import SomethingClass.*;
public class beginner {
    public static void main(String[] args) {
        System.out.println("hey");
        // beginner obj = new beginner();
        // obj.execute();
        execute();
    }
    
    //static likhunga to bina object ke call hogi agr nhi likha  to commented code se chlega
    static void execute(){
        int a = 10;
        int b = 20;

        something obj =  new something();
        
        obj.getMembers();

        int res = obj.multiple(a, b);

        System.err.println("this is result " + res);

        obj.setMembers(a, b);;

        obj.getMembers();

    }

} 


