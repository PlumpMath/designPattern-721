package createPattern.factoryMethodPattern_2;

public class FileLoggerFactory implements LoggerFactory{

	public Logger createLogger() {  
        //�����ļ���־��¼������  
        Logger logger = new FileLogger();   
        //�����ļ�������ʡ��  
        return logger;  
}   
}
