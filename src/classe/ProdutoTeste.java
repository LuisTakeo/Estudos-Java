package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 1999.99);
		
		var p2 = new Produto();
		p2.nome = "Mochila";
		p2.preco = 159.00;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
                
                Produto.desconto = 0.35;
		
		double precoFinal1 = p1.calculaDesconto();
                System.out.printf("O preço do %s é de R$%.2f.",
                        p1.nome, precoFinal1);
		double precoFinal2 = p2.calculaDesconto();
                System.out.printf("O preço do %s é de R$%.2f.",
                        p2.nome,precoFinal2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("A m�dia de valores � de R$%.2f\n", mediaCarrinho);
	}
}
