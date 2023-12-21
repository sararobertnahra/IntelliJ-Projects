public class Produto {
        private String id;
        private double precoCompra;
        private double precoVenda;
        private int quantidadeEstoque;
        public Produto (String id, double precoCompra, double precoVenda, int quantidadeEstoque) {
            this.id = id;
            this.precoCompra = precoCompra;
            this.precoVenda = precoVenda;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public String getId(){
            return id;
        }
        public double getPrecoCompra(){
            return precoCompra;
        }
        public double getPrecoVenda(){
            return precoVenda;
        }
        public int getQuantidadeEstoque(){
            return quantidadeEstoque;
        }
        public void setQuantidadeEstoque(int quantidadeEstoque) {
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public interface AcaoLeitura {
            void ler();
            void assinar();
        }
        public class Livro extends Produto implements AcaoLeitura{
            private String autor;
            private String titulo;
            private int numeroPaginas;
            public Livro(String id, double precoCompra, double precoVenda, int quantidadeEstoque, String autor, String titulo, int numeroPaginas){
                super (id, precoCompra, precoVenda, quantidadeEstoque);
                this.autor = autor;
                this.titulo = titulo;
                this.numeroPaginas = numeroPaginas;
            }
            public void ler(){
                System.out.println("Lendo o livro: " + titulo);
            }

            public void assinar() {
                System.out.println("Assinatura do autor: " + autor);
            }
        }
        public class Caderno extends Produto {
            private int numeroFolhas;
            private String tipoCapa;
            private double dimensao;
            public Caderno(String id, double precoCompra, double precoVenda, int quantidadeEstoque, int numeroFolhas, String tipoCapa, double dimensao){
                super(id, precoCompra, precoVenda, quantidadeEstoque);
                this.numeroFolhas = numeroFolhas;
                this.tipoCapa = tipoCapa;
                this.dimensao = dimensao;
            }
        }
        public class Jogos extends Produto {
            private int quantidadePecas;
            private int classificacaoIdade;
            private String genero;
            private String nome;
            public Jogos (String id, double precoCompra, double precoVenda, int quantidadeEstoque, int quantidadePecas, int classificacaoIdade, String genero, String nome){
                super (id, precoCompra, precoVenda, quantidadeEstoque);
                this.quantidadePecas = quantidadePecas;
                this.classificacaoIdade = classificacaoIdade;
                this.genero = genero;
                this.nome = nome;
            }
        }
        public class Canetas extends Produto {
            private String modelo;
            private String marca;

            private int tamanho;
            private String cor;
            private String tipo;
            public Canetas (String id, double precoCompra, double precoVenda, int quantidadeEstoque, String modelo, String marca, int tamanho, String cor, String tipo){
                super (id, precoCompra, precoVenda, quantidadeEstoque);
                this.modelo = modelo;
                this.marca = marca;
                this.tamanho = tamanho;
                this.cor = cor;
                this.tipo = tipo;
            }
        }
        public class TestarImplementacao {
            public void testar(String[] args) {
                Livro livro = new Livro("1", 25.0, 50.0, 10, "Sara", "Polimeros", 260);
                livro.ler();
                livro.assinar();
            }
        }
}
