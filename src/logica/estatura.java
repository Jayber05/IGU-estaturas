/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author angel
 */
public class estatura {
    
     private double est[], menor, mayor;
     
      public estatura(double []est){
          this.est=est;
      }
      public void setEstMy(){
       mayor = (double) est[0];
        for (int i=0;i<est.length;i++){
            if(est[i]>mayor){
                mayor= (double) est[i];
            }
        }
    }
      public void setEstMn(){
       menor = (double) est[0];
        for (int i=0;i<est.length;i++){
            if(est[i]<menor){
                menor= (double) est[i];
            }
        }
    }
      public double getEstMy(){
          
          return mayor;
      }
       public double getEstMn(){
         
          return menor;
       }
}

