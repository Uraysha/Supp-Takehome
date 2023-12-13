/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrepairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author urays
 */

public class iTechnicianTest {

    @Test
    void calculatePay_PayCalculatedSuccessfully() {
        Technician technician = new Technician();
        String repairCost = "5000";
        String rate = "0.10";

        double result = technician.calculatePay(repairCost, rate);

        assertEquals(500, result, 0.01); // using delta for double comparison
    }

    @Test
    void calculatePay_PayCalculatedUnsuccessfully() {
        Technician technician = new Technician();
        String repairCost = "5000";
        String rate = "invalidRate"; // incorrect rate value

        assertThrows(NumberFormatException.class, () -> {
            technician.calculatePay(repairCost, rate);
        });
    }

    @Test
    void validateData_LocationNameRepairCostRateValid() {
        Technician technician = new Technician();
        Data validData = new Data("Cape Town", "John Doe", "5000", "0.10");

        boolean result = technician.validateData(validData);

        assertTrue(result);
    }

    @Test
    void validateData_InvalidData() {
        Technician technician = new Technician();
        // Invalid repair cost (less than or equal to zero)
        Data invalidData = new Data("Durban", "Jane Doe", "0", "0.10");

        boolean result = technician.validateData(invalidData);

        assertFalse(result);
    }
}
