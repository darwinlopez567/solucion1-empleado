import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = null;


        String nombre, apellido;
        int dia, mes, anio, numerosdehijos, subalternos;
        boolean genero;
        int opc, indice=0;
        double salario;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Ingresar Empleado");
            System.out.println("2.- Cambiar salario");
            System.out.println("3.- Calcular edad");
            System.out.println("4.- Calcular antiguedad");
            System.out.println("5.- Calcular prestaciones");
            System.out.println("6.- Mostrar empleado");
            System.out.println("7.- Calcular auxilio educativo");
            System.out.println("8.- Calcular auxilio educativo por porcentaje");
            System.out.println("9.- Diferencia salarial");
            System.out.println("10.- Bonificacion por coordinacion");
            System.out.println("11.- Salir");
            System.out.print("\nIngrese una opción: ");
            opc = Integer.parseInt(sc.next());
            switch (opc){
                case 1:{
                    System.out.println("Ingreso del empleado "+indice+1);
                    System.out.print("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese el apellido: ");
                    apellido = sc.next();
                    System.out.print("Ingrese el genero 1 Masculino, 0 Femenino: ");
                    if(Integer.parseInt(sc.next())==1)
                        genero = true;
                    else genero = false;

                    System.out.print("Ingrese el dia de nacimiento: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de nacimiento: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de nacimiento: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fn = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el dia de ingreso: ");
                    dia = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el mes de ingreso: ");
                    mes = Integer.parseInt(sc.next());
                    System.out.print("Ingrese el anio de ingreso: ");
                    anio = Integer.parseInt(sc.next());
                    Fecha fi = new Fecha(dia,mes,anio);

                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());

                    System.out.print("Ingrese el numeros de hijos: ");
                    numerosdehijos = sc.nextInt();
                    System.out.print("Ingrese el numeros de subalternos: ");
                    subalternos = sc.nextInt();

                   e1 = new Empleado(nombre,apellido,genero,fn,fi,salario, numerosdehijos, subalternos);



                }break;
                case 2:{

                    System.out.print("Ingrese el salario: ");
                    salario = Double.parseDouble(sc.next());
                    e1.cambiarSalario(salario);
                }break;
                case 3:{
                    System.out.println("La edad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularEdad());
                }break;
                case 4:{
                    System.out.println("La antiguedad de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularAntiguedad());
                }break;
                case 5:{
                    System.out.println("Las prestaciones de "+e1.darNombre()+" "+e1.darApellido()+" es "+e1.calcularPrestaciones());
                }break;
                case 6:{
                    System.out.println(e1);
                }break;
                case 7:{
                    System.out.println("Empleado: "+e1.darNombre()+" "+e1.darApellido());
                    System.out.println("Numeros de hijos: "+e1.darnumerosdehijos());
                    System.out.println("auxiliar educativo: "+e1.calcularAuxilioeducativo());
                }break;
                case 8:{
                    double porcentaje;
                    System.out.println("ingrese el porcentaje:\n");
                    porcentaje= sc.nextDouble();
                    System.out.println("Empleado: "+e1.darNombre()+" "+e1.darApellido());
                    System.out.println("Numeros de hijos: "+e1.darnumerosdehijos());
                    System.out.println("auxiliar educativo: "+e1.calcularAuxilioEducativoPorcentaje(porcentaje));
                }break;
                case 9:{
                    Empleado e2= new Empleado("Darwin", "Lòpez", false, new Fecha(18,8,2004), new Fecha(11,5,2018),3500,0,
                            3);
                    System.out.println("la diferencia entre"+e1.darNombre()+""+e1.darApellido()+"y"+e2.darNombre()+""+e2.darApellido()+"es de"+e1.calcularDiferenciaSalarial(e2));
                }break;
                case 10:{
                    System.out.println("Empleado: "+e1.darNombre()+""+e1.darApellido()+
                            "\n Subalternos:"+e1.darSubalternos()+
                            "\nBonificacion: "+ e1.calcularBonificacionCoordinacion());
                }break;
                case 11:{
                    System.out.println("Gracias!");
                }break;
                default:
                    System.out.println("opción no válida");

            }


        }while(opc!=11);

    }

}