/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author syahrul
 */
public class AppointmentTest {
    
    /**
     * Test of occursOn method, of class Appointment.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        Date d = new Date(2016,12,18);      
        Appointment instance = new Appointment(new Date(2016,12,21),"See dentist");
        instance.setDescription("See the dentist");
        instance.occursOn(d);      
    }

    /**
     * Test of getDate method, of class Appointment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Appointment instance = new Appointment(new Date(2016,12,21),"See dentist");
        Date expResult = new Date(2016,12,21);
        Date result = instance.getDate();
        assertEquals(expResult, result);
        
    }
    
   
    
}
