/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointment;

import java.util.Date;
import org.junit.Test;


/**
 *
 * @author syahrul
 */
public class MonthlyTest {
    
  

    /**
     * Test of occursOn method, of class Monthly.
     */
    @Test
    public void testOccursOn() {
        System.out.println("occursOn");
        Date d = new Date(2016,12,11);
        Date dd = new Date(2017,2,11);
        Monthly instance = new Monthly(d,"see the dentist");
        instance.occursOn(dd);
        
    }
    
}
