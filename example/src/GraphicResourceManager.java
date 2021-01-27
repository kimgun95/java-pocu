public class GraphicResourceManager {
    private static GraphicResourceManager instance;

    public static GraphicResourceManager getInstance() {
        assert  (instance != null) : "instance was not created before get()";
        return instance;
    }
    public static void createInstance(FileLoader loader, GraphicsDevice gfxDevice) {
        assert (instance == null) "do not create instance twice";

        instance = new GraphicResourceManager(loader, gfxDevice);
    }
    public static void deleteInstance() {
        assert (instance != null) "do not delete instance";

        instance = null;
    }
}
