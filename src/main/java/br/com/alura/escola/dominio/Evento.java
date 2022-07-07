package br.com.alura.escola.dominio;

import java.time.LocalDateTime;

/**
 * Interface comum a todos os eventos
 */
public interface Evento {

	LocalDateTime momento();
}
