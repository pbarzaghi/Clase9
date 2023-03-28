/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoclase9;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoClase9 {

    public static void main(String[] args) {
        
       
        List<Persona> personas= new ArrayList<Persona>();
       Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese el nro de persona a cargar");
       int nroPersonas=sc.nextInt();
        
        for(int i=0;i<nroPersonas;i++){
              System.out.println("Nombre de la persona");
              String nombre=sc.next();
              System.out.println("Apellido de la persona");
              String apellido=sc.next();
               System.out.println("Fecha de Nacimiento");
               System.out.print("Dia ");
                int dia=sc.nextInt();
                  System.out.print("Mes ");
                int mes=sc.nextInt();
                    System.out.print("Año ");
                int anio=sc.nextInt();
               personas.add(new Persona(nombre, apellido, LocalDate.of(anio,mes,dia)));
        
        }
        personas.stream().forEach( p -> System.out.println(" Nombre y Apellido "+p.getNombre()+" "+p.getApellido()
                +" Feha Nacimiento " + p.getFechaNac().toString()));
        /*
        for (Iterator<Persona> iterator = personas.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
          
            System.out.println(" Nombre y Apellido: "+next.getNombre()+ " "+
                               next.getApellido()+
                               "\n Fecha Nacimiento: "+next.getFechaNac() +
                               "\n ----------------------------------" );
            
        }
        */

         
        
    }

   
}
