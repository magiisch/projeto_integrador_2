package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameRun {
    /*public GameRun(){
        run();
    }*/
    
    public static void start(){
        // Array do tipo pessoa para armazenar as pessoas cadastradas no sistema
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        // ...
        //List<Pessoa> lista_pessoasBCKP = new ArrayList<Pessoa>();
        // Array tipo String para armazenar as perguntas do jogo
        List<String> lista_perguntaPadrao = new ArrayList<String>();
        // Classe para o cadastro de novas pessoas no sistema
        CadastraPessoa cadastros = new CadastraPessoa();
        //Classe para setar algumas pessoas e seus dados par afins de testes
        PessoasPreDefinidasTest pessoas_test = new PessoasPreDefinidasTest();
        
        //lista_pessoas = cadastros.cadastraPessoa();
        
        // armazena as pessoas cadastradas na classe
        lista_pessoas = pessoas_test.pessoasPreDefinidas();
        //lista_pessoasBCKP = lista_pessoas;
        
        // array de numeros para sortear as perguntas
        List<Integer> numeros = new ArrayList<Integer>();
       	
        // adiciona as perguntas para o array 
        ListaPerguntas lista = new ListaPerguntas();
        lista_perguntaPadrao=lista.retornaLista();
        
        
         //armazena de um a 6  OBS: e o numero de perguntas atualmente
        for(int i = 0; i < 9; i++)
            numeros.add(i);
        // embaralha os numeros dentro do array
        Collections.shuffle(numeros);
        Collections.shuffle(numeros);
        
        // Laco de rep do jogo... Ate 9 pq e a quantia de perguntas que temos
        for(int i = 0; i < 9; i++){
            // printa na tela uma pergunta aleatorio gerada pelo numero embaralhado
            System.out.println(lista_perguntaPadrao.get(numeros.get(i)));
            // armazena o numero embaralho em uma variavel para poder usar no switch
            int numPergunta = numeros.get(i);
            // variavel para capturar a resposta do usuario
            //Character resp;
            Integer resp;
            Scanner sc = new Scanner(System.in);    
            
            //resp = sc.nextLine().charAt(0);
            resp = sc.nextInt();
            
            //Classe contendo um metodo static, para realizar a pesquisa 
            //conforme respostas do usuario, e ir removendo as pessoas
            //da lista de predicao
            lista_pessoas=EliminaPessoas.getPredicaoPessoa(lista_pessoas, resp, numPergunta);
            
            if(lista_pessoas.size()==1){
                System.out.println("A pessoa escolhida foi: "+lista_pessoas.get(0).getNome());
                i=10;
                break;
            }
            if(i==8){
                i=0;
                Collections.shuffle(numeros);
                Collections.shuffle(numeros);
            }
        }
    }
}
