package med.voll.api.Model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.DTO.EnderecoDTO;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco { 

	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String cidade;
	private String uf;
	
	public Endereco (EnderecoDTO enderecoDTO) {
		this.logradouro = enderecoDTO.logradouro();
		this.bairro = enderecoDTO.bairro();
		this.cep = enderecoDTO.cep();
		this.numero = enderecoDTO.numero();
		this.complemento = enderecoDTO.complemento();
		this.cidade = enderecoDTO.cidade();
		this.uf = enderecoDTO.uf();
	}

	public void atualizarEndereco(EnderecoDTO enderecoDTO) {
        if (enderecoDTO.logradouro() != null) {
            this.logradouro = enderecoDTO.logradouro();
        }
        if (enderecoDTO.bairro() != null) {
            this.bairro = enderecoDTO.bairro();
        }
        if (enderecoDTO.cep() != null) {
            this.cep = enderecoDTO.cep();
        }
        if (enderecoDTO.uf() != null) {
            this.uf = enderecoDTO.uf();
        }
        if (enderecoDTO.cidade() != null) {
            this.cidade = enderecoDTO.cidade();
        }
        if (enderecoDTO.numero() != null) {
            this.numero = enderecoDTO.numero();
        }
        if (enderecoDTO.complemento() != null) {
            this.complemento = enderecoDTO.complemento();
        }
	}
	
}