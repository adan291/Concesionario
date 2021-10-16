public class Coche {

    private String marca;
    private String modelo;
    private int ano;
    private String matricula;
    private int cocheCreado;

    public static int contador_de_coches;

    public Coche(String marca, String modelo, int ano, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.matricula = matricula;

        this.contador_de_coches++;
        this.cocheCreado = getContador_de_coches();
    }

    public Coche() {
        this.marca = "Adan";
        this.modelo = "Sanchez";
        this.ano = 1994;
        this.matricula = "53972959d";

        contador_de_coches++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCocheCreado() {
        return cocheCreado;
    }
    public int getContador_de_coches() {
        return contador_de_coches;
    }

    @Override
    public String toString() {
        return "Coche creado numero: " + cocheCreado + " La marca: " + marca + " ,El modelo: " + modelo
                + " ,La matricula: " + matricula + " ,El ano: " + ano;
    }
}
