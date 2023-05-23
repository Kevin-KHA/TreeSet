public class Alumno implements Comparable <Alumno>{
    //ATRIBUTOS
    private String name;
    private int id;

    //CONSTRUCTOR PARA RECEPCION DE DATOS
    public Alumno(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //ESTE METODO ES NECESARIO PARA QUE EL TREESET FUNCIONE, ORDENA DATOS SEGUN LAS MATRICULAS
    @Override
    public int compareTo(Alumno alumno) {
        return  this.id -  alumno.getId();
    }
}