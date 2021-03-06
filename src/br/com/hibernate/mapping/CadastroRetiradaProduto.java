package br.com.hibernate.mapping;
// Generated 27/03/2018 12:11:49 by Hibernate Tools 4.3.1



/**
 * CadastroRetiradaProduto generated by hbm2java
 */
public class CadastroRetiradaProduto  implements java.io.Serializable {


     private int idcadastroRetiradaProduto;
     private String codigoBarrasRetiradaProduto;
     private String quantidadeRetiradaProduto;
     private String dataValidadeRetiradaProduto;
     private String valorUnitarioRetiradaProduto;
     private String localRetiradaProduto;
     private int idAdministradorRetiradaProduto;
     private String motivosRetiradaProduto;
     private String dataRetiradaProduto;
     private String horaRetiradaProduto;

    public CadastroRetiradaProduto() {
    }

    public CadastroRetiradaProduto(int idcadastroRetiradaProduto, String codigoBarrasRetiradaProduto, String quantidadeRetiradaProduto, String dataValidadeRetiradaProduto, String valorUnitarioRetiradaProduto, String localRetiradaProduto, int idAdministradorRetiradaProduto, String motivosRetiradaProduto, String dataRetiradaProduto, String horaRetiradaProduto) {
       this.idcadastroRetiradaProduto = idcadastroRetiradaProduto;
       this.codigoBarrasRetiradaProduto = codigoBarrasRetiradaProduto;
       this.quantidadeRetiradaProduto = quantidadeRetiradaProduto;
       this.dataValidadeRetiradaProduto = dataValidadeRetiradaProduto;
       this.valorUnitarioRetiradaProduto = valorUnitarioRetiradaProduto;
       this.localRetiradaProduto = localRetiradaProduto;
       this.idAdministradorRetiradaProduto = idAdministradorRetiradaProduto;
       this.motivosRetiradaProduto = motivosRetiradaProduto;
       this.dataRetiradaProduto = dataRetiradaProduto;
       this.horaRetiradaProduto = horaRetiradaProduto;
    }
   
    public int getIdcadastroRetiradaProduto() {
        return this.idcadastroRetiradaProduto;
    }
    
    public void setIdcadastroRetiradaProduto(int idcadastroRetiradaProduto) {
        this.idcadastroRetiradaProduto = idcadastroRetiradaProduto;
    }
    public String getCodigoBarrasRetiradaProduto() {
        return this.codigoBarrasRetiradaProduto;
    }
    
    public void setCodigoBarrasRetiradaProduto(String codigoBarrasRetiradaProduto) {
        this.codigoBarrasRetiradaProduto = codigoBarrasRetiradaProduto;
    }
    public String getQuantidadeRetiradaProduto() {
        return this.quantidadeRetiradaProduto;
    }
    
    public void setQuantidadeRetiradaProduto(String quantidadeRetiradaProduto) {
        this.quantidadeRetiradaProduto = quantidadeRetiradaProduto;
    }
    public String getDataValidadeRetiradaProduto() {
        return this.dataValidadeRetiradaProduto;
    }
    
    public void setDataValidadeRetiradaProduto(String dataValidadeRetiradaProduto) {
        this.dataValidadeRetiradaProduto = dataValidadeRetiradaProduto;
    }
    public String getValorUnitarioRetiradaProduto() {
        return this.valorUnitarioRetiradaProduto;
    }
    
    public void setValorUnitarioRetiradaProduto(String valorUnitarioRetiradaProduto) {
        this.valorUnitarioRetiradaProduto = valorUnitarioRetiradaProduto;
    }
    public String getLocalRetiradaProduto() {
        return this.localRetiradaProduto;
    }
    
    public void setLocalRetiradaProduto(String localRetiradaProduto) {
        this.localRetiradaProduto = localRetiradaProduto;
    }
    public int getIdAdministradorRetiradaProduto() {
        return this.idAdministradorRetiradaProduto;
    }
    
    public void setIdAdministradorRetiradaProduto(int idAdministradorRetiradaProduto) {
        this.idAdministradorRetiradaProduto = idAdministradorRetiradaProduto;
    }
    public String getMotivosRetiradaProduto() {
        return this.motivosRetiradaProduto;
    }
    
    public void setMotivosRetiradaProduto(String motivosRetiradaProduto) {
        this.motivosRetiradaProduto = motivosRetiradaProduto;
    }
    public String getDataRetiradaProduto() {
        return this.dataRetiradaProduto;
    }
    
    public void setDataRetiradaProduto(String dataRetiradaProduto) {
        this.dataRetiradaProduto = dataRetiradaProduto;
    }
    public String getHoraRetiradaProduto() {
        return this.horaRetiradaProduto;
    }
    
    public void setHoraRetiradaProduto(String horaRetiradaProduto) {
        this.horaRetiradaProduto = horaRetiradaProduto;
    }




}


