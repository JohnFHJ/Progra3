/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ImpresoraDemo {
    public static void main(String[] args){
    ImpresoraNormal impresora1 = new ImpresoraNormal("pdf", "A4", true, "tyexto 1");
    ImpresoraAdicional impresora2 = new ImpresoraAdicional("Excel", "A3", false, "texto2");
    
    System.out.println(impresora1);
    System.out.println(impresora2);
    }
}
