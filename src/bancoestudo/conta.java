package bancoestudo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ianin
 */
public abstract class conta {
      
    private String cpf;
    double saldo;
    private double depositoInicial;
    private double saquesMensal;
    private double depositosMensal;
    
    private double rendimentosMensais;
    private double jurosMensais;
    
    // CONSTRUTORES  /////////////////////

    public conta(String cpf,double depositoInicial){
        if(cpf == null || depositoInicial <= 0){
            System.out.println("Dados Inválidos para Criar a conta\nSeu Depósito Inicial deve ser maior que 0\nSeu CPF precisa Existir");
        }
        else{
        this.depositosMensal = 0.0;
        this.saquesMensal = 0.0;
        this.cpf=cpf;
        this.saldo=depositoInicial;
        this.rendimentosMensais = 0.0;
        this.jurosMensais = 0.0;
        }
    }
    
    // GETTERS AND SETTERS ///////////////

    public double getSaquesMensal() {
        return saquesMensal;
    }

    public void setSaquesMensal(double saquesMensal) {
        this.saquesMensal = saquesMensal;
    }

    public double getDepositosMensal() {
        return depositosMensal;
    }

    public void setDepositosMensal(double depositosMensal) {
        this.depositosMensal = depositosMensal;
    }
    
    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }
    
     public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendimentosMensais() {
        return rendimentosMensais;
    }

    public void setRendimentosMensais(double rendimentosMensais) {
        this.rendimentosMensais = rendimentosMensais;
    }

    public double getJurosMensais() {
        return jurosMensais;
    }

    public void setJurosMensais(double jurosMensais) {
        this.jurosMensais = jurosMensais;
    }
    
    
    
    
    
    // MÉTODOS ///////////////////////////
   
    
    public void depositar(Double valor){
        if(valor > 0) {
            
            System.out.println("Seu depósito foi realizado com sucesso!!");
            
            setDepositosMensal(getDepositosMensal() + valor);
            setSaldo(getSaldo() + valor);
        }
        else{
            System.out.println("Não foi possivel realizar seu depósito!!"); 
        }
        
    }
    
    // -------------------------------------------------------------------
        
    public boolean sacar(Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            
            System.out.println("Seu saque foi realizado com sucesso!!");
            
            setSaquesMensal(getSaquesMensal() + valor);
            setSaldo(getSaldo() - valor);
            
            return true;
        }
        else{
            
            System.out.println("Não foi possivel realizar o saque!!");
            
            return false;
        }
  
    }
        
    // -------------------------------------------------------------------
    
    public abstract void atualizar(double taxa);
      
    public abstract String tipoConta();
   
    // ------------------------------------------------------------------
    
    public void demonstrativo(){
        System.out.println("\n\t TIPO DA CONTA: " + tipoConta() +
                "\n\t Juros / Rendimentos acumulados: " + (rendimentosMensais + jurosMensais) + 
                "\n\t Saldo Atual: " + getSaldo() +
                "\n\t Saldo Futuro: " + (getSaldo() + rendimentosMensais));
        
    }
    
    // -----------------------------------------------------------------
    
    private void zerarAcumuladores(){
        
        rendimentosMensais = 0.0;
        jurosMensais = 0.0;
        depositosMensal = 0.0;
        saquesMensal = 0.0;
        
    }
    
    
    private void fecharMes(){
        
        zerarAcumuladores();
        atualizarSaldoRendimentosJuros();
        
    }
    
    // ----------------------------------------------------------------
    
    public void atualizarSaldoRendimentosJuros(){
            
        if (saldo >= 0) {
            saldo += rendimentosMensais;
        } else {
            saldo -= jurosMensais;
        }
        
    }
    
    // RA : 0040482221028 || Ian Francisco Roland do Nascimento
    
    
  
    
    
}
