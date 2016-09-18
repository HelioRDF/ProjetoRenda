package br.com.projetorenda.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//A anotação diz que a classe não corresponde a uma tabela do Hibernate, mas vai ser usada por outras classes.
@MappedSuperclass 
@SuppressWarnings("serial")
public class GenericDomain implements Serializable {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long codigo;



public Long getCodigo() {
	return codigo;
}

public void setCodigo(Long codigo) {
	this.codigo = codigo;
}	




}
