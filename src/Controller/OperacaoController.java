package Controller;

import Model.Cliente;
import Model.Fila;

public class OperacaoController {


    public OperacaoController() {
        super();
    }


    public void Caixa(Fila fila) throws Exception {

        while(!fila.isEmpty()) {
            Cliente cliente = (Cliente) fila.remove();

            System.out.println("O valor total da compra do cliente " + cliente.nome + " é de: R$" + (float) (cliente.valorPecas * cliente.quantidadePecas));
        }
    }



}
