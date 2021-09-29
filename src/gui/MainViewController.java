package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemAjuda;
	
	@FXML
	public void onMenuItemVendedorAction()
	{
		System.out.println("Menu item vendedor");
	}
	
	@FXML
	public void onMenuItemDepartamentoAction()
	{
		System.out.println("Menu item departamento");
	}
	
	@FXML
	public void onMenuItemSaidaAction()
	{
		System.out.println("Menu item saida");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
}
