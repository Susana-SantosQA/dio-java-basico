public class Usuario {

       public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " +smartTv.Canal);

        smartTv.mudarCanal(13);
        
        System.out.println("Canal Atual : " +smartTv.Canal);

        System.out.println("Volume Atual : " +smartTv.Volume);

        System.out.println("TV Ligada ? " +smartTv.Ligada);
        System.out.println("Canal Atual : " +smartTv.Canal);
        System.out.println("Volume Atual : " +smartTv.Volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.Ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.Ligada);
    }
    
}
