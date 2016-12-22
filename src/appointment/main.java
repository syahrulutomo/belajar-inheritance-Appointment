package appointment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Date:");
        int in1 = input.nextInt();
        
        Scanner input2 = new Scanner(System.in);
        System.out.print("Month:");
        int in2 = input2.nextInt();
        
        Scanner input3 = new Scanner(System.in);
        System.out.print("Year:");
        int in3 = input3.nextInt();
        
        Date d = new Date(in3,in2,in1);

        ArrayList<Appointment> a = new ArrayList<Appointment>();
        
        Appointment ap = new Appointment(new Date(2016,12,21),"hanging with old friends");
        a.add(ap);
        
        Daily ap2 = new Daily(new Date(2016,12,28),"Go to the beach");
        a.add(ap2);
        
        Monthly ap3 = new Monthly(new Date(2016,1,21),"play football");
        a.add(ap3);
        
        Onetime ap4 = new Onetime(new Date(2016,12,21),"Visit grandpa's home");
        a.add(ap4);
        
        System.out.println("\n ** Appointments **");
        
        
        for(int i=0;i<a.size();i++)
        {   
            a.get(i).occursOn(d);       
        }
        
    }
    
}
