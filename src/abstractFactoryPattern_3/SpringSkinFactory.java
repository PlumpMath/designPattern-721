package abstractFactoryPattern_3;

//SpringƤ�����������幤��
public class SpringSkinFactory implements SkinFactory{

	 public Button createButton() {  
	        return new SpringButton();  
	    }  

	    public TextField createTextField() {  
	        return new SpringTextField();  
	    }  

	    public ComboBox createComboBox() {  
	        return new SpringComboBox();  
	    }  
}
