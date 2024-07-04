public class App {
    public static void main(String[] args){
        String[] palavras = {"a", "vida", "é",
"bela"};
        String[] palavras2 = new String[palavras.length];
        
        for(int i = 0; i < palavras.length;i++){
            palavras2[i] = palavras[palavras.length -1 - i];
        }

        String concatenacao = String.join(" ",palavras2);
        concatenacao = concatenacao.toUpperCase();

        System.out.println(concatenacao);
    }
}
