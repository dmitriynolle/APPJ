package HW4;

public class FileDataSource implements DataSource {
    private static String name;

    @Override
    public void writeData(String data) {
       //запись файла
        name = data;
    }

    @Override
    public String readData() {
        // чтение из файла
        return "записано " + name;
    }
}
