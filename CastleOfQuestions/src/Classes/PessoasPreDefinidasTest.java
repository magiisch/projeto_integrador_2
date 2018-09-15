/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author vm_su
 */
public class PessoasPreDefinidasTest {
    public List pessoasPreDefinidas(){
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();   
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Victor Mateus Suzena");
        pessoa1.setIdade(19);
        pessoa1.setCalvo(true);
        pessoa1.setCabeloLongo(false);
        pessoa1.setAlto(false);
        pessoa1.setBarba(true);
        pessoa1.setProfessor(true);
        pessoa1.setMasculino(false);
        pessoa1.setCabeloClaro(true);
        pessoa1.setMaior20(true);
        pessoa1.setOlhoEscuro(false);
        lista_pessoas.add(0,pessoa1);
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Eduarda Gabriele");
        pessoa2.setIdade(22);
        pessoa2.setCalvo(false);
        pessoa2.setCabeloLongo(false);
        pessoa2.setAlto(true);
        pessoa2.setBarba(false);
        pessoa2.setProfessor(true);
        pessoa2.setMasculino(false);
        pessoa2.setCabeloClaro(false);
        pessoa2.setMaior20(false);
        pessoa2.setOlhoEscuro(true);
        lista_pessoas.add(1,pessoa2); 
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Suzena");
        pessoa3.setIdade(12);
        pessoa3.setCalvo(true);
        pessoa3.setCabeloLongo(false);
        pessoa3.setAlto(false);
        pessoa3.setBarba(false);
        pessoa3.setProfessor(false);
        pessoa3.setMasculino(true);
        pessoa3.setCabeloClaro(false);
        pessoa3.setMaior20(true);
        pessoa3.setOlhoEscuro(false);
        lista_pessoas.add(2,pessoa3); 
        
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Gabriel Nunes");
        pessoa4.setIdade(9);
        pessoa4.setCalvo(true);
        pessoa4.setCabeloLongo(false);
        pessoa4.setAlto(false);
        pessoa4.setBarba(true);
        pessoa4.setProfessor(false);
        pessoa4.setMasculino(true);
        pessoa4.setCabeloClaro(false);
        pessoa4.setMaior20(false);
        pessoa4.setOlhoEscuro(false);
        lista_pessoas.add(3,pessoa4);
        
        
        Pessoa pessoa5 = new Pessoa();
        pessoa5.setNome("Rodrigo Jr.");
        pessoa5.setIdade(19);
        pessoa5.setCalvo(true);
        pessoa5.setCabeloLongo(false);
        pessoa5.setAlto(false);
        pessoa5.setBarba(true);
        pessoa5.setProfessor(false);
        pessoa5.setMasculino(false);
        pessoa5.setCabeloClaro(true);
        pessoa5.setMaior20(false);
        pessoa5.setOlhoEscuro(false);
        lista_pessoas.add(4,pessoa5); 
        
        Pessoa pessoa6 = new Pessoa();
        pessoa6.setNome("Roberto");
        pessoa6.setIdade(19);
        pessoa6.setCalvo(true);
        pessoa6.setCabeloLongo(true);
        pessoa6.setAlto(false);
        pessoa6.setBarba(true);
        pessoa6.setProfessor(false);
        pessoa6.setMasculino(true);
        pessoa6.setCabeloClaro(true);
        pessoa6.setMaior20(true);
        pessoa6.setOlhoEscuro(false);
        lista_pessoas.add(5,pessoa6);
        
        Pessoa pessoa7 = new Pessoa();
        pessoa7.setNome("Gabriela Silvaaaa");
        pessoa7.setIdade(50);
        pessoa7.setCalvo(false);
        pessoa7.setCabeloLongo(false);
        pessoa7.setAlto(false);
        pessoa7.setBarba(false);
        pessoa7.setProfessor(false);
        pessoa7.setMasculino(false);
        pessoa7.setCabeloClaro(false);
        pessoa7.setMaior20(true);
        pessoa7.setOlhoEscuro(true);
        lista_pessoas.add(5,pessoa6); 
        
        Pessoa pessoa8 = new Pessoa();
        pessoa8.setNome("Lucas Robertoo");
        pessoa8.setIdade(50);
        pessoa8.setCalvo(false);
        pessoa8.setCabeloLongo(false);
        pessoa8.setAlto(true);
        pessoa8.setBarba(false);
        pessoa8.setProfessor(true);
        pessoa8.setMasculino(false);
        pessoa8.setCabeloClaro(true);
        pessoa8.setMaior20(false);
        pessoa8.setOlhoEscuro(false);
        lista_pessoas.add(5,pessoa6); 

        return lista_pessoas;
        
    }
}
