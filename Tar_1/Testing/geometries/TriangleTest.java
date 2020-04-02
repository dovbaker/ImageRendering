package geometries;

import org.junit.jupiter.api.Test;
import primitives.Point3D;
import primitives.Vector;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testGetNormal() {
        Triangle pl1 =new Triangle(
                new Point3D(0.0,0.0,1.0),
                new Point3D(0.0,1.0,0.0),
                new Point3D(1.0,0.0,0.0));
        Vector v1=pl1.getNormal(new Point3D(0,0,0));

        Triangle pl2 =new Triangle(
                new Point3D(0.0,1.0,0.0),
                new Point3D(1.0,0.0,0.0),
                new Point3D(0.0,0.0,1.0));
        Vector v2=pl2.getNormal(new Point3D(0,0,0));

        Triangle pl3 =new Triangle(
                new Point3D(1.0,0.0,0.0),
                new Point3D(0.0,1.0,0.0),
                new Point3D(0.0,0.0,1.0));
        Vector v3=pl3.getNormal(new Point3D(0,0,0));

        assertEquals(v1,v2);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        assertNotEquals(v1,v3);
    }
}