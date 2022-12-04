package src.com.bilibili.shopping;

public class bankCardFactory {
    public bankCard getCard(String bankcard) {

        if(bankcard.equalsIgnoreCase("AgriculturalBankCard")) {
            return new agriculturalBankCard();
        }
        else if(bankcard.equalsIgnoreCase("CommunicationsBankCard")) {
            return new communicationsBankCard();
        }
        else if(bankcard.equalsIgnoreCase("ChinaBankCard")) {
            return new chinaBankCard();
        }
        return null;

    }
}
