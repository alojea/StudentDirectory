public enum Gender {
    MALE('M'),
    FEMALE('F');

    private char charValue;

    Gender(char charValue) {
        this.charValue = charValue;
    }


    public char getCharValue() {
        return charValue;
    }

}
