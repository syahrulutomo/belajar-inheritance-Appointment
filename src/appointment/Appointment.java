package appointment;

import java.util.Date;

public class Appointment {
    private Date date;
    private String description;
    
   public Appointment(Date d,String desc)
   {
       date = d;
       description = desc;
   }

    public void setDate(Date d) {
        this.date = date;
    }

    public Date getDate()
    {
        return date;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    
    public void occursOn(Date d)
    {
        if(d.equals(date))
        {
            System.out.println(description);
        }
        
    }

  

    
    
}
