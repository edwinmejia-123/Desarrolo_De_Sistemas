/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author joser
 */
public class Validaciones {
 private static int entero;
    private static double decimal;
    private static String cadena;
    static SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");

    public static boolean numEntero(String cadena) {
        try {
            entero = Integer.parseInt(cadena.trim());
            return true;
        } catch (Exception a) {
            return false;
        }
    }

    public static boolean numEnteroPositivo(String cadena) {
        try {
            entero = Integer.parseInt(cadena.trim());
            if (entero <= 0) {
                return false;
            }
            return true;
        } catch (Exception a) {
            return false;
        }
    }

   

    public static boolean numDecimal(String cadena) {
        try {
            decimal = Double.parseDouble(cadena.trim());
            return true;
        } catch (Exception a) {
            return false;
        }
    }

    public static boolean numDecimalPositivo(String cadena) {
        try {
            decimal = Double.parseDouble(cadena.trim());
            if (decimal <= 0) {
                return false;
            }
            return true;
        } catch (Exception a) {
            return false;
        }
    }

    public static boolean validacionTelefono(String cadena) {
        Pattern pat = Pattern.compile("[267][0-9]{3}-[0-9]{4}");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }

    public static Date convertirFecha(String cadena) throws ParseException {
        return dt.parse(cadena);
    }

    public static boolean numDUI(String cadena) {
        Pattern pat = Pattern.compile("[0-9]{8}-[0-9]{1}");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }

    public static boolean valContraseña(String cadena) {
        Pattern pat = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }

    public static boolean valCorreo(String cadena) {
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }

    public static boolean valTarjeta(String cadena) {
        Pattern pat = Pattern.compile("[0-9]{16}");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }
    
    public static boolean valCodigoSeguridad(String cadena) {
        Pattern pat = Pattern.compile("[0-9]{3}");
        Matcher mat = pat.matcher(cadena);
        return mat.matches();
    }

    
}
