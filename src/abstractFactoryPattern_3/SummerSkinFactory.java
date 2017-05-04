package abstractFactoryPattern_3;

//SummerƤ�����������幤��
public class SummerSkinFactory implements SkinFactory{

	 public Button createButton() {  
	        return new SummerButton();  
	    }  

	    public TextField createTextField() {  
	        return new SummerTextField();  
	    }  

	    public ComboBox createComboBox() {  
	        return new SummerComboBox();  
	    }  
}
