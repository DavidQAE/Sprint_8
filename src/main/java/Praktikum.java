public class Praktikum {
    public static void main(String[] args) {
        String nameSurname = "Тимофей луговой";
        Account account = new Account(nameSurname);
        boolean canEmboss = account.checkNameToEmboss();
        System.out.println("Можно ли использовать имя \"" + nameSurname + "\" для печати на карте? " + (canEmboss ? "Да" : "Нет"));
    }

}
