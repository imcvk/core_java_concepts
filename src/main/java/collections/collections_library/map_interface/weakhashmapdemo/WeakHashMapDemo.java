package collections.collections_library.map_interface.weakhashmapdemo;


import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();

        imageCache.put("img3", new Image("img3"));
        imageCache.put("img4", new Image("img4"));
        System.out.println(imageCache);
        System.gc();
        simulateAppRun();
        System.out.printf("image cache after running gc: %s%n", imageCache);
    }

    public static void simulateAppRun() {

    }
}

class Image {
    String name;

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image() {
    }

    public Image(String name) {
        this.name = name;
    }
}
