public class Animal{
    String nombre, especie;
    int edad;

    public Animal(String nombre, String especie, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
    }
    //crear metodos de comer, dormir, hibernar...
    public void comer (){
        System.out.println(nombre+" está comiendo");
    }
    public void dormir (){
        System.out.println(nombre+" está durmiendo");
    }
    public void hibernar (){
        System.out.println(nombre+" de la especie "+especie+"está hibernando");
    }
}