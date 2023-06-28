package HLutility;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class HLutilidades {
    public static final String HLCEDULA = "\t - CEDULA: 1150141487";
    public static final String HLCORREO = "\t - CORREO: henry.ludena@epn.edu.ec";
    public static final String HLNOMBRE = "\t - NOMBRE: henry francisco ludeña chicaiza";
    static  Scanner sc = new Scanner(System.in);
    public boolean HLingresoUsuario(String HLusuario, String HLclave, boolean HLbandera){
        HLbandera=true;
        if(((HLusuario.equalsIgnoreCase("henry.ludena@epn.edu.ec"))||(HLusuario.equalsIgnoreCase("profe"))&&((HLclave.equalsIgnoreCase("1150141487"))||(HLclave.equalsIgnoreCase("1234"))))){
            return HLbandera = false;
        }else
        HLbandera = true;
        return HLbandera;
    }

    public static final void HLlimpiarTerminal(){
        try {
            String operatingSystem = System.getProperty("os.name");     
              
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public int HLmenu(String HLusuario){
        int HLnumeroIngreasdo = 0;
        boolean HLbandera = true;
        do {
        System.out.println("------------------------");
        System.out.println("Carga horaria de alumnos");
        System.out.println("--------------------------");
        System.out.println("Usuario: "+HLusuario);
        System.out.println();
        System.out.println("1 Visualizar Alumnos");
        System.out.println("2 Visualizar Asignaturas");
        System.out.println("3 Visualizar Horario");
        System.out.println("4 Visualizar Horario de una Materia");
        System.out.println("0 SALIR");
        try {
            HLnumeroIngreasdo=Integer.parseInt(sc.nextLine());
            if(HLnumeroIngreasdo>=0&&HLnumeroIngreasdo<=4)
            HLbandera=false;
            else
            System.out.println("Ingrese un número del menú");
        } catch (Exception e) {
            System.out.println("Ingrese un número válido");
        }
        } while (HLbandera==true);
       
        return HLnumeroIngreasdo;
    }
}
