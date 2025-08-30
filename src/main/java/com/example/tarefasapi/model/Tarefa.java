package com.example.tarefasapi.model;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String NomeDaTarefa;
	private String DataEntrega;
	private String Responsavel;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDaTarefa() {
		return NomeDaTarefa;
	}
	public void setNomeDaTarefa(String NomeDaTarefa) {
		this.NomeDaTarefa = NomeDaTarefa;
	}
	public String getDataEntrega() {
		return DataEntrega;
	}
	public void setDataEntrega(String DataEntrega) {
		this.DataEntrega = DataEntrega;
	}
	public String getResponsavel() {
		return Responsavel;
	}
	public void setResponsavel(String Responsavel) {
		this.Responsavel = Responsavel;
	}
	@Override
	public String toString() {
		return "Contato [id=" + id + ", NomeDaTarefa=" + NomeDaTarefa + ", DataEntrega=" + DataEntrega + ", Responsavel=" + Responsavel + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(DataEntrega, Responsavel, id, NomeDaTarefa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(DataEntrega, other.DataEntrega) && Objects.equals(Responsavel, other.Responsavel) && Objects.equals(id, other.id)
				&& Objects.equals(NomeDaTarefa, other.NomeDaTarefa);
	}
	
}
