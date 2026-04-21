class Cylinder extends ThreeDObject {
    public Cylinder(double radius, double height) {
        dim1 = radius;
        dim2 = height;
        dim3 = 0;
    }
    
    double wholeSurfaceArea() {
        return (2 * 3.14159 * dim1 * dim1) + (2 * 3.14159 * dim1 * dim2);
    }
    
    double volume() {
        return 3.14159 * dim1 * dim1 * dim2;
    }
}
