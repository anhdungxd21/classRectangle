public class Rectangle {
    double width, height;
    Rectangle(){

    }

    Rectangle(double width, double _height){
        this.width = width;
        this.height = _height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
    public void setWidth(double width1){
        width = width1;
    }
    public String display(){
        return "Rectangle{"+"width="+ width + ", height=" + height + "}";
    }
}
