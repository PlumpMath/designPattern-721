package abstractFactoryPattern_3;

//����Ƥ�������ӿڣ����󹤳�
public interface SkinFactory {

	public Button createButton();  
    public TextField createTextField();  
    public ComboBox createComboBox(); 
}
