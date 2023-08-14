public class Balao {
    //Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    int capacidade;
    double altura;
    String porte;
    double peso;
    //Métodos
    public String voar(){
        return "voando";
    }

    public void setId(int id){

        this.id = id;
    }

    public int getId(){

        return id;
    }

    public void setCor(String cor){

        this.cor = cor;
    }

    public String getCor(){

        return cor;
    }

    public void setTipo (String tipo){

        this.tipo = tipo;
    }

    public String getTipo (){

        return tipo;
    }

    public void setCapacidade(int capacidade){

        this.capacidade = capacidade;
    }

    public int getCapacidade (){

        return capacidade;
    }

    public void setAltura(double altura){

        this.altura = altura;
    }

    public double getAltura (){

        return altura;
    }

    public void setPorte(String porte){

        this.porte = porte;
    }

    public String getPorte (){

        return porte;
    }

    public void peso (double peso){

        this.peso = peso;
    }

    public double getPeso(){

        return peso;
    }
}
