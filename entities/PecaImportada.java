package entities;

public class PecaImportada extends Peca {
	
		protected double taxaImportacao;
		protected double taxaFrete;
		
		public PecaImportada() {
			// TODO Auto-generated constructor stub
		}

		public PecaImportada(String nome,double custo,double lucro,double taxaImportacao, double taxaFrete) {
			super(nome,custo,lucro);
			this.taxaImportacao = taxaImportacao;
			this.taxaFrete = taxaFrete;
		}
		
		public double calculoTaxaImportacao(double taxaImportacao) {
			return taxaImportacao = (getCusto() + getLucro()) * 0.10;
		}
		public double calculoTaxaFrete(double taxaFrete) {
			return taxaFrete = (getCusto() + getLucro()) * 0.15;
		}
		public double calculoPrecoTotal() {
			return (getCusto() + getLucro() + calculoTaxaFrete(taxaFrete) + calculoTaxaImportacao(taxaImportacao));
		}
		
		public void exibir() {
			super.exibir();
			System.out.println("Taxa de Importação: " + calculoTaxaImportacao(taxaImportacao));
			System.out.println("Taxa de Frete: " + calculoTaxaFrete(taxaFrete));
			System.out.println("Preço total: " + calculoPrecoTotal() );
		}
		public double getTaxaImportacao() {
			return taxaImportacao;
       }

		public void setTaxaImportacao(double taxaImportacao) {
			this.taxaImportacao = taxaImportacao;
		}

		public double getTaxaFrete() {
			return taxaFrete;
		}

		public void setTaxaFrete(double taxaFrete) {
			this.taxaFrete = taxaFrete;
		}
		
}
