public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
      byte numero1 = -128;
      short  numero2=numero1;
      final double VALOR_DE_PI = 3.14;
      numero1 = (byte) numero2;
      System.out.println(numero1);
      System.out.println(VALOR_DE_PI);
    }
}
