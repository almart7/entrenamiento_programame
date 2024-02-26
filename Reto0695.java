public class Reto0695{
    
    static java.util.Scanner in;
    
    public static boolean casoDePrueba(){
        int prueba=in.nextInt();
        
        if (prueba==0)
            return false;
        else{
            // CÓDIGO DE TRABAJO
            if (prueba>=1 && prueba<1000000000){
                // ORDENAMOS LAS CIFRAS DE MAYOR A MENOR
                // De int a String
                String descendente = Integer.toString(prueba);
                // De String a Array
                char[] cifrasDesc = descendente.toCharArray();
                // Ordenamos cifras de forma descendente y pase de Array a String
                java.util.Arrays.sort(cifrasDesc);
                StringBuilder cifrasOrdenadasDesc = new StringBuilder();
                for (int i=cifrasDesc.length-1; i>=0; i--){
                    cifrasOrdenadasDesc.append(cifrasDesc[i]);
                }
                // De String a int
                int numeroDescendente = Integer.parseInt(cifrasOrdenadasDesc.toString());
                
                // ORDENAMOS LAS CIFRAS DE MENOR A MAYOR
                // De int a String
                String ascendente = Integer.toString(prueba);
                // De String a Array
                char[] cifrasAsc = ascendente.toCharArray();
                // Ordenamos cifras de forma ascendente y pase de Array a String
                java.util.Arrays.sort(cifrasAsc);
                StringBuilder cifrasOrdenadasAsc = new StringBuilder();
                for (int i=0; i<cifrasAsc.length; i++){
                    cifrasOrdenadasAsc.append(cifrasAsc[i]);
                }
                // De String a int
                int numeroAscendente = Integer.parseInt(cifrasOrdenadasAsc.toString());
                
                // Mostramos el resultado
                System.out.println(numeroDescendente+" - "+numeroAscendente+" = "+(numeroDescendente-numeroAscendente)+" = "+((numeroDescendente-numeroAscendente)/9)+" x 9");
            }
            // FIN DE CÓDIGO DE TRABAJO
            
            return true;
        }
    }
    
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
     
}