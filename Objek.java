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
       
       gl.glPushMatrix();
        gl.glTranslatef(0f, 1.7f, -2.8f);
        gl.glRotatef(-90, 0, 0, 1);
        baling(gl);
        gl.glTranslatef(0f, 0f, 2.5f);
        gl.glRotatef(-90, 1, 0, 0);
        gl.glRotatef(90, 0, 0, 1);
        baling(gl);
        gl.glPopMatrix();
    }

    static void ruangkendali(GL gl) {
         gl.glBegin(GL.GL_POLYGON); //sisi depan
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(1f, 0.5f, 0.4f);
        gl.glVertex3f(-2f, 0.5f, 0.4f);
        gl.glVertex3f(-1f, -0.5f, 0.4f);
        gl.glVertex3f(1f, -0.5f, 0.4f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi blkg
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(1f, 0.5f, -0.4f);
        gl.glVertex3f(-2f, 0.5f, -0.4f);
        gl.glVertex3f(-1f, -0.5f, -0.4f);
        gl.glVertex3f(1f, -0.5f, -0.4f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi dpn a
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(1f, 0.5f, 0.4f);
        gl.glVertex3f(1f, 0.5f, -0.4f);
        gl.glVertex3f(1f, -0.5f, -0.4f);
        gl.glVertex3f(1f, -0.5f, 0.4f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi dpn b
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(-1f, -0.5f, 0.4f);
        gl.glVertex3f(-1f, -0.5f, -0.4f);
        gl.glVertex3f(-2f, 0.5f, -0.4f);
        gl.glVertex3f(-2f, 0.5f, 0.4f);
        gl.glEnd();
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
        gl.glRotatef(90, 0, 0, 1);

        double clip_plane1[] = {0.0, 0.0, -2.0, 0.5};
        gl.glClipPlane(GL.GL_CLIP_PLANE1, clip_plane1, 0);
        gl.glEnable(GL.GL_CLIP_PLANE1);
        glu.gluSphere(q, 0.15, SLICES, STACKS);
        glu.gluDeleteQuadric(q);
        gl.glDisable(GL.GL_CLIP_PLANE1);
        gl.glTranslatef(0f, 0f, 0f);
        glu.gluDisk(q, 0f, 0.15, SLICES, STACKS);
        glu.gluCylinder(q, 0.08, 0.08, 0.3, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.3f);
        glu.gluDisk(q, 0.0f, 0.4, SLICES, STACKS);
        glu.gluCylinder(q, 0.4, 0.4, 0.3, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.3f);
        glu.gluCylinder(q, 0.4, 0.3, 0.2, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.2f);
        glu.gluCylinder(q, 0.3, 0.2, 0.11, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.11f);
        glu.gluCylinder(q, 0.2, 0.1, 0.1, SLICES, STACKS);
        gl.glTranslatef(0f, 0f, 0.055f);
        glu.gluSphere(q, 0.11, SLICES, STACKS);
        glu.gluDeleteQuadric(q);

        batangkipas(gl);
    }

    static void kipas(GL gl) {

    }

    static void batangkipas(GL gl) {
        gl.glRotatef(90, 1, 0, 0);
        gl.glTranslatef(0f, -0.5f, 0f);
        float amb[] = {0.2f, 0.2f, 0.8f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        float BODY_LENGTH = 0.9f;
        float BODY_RADIUS = 0.05f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }

    static void sirip1(GL gl) {
         gl.glBegin(GL.GL_POLYGON); //Kotak dpn
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glVertex3f(0.0f, -1.5f, 0.2f);
        gl.glVertex3f(0.0f, 1.5f, 0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //Kotak blkg
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glVertex3f(0.0f, -1.5f, -0.2f);
        gl.glVertex3f(0.0f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi dpn
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(2f, 0, 0.2f);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi blkg
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glVertex3f(2f, 0, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi atas kotak
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(0f, 1.5f, 0.2f);
        gl.glVertex3f(0f, 1.5f, -0.2f);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi bawah kotak
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glVertex3f(0f, -1.5f, 0.2f);
        gl.glVertex3f(0f, -1.5f, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi atas miring
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0f, 1.5f, 0.2f);
        gl.glVertex3f(2f, 0f, 0.2f);
        gl.glVertex3f(2f, 0f, -0.2f);
        gl.glVertex3f(0f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi bawah miring
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0f, -1.5f, 0.2f);
        gl.glVertex3f(2f, 0f, 0.2f);
        gl.glVertex3f(2f, 0f, -0.2f);
        gl.glVertex3f(0f, -1.5f, -0.2f);
        gl.glEnd();
    }
   
   static void sirip2(GL gl) {
         gl.glBegin(GL.GL_POLYGON); //Kotak dpn
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glVertex3f(0.0f, -1.5f, 0.2f);
        gl.glVertex3f(0.0f, 1.5f, 0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //Kotak blkg
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glVertex3f(0.0f, -1.5f, -0.2f);
        gl.glVertex3f(0.0f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi dpn
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(2f, 0, 0.2f);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi blkg
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glVertex3f(2f, 0, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi atas kotak
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, 1.5f, 0.2f);
        gl.glVertex3f(0f, 1.5f, 0.2f);
        gl.glVertex3f(0f, 1.5f, -0.2f);
        gl.glVertex3f(0.5f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi bawah kotak
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0.5f, -1.5f, 0.2f);
        gl.glVertex3f(0f, -1.5f, 0.2f);
        gl.glVertex3f(0f, -1.5f, -0.2f);
        gl.glVertex3f(0.5f, -1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi atas miring
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0f, 1.5f, 0.2f);
        gl.glVertex3f(2f, 0f, 0.2f);
        gl.glVertex3f(2f, 0f, -0.2f);
        gl.glVertex3f(0f, 1.5f, -0.2f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_POLYGON); //sisi bawah miring
        gl.glColor3f(1, 1, 1);
        gl.glVertex3f(0f, -1.5f, 0.2f);
        gl.glVertex3f(2f, 0f, 0.2f);
        gl.glVertex3f(2f, 0f, -0.2f);
        gl.glVertex3f(0f, -1.5f, -0.2f);
        gl.glEnd();
   }
    
    static void movement(GL gl) {

    }
}
