package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
        Produto(String nomeProduto, double precoProduto){
            nome = nomeProduto;
            preco = precoProduto;
        }
        Produto(){
        }
	
        double calculaDesconto() {
		return preco * (1 - desconto);
	}
        
}
