package window;

import model.ventanaPrincipalModel;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class ventanaPrincipalwindow extends MainWindow<ventanaPrincipalModel> {
  public ventanaPrincipalwindow(final ventanaPrincipalModel model) {
    super(model);
  }
  
  public static void main(final String[] arg) {
    ventanaPrincipalModel _ventanaPrincipalModel = new ventanaPrincipalModel();
    new ventanaPrincipalwindow(_ventanaPrincipalModel).startApplication();
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("TO DO List");
    final Panel primerRenglon = new Panel(mainPanel);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    primerRenglon.setLayout(_columnLayout);
    TextBox _textBox = new TextBox(primerRenglon);
    final Procedure1<TextBox> _function = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "tareaNueva");
        it.setWidth(120);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function);
    Button _button = new Button(primerRenglon);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Tarea");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
    TextBox _textBox_1 = new TextBox(primerRenglon);
    final Procedure1<TextBox> _function_2 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "tareaNueva");
        it.setWidth(120);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_2);
    Button _button_1 = new Button(primerRenglon);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("EditarTarea");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    final Panel segundoRenglon = new Panel(mainPanel);
    final Panel tercerRenglon = new Panel(mainPanel);
    Button _button_2 = new Button(tercerRenglon);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Hacer/Deshacer");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_4);
  }
}
