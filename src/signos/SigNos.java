/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signos;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class SigNos {
    public static void main(String[] args) {
        
        int dia, mes;
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("\n\t\t\t -- Sistema de Signos --\n");
        
        //Entradas
        System.out.print("Informe o dia: ");
        dia = entrada.nextInt();
        System.out.print("Informe o mês: ");
        mes = entrada.nextInt();
        
        //Processamento
        if((dia <= 31) && (dia >= 1)){
            switch(mes){
                case 1:
                    //Capricórnio ou Aquário
                    if(dia <= 19){
                        System.out.println("Capricórnio");
                    }else{
                        System.out.println("Aquário");
                    }
                    break;
                case 2:
                    //Aquario ou peixes
                    if(dia <= 18){
                        System.out.println("Aquário");
                    }else{
                        System.out.println("Peixes");
                    }
                    break;
                case 3:
                    //Peixes ou Aries
                    if(dia <= 19){
                        System.out.println("Peixes");
                    } else {
                        System.out.println("Aries");
                    }
                    break;
                case 4:
                    //Aries ou touro
                    if(dia <= 21){
                        System.out.println("Aries");
                    }else{
                        System.out.println("Touro");
                    }
                    break;
                case 5:
                    //Touro ou Gêmeos
                    if(dia <= 21){
                        System.out.println("Gêmeos");
                    } else {
                        System.out.println("Touro");
                    }
                    break;
                case 6:
                    //Gêmeos ou câncer
                    if(dia <= 21){
                        System.out.println("Câncer");
                    }else{
                        System.out.println("Gêmeos");
                    }
                    break;
                case 7:
                    //Câncer ou leão
                    if(dia <= 22){
                        System.out.println("Câncer");
                    }else{
                        System.out.println("Leão");
                    }
                    break;
                case 8:
                    //Leão e virgem
                    if(dia <= 22){
                        System.out.println("Leão");
                    }else{
                        System.out.println("Virgem");
                    }
                    break;
                case 9:
                    //Virgem e libra
                    if(dia <= 22){
                        System.out.println("Virgem");
                    }else{
                        System.out.println("Libra");
                    }
                    break;
                case 10:
                    //Libra e escorpião
                    if( dia <= 22){
                        System.out.println("Libra");
                    }else {
                        System.out.println("Escorpião");
                    }
                    break;
                case 11:
                    //Escorpião e sagitário
                    if(dia <= 21){
                        System.out.println("Escorpião");
                    }else{
                        System.out.println("Sagitário");
                    }
                    break;
                case 12:
                    //Sagitário e capricórnio
                    if(dia <= 21){
                        System.out.println("Sagitário");
                    }else{
                        System.out.println("Capricórnio");
                    }
                    break;
                default:
                    System.out.printf("Mês %d incorreto!", mes);
            }
        }else{
            System.out.printf("Dia %d incorreto!", dia);
        }
        
        
        
        
    }
    
}
    
