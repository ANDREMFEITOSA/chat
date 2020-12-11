package prova1b;

import static java.util.Arrays.copyOf;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nome;
	
	private List<Mensagem> mensagens;
	private List<Participante> participantes;
	
	public Grupo(String nome) {
		this.nome = nome;
		this.mensagens = new ArrayList<>();
		this.participantes = new ArrayList<>();
	}
	
	public void addicionarParticipante(Participante p) {
		// exce��o participante repetido
		this.participantes.add(p);
		
	}
	
	public boolean removerParticipante(Participante p) {
		// exce��o participante inexistente
		boolean participanteExiste = participantes.remove(p);
		
		return participanteExiste;
	}
	
	public void enviarMensagem(Mensagem m) {
		//exce��o mensagem nula
		this.mensagens.add(m);
	}
	
	public String getNome() {
		return this.nome;
	}
	public List getParticipantes() {
		return this.participantes;
	}
	
	public List getMensagens() {
		return this.mensagens;
	}
}
