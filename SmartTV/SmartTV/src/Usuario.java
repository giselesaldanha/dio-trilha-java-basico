public class Usuario {

  public static void main(String[] args) {
     SmartTV smartTv = new SmartTV();

     System.out.println ("\n" + "CONFIGURAÇÃO INICIAL");
     System.out.println("TV Ligada? " + smartTv.ligada);
     System.out.println("Canal Atual: " + smartTv.canal);
     System.out.println("Volume Atual: " + smartTv.volume);

     System.out.println("\n" +"LIGANDO E DESLIGANDO TV");
     smartTv.ligar();
     System.out.println("TV Ligada? " +smartTv.ligada);
     smartTv.desligar();
     System.out.println("TV Ligada? " +smartTv.ligada);

     System.out.println("\n" + "AUMENTANDO E DIMINUINDO CANAL");
     smartTv.aumentarCanal();
     smartTv.aumentarCanal();
     smartTv.aumentarCanal();
     System.out.println("Canal Atual: " +smartTv.canal);
     smartTv.diminuirCanal();
     smartTv.diminuirCanal();
     System.out.println("Canal Atual: " +smartTv.canal);

     System.out.println("\n" + "AUMENTANDO E DIMINUINDO VOLUME");
     smartTv.aumentarVolume();
     System.out.println("Volume Atual: " +smartTv.volume);
     smartTv.diminuirVolume();
     System.out.println("Volume Atual: " +smartTv.volume + "\n");
  }
  
}
