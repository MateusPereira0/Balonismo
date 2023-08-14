public class Piloto {
    public static void main(String[] args) {
        //Construir balões
        Piloto p1 = new Piloto();
        String resultado = p1.pilotar();
        System.out.println(resultado);
    }
    public String pilotar(){
        return "pilotando";
    }
}   
