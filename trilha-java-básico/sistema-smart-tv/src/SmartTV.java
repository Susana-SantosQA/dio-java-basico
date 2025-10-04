public class SmartTV {
boolean Ligada = false;
int Canal = 1;
int Volume = 25;

public void mudarCanal (int novoCanal){
    Canal = novoCanal;
}
public void aumentarCanal(){
    Canal++;
}
public void diminuirCanal(){
    Canal--;    
}

public void aumentarVolume(){
    //Volume = Volume + 1;
    Volume++;
    System.out.println("Aumentar Volume : " +Volume);
}

public void diminuirVolume(){
    //Volume = Volume + 1;
    Volume--;
    System.out.println("Diminuir Volume : " +Volume);
}

public void ligar(){
    Ligada = true;
 
}

public void desligar() {
    Ligada = false;
}

}
