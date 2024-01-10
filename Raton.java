public class Raton {
    private String marca;
    private int botonesFuncionando;
    private boolean conectado;
    private int totalBotones;

    public Raton (String marca, int botonesTotal, int botonesQueFuncionan) {
        conectado = true;
        botonesFuncionando= botonesQueFuncionan;
        totalBotones= botonesTotal;
    }
    public String getMarca() {
        return marca;
    }
    public int getbotonesSinFuncionar() {
        return botonesFuncionando;
    }
    public boolean getconectado() {
        return conectado;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    public void sinFuncionar (){
        botonesFuncionando= totalBotones -  botonesFuncionando;
    }
    public void desconectado () {
        if (conectado== true){
            conectado= false;
        }
        else{
            conectado= true;
        }
    }
}
