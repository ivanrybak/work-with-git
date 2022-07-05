public class Something {
  private   String shape;
    private String color;
  private int age;

    public Something(String shape, String color, int age) {
        this.shape = shape;
        this.color = color;
      this.age=age;
      

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
   public int getAge() {
        return age;
    }
 void See(){
    System.out.println(color+"\n  " + shape+"\n "+ age);
}

}


