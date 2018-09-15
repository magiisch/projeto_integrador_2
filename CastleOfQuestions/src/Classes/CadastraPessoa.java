/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vm_su
 */
public class CadastraPessoa {
    
    
    public List cadastraPessoa(){
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();   
        for (int i = 0; i < 6; i++){
            Pessoa pessoa = new Pessoa();
            Scanner sc = new Scanner(System.in);
            System.out.printf("Informe seu nome");
            pessoa.setNome(sc.nextLine());
            
            System.out.printf("Informe sua idade");
            pessoa.setIdade(sc.nextInt());
            
            Integer resp;
            System.out.printf("A pessoa que você esta pensando e calva? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setCalvo(true);
            }else{
                pessoa.setCalvo(false);
            }
            System.out.println("");
            
            System.out.printf("A pessoa que você esta pensando tem cabelos longos? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setCabeloLongo(true);
            }else{
                pessoa.setCabeloLongo(false);
            }
            System.out.println("");
            
            System.out.printf("A pessoa que você esta pensando é alta? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setAlto(true);
            }else{
                pessoa.setAlto(false);
            }
            System.out.println("");
            
            System.out.printf("A pessoa que você esta pensando tem barba? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setBarba(true);
            }else{
                pessoa.setBarba(false);
            }
            System.out.println("");
            
            System.out.printf("A pessoa que você esta pensando e professor? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setProfessor(true);
            }else{
                pessoa.setProfessor(false);
            }
            System.out.println("");
            
            System.out.printf("A pessoa que voce esta pensando e do sexo masculino? ");
            resp = sc.nextInt();
            if(resp==1){
                pessoa.setMasculino(true);
            }else{
                pessoa.setMasculino(false);
            }
            System.out.println("");
            
            lista_pessoas.add(i,pessoa);  
        }
        
        return lista_pessoas;
    }
    
}
