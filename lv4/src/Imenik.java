import java.util.Objects;

public class Imenik {

    private Student[] lista = new Student[0];

    public Imenik(Student[] lista){
        this.lista=lista;
    }

    public void ispisStudenta(){
        for(int i = 0;i<lista.length;i++){
            this.lista[i].ispisiPodatke();
        }
    }

    public void pronadjiStudentaPoImenu(String ime){
        for(int i = 0; i<this.lista.length;i++){
            if(Objects.equals(this.lista[i].getIme(),ime)){
                System.out.println("Student " + ime + " je pronađen!");
            }
        }
    }






}