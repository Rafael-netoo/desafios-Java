public class App {
    public static void main(String[] args){
        String texto01 = "Será que são iguais?";
        String texto02 = "Será que são iguais?";

        if(texto01.compareTo(texto02) == 0){
            System.out.println("Os textos são iguais");
        }
        else{
            System.out.println("São diferentes!");
        }
    }
}
