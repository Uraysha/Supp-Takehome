/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrepairs;

/**
 *
 * @author urays
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.test.*;
 class iRepairsTest {


    @Test
    void testRepairCosts() {
        Repairs in = new Repairs();
        double[] repairs = {8000, 2500, 5000};
        double totalRepairCost = in.RepairCosts(repairs);
        assertEquals(15500, totalRepairCost);
    }

    @Test
    void testTechnicianPay() {
        Repairs in = new Repairs();
        double technicianPay = in.TechnicianPay(15500);
        assertEquals(1550, technicianPay);
    }

    @Test
    void testTopTechnician() {
        Repairs in = new Repairs();
        double[] repairs = {8000, 2500, 5000};
        int topTechnician = in.TopTechnician(repairs);
        assertEquals(0, topTechnician);
    }

    private void assertEquals(int i, double totalRepairCost) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
}
