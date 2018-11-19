public class NameParser{
    public static T parse(String name, Creator creator) {
        String[] tokens = name.split(" ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        return creator.create(firstName, lastName);
    }
}
