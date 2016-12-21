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
public class OnetimeTest {
    
    @Test
    public void testSomeMethod() {
        System.out.println("occursOn");
        Date d = new Date(2016,12,18);        
        Date x = new Date(2016,12,18);
        Onetime instance = new Onetime(x,"See the dentist");
        instance.occursOn(d);
    }
    
}
