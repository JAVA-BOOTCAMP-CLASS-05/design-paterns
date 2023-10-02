package estructural.decorator;

public class Demo {

	public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSource compressedEncoding = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("OutputDemo.txt")));
        compressedEncoding.writeData(salaryRecords);
 
        DataSource encodingCompressed = new EncryptionDecorator(
                new CompressionDecorator(
                    new FileDataSource("OutputDemo2.txt")));
        
        encodingCompressed.writeData(salaryRecords);
        
        DataSource plain = new FileDataSource("OutputDemo.txt");
        DataSource plain2 = new FileDataSource("OutputDemo2.txt");
        
        System.out.println("- Datos ejemplo ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encryptados y Comprimidos --------------");
        System.out.println(plain.readData());
        System.out.println("- Comprimidos y Encryptados --------------");
        System.out.println(plain2.readData());
        System.out.println("- Desencriptados y descomprimidos --------------");
        System.out.println(compressedEncoding.readData());
        System.out.println("-  Descomprimidos y desencriptados  --------------");
        System.out.println(encodingCompressed.readData());
    }

}
