import java.util.Scanner;

public class Media {
    public static void main(String[] agrs){

    double n1, n2, media;
    Scanner entrada;
    entrada = new Scanner(System.in);
    System.out.print ("digite as duas notas: " );
    n1=entrada.nextDouble();
    n2=entrada.nextDouble();
    media= (n1+n2)/2;
    if (media>7)
        System.out.println("Aprova com"+ media);
} }




