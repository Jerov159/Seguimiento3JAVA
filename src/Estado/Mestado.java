package Estado;
import javax.swing.*;
import java.util.jar.JarEntry;
public class Mestado {

        public static void main(String[] args) {
            estado property1 = new estado(1,"Cr 18 # 70-20",50,1700000,3,2,"Yes","Available");
            estado property2 = new estado(2," Cl 10 No. 62C-06",70,1500000,1,1,"No","Sold");
            estado property3 = new estado(3,"Cr 19 santa Clara",300,19000000,7,5,"No","Rented");

            estado[] propertiesArray = {property1, property2, property3};// Crear un array para almacenar las instancias de RealState
            for (estado property : propertiesArray){
                property.showData();
            }
        }
    }
