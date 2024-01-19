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

    public double getVolume(){
        double area = getArea();
        double volumen = area * altura;
        return(volumen);
    }





}
