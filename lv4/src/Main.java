import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.print("Unesite broj studenata: ");
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()){
            System.out.print("Unesite broj studenata: ");
            input.next();
        }

        int broj_studenata = input.nextInt();
        Student[] studenti = new Student[broj_studenata];

        for(int i =0;i< broj_studenata;i++){
            studenti[i] = new Student();
            studenti[i].setIme("Ivan "+i);
        }

        Imenik imenik = new Imenik(studenti);
        imenik.ispisStudenta();
    }
}