package model;

import org.uqbar.commons.model.annotations.Observable;
import org.uqbar.commons.model.annotations.Transactional;

@Transactional
@Observable
@SuppressWarnings("all")
public class Tareas {
  private String nombreTarea;
  
  private Boolean Realizado;
}
