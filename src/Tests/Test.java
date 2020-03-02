/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import Controller.*;
import Model.*;

/**
 *
 * @author Angel Wu
 */
public class Test {
    public void testAll(){
        AccessPrescriptionUIControllerTest();
    }
    
    public void AccessPrescriptionUIControllerTest(){
        try {
//            int expectedValue = 0;
            AccessPrescriptionUIController test = new AccessPrescriptionUIController();
            test.displayPrescriptions("000000");
            System.out.println("Passed: " + "displayPrescriptions" + " returned void");
            
        } catch (Exception e) {
            System.out.println("Failed: " + "displayPrescriptions" + " returned void");
        }
    }
}


