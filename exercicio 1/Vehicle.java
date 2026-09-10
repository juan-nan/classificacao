public class Vehicle{
    private int passageiros;
    private double capacidadeTanque ;
    private double consumo;
    
}

/*contrutor*/

public Vehicle(int passageiros,double capacidadeTanque, double consumo){
    setPassageiros(passageiros);
    setCapacidadeTanque(capacidadeTanque);
    setConsumo(consumo);
}

public Vehicle(){
this(1,1.0,1.0);
}

public Vehicle(Vehicle outro){
this(outro.passageiros,outro.capacidadeTanque.outro.consumo);
}

//get e set
public int getPassageiros(){
    return passageiros;
}

public void setPassageiros( int passageiros){
    if( passageiros <= 0){

    }
    this.passageiros = passageiros;
}

public double getCapacidadeTanque(){
    return capacidadeTanque;
}

public void setCapacidadeTanque(double capacidadeTanque){
    if(capacidadeTanque <= 0){
        
    }
    this.capacidadeTanque = capacidadeTanque;
}


public double getConsumo(){
    return consumo;
}

public void setConsumo(double consumo){
    
    this.consumo = consumo;
}

public double autonomia(){
    return capacidadeTanque *consumo;
}

public double necessario(double distancia){
    return distancia/consumo;
}

public String toString(){
    return "Passageiros: " + passageiros + 
    ", Capacidade do tanque: " + capacidadeTanque + 
    "galões, Consumo: " + consumo
}