package model;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.annotations.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class ventanaPrincipalModel {
  private String tareaNueva;
  
  private String Resultados;
  
  @Pure
  public String getTareaNueva() {
    return this.tareaNueva;
  }
  
  public void setTareaNueva(final String tareaNueva) {
    this.tareaNueva = tareaNueva;
  }
  
  @Pure
  public String getResultados() {
    return this.Resultados;
  }
  
  public void setResultados(final String Resultados) {
    this.Resultados = Resultados;
  }
}
