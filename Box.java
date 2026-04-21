class Box extends ThreeDObject {
    public Box(double length, double width, double height) {
        dim1 = length;
        dim2 = width;
        dim3 = height;
    }
    
    double wholeSurfaceArea() {
        return 2 * ((dim1 * dim2) + (dim2 * dim3) + (dim3 * dim1));
    }
    
    double volume() {
        return dim1 * dim2 * dim3;
    }
}
