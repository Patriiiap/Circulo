public class Circulo {

    private double radio;


    //Constructor

    public Circulo (double radio){
        this.radio = radio;
    }


    //Getters and Setters

    public double getRadio() {
        if (radio < 0){
            radio = 0;
        }
        else {
            this.radio = radio;
        }
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //Métodos

    public double getArea (){
        double area = radio * radio * Math.PI;

        return (area);
    }
}
