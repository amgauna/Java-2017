Classe usuário

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {
    private static final long serialVersionUID = -309513637403441998L;
    private Long id;
    private Date dataCadastro;
    private String nome;
    private String frase;

    public Long getId() {
		return id;
	}
    
	public void setId(Long id) {
		this.id = id;
	}
    
	public Date getDataCadastro() { 
		return dataCadastro;
	}

    public void setDataCadastro(Date dataCadastro) { 
		this.dataCadastro = dataCadastro;
	}
    
	public String getNome() { 
		return nome;
	}
    
	public void setNome(String nome) { 
		this.nome = nome;
	}

    public String getFrase() {
		return frase;
	}
    
	public void setFrase(String frase) { 
		this.frase = frase;
	}

    @Override public String toString() { 
		return "Usuario [nome=" + nome + ", frase=" + frase + ", dataCadastro=" + dataCadastro + " id=" + id + "]";
	}
}
