class Cone extends ThreeDObject {
    public Cone(double radius, double height) {
        dim1 = radius;
        dim2 = height;
        dim3 = 0;
    }
    
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt((dim1 * dim1) + (dim2 * dim2));
        return 3.14159 * dim1 * (dim1 + slantHeight);
    }
    
    double volume() {
        return (3.14159 * dim1 * dim1 * dim2) / 3;
    }
}
