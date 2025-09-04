package br.model;

import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;
    private List<Ocorrencia> listaOcorrencias;
    private Veiculo veiculo;

    
}