package HW3;

public class Card {
    String cardNumber;
    String ownerName;
    String ownerSurname;

    public class CardValidator{
        String cardNumber;
        String cardType;
        boolean isOwned;
        boolean validity;
        int cvv;
        CardValidator(String cardNumber, String cardType, boolean isOwned, boolean validity, int cvv){
            this.cardNumber = cardNumber;
            this.cardType = cardType;
            this.isOwned = isOwned;
            this.validity = validity;
            this.cvv = cvv;
        }
        public String getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public String getCardType() {
            return cardType;
        }

        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

        public boolean getIsOwned() {
            return isOwned;
        }

        public void setOwned(boolean owned) {
            isOwned = owned;
        }

        public boolean getValidity() {
            return validity;
        }

        public void setValidity(boolean validity) {
            this.validity = validity;
        }

        public int getCvv() {
            return cvv;
        }

        public void setCvv(int cvv) {
            this.cvv = cvv;
        }

        public String validate (CardValidator cardToVal){
            int len = cardToVal.getCardNumber().replace(" ","").length();
            if (len == 16 &&
                    (cardToVal.getCardType().equals("Visa") || cardToVal.getCardType().equals("Mastercard")) &&
                    cardToVal.getIsOwned() &&
                    cardToVal.getValidity() &&
                    (cardToVal.getCvv() > 0 && cardToVal.getCvv() <= 999)
            ){
                return "VALID !";
            }
            else {
                return "NOT VALID !";
            }
        }

    }

    public static void main(String[] args) {
        Card someCard = new Card();
        Card.CardValidator cardToVal = someCard.new CardValidator("888       55155 9999    7777", "Visa", true, true, 222);
        System.out.println(cardToVal.validate(cardToVal));
    }
}
