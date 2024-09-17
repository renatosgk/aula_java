import java.util.Objects;

public class ProdutoDigital extends Produto {
    private String linkDowload;
    private String formatoArquivo;

    public ProdutoDigital() {
    }

    public ProdutoDigital(String nome, double preco, String descricao, int quantidade, String linkDowload, String formatoArquivo) {
        super(nome, preco, descricao, quantidade);
        this.linkDowload = linkDowload;
        this.formatoArquivo = formatoArquivo;
    }

    public String getLinkDowload() {
        return linkDowload;
    }

    public void setLinkDowload(String linkDowload) {
        this.linkDowload = linkDowload;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoDigital that = (ProdutoDigital) o;
        return Objects.equals(getLinkDowload(), that.getLinkDowload()) && Objects.equals(getFormatoArquivo(), that.getFormatoArquivo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLinkDowload(), getFormatoArquivo());
    }

    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "linkDowload='" + linkDowload + '\'' +
                ", formatoArquivo='" + formatoArquivo + '\'' +
                "} " + super.toString();
    }
}
