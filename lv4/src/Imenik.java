public class Imenik {

    private Student[] lista = new Student[0];

    public Imenik(Student[] lista){
        this.lista=lista;
    }

    public void ispisStudenta(Student[] lista){
        for(int i = 0;i<lista.length;i++){
            lista[i].ispisiPodatke();
        }
    }






}