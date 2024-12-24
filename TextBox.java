public class TextBox {
    String text = ""; // it is a field
    /* To prevent program from crashing or raising null pointer exception we must
        initialize each field to some value
    */
    public void setText(String text){ // methods
        this.text = text;
        /* "this" keyword is pointer to object , it is used to differentiate betweeen
            the parameter variable of method and field of class when both have same
            name
        */
    }
    public void clear(){
        text = "";
    }
}
