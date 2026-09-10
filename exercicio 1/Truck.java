public class Truck extends Vehicle{
    private double capacidadeCarga;
}

public Truck(int passageiros, double capacidadeTanque, double consumo, double capacidadeCarga) {
    super(passageiros, capacidadeTanque, consumo); // inicializa a parte "Vehicle"
    this.capacidadeCarga = capacidadeCarga;
    }

public double getCapacidadeCarga(){
    return capacidadeCarga;
}

public void setCapacidadeCarga(double capacidadeCarga){
    this.capacidadeCarga= capacidadeCarga;
}

@Override

public String toString(){
    return super.toString()+" Capacidade da carga" + capacidadeCarga +"kg"
}