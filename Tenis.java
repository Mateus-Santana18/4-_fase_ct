Public class Tenis 
{

    private String marca;
    private String tamanho;
    private int notaFiscal;
    private String cores;
    private boolean possuiCardaco;
    


    public Tenis(String marca, String tamanho, int notaFiscal, String cores, boolean possuiCardaco)
    {
        this.marca = marca;
        this.tamanho  = tamanho;
        this.notaFiscal = notaFiscal;
        this.cores = cores;
        this.possuiCardaco = possuiCardaco;
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

    public ind getId(int notaFiscal){
        return notaFiscal;
    }

    public void setId(){
        this.nota_fiscal = notaFiscal;
    }

    public String getCores(String cores){
        return cores;
    }
    
    public void setCores(){
        this.cores = cores;
    }
    
    public boolean getPossuiCardaco(boolean possuiCardaco){
        return possuiCardaco;
    }
    
    public void possuiCardaco(){
        this.possuiCardaco = possuiCardaco;
    }

}
