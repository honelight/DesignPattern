package flyWeight;

import java.awt.*;
import java.util.HashMap;

public class RectFactory {
    private static final HashMap<Color, MyRect> rectByColor = new HashMap<Color, MyRect>();

    public static MyRect getRect(Color color){
        MyRect rect = (MyRect)rectByColor.get(color);
        if(rect==null){
            rect = new MyRect(color);
            rectByColor.put(color, rect);
        }
        return rect;
    }
}
