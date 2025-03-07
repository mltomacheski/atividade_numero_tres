
//8. Verificar se a soma de dois números é maior que 100.
// import java.util.Scanner;

//     public class Exercicio {
//         public static void main (String args[]) {
//             Scanner sc = new Scanner(System.in);


//             System.out.println("Digite o primeiro número para somar");
//             Double priNumero = sc.nextDouble();

//             System.out.println("Digite o segundo número para somar");
//             Double segNumero= sc.nextDouble();

//             Double soma = priNumero +segNumero ;

//             if (soma>100) {
//                 System.out.println("O Resultado é : " + soma);
//                 System.out.println("A soma é maior que 100.");

//             } else {
//                 System.out.println("A soma é menor que 100.");
//             }

//         }

// }



//18. Comparar duas strings e imprimir a maior (com base no número de
//caracteres).


// import java.util.Scanner;

//     public class Exercicio {
//         public static void main (String args[]) {
//             Scanner sc = new Scanner(System.in);


//             System.out.println("Digite uma palavra");
//              String str1 = sc.next();

//             System.out.println("Digite outra palavra");
//              String str2 = sc.next();

//             if ( str1.length() > str2.length() ) {

//                 System.out.println("A maior string é :" + str1);
                
//             } else {
//                 System.out.println("A maior string é :" + str2);
//             } 
                   
//         }

// }


/*28. Verificar se um caractere é uma letra maiúscula.*/
// Estou resolvendo, ou pelo menos tentando



import java.util.Scanner;

    public class Exercicio {
        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);

            

            System.out.println("Digite uma letra");
             //char str1 = sc.next();
             char str1 ;
             char maiuscula = ('A');

             
            // A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z
             //var minuscula = ("abcdefghijklmnopqrstuvwxwz");

             if ( str1.charAt == maiuscula ) {

                System.out.println("Contém letra maiuscula");
                
            } else {
                System.out.println("Não contém letra maiuscula");
            } 
                   
        }

}
