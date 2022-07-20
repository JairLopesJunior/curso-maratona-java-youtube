package com.youtube.maratonajava.Npolimorfismo.dominio;

import com.youtube.maratonajava.Npolimorfismo.dominio.repository.Repositorio;
import com.youtube.maratonajava.Npolimorfismo.dominio.service.RepositorioArquivoService;
import com.youtube.maratonajava.Npolimorfismo.dominio.service.RepositorioBancoDeDadosService;
import com.youtube.maratonajava.Npolimorfismo.dominio.service.RepositorioMemoriaService;

public class RepositorioMain {

    public static void main(String[] args) {
        Repositorio repositorioBancoDeDadosService = new RepositorioArquivoService();
        Repositorio repositorioBancoDeDadosService2 = new RepositorioBancoDeDadosService();
        Repositorio repositorioBancoDeDadosService3 = new RepositorioMemoriaService();
        repositorioBancoDeDadosService.salvar();
        repositorioBancoDeDadosService2.salvar();
        repositorioBancoDeDadosService3.salvar();
    }
}
