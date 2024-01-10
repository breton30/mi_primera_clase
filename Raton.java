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
    public int getBotonesSinFuncionar() {
        return botonesFuncionando;
    }
    public boolean getConectado() {
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
    public void estadoRaton() {
        System.out.println("Marca Raton: " + marca + " Botones totales: " + totalBotones +  " Conectado al equipo: " + conectado);
    }
    public String getEstado() {
        return marca + " " + totalBotones +" " + conectado;
    }
}
