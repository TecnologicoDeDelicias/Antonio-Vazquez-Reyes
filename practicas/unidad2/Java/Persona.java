package practicas.unidad2.Java;

class Persona{
    String nombre;
    int edad; 
    boolean vive;

void saludar() {
        System.out.println("hola mi nombre es" + nombre);
    }
void incrementaredad() {
    edad=edad+1;
}
void morir() {
    vive=false;
}
public static void main(String[] args) {
    Persona persona = new persona();
        persona.edad = 25;
        persona.nombre = rogelio;
        persona.vive = true;

    System.out.println("la edad de la persona es" + persona.edad);
    System.out.println("la persona vive?" + persona.vive);
}
    persona.saludar();

    System.out.println("la edad de la persona es" + persona.edad);
    System.out.println("la persona vive?" + persona.vive);
}
    persona.incrementaredad();

    System.out.println("la edad de la persona es" + persona.edad);
    System.out.println("la persona vive?" + persona.vive);
}
    persona.morir();

    System.out.println("la edad de la persona es" + persona.edad);
    System.out.println("la persona vive?" + persona.vive);
}
}