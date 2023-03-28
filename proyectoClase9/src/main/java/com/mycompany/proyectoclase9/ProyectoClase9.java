/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoclase9;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProyectoClase9 {

    public static void main(String[] args) {
        
        List<Persona> personas=cargaPersonas();
        
        for (Iterator<Persona> iterator = personas.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println(" Nombre y Apellido: "+next.getNombre()+ " "+
                               next.getApellido()+
                               "\n Fecha Nacimiento: "+next.getFechaNac() +
                               "\n ----------------------------------" );
            
        }
        

         
        
    }
    
    
    private static  List<Persona> cargaPersonas(){
    
    Persona persona1= new Persona();
    persona1.setApellido("Barzaghi");
    persona1.setNombre("Pablo");
    persona1.setFechaNac(LocalDate.of(1975,01,28));
    
    Persona persona2 = new Persona("Guillermina","Lateana",LocalDate.of(1974, 12,22));
   
     List<Persona> personas= new ArrayList<Persona>();
     personas.add(persona1);
     personas.add(persona2);
     return personas;
    
    
    }
}
