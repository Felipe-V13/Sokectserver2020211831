package Hilos;

public class  Machote {
    String nombre;
    String apellido;
    //constructor
    Machote(int id){
        System.out.println("Instacncia de machote creada con id = " + id);
    }

    public void procesar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("apellido: " + this.apellido);
    }
    public static void main(String args[]){

        Machote machote1= new Machote(1);
        Machote machote2= new Machote(2);


        //machote1.procesar();
        //machote2.procesar();

    }
}
