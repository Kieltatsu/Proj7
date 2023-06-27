package Mod7;

public class TestCarro {
    /**
     * O metedo retorna os dados de Carro
     * @param args valores do sisterma
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro ();

        meuCarro.setCor("PRETO");
        meuCarro.setTipo("PASSEIO");
        meuCarro.setPlaca("GKK-1212");
        meuCarro.setNumPortas(4);

        System.out.println("------CARRO-------");
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Portas: " + meuCarro.getNumPortas());




    }
}
