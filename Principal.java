import java.util.Scanner;
import java.util.TreeSet;
public class Principal
{
    public static void main(String[] args)
    {
        menu();
    }

    public static void menu(){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        TreeSet<Alumno> datos = new TreeSet<Alumno>();

        do {
            System.out.println("[1]._Registro  [2]._Modificar");
            System.out.print("Opcion elegida: ");

            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("----------REGISTRO DE ALUMNO--------");
                    registrar(datos);
                    break;
                case 2:
                    System.out.println("----------MODIFICAR DATO-------------");
                    modificar(datos);
                    break;
                default:

                    break;
            }
        } while (opcion!=3);

    }



    public static void registrar(TreeSet<Alumno> datos){
        //Alumno registrar = new Alumno();
        Scanner leer = new Scanner(System.in);
        int idIngresado;
        String nombreIngresado;
        System.out.print(">>>ingrese id: ");
        idIngresado = leer.nextInt();
        System.out.print(">>>Nombre: ");
        nombreIngresado = leer.next();
        datos.add(new Alumno(idIngresado, nombreIngresado));

    }

    public static void modificar(TreeSet<Alumno> datos){
        Scanner leer = new Scanner(System.in);

        for (Alumno alumno : datos) {
            System.out.println("Matricula: " + alumno.getId() + " "+ "Nombre: " + alumno.getName());
        }

        int matriculaBuscar;
        System.out.print("Matricula a buscar: ");
        matriculaBuscar = leer.nextInt();
        String nombreNuevo;
        for (Alumno alumno : datos) {
            if(matriculaBuscar==alumno.getId()){
                System.out.println("Matricula encontrada");
                System.out.print("Ingrese el nuevo nombre: ");
                nombreNuevo = leer.next();
                alumno.setName(nombreNuevo);
                System.out.print("Datos actualizados correctamente");
            }   
        }


    }
    
}