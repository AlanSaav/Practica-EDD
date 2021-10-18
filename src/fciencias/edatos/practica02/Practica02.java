package fciencias.edatos.practica02;
import java.util.InputMismatchException;
import java.util.Scanner;
import fciencias.edatos.practica02.DoubleLinkedList;
/**
* Práctica 02 del curso de Estructuras de Datos.
* @author Góngora Ramírez Dania Paula numero de cuenta: 3181274
* @author Herrera Saavedra Alan numero de cuenta:421055951
* @version 17 de octubre 2021.
* 
*/


public class Practica02{

   
    public static void main(String[] args){
    

 
        //lista para el menú//
        DoubleLinkedList<String> lista = new DoubleLinkedList<>();


        Scanner scan = new Scanner(System.in); //Scanner
        boolean salir = false;
        int opcion; //guarda la opción que se escoja// 
        while (!salir) {
            
            System.out.println("\033[31m-----MI LISTA NETFLIX-----\u001B[0m");
            System.out.println("\033[35mOpcion 1.\u001B[0m agregar pelicula a tu lista"); //agregar elemento a la lista
            System.out.println("\033[35mOpcion 2.\u001B[0m Limpia tu lista"); //Limpiar la lista
            System.out.println("\033[35mOpcion 3.\u001B[0m ¿Tienes agregada una pelicula en tu lista?"); //Esta contenido
            System.out.println("\033[35mOpcion 4.\u001B[0m Obtener pelicula guardada en tu lista"); //obtener 
            System.out.println("\033[35mOpcion 5.\u001B[0m ¿Tu lista esta vacia?"); //verificar si la lista esta vacia
            System.out.println("\033[35mOpcion 6.\u001B[0m Remueve una pelicula de tu lista"); //Remover
            System.out.println("\033[35mOpcion 7.\u001B[0m ¿Cuantas peliculas hay en tu lista?"); //longitud de la lista
            System.out.println("\033[35mOpcion 8.\u001B[0m Ver lista del final a inicio "); //reversa de la lista
            System.out.println("\033[35mOpcion 9.\u001B[0m Cortar tu lista"); //cortar
            System.out.println("\033[35mOpcion 10.\u001B[0m Ver Mi Lista de peliculas"); //mostrar lista
            System.out.println("\033[35mOpcion 11.\u001B[0m Salir de Mi Lista \033[31mNETFLIX\u001B[0m"); //opcion de salir


            try {
 
                System.out.println("\033[30mSolo se aceptan números del 1 al 11\u001B[0m");
                opcion = scan.nextInt(); //guardamos su opcion
 
                switch (opcion) {

                    case 1: //agregamos elemento
                        System.out.println("\033[35mHas seleccionado agregar pelicula, da el indice int donde quieres agregarla: ");
                        try{
                        int i = scan.nextInt();
                        scan.nextLine();
                        System.out.println("\033[35mAhora coloca la pelicula que quieres agregar: ");
                        String s = scan.nextLine();
                        lista.add(i, s);
                        }catch(InputMismatchException e){
                        System.out.println("\033[31mDebes insertar un número y un string\u001B[0m");
                        scan.next();
                        }catch(IndexOutOfBoundsException x){
                        System.out.println("\033[31mDebes agregar tu pelicula un lugar antes o un lugar despues de una ya existente\u001B[0m");
                        }
                    break;


                    case 2: //metodo clear
                    System.out.println("\033[35mHas seleccionado Limpiar tu lista de peliculas \n \033[32mTu lista esta vacia\u001B[0m"); 
                    lista.clear();
                    break;

                    
                    case 3: //metodo contains
                    Scanner s = new Scanner(System.in);
                    System.out.println("\033[35mHas seleccionado Ver si tu pelicula esta contenida en la lista");
                    System.out.println("\033[35mIngresa la pelicula que quieres buscar en tu lista: "); 
                    String peli = s.nextLine();
                    System.out.println("\033[32m¿Tu pelicula esta contenida en tu lista?:\u001B[0m " + lista.contains(peli)); 

                    break;


                    case 4: //metodo get
                    System.out.println("\033[35mHas seleccionado obtener una pelicula \n Coloca el indice int donde quieres buscar la pelicula: "); 
                    int peliget = scan.nextInt();
                    System.out.println("\033[32mLa pelicula guardada en ese indice es:\u001B[0m " + lista.get(peliget)); 


                    break;




                    case 5: //metodo isEmpty
                        System.out.println("\033[35mHas seleccionado ver si tienes peliculas en tu lista");
                        System.out.print("\033[32m¿Tu lista esta vacia?:\u001B[0m " + lista.isEmpty() + "\n");
                         
                        break;



                    case 6: //metodo remove

                    try{
                    System.out.println("\033[35mHas seleccionado remover una pelicula de tu lista \n Coloca el indice int de la pelicula que quieres remover: ");
                    peliget = scan.nextInt();
                    System.out.println("\033[32mHas removido con exito la pelicula:\u001B[0m " + lista.remove(peliget)); 
                    } catch(IndexOutOfBoundsException a){
                        System.out.println("\033[31mDebes ingresar un indice int que contenga una pelicula en tu lista\u001B[0m");
                        
                    }


                    break;



                    case 7: //metodo size
                        System.out.println("\033[35mHas seleccionado Ver cuantas peliculas tengo agregadas");
                        System.out.print("\033[32mTienes: " + lista.size() + " peliculas en tu lista \u001B[0m" + "\n");
                        break;



                    case 8: //metodo revert2
                        System.out.println("\033[35mHas seleccionado Obtener la lista en reversa");
                        System.out.print("\033[32mla reversa de tu lista de peliculas es: \u001B[0m " + lista.revert2() + "\n");
                        break;



                    case 9: //metodo cut
                        try{
                        if(lista.size()==0)
                            System.out.println("\033[35mPrimero agrega peliculas a tu lista");
                        System.out.println("\033[35mEscogiste cortar la lista, \033[32mdigita un Booleano\u001B[0m");
                        boolean side = scan.nextBoolean();
                        lista.cut(side);
                        System.out.println(lista.cut(side));
                    }catch(InputMismatchException e){
                        System.out.println("\033[31mDebes insertar un booleano\u001B[0m");
                        scan.next();
                    }
                        break;



                    
                    case 10: //metodo toString
                    System.out.println("\033[35mEscogiste Mostrar tus peliculas agregadas");
                    System.out.print("\033[32mTu lista de peliculas es: \u001B[0m" + lista.toString() + "\n");
                        break;




                    case 11:
                        salir = true;
                        break;
                    default:
                        System.out.println("\033[31mSolo números entre 1 y 7\u001B[0m");


                }
            } catch (InputMismatchException e) {
                System.out.println("\033[31mDebes insertar un número\u001B[0m");
                scan.next();
            }
        }

System.out.println("\033[30mHas salido de la configuracion de MI LISTA NETFLIX, se han guardado tus datos ");


        
    }
}

