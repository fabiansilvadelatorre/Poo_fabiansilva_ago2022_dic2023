package reto6;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private String EntradaMenu = "Menú";
    private String Opcion = "Digite el número correspondiente a la opción a elegir: ";
    private String Error = "El valor ingresado no posee un formato numérico. Intente de nuevo: ";
    private String Reintentar = "Opción no disponible. Intente de nuevo: ";
    private String Finalizar = "Programa finalizado.";
    private ArrayList<String> optionList = new ArrayList<>();
    private ArrayList<pty.MenuActionPrototype> menuActionPrototypeList = new ArrayList<>();
    private boolean alive = true;
    public void MenuFalso() {
        alive = false;
    }
    public boolean isAlive() {
        return alive;
    }
    public Menu addOption(String option, pty.MenuActionPrototype menuActionPrototype) {
        optionList.add(option);
        menuActionPrototypeList.add(menuActionPrototype);
        return this;
    }
    public void addExitOption() {
        optionList.add("Salir");
    }
    public void clearMenu() {
        optionList.clear();
        menuActionPrototypeList.clear();
    }
    public void showMenu() {
        System.out.println(EntradaMenu);
        for (int i = 0; i < optionList.size(); i++) {
            System.out.println(i + 1 + ") " + optionList.get(i));
        }
    }
    public void requestOption(){
        System.out.print(Opcion);
    }
    public int readOption() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                int option = input.nextInt();
                input.nextLine();
                if (option < 0 || option > optionList.size()) {
                    System.out.print(Reintentar);
                    continue;
                }
                else if(option == 0){
                    MenuFalso();
                    option = optionList.size();
                }
                return option;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.print(Error);
            }
        }
    }
    public void executeOption(int option) {
        if (option == optionList.size()) {
            MenuFalso();
            System.out.println(Finalizar);
            return;
        }
        menuActionPrototypeList.get(option - 1).Accion();
    }
}
