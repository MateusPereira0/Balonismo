public class Pessoa {

    String nome;
    String sobrenome;
    String genero;
    double peso;
    double altura;
     int idade;

    Pessoa Pessoa = new Pessoa();

    public Pessoa(){
    }
    public String nome(){
        System.out.println("Abner");
        return nome = nome;
    }

    public String sobrenome() {
        System.out.println("Claudeneias");
        return sobrenome = sobrenome;
    }

    public String genero(){
        System.out.println("masculino");
        return genero = genero;
    }

    public double peso(){
        System.out.println("83,1kg");
        return peso = peso;
    }

    public double altura(){
        System.out.println("1.78");
        return altura = altura;
    }

    public int idade(){
        System.out.println("25 anos");
        return idade = idade;
    }

    public void setNome (String nome){

        this.nome = nome;
    }

    public String getNome(){


        return nome;
    }

    public void setSobrenome (String sobrenome){

        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){

        return sobrenome;
    }

    public void setGenero (String genero){

        this.genero = genero;
    }

    public String GetGenero (){

        return genero;
    }

    public void setPeso (double peso){

        this.peso = peso;
    }

    public double getPeso (){

        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura (){

        return altura;
    }

    public void setIdade (int idade){

        this.idade = idade;
    }

    public int setIdade (){

        return idade;
    }

}
