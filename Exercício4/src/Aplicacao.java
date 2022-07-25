public class Aplicacao {
    public static void main(String[] args) {
    
    int hp = 100;
    int lp = 200;
    int ha = 30;
    int la = 15;
    int area_azulejo;
    int area_parede;
    int total_azulejos;

    area_parede = hp * lp;
    System.out.println("A area da parede é de: " + area_parede + "cm");
    area_azulejo = ha * la;
    System.out.println("A area do azulejo é de: " + area_azulejo + "cm");
    total_azulejos = area_parede / area_azulejo;
    System.out.println("A quantidade de azulejos necessários é de: " + total_azulejos + " azulejos");

    }
}
