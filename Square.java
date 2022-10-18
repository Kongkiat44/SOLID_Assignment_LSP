public class Square extends Rectangle{
    Square(int side) {
        this.setSide(side);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    //method getArea() following logic of square that all sides of square are equal
    /*
    @Override
    public int getArea() {
        if (super.getWidth() != super.getHeight()){
            throw new ArithmeticException("Height and Width of the Square is not equal. Please set width and height in equal value");
        }
        else {
            return super.getWidth()*super.getHeight();
        }
    }*/
}
