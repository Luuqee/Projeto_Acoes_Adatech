package plasmus777.github.com.projetoAcoesAdatech.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

import plasmus777.github.com.projetoAcoesAdatech.model.ativoFinanceiro.Acao;

public class AcaoDTO implements DTO<AcaoDTO, Acao> {

    @NotNull(message = "O código de negociação não pode ser nulo.")
    @Pattern(regexp = "^[A-Z0-9]{1,5}$", message = "O código de negociação deve conter apenas letras e números, com até 5 caracteres.")
    @Size(min = 1, max = 5, message = "O código de negociação deve ter entre 1 a 5 caracteres.")
    private String codigoNegociacao;

    @NotNull(message = "A quantidade de ações não pode ser nula.")
    @Min(value = 1, message = "A quantidade deve ser pelo menos 1.")
    private Integer quantidade;

    @NotNull(message = "O nome não pode ser nulo.")
    @Size(min = 1, max = 100, message = "O nome deve ter no máximo 100 caracteres.")
    private String nome;

    @NotNull(message = "O preço atual não pode ser nulo.")
    @Min(value = 0, message = "O preço atual deve ser maior ou igual a 0.")
    private BigDecimal precoAtual;

    @NotNull(message = "O preço de compra não pode ser nulo.")
    @Min(value = 0, message = "O preço de compra deve ser maior ou igual a 0.")
    private BigDecimal precoCompra;

    @NotNull(message = "A data de cadastro não pode ser nula.")
    private LocalDate dataCadastro;

    @NotNull(message = "O usuário não pode ser nulo.")
    @Size(min = 1, max = 50, message = "O usuário deve ter no máximo 50 caracteres.")
    private String usuario;

    @NotNull(message = "O preço mínimo não pode ser nulo.")
    @Min(value = 0, message = "O preço mínimo deve ser maior ou igual a 0.")
    private BigDecimal precoMinimo;

    @NotNull(message = "O preço máximo não pode ser nulo.")
    @Min(value = 0, message = "O preço máximo deve ser maior ou igual a 0.")
    private BigDecimal precoMaximo;

    public AcaoDTO(String codigoNegociacao, Integer quantidade, String nome, BigDecimal precoAtual, BigDecimal precoCompra, LocalDate dataCadastro, String usuario, BigDecimal precoMinimo, BigDecimal precoMaximo) {
        this.codigoNegociacao = codigoNegociacao;
        this.quantidade = quantidade;
        this.nome = nome;
        this.precoAtual = precoAtual;
        this.precoCompra = precoCompra;
        this.dataCadastro = dataCadastro;
        this.usuario = usuario;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }

    public AcaoDTO() {
    }

    public String getCodigoNegociacao() {
        return codigoNegociacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPrecoAtual() {
        return precoAtual;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public String getUsuario() {
        return usuario;
    }

    public BigDecimal getPrecoMinimo() {
        return precoMinimo;
    }

    public BigDecimal getPrecoMaximo() {
        return precoMaximo;
    }

    public void setCodigoNegociacao(String codigoNegociacao) {
        this.codigoNegociacao = codigoNegociacao;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoAtual(BigDecimal precoAtual) {
        this.precoAtual = precoAtual;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPrecoMinimo(BigDecimal precoMinimo) {
        this.precoMinimo = precoMinimo;
    }

    public void setPrecoMaximo(BigDecimal precoMaximo) {
        this.precoMaximo = precoMaximo;
    }

    @Override
    public Acao toEntity() {
        Acao acao = new Acao();
        acao.setCodigoNegociacao(this.codigoNegociacao);
        acao.setQuantidade(this.quantidade);
        acao.setNome(this.nome);
        acao.setPrecoAtual(this.precoAtual);
        acao.setPrecoCompra(this.precoCompra);
        acao.setDataCadastro(this.dataCadastro);
        acao.setUsuario(this.usuario);
        acao.setPrecoMinimo(this.precoMinimo);
        acao.setPrecoMaximo(this.precoMaximo);
        return acao;
    }

    @Override
    public AcaoDTO fromEntity(Acao acao) {
        if (acao == null) {
            return null;
        }
        AcaoDTO dto = new AcaoDTO();
        dto.setCodigoNegociacao(acao.getCodigoNegociacao());
        dto.setQuantidade(acao.getQuantidade());
        dto.setNome(acao.getNome());
        dto.setPrecoAtual(acao.getPrecoAtual());
        dto.setPrecoCompra(acao.getPrecoCompra());
        dto.setDataCadastro(acao.getDataCadastro());
        dto.setUsuario(acao.getUsuario());
        dto.setPrecoMinimo(acao.getPrecoMinimo());
        dto.setPrecoMaximo(acao.getPrecoMaximo());
        return dto;
    }
}
