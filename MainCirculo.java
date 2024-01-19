public class MainCirculo {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5.7);
        Circulo circulo2 = new Circulo(-2.4);
        Cilindro cilindro1 = new Cilindro(1.7, 6.2);
        Cilindro cilindro2 = new Cilindro(4.7, -8.3);


        System.out.println("El Radio del circulo 1 es: " + circulo1.getRadio());
        System.out.println("EL Area del circulo 1 es: " + circulo1.getArea());
        System.out.println("-------------------------------------------------------");
        System.out.println("El Radio del cilindro 1 es: " + cilindro1.getRadio());
        System.out.println("El Area del cilindro 1 es: " + cilindro1.getArea());
        System.out.println("La Altura del cilindro 1 es: " + cilindro1.getAltura());
        System.out.println("EL volumen del cilindro 1 es: " + cilindro1.getVolume());
        System.out.println("-------------------------------------------------------");
        System.out.println("El Radio del circulo 2 es: " + circulo2.getRadio());
        System.out.println("EL Area del circulo 2 es: " + circulo2.getArea());
        System.out.println("-------------------------------------------------------");
        System.out.println("El Radio del cilindro 2 es: " + cilindro2.getRadio());
        System.out.println("El Area del cilindro 2 es: " + cilindro2.getArea());
        System.out.println("La Altura del cilindro 2 es: " + cilindro2.getAltura());
        System.out.println("EL volumen del cilindro 2 es: " + cilindro2.getVolume());




    }
}
