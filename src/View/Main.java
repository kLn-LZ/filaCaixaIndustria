package View;

import Controller.OperacaoController;
import Model.Cliente;
import Model.Fila;

public class Main {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        OperacaoController OC = new OperacaoController();
        for(int i = 1; i <= 20; i++) {

            Cliente cliente = new Cliente();
            cliente.nome = "Cliente" + i;
            cliente.quantidadePecas = (int) (Math.random() * 51) + 20;
            cliente.valorPecas = (float) (Math.random() * 101.00) + 5;
            fila.insert(cliente);
        }

        OC.Caixa(fila);



    }
}
