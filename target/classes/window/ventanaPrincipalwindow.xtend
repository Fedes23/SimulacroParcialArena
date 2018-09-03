package window

import model.Tareas
import model.ventanaPrincipalModel
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.MainWindow

import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.bindings.NotNullObservable
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.layout.ColumnLayout

class ventanaPrincipalwindow extends MainWindow<ventanaPrincipalModel>{
	
	new (ventanaPrincipalModel model){
			super(model)
		}
		
		static def void main(String[] arg) {
		new ventanaPrincipalwindow(new ventanaPrincipalModel).startApplication
	}
		
		override createContents(Panel mainPanel){
			this.title = "TO DO List"
			
		val primerRenglon = new Panel (mainPanel)	
			primerRenglon.layout = new ColumnLayout(2)
			new TextBox(primerRenglon) =>[
				value <=> "tareaNueva"
				 width= 120
				
			]
			new Button(primerRenglon) =>[
				
				caption  ='Agregar Tarea'
			//	onClick  [this.agregarTarea()]
			]
			new TextBox(primerRenglon) =>[
				value <=> "tareaNueva"
				width = 120
			
			]
			new Button(primerRenglon) => [
	//		val elementoSeleccionado =  new NotNullObservable('tareaSeleccionada')
				caption ="EditarTarea"
				//onClick [this.editarTarea()]
	//			bindEnabled(tareaSeleccionada)
			]
			
		val segundoRenglon = new Panel(mainPanel)
		
	/* 	val grilla = new Table<Tareas>(segundoRenglon,typeof (Tareas)) =>[
			items <=> 'resultados'
			value <=> 'tareaSeleccionada'
			
			new Column<Tareas>(it) => [
				title = 'Tarea'
				bindContentsToProperty('nombreTarea')
			]
			new Column<Tareas>(it) =>[
				title = 'Hecho'
				bindContentsToProperty('Realizado')
			]
			]	*/	
		val tercerRenglon = new Panel(mainPanel)
			
			new Button(tercerRenglon) =>[
				caption = 'Hacer/Deshacer'
			//	onClick[this.hacerODeshacer]	
			]
		
		
		
		
		}


	/*def agregarTarea(){
	
		new agregarTareawindow(this, new agregarTareaModel).open		
	}
*/
}