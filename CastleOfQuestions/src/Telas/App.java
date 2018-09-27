package Telas;

import Classes.*;
import java.util.Scanner;
import org.bytedeco.javacv.FrameGrabber;
import reconhecimento.Reconhecedor;
//import org.bytedeco.javacv.FrameGrabber;
//import reconhecimento.Reconhecedor;

public class App {
    
    //public static void main(String[] args) throws FrameGrabber.Exception, InterruptedException {
        public static void main(String[] args) throws FrameGrabber.Exception, InterruptedException{
        boolean reconhecido;
        Scanner scanner = new Scanner(System.in);
        Reconhecedor recog = new Reconhecedor();
        //if (recog.reconhece()){
            GameRun.start(); 
        //}else{
            System.out.println("Voce nao foi reconhecido");
        //}
    }
    
}