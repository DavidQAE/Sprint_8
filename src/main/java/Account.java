public class Account {
    private final String name;

    public Account(String name) {

        this.name = name;
    }

    public boolean checkNameToEmboss() {
        String[] parts = name.split("  ");
        int firstSpace = name.indexOf(' ');
        int lastSpace = name.lastIndexOf(' ');

        if(name.length() < 3 || name.length() > 19){
              return false;

          }

          else if (!name.equals(name.trim())) {
                return false;
        }

          else if (parts.length >= 2) {
              return false;
          }
          else if (firstSpace == -1 || firstSpace != lastSpace) {
            return false;
        }

          else  {
              return true;

          }

    }
}
