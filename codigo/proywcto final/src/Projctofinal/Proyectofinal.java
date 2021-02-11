/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projctofinal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyectofinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opciones;
        int contador = 0;

        System.out.println("Ingrese 1 para crear una cuenta de Facebook\n"
                + "Ingrese 2 para crear una cuenta de Twitter\n"
                + "Ingrese 3 para crear una cuenta de Whatsapp\n"
                + "Ingrese 4 para crear una cuenta de Telegram\n"
                + "Ingrese 5 para crear una cuenta de Signal\n"
                + "Ingrese 6 para crear una cuenta de Instagram\n"
                + "Ingrese 7 para crear una cuenta de Flickr ");
        opciones = entrada.nextInt();

        int opcion = 1;
        if (opciones == 1) {
            contador += 1;
            System.out.println(crearFacebook());

        } else {
            if (opciones == 2) {
                contador += 1;
                crearTwitter();
            } else {
                if (opciones == 3) {
                    contador += 1;
                    System.out.println(crearWhatsapp());
                } else {
                    if (opciones == 4) {
                        contador += 1;
                        crearTelegram();
                    } else {
                        if (opciones == 5) {
                            contador += 1;
                            System.out.println(crearSignal());
                        } else {
                            if (opciones == 6) {
                                contador += 1;
                                crearInstagram();
                            } else {
                                if (opciones == 7) {
                                    contador += 1;
                                    System.out.println(crearFlickr());
                                } else {
                                    System.out.println("Opncion incorrecta");
                                }

                            }

                        }

                    }

                }

            }

        }
        System.out.println(obtenerMensaje(contador));

    }

    public static String crearFacebook() {
        System.out.println("Estamos creando una cuenta de Facebook ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String cadena = "";
        String pais;
        int edad;
        String correo;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el pais: ");
        pais = entrada.nextLine();

        System.out.print("Ingresar su correo electronico: ");
        correo = entrada.nextLine();
        cadena = String.format("Nombre de usuario:¨%s\n"
                + "Ciudad: %s\n"
                + "Edad: %s\n"
                + "Pais: %s\n"
                + "Correo electronico: %s", nombre, ciudad, pais, edad, correo);
        return cadena;

    }

    public static void crearTelegram() {
        System.out.println("Estamos creando una cuenta de Telegram ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String cadena = "";
        String pais;
        int numeroTelefono;
        String areaInteres;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese la numero de telefono: ");
        numeroTelefono = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el pais: ");
        pais = entrada.nextLine();

        System.out.print("Ingresar su area de interes: ");
        areaInteres = entrada.nextLine();
        System.out.printf("Nombre de usuario:¨%s\n"
                + "Ciudad: %s\n"
                + "Numero de telefono: %s\n"
                + "Pais: %s\n"
                + "Area de interes: %s", nombre, ciudad, pais, numeroTelefono,
                areaInteres);
    }

    public static String crearWhatsapp() {
        System.out.println("Estamos creando una cuenta de Whatsapp ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String cadena = "";
        String pais;
        int edad;
        int numeroTelefono;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el pais: ");
        pais = entrada.nextLine();

        System.out.print("Ingresar su numero de telefono: ");
        numeroTelefono = entrada.nextInt();
        cadena = String.format("Nombre de usuario:¨%s\n"
                + "Ciudad: %s\n"
                + "Edad: %s\n"
                + "Pais: %s\n"
                + "Numero de telefono: %s", nombre, ciudad, pais, edad, 
                numeroTelefono);
        return cadena;

    }

    public static void crearTwitter() {
        System.out.println("Estamos creando una cuenta de Twitter ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombres;
        String apellidos;
        String ciudad;
        String cadena = "";
        String pais;
        String idioma;
        int edad;
        String correo;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese sus nombres: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        apellidos = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese su pais: ");
        pais = entrada.nextLine();

        System.out.print("Ingrese un idioma: ");
        idioma = entrada.nextLine();

        System.out.print("Ingrese su correo electronico: ");
        correo = entrada.nextLine();

        System.out.printf("Nombre de usuario:¨%s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %s\n"
                + "Ciudad: %s\n"
                + "Pais: %s\n"
                + "Idioma: %s\n"
                + "Correo electonico: %s", nombre, nombres, apellidos, 
                edad, ciudad, pais, idioma, correo);
    }

    public static String crearSignal() {
        System.out.println("Estamos creando una cuenta de Signal ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String cadena = "";
        String pais;
        String hobby;
        int numeroTelefono;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese su hobby principal: ");
        hobby = entrada.nextLine();
        System.out.print("Ingrese el pais: ");
        pais = entrada.nextLine();

        System.out.print("Ingresar su numero de telefono: ");
        numeroTelefono = entrada.nextInt();
        cadena = String.format("Nombre de usuario:¨%s\n"
                + "Ciudad: %s\n"
                + "Hobby principal: %s\n"
                + "Pais: %s\n"
                + "Numero de telefono: %s", nombre, ciudad, pais, hobby, 
                numeroTelefono);
        return cadena;
    }

    public static void crearInstagram() {
        System.out.println("Estamos creando una cuenta de Instagram ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String ciudad;
        String cadena = "";
        int edad;
        String correo;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ciudad: ");
        ciudad = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingresar su correo electronico: ");
        correo = entrada.nextLine();
        System.out.printf("Nombre de usuario:¨%s\n"
                + "Ciudad: %s\n"
                + "Numero de telefono: %s\n"
                + "Correo electronico: %s", nombre, ciudad, edad, correo);
    }

    public static String crearFlickr() {
        System.out.println("Estamos creando una cuenta de Flickr ");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cadena = "";
        String correo;
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();

        System.out.print("Ingresar su correo electronico: ");
        correo = entrada.nextLine();
        cadena = String.format("Nombre de usuario:¨%s\n"
                + "Correo electronico: %s", nombre, correo);
        return cadena;
    }

    public static String obtenerMensaje(int numero) {
        String[] mensajeFinal = {"Campaña con poca afluencia", 
            "Campaña moderada siga adelante", "Excelente campaña"};
        String cadena = "";
        if (numero >= 1 && numero <= 5) {
            cadena = mensajeFinal[0];

        } else {
            if (numero >= 6 && numero <= 15) {
                cadena = mensajeFinal[1];
            } else {
                if (numero >= 16) {
                    cadena = mensajeFinal[2];
                }
            }
        }

        return cadena;

    }
}
