package model

import org.uqbar.commons.model.annotations.Transactional
import org.uqbar.commons.model.annotations.Observable

@Transactional
@Observable
class Tareas {
	String nombreTarea
	Boolean Realizado
	
}