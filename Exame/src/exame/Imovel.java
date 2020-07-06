
package exame;

/**
 *
 * @author Sergio
 */
public class Imovel extends FormCadastro{
    private String nome;
    private String categoria;
    private String tipo;
    private String descricao;
    private String valor;
      
    public Imovel(){
    }
    
    public Imovel(String nome, String categoria, String tipo, String descricao, String valor) {
        this.nome = nome;
        this.categoria = categoria;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Imovel{" + "nome=" + nome + ", categoria=" + categoria + ", tipo=" + tipo + ", descricao=" + descricao + ", valor=" + valor + '}';
    }
}

