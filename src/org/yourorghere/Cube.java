/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author licence
 */
public class Cube {


    public Cube(GL gl){
    // Draw A Quad
        gl.glBegin(GL.GL_QUADS);
                 gl.glColor3f(1f,0f,0f); //red color
      gl.glVertex3f( 0.5f, 0.5f, -0.5f); // Top Right Of The Quad (Top)
      gl.glVertex3f( -0.5f, 0.5f, -0.5f); // Top Left Of The Quad (Top)
      gl.glVertex3f( -0.5f, 0.5f, 0.5f ); // Bottom Left Of The Quad (Top)
      gl.glVertex3f( 0.5f, 0.5f, 0.5f ); // Bottom Right Of The Quad (Top)
		
      gl.glColor3f( 0f,1f,0f ); //green color
      gl.glVertex3f( 0.5f, -0.5f, 0.5f ); // Top Right Of The Quad
      gl.glVertex3f( -0.5f, -0.5f, 0.5f ); // Top Left Of The Quad
      gl.glVertex3f( -0.5f, -0.5f, -0.5f ); // Bottom Left Of The Quad
      gl.glVertex3f( 0.5f, -0.5f, -0.5f ); // Bottom Right Of The Quad 

      gl.glColor3f( 0f,0f,1f ); //blue color
      gl.glVertex3f( 0.5f, 0.5f, 0.5f ); // Top Right Of The Quad (Front)
      gl.glVertex3f( -0.5f, 0.5f, 0.5f ); // Top Left Of The Quad (Front)
      gl.glVertex3f( -0.5f, -0.5f, 0.5f ); // Bottom Left Of The Quad
      gl.glVertex3f( 0.5f, -0.5f, 0.5f ); // Bottom Right Of The Quad 

      gl.glColor3f( 1f,1f,0f ); //yellow (red + green)
      gl.glVertex3f( 0.5f, -0.5f, -0.5f ); // Bottom Left Of The Quad
      gl.glVertex3f( -0.5f, -0.5f, -0.5f ); // Bottom Right Of The Quad
      gl.glVertex3f( -0.5f, 0.5f, -0.5f ); // Top Right Of The Quad (Back)
      gl.glVertex3f( 0.5f, 0.5f, -0.5f ); // Top Left Of The Quad (Back)

      gl.glColor3f( 1f,0f,1f ); //purple (red + green)
      gl.glVertex3f( -0.5f, 0.5f, 0.5f ); // Top Right Of The Quad (Left)
      gl.glVertex3f( -0.5f, 0.5f, -0.5f ); // Top Left Of The Quad (Left)
      gl.glVertex3f( -0.5f, -0.5f, -0.50f ); // Bottom Left Of The Quad
      gl.glVertex3f( -0.5f, -0.5f, 0.5f ); // Bottom Right Of The Quad 

      gl.glColor3f( 0f,1f, 1f ); //sky blue (blue +green)
      gl.glVertex3f( 0.5f, 0.5f, -0.5f ); // Top Right Of The Quad (Right)
      gl.glVertex3f( 0.5f, 0.5f, 0.5f ); // Top Left Of The Quad
      gl.glVertex3f( 0.5f, -0.5f, 0.5f ); // Bottom Left Of The Quad
      gl.glVertex3f( 0.5f, -0.5f, -0.5f ); // Bottom Right Of The Quad
      gl.glEnd(); // Done Drawing The Quad
      gl.glFlush();
		

        gl.glEnd();
    }
}
