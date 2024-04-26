package c22491452;

import MusicVis.MyVisual;

public class spiral {

    MyVisual mv;

    public spiral(MyVisual mv) {
        this.mv = mv;
    }

    public void render() {
        float distance = 500;
        int numPointsPerFrame = 20; // Adjust this value to control the number of points drawn per frame

        float r = mv.random(256);
        float g = mv.random(256);
        float b = mv.random(256);
        float cChange = 3;
        double distanceChange = 0.01;

        for (float angle = 0; angle < 400 * numPointsPerFrame; angle += 0.3) {
            float x = mv.width / 2 + mv.cos(mv.radians(angle)) * distance;
            float y = mv.height / 2 + mv.sin(mv.radians(angle)) * distance;

            r += mv.random(-cChange, cChange);
            r = mv.constrain(r, 255, 255);

            g += mv.random(-cChange, cChange);
            g = mv.constrain(g, 255, 255);

            b += mv.random(-cChange, cChange);
            b = mv.constrain(b, 255, 255);

            mv.stroke(r, g, b);
            mv.point(x, y);

            distance += distanceChange;
        }
    }
}
