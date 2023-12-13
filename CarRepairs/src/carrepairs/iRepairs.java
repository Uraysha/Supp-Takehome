/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrepairs;

import java.util.Arrays;

/**
 *
 * @author urays
 */
 public interface iRepairs{  
     double RepairCosts(double[] repairCosts);
    double TechnicianPay(double amount);
    int TopTechnician(double[] repairs);
}

class Repairs implements iRepairs {

    @Override
    public double RepairCosts(double[] repairCosts) {
        return Arrays.stream(repairCosts).sum();
    }

    @Override
    public double TechnicianPay(double amount) {
        return amount * 0.10;
    }

    @Override
    public int TopTechnician(double[] repairs) {
        int indextech = 0;
        for (int i = 1; i < repairs.length; i++) {
            if (repairs[i] > repairs[indextech]) {
                indextech = i;
        
    }        return indextech;

}
     
       

         
         
public class TechRepairs{
           public static void main(String[] args) {
        // method to print the report
String[] TechName= {"Joe Bloggs", "Jane Doe"};
 final double [][]Cost= {{8000, 25000, 5000},
                               {7000, 2200, 5600}};
 
           Repairs in= new Repairs(); 
           double cost2[]= new double[2];
   for(int row = 0; row <= Cost.length; row++) {
            System.out.print("Total vehicle repairs for " +TechName[row]+ "=" );
            for (int col = 0; col<= Cost[row].length; col++) {
                cost2[col]= +Cost[row][col];
                System.out.print("\t R " + Costs2[col]+ "\t");
            }
            System.out.println();
       System.out.println("Technician Vehichle repair Report");
       System.out.println();
        System.out.println("\t\tJan\t\t"+ "Feb\t\t" + "March\t\t");
        System.out.println("----------------------------------------------------------------------");
    
// print thesecond part of the report
   for(int i=0; i< TechName.length;i++){
   {System.out.println(TechName[i]+"\t\t");
       for(int j=0;j<Cost.length; j++){
        System.out.print (Cost[i][j]+"\t\t");
       }
   }System.out.println();
        
    for (int k=0; k< TechName.length; k++){
        for(int y=0; y<cost2.length;y++){
            System.out.println("The vehicle repairs for "+TechName[k]+ "is " +cost2[y]);
        
           System.out.println();
System.out.println("Repair commision for "+TechName[k]+ "is:" +cost2[y]*0.1);
    }       
      
}
       int topTechnicianIndex = in.TopTechnician(repairs[0]);
        System.out.println("Top Performing Vehicle Technician:  " + (topTechnicianIndex + 1));
 
}
}

}
    
}}