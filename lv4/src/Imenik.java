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






}