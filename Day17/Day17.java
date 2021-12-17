package Fuente;

/**
 *
 * @author aleja
 */
public class Day17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int xMin = 102, xMax = 157, yMin = -146, yMax = -90;

        int PosicionMaxXY = (Math.abs(yMin) - 1) * (Math.abs(yMin)) / 2;
        System.out.println(PosicionMaxXY);
        
        /*
        int velocidadMinX, velocidadMaxX, velocidadMinY, velocidadMaxY, xPos = 0, yPos = 0;
        boolean bandera = true;

        velocidadMaxX = xMax;
        velocidadMinY = yMin;
        velocidadMinX = (int) Math.ceil((-1 + Math.sqrt(1 + 8 * xMin)) / 2);
        velocidadMaxY = Math.abs(yMin) - 1;

        int cont = 0;
        for (int i = velocidadMinX; i <= velocidadMaxX; i++) {
            for (int j = velocidadMinY; j <= velocidadMaxY; j++) {
                if (bandera) {
                    xPos = 0; 
                    yPos = 0;
                    while (xPos <= xMax && yPos >= yMin) {
                        xPos += i;
                        yPos += j;
                        if (i > 0) {
                            i--;
                        }
                        j--;
                        if (xPos >= xMin && xPos <= xMax && yPos >= yMin && yPos <= yMax) {
                            bandera = true;
                        }
                    }
                    if(bandera){
                        continue;
                    }else{
                        bandera = false;
                    }
                    cont++;
                }
            }
        }
        System.out.println(cont);
        */
    }

}
