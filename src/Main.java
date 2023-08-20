import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<NoteBook> noteBooks = new HashSet<>();

        noteBooks.add(new NoteBook("Honor", 8, 1000, "Win 11", "черный"));
        noteBooks.add(new NoteBook("Apple", 16, 512, "macOS", "золотой"));
        noteBooks.add(new NoteBook("HP", 12, 2000, "Win 10", "серебряный"));
        noteBooks.add(new NoteBook("Honor", 64, 2000, "Win 11", "черный"));
        noteBooks.add(new NoteBook("Asus", 8, 1000, "Win 10", "белый"));

        filterNoteBook(noteBooks);
    }

    private static void filterNoteBook(Set<NoteBook> noteBooks) {
        Map<String, String> criteria = new HashMap<>();
        criteria.put("1", "ОЗУ");
        criteria.put("2", "Объем ЖД");
        criteria.put("3", "ОС");
        criteria.put("4", "Цвет");


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру соответсвующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        String numInput = sc.nextLine();

        if (criteria.containsKey(numInput)) {
            String selectedCriteria = criteria.get(numInput);
            System.out.println("Введите минимальное значение для " + selectedCriteria);
            String minVal = sc.nextLine();


            Set<NoteBook> filter = new HashSet<>();
            switch (selectedCriteria) {
                case "ОЗУ":
                    int minRam = Integer.parseInt(minVal);
                    for (NoteBook nb : noteBooks) {
                        if (nb.getRam() >= minRam) {
                            filter.add(nb);
                        }
                    }
                    break;
                case "Объем ЖД":
                    int ninHddSize = Integer.parseInt(minVal);
                    for (NoteBook nb : noteBooks) {
                        if (nb.getHddSize() >= ninHddSize) {
                            filter.add(nb);
                        }
                    }
                    break;
                case "Операционная система":
                    for (NoteBook nb : noteBooks) {
                        if (nb.getOs().equalsIgnoreCase(minVal)) {
                            filter.add(nb);
                        }
                    }
                    break;
                case "Цвет":
                    for (NoteBook nb : noteBooks) {
                        if (nb.getColor().equalsIgnoreCase(minVal)) {
                            filter.add(nb);
                        }
                    }
                    break;
                default:
                    System.out.println("Введен не верный критерий");
                    return;
            }

            if (filter.isEmpty()) {
                System.out.println("Ноутбуков удовлетворяющих введенным критериям не найдено");
            } else {
                for (NoteBook nb : filter) {
                    System.out.println(nb);
                }
            }
        } else {
            System.out.println("Не корректный ввод критерия");
        }
    }
}