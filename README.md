Projeto Hierarquia de Classes: Peça e Peça Importada
Descrição
Este projeto implementa uma hierarquia de classes em Java para representar peças utilizadas na montagem de equipamentos eletrônicos, como computadores.

Classe base (superclasse): Peca
Representa uma peça genérica com os atributos nome, custo e lucro.
Possui métodos para calcular o preço da peça (custo + lucro) e exibir seus dados.

Classe derivada (subclasse): PecaImportada
Extende a classe Peca e adiciona os atributos taxaImportacao e taxaFrete.
O cálculo do preço inclui estas taxas extras além do custo e lucro da peça.
Também sobrescreve o método de exibição para mostrar todas as informações.

Funcionalidades
Construtores para inicialização dos objetos

Métodos getters e setters para todos os atributos

Método para cálculo do preço final da peça

Método para exibir os detalhes completos da peça

Testes
No método main da classe TestePeca, foram criadas instâncias de Peca e PecaImportada para demonstrar o funcionamento dos métodos.
