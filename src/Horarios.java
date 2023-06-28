import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Horarios {
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public void leerArchivo(String nombreArchivo){
        try {
            lector = new BufferedReader(new FileReader (nombreArchivo));
            while((linea = lector.readLine()) !=null){
                partes = linea.split(";");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes=null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void imprimirLinea(){
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]+"   |    ");
        }
    }
    public void opcion1(int numero){
        String HLvariable = " ";
        File fichero=new File("C:\\\\Users\\\\Usuario\\\\Desktop\\\\Archivos EPN\\\\Segundo Semestre Software\\\\Programaci\u00F3n\\\\LudenaHenryExamen1erBimestre\\\\202120757-ALEMAN OSORIO CARLOS ALEJANDRO.csv");
        System.out.println(fichero);
    }

    private static final String Ruta = "C:\\Users\\Usuario\\Desktop\\Archivos EPN\\Segundo Semestre Software\\Programaci\u00F3n\\LudenaHenryExamen1erBimestre";
    public void primeraOpcion(){
        System.out.println("\n Nombres alumnos: ");
        File [] archivos = new File(Ruta).listFiles(archivo -> archivo.isFile());

        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
        String patron = "^[2]2021";

        Pattern pattern = Pattern.compile(patron);

        for (File archivo : archivos) {
            Matcher matcher = pattern.matcher(archivo.getName());

            if(matcher.find()){
                System.out.println(archivo.getName());
            }
        }

    }
}


