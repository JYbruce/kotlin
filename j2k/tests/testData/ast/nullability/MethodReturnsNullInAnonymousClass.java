import java.lang.Override;
import java.lang.String;

//file
interface Getter {
    String get()
}

class C {
    String foo(boolean b) {
        Getter getter = new Getter() {
            @Override
            public String get() {
                return null;
            }
        };
        return "";
    }
}