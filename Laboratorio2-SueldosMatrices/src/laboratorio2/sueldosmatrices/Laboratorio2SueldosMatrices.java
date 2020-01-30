/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2.sueldosmatrices;

import java.util.Scanner;

/**
 *
 * @author Sucely Alvarez
 */
public class Laboratorio2SueldosMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] stDatos=new String[10][2];
        double[][] dbValores=new double[10][16];
        int iOpcion=0, iContadorFilaDatos=0, iContadorFilaValores=0, iContadorColumnaDatos=0, iContadorColumnaValores=0;
        double dbSueldoBase=0, dbSueldoExtra=0, dbBonificacion=0, dbComisiones=0;
        
        Scanner in=new Scanner(System.in);
        System.out.println("--- SISTEMA PLANILLA DE SUELDOS ---");
        do{
            //INGRESO NOMBRE
        System.out.println("Ingrese el nombre del empleado:");
        stDatos[iContadorFilaDatos][iContadorColumnaDatos]=in.nextLine();
        iContadorColumnaDatos=iContadorColumnaDatos+1;
        
        //INGRESO DEL PUESTO
        System.out.println("Ingrese el sueldo del empleado:");
        dbSueldoBase=
        stDatos[iContadorFilaDatos][iContadorColumnaDatos]=in.nextLine();
        iContadorColumnaDatos=iContadorColumnaDatos+1;
        
        //INGRESO SUELDO
        System.out.println("Ingrese el sueldo del empleado:");
        dbValores[iContadorFilaValores][iContadorColumnaValores]=in.nextDouble();
        iContadorColumnaValores=iContadorColumnaValores+1;
        
        //INGRESO SUELDO EXTRAORDINARIO
         System.out.println("Ingrese el sueldo extraordinario del empleado:");
        dbValores[iContadorFilaValores][iContadorColumnaValores]=in.nextDouble();
        iContadorColumnaValores=iContadorColumnaValores+1;
        
        //INGRESO BONIFICACION
         System.out.println("Ingrese la bonificacion del empleado:");
        dbValores[iContadorFilaValores][iContadorColumnaValores]=in.nextDouble();
        iContadorColumnaValores=iContadorColumnaValores+1;
        
        //INGRESO DE COMISIONES
         System.out.println("Ingrese las comisiones del empleado:");
        dbValores[iContadorFilaValores][iContadorColumnaValores]=in.nextDouble();
        iContadorColumnaValores=iContadorColumnaValores+1;
        
        //CALCULO IGSS
        dbValores[iContadorFilaValores][iContadorColumnaValores]=;
        iContadorColumnaValores=iContadorColumnaValores+1;
        
        }while(iOpcion!=2);
        
        
    }
    
}
