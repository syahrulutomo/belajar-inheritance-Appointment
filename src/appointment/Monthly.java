package appointment;

import java.util.Date;

public class Monthly extends Appointment{
    private int date;
            
    public Monthly(Date d, String desc) {
        super(d,desc);
        date = d.getDate();
       
    }
    
    @Override
    public void occursOn(Date d)
    {
        int dd = d.getDate();
        if(date == dd)
        {
            System.out.println(super.getDescription());
        }
    }
    
    
    
    
    
}
