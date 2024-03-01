import java.util.Scanner;
class Patient{
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private int medicalCard;
    public String diagnose;

    public Patient(String lastName, String firstName, String middleName, String address, int medicalCard, String diagnose){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.medicalCard = medicalCard;
        this.diagnose = diagnose;
    }

    public void printInfo() {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Адрес: " + address);
        System.out.println("Номер медицинской карты: " + medicalCard);
        System.out.println("Диагноз: " + diagnose);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient[] patients = new Patient[3];
        patients[0] = new Patient("Воронов", "Иван", "Яковлевич", "ул. Пушкина, 1", 5, "Астма");
        patients[1] = new Patient("Иванов", "Петр", "Харитонович", "ул. Пушкина, 2", 90, "Ангина");
        patients[2] = new Patient("Новиков", "Алексей", "Владимирович", "ул. Пушкина, 3", 79, "Грипп");
        System.out.println("Диагноз: ");
        String diagnoss = scanner.next();

        System.out.println("Пациенты с диагнозом \"" + diagnoss + "\":");
        for (Patient patient : patients) {
            if (patient.diagnose.equals(diagnoss)) {
                patient.printInfo();
            }
        }
    }
}