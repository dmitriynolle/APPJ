package HW4;

public class Main {
    public static void main(String[] args) {
        String text = "Здесь находится какой то текст !!!";
        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource());
        encoded.writeData(text);
        DataSource plain = new FileDataSource();

        System.out.println("Input data");
        System.out.println(text);
        System.out.println("Encoded data");
        System.out.println(plain.readData());
        System.out.println("Decoded data");
        System.out.println(encoded.readData());
    }
}
