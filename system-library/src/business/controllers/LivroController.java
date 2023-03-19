package business.controllers;

import Business.Model.Obra;
import Business.Service.LivroService;
import business.repositories.RepositorioDeObras;

    public class LivroController {

        private LivroService livroService;
        private RepositorioDeObras deObras;

        public LivroController(RepositorioDeObras a) {
            this.deObras = a;
            //this.livroService = livroService;
        }

        public boolean cadastrarObra(String nome, String titulo, String autor, int anoPublicacao, String tipoObra) {
            Obra obra = new Obra(nome, titulo, autor, anoPublicacao, tipoObra);
            return livroService.cadastrarObra(obra);
        }

        public boolean excluirLivro(int id) {
            return livroService.excluirLivro(id);
        }

        public Obra pesquisarObra(String Titulo) {
            return livroService.pesquisarObra(Titulo);
        }

        public boolean atualizarObra(int id, String nome, String titulo, String autor, int anoPublicacao, String tipoObra) {
            Obra obra = new Obra(id, nome, titulo, autor, anoPublicacao, tipoObra);
            return livroService.atualizarObra(obra);
        }


}
