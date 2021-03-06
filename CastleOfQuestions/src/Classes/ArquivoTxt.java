package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
Classe para manipulacao de arquivos .txt, permitindo salvar objetos de Pessoa
e tbm capturar os objetos que ja foram salvos no .txt.

os metodos que deverao ser chamados por fora sao:
salvaTxt  -->  recebendo o caminho, ou nome do arquivo que sera salvo.
               E tbm o ArrayList de pessoas.
*/

public class ArquivoTxt {
    
    /*public static void exibirTxt(){
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        lista_pessoas=capturaTxt("dados_pessoas.txt");
        for(int i=0; i<lista_pessoas.size();i++){
            System.out.println("Nome: "+lista_pessoas.get(i).getNome()+"  Codigo: "+lista_pessoas.get(i).getCodPessoa());
        }
    }*/
    
    public static void excluirTxt(String caminho, Integer codPessoa){
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        lista_pessoas=capturaTxt(caminho);
        boolean falha_salvar=true;
        for(int i=0; i<lista_pessoas.size();i++){
            if(lista_pessoas.get(i).getCodPessoa()==codPessoa){
                lista_pessoas.remove(i);
                if(Write(caminho, lista_pessoas))
                    System.out.println("Arquivo salvo com sucesso!");
                else
                    System.out.println("Erro ao salvar o arquivo!");
                falha_salvar=false;
                break;
            }
        }
        if(falha_salvar){
            System.out.println("Tentativa de exclusao invalida!!\n");
        }
    }
    
    public static void salvaTxt(String caminho, Pessoa pessoa){
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        lista_pessoas = ArquivoTxt.capturaTxt(caminho);
        lista_pessoas.add(pessoa);
        if(Write(caminho, lista_pessoas))
            System.out.println("Arquivo salvo com sucesso!");
        else
            System.out.println("Erro ao salvar o arquivo!");
    }
    
    
    // Busca a String conteudo (que contem todas as informacoes das pessoas cadastradas) no metodo "read" e, logo em seguida, 
    // processa o conteudo da string ja armazendando nos objetos "Pessoa", ao final do processamento a funcao retorna um List<Pessoa>
    public static List<Pessoa> capturaTxt(String caminho){
        String conteudo = read(caminho);
        List<Pessoa> lista_pessoas = new ArrayList<Pessoa>();
        int i=0;
        int index=0;
        while(i<1100){
            Pessoa pessoa = new Pessoa();
            try{  
                pessoa.setNome(conteudo.split(";")[i]);
                i+=1;
                pessoa.setCodPessoa(Integer.parseInt(conteudo.split(";")[i]));
                i+=1;
                pessoa.setIdade(Integer.parseInt(conteudo.split(";")[i]));
                i+=1;
                pessoa.setCalvo(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setCabeloLongo(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setAlto(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setBarba(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setProfessor(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setMasculino(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setCabeloClaro(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setOlhoEscuro(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                pessoa.setMaior20(Boolean.parseBoolean(conteudo.split(";")[i]));
                i+=1;
                
                lista_pessoas.add(index,pessoa);
                index+=1;
                
            }catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }
        return lista_pessoas;
    }
    
    
    // Le todo o conteudo do txt e armazena  na String conteudo. A String "conteudo" será tratada no metodo capturaTxt 
    private static String read(String caminho){
        String conteudo = "";
        
        try{
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try{
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch(IOException ex){
                System.out.println("Erro ao ler o arquivo");
                return "";
            }
        } catch(FileNotFoundException ex){
            System.out.println("Erro ao abrir o arquivo");
            return "";
        }
    }
    
    // Salva uma lista de pessoas em txt
    private static boolean Write(String caminho, List<Pessoa> lista_pessoas){
        try{
            FileWriter arq = new FileWriter(caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            //gravarArq.println(texto);
            for(int i=0; i<lista_pessoas.size();i++){
                gravarArq.println(lista_pessoas.get(i).getNome()+";");
                gravarArq.println(lista_pessoas.get(i).getCodPessoa()+";");
                gravarArq.println(lista_pessoas.get(i).getIdade()+";");
                gravarArq.println(lista_pessoas.get(i).isCalvo()+";");
                gravarArq.println(lista_pessoas.get(i).isCabeloLongo()+";");
                gravarArq.println(lista_pessoas.get(i).isAlto()+";");
                gravarArq.println(lista_pessoas.get(i).isBarba()+";");
                gravarArq.println(lista_pessoas.get(i).isProfessor()+";");
                gravarArq.println(lista_pessoas.get(i).isMasculino()+";");
                gravarArq.println(lista_pessoas.get(i).isCabeloClaro()+";");
                gravarArq.println(lista_pessoas.get(i).isOlhoEscuro()+";");
                gravarArq.println(lista_pessoas.get(i).isMaior20()+";\r\n");   
            }
            gravarArq.close();
            return true;
        } catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
