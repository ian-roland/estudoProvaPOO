/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoestudo;

/**
 *
 * @author ianin
 */

public class contaCorrente extends conta {
    
    private double limiteChequeEspecial;
    
    // CONSTRUTOR ////////////////////////////////////
    
    public contaCorrente(String cpf, double depositoInicial , double limiteChequeEspecial){
        super(cpf, depositoInicial);
        if(limiteChequeEspecial == 0.0){
            System.out.println("Limite de Cheque Especial Inválido!!");
        }
        else{
        
            this.limiteChequeEspecial = limiteChequeEspecial;
        
        }
        
    }

    @Override
    public void atualizar(double taxa){
        if(super.getSaldo() < 0){
           // saldo -= taxa;
            jurosMensais += getJurosMensais() + taxa;
        }
    }
    
    @Override
    public String tipoConta(){
        
        return "Conta Corrente";
        
    }
    
    // ---------------------------------------------------------------
    
    public boolean Sacar(double valor){
        if(valor <= 0){
            System.out.println("Saque Inválido!!");
            return false;
        }
        else{
            
        double saldoDisponivel = saldo + limiteChequeEspecial;
        
            if(valor < saldoDisponivel){
                
                setSaquesMensal(getSaquesMensal() + valor);
                saldo -= valor;
                return true;
                
   
            }
            else{
                
                System.out.println("Saldo Indisponivel!!");
                return false;
            
            }
        
        }
    }
    
    // -----------------------------------------------------------
    
    // RA: 0040482221028 || Ian Francisco Roland do Nascimento
 
}
