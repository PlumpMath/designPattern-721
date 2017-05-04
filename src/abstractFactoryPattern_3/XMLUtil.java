package abstractFactoryPattern_3;

import javax.xml.parsers.*;  
import org.w3c.dom.*;  
import java.io.*; 

public class XMLUtil {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������  
	public static Object getBean() {  
        try {  
            //����DOM�ĵ�����  
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();  
            DocumentBuilder builder = dFactory.newDocumentBuilder();  
            Document doc;                             
            doc = builder.parse(new File("source/config.xml"));   

            //��ȡ�����������ı��ڵ�  
            NodeList nl = doc.getElementsByTagName("class");  
            Node classNode=nl.item(0).getFirstChild();  
            String cName=classNode.getNodeValue();  

            //ͨ����������ʵ�����󲢽��䷵��  
            Object obj=Class.forName(cName).newInstance();  
            return obj;  
        }     
        catch(Exception e) {  
            e.printStackTrace();  
            return null;  
         }  
    }  
}