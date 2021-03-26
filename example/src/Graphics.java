public final class Graphics {
    private OpenGL gl;
    ...

    public void clear(float r, float g, float b, float a) {
        this.gl.clearScreen(a, r, g, b);
    }
}
