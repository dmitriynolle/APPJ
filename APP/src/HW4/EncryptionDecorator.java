package HW4;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        return ("зашифровано " + data);
    }

    private String decode(String data) {
        String[] text = data.split(" ", 2);
        return ("расшифровано " + text[1]);
    }
}
