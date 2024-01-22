public class Cilindro extends Circulo{

    private double altura;


    //Constructor

    public Cilindro (double radio, double altura){
        super(radio);
        this.altura = altura;
    }


    //Getters and Setters

    public double getAltura() {
        if(altura < 0){
            altura = 0;
        }
        else {
            this.altura = altura;
        }
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    // Métodos

    /*@Override
    public double getArea() {
        double area = (2 * Math.PI * altura) + (2 * Math.PI * altura);
        return (area);
    }*/

    @Override
    public double getArea() {
        double area = (super.getArea() * 2) + (2 * getRadio() * altura * Math.PI);
        return area;
    }

    public double getVolume(){
        double area = getArea();
        double volumen = area * altura;
        return(volumen);
    }
}
