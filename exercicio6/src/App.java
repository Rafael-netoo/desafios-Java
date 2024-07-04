public class App {
    public static void main(String[] args){
        String[] palavras = {"a", "vida", "é",
"bela"};
      String concatenacao = String.join(" ",palavras);
      concatenacao = concatenacao.toUpperCase();

     System.out.println(concatenacao);
       
    }


}
