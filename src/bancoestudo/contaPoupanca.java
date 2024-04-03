/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bancoestudo;

/**
 *
 * @author ianin
 */
public class contaPoupanca extends conta {

   

    public contaPoupanca(String cpf, double depositoInicial) {
        super(cpf, depositoInicial);
    }

    @Override
    public void atualizar(double taxa){
        //saldo += taxa;
        rendimentosMensais += (getRendimentosMensais()+taxa);
        System.out.println(getRendimentosMensais()+getSaldo());
    }
        
    @Override
    public String tipoConta() {
        return "Conta Poupança";
    }
    
    // RA: 0040482221028 || Ian Francisco Roland do Nascimento
  
}
