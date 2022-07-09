package br.com.alura.escola.shared.dominio.evento;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * Interface comum a todos os eventos
 */
public interface Evento {

	LocalDateTime momento();
	TipoDeEvento tipo();
	Map<String, Object> informacoes();
}
