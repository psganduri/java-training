package labs;


    public class TenDigitsException extends Exception {
        String num;

        TenDigitsException(String num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return (num + "Phone number is not 10 digits.");
        }
    }


