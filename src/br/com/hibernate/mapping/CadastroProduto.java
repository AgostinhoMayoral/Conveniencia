package br.com.hibernate.mapping;
// Generated 27/03/2018 12:11:49 by Hibernate Tools 4.3.1



/**
 * CadastroProduto generated by hbm2java
 */
public class CadastroProduto  implements java.io.Serializable {


     private int idcadastroProduto;
     private String nomeProduto;
     private String quantidadeProduto;
     private String tipoProduto;
     private String descricaoProduto;
     private String marcaProduto;
     private String pesoKgProduto;
     private String valorCompraProduto;
     private String valorVendaProduto;
     private byte[] imagemProduto;
     private String codigoBarrasProduto;
     private int idDoAdministradorQueCadastrouProduto;

    public CadastroProduto() {
    }

	
    public CadastroProduto(int idcadastroProduto, String nomeProduto, String quantidadeProduto, String tipoProduto, String descricaoProduto, String marcaProduto, String valorCompraProduto, String valorVendaProduto, String codigoBarrasProduto, int idDoAdministradorQueCadastrouProduto) {
        this.idcadastroProduto = idcadastroProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.tipoProduto = tipoProduto;
        this.descricaoProduto = descricaoProduto;
        this.marcaProduto = marcaProduto;
        this.valorCompraProduto = valorCompraProduto;
        this.valorVendaProduto = valorVendaProduto;
        this.codigoBarrasProduto = codigoBarrasProduto;
        this.idDoAdministradorQueCadastrouProduto = idDoAdministradorQueCadastrouProduto;
    }
    public CadastroProduto(int idcadastroProduto, String nomeProduto, String quantidadeProduto, String tipoProduto, String descricaoProduto, String marcaProduto, String pesoKgProduto, String valorCompraProduto, String valorVendaProduto, byte[] imagemProduto, String codigoBarrasProduto, int idDoAdministradorQueCadastrouProduto) {
       this.idcadastroProduto = idcadastroProduto;
       this.nomeProduto = nomeProduto;
       this.quantidadeProduto = quantidadeProduto;
       this.tipoProduto = tipoProduto;
       this.descricaoProduto = descricaoProduto;
       this.marcaProduto = marcaProduto;
       this.pesoKgProduto = pesoKgProduto;
       this.valorCompraProduto = valorCompraProduto;
       this.valorVendaProduto = valorVendaProduto;
       this.imagemProduto = imagemProduto;
       this.codigoBarrasProduto = codigoBarrasProduto;
       this.idDoAdministradorQueCadastrouProduto = idDoAdministradorQueCadastrouProduto;
    }
   
    public int getIdcadastroProduto() {
        return this.idcadastroProduto;
    }
    
    public void setIdcadastroProduto(int idcadastroProduto) {
        this.idcadastroProduto = idcadastroProduto;
    }
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getQuantidadeProduto() {
        return this.quantidadeProduto;
    }
    
    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    public String getTipoProduto() {
        return this.tipoProduto;
    }
    
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }
    
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public String getMarcaProduto() {
        return this.marcaProduto;
    }
    
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    public String getPesoKgProduto() {
        return this.pesoKgProduto;
    }
    
    public void setPesoKgProduto(String pesoKgProduto) {
        this.pesoKgProduto = pesoKgProduto;
    }
    public String getValorCompraProduto() {
        return this.valorCompraProduto;
    }
    
    public void setValorCompraProduto(String valorCompraProduto) {
        this.valorCompraProduto = valorCompraProduto;
    }
    public String getValorVendaProduto() {
        return this.valorVendaProduto;
    }
    
    public void setValorVendaProduto(String valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }
    public byte[] getImagemProduto() {
        return this.imagemProduto;
    }
    
    public void setImagemProduto(byte[] imagemProduto) {
        this.imagemProduto = imagemProduto;
    }
    public String getCodigoBarrasProduto() {
        return this.codigoBarrasProduto;
    }
    
    public void setCodigoBarrasProduto(String codigoBarrasProduto) {
        this.codigoBarrasProduto = codigoBarrasProduto;
    }
    public int getIdDoAdministradorQueCadastrouProduto() {
        return this.idDoAdministradorQueCadastrouProduto;
    }
    
    public void setIdDoAdministradorQueCadastrouProduto(int idDoAdministradorQueCadastrouProduto) {
        this.idDoAdministradorQueCadastrouProduto = idDoAdministradorQueCadastrouProduto;
    }




}


