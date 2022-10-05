public class Main {
    public static void main(String[] args) {

        ApplicationProperties applicationProperties = ApplicationProperties.getInstance();

        System.out.println(String.format("Nome: %s , CreationDate: %s", applicationProperties.getName(), applicationProperties.getCreationDate() ));
    }
}
