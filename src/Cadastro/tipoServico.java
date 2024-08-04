package Cadastro;

public class tipoServico {
    private String servico;
    private String descricaoServico;
    private int valorServico;
    private String dataEmissaoOS;
    private String dataEntrega;

    public tipoServico(String servico, String descricaoServico, int valorServico, String dataEmissaoOS, String dataEntrega) {
        this.servico = servico;
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
        this.dataEmissaoOS = dataEmissaoOS;
        this.dataEntrega = dataEntrega;
    }
}
