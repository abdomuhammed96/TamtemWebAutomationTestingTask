package pages.HomePage;

public class HomePageLogic extends HomePageAbstract {

    public HomePageLogic() {
        super();
    }


    @Override
    public void clickOnElementOnHomePage(String arg0) {
        switch (arg0) {
            case "Open Registration Page":
                clickOnElement(RegistrationButton);
                break;
            case "Open Games Page":
                clickOnElement(GamesTab);
                break;
            case "Open VIPTarneeb":
                clickOnElement(VIPTarneeb);
                break;

            default:
        }
    }


}
