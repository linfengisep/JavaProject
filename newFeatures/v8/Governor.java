import java.time.LocalDate;

public class Governor {

    public String name;
    public LocalDate birthday;
    public Sex gender;

    public Governor(LocalDate birthday, Sex sex, String name){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Governor a, Governor b) {
        return a.birthday.compareTo(b.birthday);
    }

    static enum Sex {
        MALE,
        FEMALE
    }

    public static boolean isFamousName(String name){
        return name == "Napoleon";
    }

    public boolean isChirac(String name){
        return name == "Chirac";
    }
}
