package Window;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL;


public abstract class Window {

    long window;
    int width;
    int height;

    public void createWindow(int width, int height, int state, String name) {
        this.width = width;
        this.height = height;
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(state, GLFW_TRUE);
        window = glfwCreateWindow(width, height, name, 0, 0);
        glfwMakeContextCurrent(window);
        glfwMakeContextCurrent(window);
        glfwShowWindow(window);
        GL.createCapabilities();
    }

    public long getWindow() {return window;}
}
