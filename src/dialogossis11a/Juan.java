
package dialogossis11a;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovanni Tzec
 */
public class Juan {

   
    public static void main(String[] args) {
        /*JOptionPane.showMessageDialog(null,"Sis11A");
        JOptionPane.showMessageDialog(null,"Datos estudiante",
                "Estudiante",0);*/
        String categoria,codigo,nombre = null,direccion;
        int op,nhora,con = 0;
        int fechaNacimiento = 0;
        int fecha=0;
        int con2=0;
        double salario = 0;
        double planilla = 0;
        double promedioDeSalario = 0;
        
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat df=new DecimalFormat("##.##");
        
        op=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos Empleados son. "));
        
        
        for(int i=0; i<op; i++)
        {
        codigo=JOptionPane.showInputDialog("Ingrese su Codigo: ");
        nombre=JOptionPane.showInputDialog("Ingrese su Nombre: ");
        fechaNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa su Fecha de Nacimiento: "));
        categoria=JOptionPane.showInputDialog("Ingrese su Categoria");
        nhora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus Horas Trabajadas"));
        direccion=JOptionPane.showInputDialog("Ingrese su Direccion: "); 
     
        switch(categoria)
        {
            case "a": salario=nhora*15;                    
            break;
            case "b" : salario=nhora*13;
                        con=con+1;
            break;
            case "c": salario=nhora*11;
            break;
            case "d": salario=nhora*10;
            break;
            default: JOptionPane.showMessageDialog(null,"Error de eleccio");
            break;
        }
        
        fecha = 2018-fechaNacimiento;
        if(fecha>50)
        {
            con2=con2+1;
        }
        
        
        planilla = planilla+salario;
        promedioDeSalario = planilla/op;
        JOptionPane.showMessageDialog(null,"\n Datos"+"\n Nombre: "+nombre+
                        "\n Codigo: "+codigo+"\n Direccion:"+direccion+"\n salario: "+nf.format(salario)+
                        "\n Suedad es: "+fecha );
        }//end for
        
        JOptionPane.showMessageDialog(null,"\n Datos"+"\n Cuanto son de la categoria B: "+con);
        JOptionPane.showMessageDialog(null,"\n Datos"+"\n Cuantas Personas Mayores de 50 Anhos son: "+con2);
        JOptionPane.showMessageDialog(null,"\n Datos"+"\n Total de Planilla "+planilla);
        JOptionPane.showMessageDialog(null,"\n Datos"+"\n Promedio de total de los salarios "+promedioDeSalario);
        
       
        
    }
    
}
