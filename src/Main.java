import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome, nivel;
        int xp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Heroi: ");
        nome = sc.next();

        System.out.println("Digite a experiencia obtida: ");
        xp = sc.nextInt();

        if(xp >= 0 && xp < 1001){
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else if (xp >= 10001) {
            nivel = "Radiante";
        } else {
            System.out.println("Quantidade de XP invalido");
            nivel = "Sem nivel";
        }

        System.out.println("O Herói de nome "+nome+" está no nível de "+nivel);
    }
}