package appointment;

import java.util.Date;

public class Daily extends Appointment{
    String day ;
    
    public Daily(Date d, String desc) {
        super(d,desc);
        day = String.valueOf(d.getDay());

    }

   
    @Override
    public void occursOn(Date d)
    {
        String dd = String.valueOf(d.getDay());
        if(day.equalsIgnoreCase(dd))
        {
            System.out.println(super.getDescription());
        }
       
    }
}
