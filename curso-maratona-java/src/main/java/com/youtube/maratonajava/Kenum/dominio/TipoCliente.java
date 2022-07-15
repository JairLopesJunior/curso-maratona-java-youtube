package com.youtube.maratonajava.Kenum.dominio;

import java.util.Arrays;
import java.util.Optional;

public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        TipoCliente tipoCliente = Arrays.stream(values())
                .filter(tpCliente -> tpCliente.getNomeRelatorio().equals(nomeRelatorio))
                .findFirst()
                .orElse(null);
        return tipoCliente;
    }

    public int valor;
    public String nomeRelatorio;

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
