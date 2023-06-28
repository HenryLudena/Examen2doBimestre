import java.util.Scanner;

import HLutility.HLutilidades;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        HLutilidades importar = new HLutilidades();
        System.out.println(HLutilidades.HLCEDULA);
        System.out.println(HLutilidades.HLCORREO);
        System.out.println(HLutilidades.HLNOMBRE);
        int HLnumeroIntentos = 3, HLnumeroMenu;
        boolean HLbandera = true;
        String HLusuario;
        String HLclave;
        
        do {
        System.out.println("--------------------");
        System.out.print("+ Usuario: ");
        HLusuario = sc.nextLine();
        System.out.print("+ Clave: ");
        HLclave = sc.nextLine();
        System.out.println("--------------------");
            HLbandera = importar.HLingresoUsuario(HLusuario, HLclave,HLbandera);
            if(HLbandera==true){
            HLnumeroIntentos--;
            System.out.println("* Numero de intentos: "+HLnumeroIntentos);
            }
            if(HLnumeroIntentos==0){
            System.out.println("Lo sentimos tu usuario y clave son incorrectos..!");
            System.out.println("Gracias");
            System.exit(0);
            }
        } while ((HLbandera==true)&&(HLnumeroIntentos>=1));
        
        System.out.println("Bienvenido "+HLusuario.toUpperCase());
        importar.HLlimpiarTerminal();
        Horarios archivo = new Horarios();
        HLnumeroMenu=importar.HLmenu(HLusuario);
        Horarios ho = new Horarios();
        switch (HLnumeroMenu) {
            case 1:
                ho.primeraOpcion();
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                archivo.leerArchivo("C:\\Users\\Usuario\\Desktop\\Archivos EPN\\Segundo Semestre Software\\Programación\\LudenaHenryExamen1erBimestre\\202120757-ALEMAN OSORIO CARLOS ALEJANDRO.csv");
                archivo.leerArchivo("C:\\Users\\Usuario\\Desktop\\Archivos EPN\\Segundo Semestre Software\\Programación\\LudenaHenryExamen1erBimestre\\202111083-HIDALGO CRUZ PABLO ESTEBAN.csv");
                archivo.leerArchivo("C:\\Users\\Usuario\\Desktop\\Archivos EPN\\Segundo Semestre Software\\Programación\\LudenaHenryExamen1erBimestre\\202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv");
                break;
            case 4:
                
                break;
            default:
            System.out.println("Regresa pronto "+HLusuario);
            System.exit(0);
                break;
        }
        
        
        
        
    }
}
