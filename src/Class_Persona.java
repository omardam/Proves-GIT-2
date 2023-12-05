public class Class_Persona {

    private final String nom;
    private final int edat;

    public Class_Persona(String nom, int edat){
        this.nom = nom;
        this.edat = edat;
    }

    public void saludar(){
        System.out.println("Hola, soc el "+nom+" i tinc "+edat+" anys.");
    }

}
