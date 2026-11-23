import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student[] studenti = new Student[broj_studenata];
        System.out.print("Unesite broj studenata: ");

        while(!input.hasNextInt()){
            System.out.print("Unesite broj studenata: ");
            input.next();
        }

        int broj_studenata = input.nextInt();
        Student[] studenti = new Student[broj_studenata];

        for(int i =0;i< broj_studenata;i++){
            studenti[i]=new Student();
        }





    }
}