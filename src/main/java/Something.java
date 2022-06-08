public class Something {
  private   String shape;
    private String color;

    public Something(String shape, String color) {
        this.shape = shape;
        this.color = color;

    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 void See(){
    System.out.println(color+"\n  " + shape);
}

}


