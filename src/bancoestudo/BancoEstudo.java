/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancoestudo;

/**
 *
 * @author ianin
 */
public class BancoEstudo {

    public static void main(String[] args) {
        
        // Criar contas
        contaCorrente conta1 = new contaCorrente("12345678900", 1000.00 , 100.00);
        contaPoupanca conta2 = new contaPoupanca("98765432100", 500.00);

        // Realizar operações nas contas
        conta1.depositar(200.00);
        conta1.sacar(100.00);
        conta2.depositar(150.00);
        conta2.sacar(100.00);

        // Atualizar as contas
        
        conta1.atualizar(1.00); 
        conta2.atualizar(2.00); 
        
        // Exibir demonstrativos das contas
        conta1.demonstrativo();
        conta2.demonstrativo();
        
        // Fechar o mês para as contas
        conta1.fecharMes();
        conta2.fecharMes(); 
        
        //
        
       
    }
    
}

// RA: 0040482221028 || Ian Francisco Roland do Nascimento
