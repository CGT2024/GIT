public class CadastroDeCarros {
    public static void main(String[] args) {

        Carros carro1 = new Carros();
        carro1.modelo = "Focus GLS";
        carro1.anofabrica = 2018;
        carro1.tipo = "Automovel";

        Carros carro2 = new Carros();
        carro2.modelo = "New Blazer GLS ";
        carro2.anofabrica = 2020;
        carro2.tipo = "Camionete";

        Montadora montadora1 = new Montadora();
        montadora1.nome = "Ford";
        montadora1.endereco = "Rua das Caravelas 201 - Bairro dos Peixes";
        montadora1.telefone = 22224456;

        Montadora montadora2 = new Montadora();
        montadora2.nome = "Chevrolet";
        montadora2.endereco = "Rua das Flores 2101 - Bairro Novo";
        montadora2.telefone = 56224656;

        Concessionaria concessionaria1 = new Concessionaria();
        concessionaria1.nome = "FordModelos";
        concessionaria1.endereco = "Rua da Roda 234 - Bairro Virabreqim";
        concessionaria1.telefone = 5645656;

        Concessionaria concessionaria2 = new Concessionaria();
        concessionaria2.nome = "Mais Chev";
        concessionaria2.endereco = " Av dos Ingleses 60 - Bairro Franca";
        concessionaria2.telefone = 51234656;

        carro1.mostraInfo();
        montadora1.mostraInfo();
        concessionaria1.mostraInfo();

        carro2.mostraInfo();
        montadora2.mostraInfo();
        concessionaria2.mostraInfo();
    }
}
