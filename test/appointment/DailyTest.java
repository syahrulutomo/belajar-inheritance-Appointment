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
public class DailyTest {
    
    /**
     * Test of occursOn method, of class Daily.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        Date d = new Date(2016,12,19);
        Date dd = new Date(2016,12,26);
        Daily instance = new Daily(d,"See the dentist");
        instance.occursOn(dd);
        
    }
    
}
