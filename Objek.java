package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {
   
    static void balon(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glRotatef(90, 0, 1, 0);

        double clip_plane1[] = {0.0, 0.0, -2.0, 0.5};
        gl.glClipPlane(GL.GL_CLIP_PLANE1, clip_plane1, 0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
        glu.gluSphere(q, 0.5, SLICES, STACKS);
        glu.gluDeleteQuadric(q);
        gl.glDisable(GL.GL_CLIP_PLANE1);

        //cylinder = depan/belakang/panjang/detail/detail
//        glu.gluCylinder(q, 0, 0.2, 0.2, SLICES, STACKS);
//        gl.glTranslatef(0f, 0f, 0.2f);
//        glu.gluCylinder(q, 0.2, 0.5, 0.5, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, -0.15f);
        glu.gluCylinder(q, 0.5, 0.7, 0.4, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.4f);
        glu.gluCylinder(q, 0.7, 0.9, 0.7, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.7f);
        glu.gluCylinder(q, 0.9, 1.1, 1.1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1.1f);
//        glu.gluCylinder(q, 1.1, 1.3, 1.6, SLICES, STACKS);
//        gl.glTranslatef(0f, 0f, 1.6f);
        glu.gluCylinder(q, 1.1, 1.1, 2, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 2f);
        glu.gluCylinder(q, 1.1, 1, 1.3, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1.3f);
        glu.gluCylinder(q, 1, 0.8, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1f);
        glu.gluCylinder(q, 0.8, 0.6, 0.8, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.8f);
        glu.gluCylinder(q, 0.6, 0.4, 0.6, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.6f);
        glu.gluCylinder(q, 0.4, 0.2, 0.4, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.3f);

        glu.gluSphere(q, 0.2, SLICES, STACKS);
        glu.gluDeleteQuadric(q);
    }

    static void ruangkendali(GL gl) {

    }

    static void baling(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glRotatef(90, 0, 1, 0);

        double clip_plane1[] = {0.0, 0.0, -2.0, 0.5};
        gl.glClipPlane(GL.GL_CLIP_PLANE1, clip_plane1, 0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
        glu.gluSphere(q, 1, SLICES, STACKS);
        glu.gluDeleteQuadric(q);
        gl.glDisable(GL.GL_CLIP_PLANE1);
        gl.glTranslatef(0f, 0f, 0.25f);
        glu.gluDisk(q, 0.0f, 1, SLICES, STACKS);
        glu.gluCylinder(q, 0.7, 0.7, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1f);
        glu.gluDisk(q, 0.0f, 2, SLICES, STACKS);
        glu.gluCylinder(q, 2, 2, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1f);
        glu.gluCylinder(q, 2, 1.7, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1f);
        glu.gluCylinder(q, 1.7, 1.3, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 1f);
        glu.gluCylinder(q, 1.3, 0.8, 1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.75f);
        glu.gluSphere(q, 0.8, SLICES, STACKS);
        glu.gluDeleteQuadric(q);
    }
    
    static void kipas(GL gl) {

    }
    
    static void batangkipas(GL gl) {

    }

    static void sirip(GL gl) {

    }
    
    static void movement(GL gl) {

    }
}