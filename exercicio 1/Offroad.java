public class OffRoad extends Vehicle{
    private double groundClearence;
}

public Truck(int passageiros, double capacidadeTanque, double consumo, double groundClearence) {
    super(passageiros, capacidadeTanque, consumo); // inicializa a parte "Vehicle"
    this.groundClearence = groundClearence;
    }

public double getGroundClearence(){
    return groundClearence;
}

public void setGroundClearence(double groundClearence){
    this.groundClearence= groundClearence;
}

@Override

public String toString(){
    return super.toString()+" Distancia entre o solo e o veiculo" + groundClearence +"m"
}