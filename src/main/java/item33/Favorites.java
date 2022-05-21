package item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.*;

public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<T> type, Object instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));
    }

    public <T> T getFavorites(Class<T> type) {
        return type.cast(favorites.get(type));
    }

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorites((Class)Integer.class, "Integer의 인스턴스가 아닙니다.");
        int favoriteInteger = f.getFavorites(Integer.class);

        AnnotatedElement ae;
    }

    static void superTypeToken() {
        Favorites f = new Favorites();
        List<String> pets = Arrays.asList("개", "고양이", "앵무");

        //f.putFavorites(new TypeRef<List<String>>(){}, pets);
        //List<String> listsofStrings = f.getFavorites(new TypeRef<List<String>>(){});
    }

    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);


        } catch (Exception ex) {
            throw new IllegalArgumentException(ex);
        }
        return element.getAnnotation(
                annotationType.asSubclass(Annotation.class)
        );

        /*
        @SuppressWarnings("unchecked")
        Class<? extends Annotation> t= (Class<? extends Annotation>) annotationType;
        return element.getAnnotation(t);
         */
    }
}
