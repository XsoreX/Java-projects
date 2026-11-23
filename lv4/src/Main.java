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
            System.out.print("Unesite ime studenta " + i + ":");
            studenti[i].setIme(input.next());
            System.out.print("Unesite ocjenu studenta: ");
            while(!input.hasNextInt()){
                System.out.print("Unesite ocjenu studenata: ");
                input.next();
            }
            studenti[i].setOcjena(input.nextInt());
            System.out.print("Unesite JMBAG studenta: ");
            studenti[i].setJmbag(input.nextInt());
        }



        Imenik imenik = new Imenik(studenti);
        imenik.ispisStudenta();

        //System.out.print("Pretrazivanje po imenu: ");
        //imenik.pronadjiStudentaPoImenu(input.next());
        System.out.print("Pretrazivanje po JMBAG-u: ");
        imenik.pronadjiStudentaPoJMBAG(input.nextInt());
    }
}