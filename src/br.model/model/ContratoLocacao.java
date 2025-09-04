package br.model;

import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private float valorTotal;
    private Status status;
    private List<Locacao> listaLocacao;
    private Funcionario funcionario;
    private Cliente cliente;

    
}