package ui;

import controller.ControllerCajero;
import exceptions.IdNoEncontrado;
import exceptions.RetiroMayorAlSaldo;
import exceptions.RetiroNegativo;
import exceptions.ValorNegativoParaRecargar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IdNoEncontrado {
        Scanner sc = new Scanner(System.in);
        ControllerCajero ctrl = new ControllerCajero();
        int id;
        int op;
        boolean validarRetiro = false;
        boolean validarRecarga = false;

        do {
            try {
                System.out.println("-----------CAJERO AUTOMATICO-----------");
                System.out.print("Ingrese su ID: ");
                id = sc.nextInt();


                if (ctrl.buscarId(id)) {

                    System.out.println("ID encontrado, bienvenido");

                    do {

                        System.out.println("-------------------------------------------");
                        System.out.println("Ingrese la accion que quiere realizar:");
                        System.out.println("1. Retirar");
                        System.out.println("2. Recargar");
                        System.out.println("3. Consultar saldo");
                        System.out.println("0. Salir");
                        System.out.println("-------------------------------------------");
                        System.out.print("Digite aqui: ");
                        op = sc.nextInt();
                        sc.nextLine();

                        switch (op) {

                            case 1:
                                System.out.println("------------------------------------");
                                System.out.println("Ingrese el valor que va a retirar");
                                double retiro = sc.nextDouble();
                                System.out.println(ctrl.retirarDinero(id, retiro));
                                validarRetiro = true;
                                validarRetiro = false;
                                System.out.println("------------------------------------");
                                break;

                            case 2:
                                System.out.println("------------------------------------");
                                System.out.println("Ingrese el valor que va a recargar");
                                double recarga = sc.nextDouble();
                                System.out.println(ctrl.recargarDinero(id, recarga));
                                validarRecarga = true;
                                validarRecarga = false;
                                System.out.println("------------------------------------");
                                break;

                            case 3:
                                System.out.println("------INFORMACION DE LA CUENTA------");
                                System.out.println(ctrl.mostrarSaldo(id));
                                System.out.println("------------------------------------");
                                break;

                            case 0:
                                System.out.println("Saliendo...");
                                break;

                            default:
                                System.out.println("Opcion no valida");
                        }


                    } while (op != 0);


                } else {
                    System.out.println("ID NO ENCONTRADO");
                }

            } catch (IdNoEncontrado e) {
                System.out.println(e.getMessage());

            } catch (RetiroMayorAlSaldo w) {
                System.out.println(w.getMessage());

            } catch (RetiroNegativo o) {
                System.out.println(o.getMessage());

            } catch (ValorNegativoParaRecargar t) {
                System.out.println(t.getMessage());
            }
        }while(!validarRecarga && !validarRetiro);
        }
    }
