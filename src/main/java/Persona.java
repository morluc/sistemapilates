public abstract class Persona {
    // Atributos de instancia: tipoDni(int), dni(int), nombre(String), apellido(String)
    private int tipoDni, dni;
    private String nombre, apellido;

    public Persona(int t, int d, String n, String a)
    {
      tipoDni = t;
      dni = d;
      nombre = n;
      apellido = a;
    }

    //comandos
    public void cambiarTipoDni(int t)
    {
      tipoDni = t;
    }

    public void cambiarDni(int d)
    {
      dni = d;
    }

    public void cambiarNombre(String n)
    {
      nombre = n;
    }

    public void cambiarApellido(String a)
    {
      apellido = a;
    }

    //consultas

    public int obtenerTipoDni()
    {
      return tipoDni;
    }

    public int obtenerDni()
    {
      return dni;
    }

    public String obtenerNombre()
    {
      return nombre;
    }

    public String obtenerApellido()
    {
      return apellido;
    }


}
