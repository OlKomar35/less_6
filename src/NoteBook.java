public class NoteBook {
    private int id = 0;
    private String brand;
    private int ram;
    private int hddSize;
    private String os;
    private String color;

    public NoteBook(String brand, int ram, int hddSize, String os, String color) {
        this.id++;
        this.brand = brand;
        this.ram = ram;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ноутбук[ " +
                "Фирма: " + brand +
                ", ОЗУ: " + ram +"ГБ"+
                ", Объем ЖД: " + hddSize +"ГБ"+
                ", ОС: " + os +
                ", цвет: " + color +
                ']';
    }
}
