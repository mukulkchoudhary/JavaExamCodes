class Cube extends ThreeDObject {
    public Cube(double side) {
        dim1 = side;
        dim2 = side;
        dim3 = side;
    }
    
    double wholeSurfaceArea() {
        return 6 * dim1 * dim1;
    }
    
    double volume() {
        return dim1 * dim1 * dim1;
    }
}
