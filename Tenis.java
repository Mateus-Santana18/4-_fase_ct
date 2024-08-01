Public class Tenis 
{

    private String marca;
    private String tamanho;
    private int nota_fiscal;
    


    public Tenis(String marca; String tamanho; int nota_fiscal){
        this.marca = marca;
        this.tamanho  = tamanho;
        this.nota_fiscal = nota_fiscal;
    }


    public String getMarca(String marca){
        return marca;
    }
    
    public void setMarca(){
        this.marca = marca;
    }

    public String getTamanho(String tamanho){
        return tamanho;
    }
    
    public void setTamanho(){
        this.tamanho = tamanho
    }

    public ind getId(int nota_fiscal){
        return nota_fiscal;
    }

    public void setId(){
        this.nota_fiscal = nota_fiscal;
    }

}
