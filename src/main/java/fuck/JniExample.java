package fuck;

import java.io.File;

public class JniExample {
    static {
      //  System.loadLibrary("cygwin");
        File libx2 = new File("cygwin1.dll");
        System.load(libx2.getAbsolutePath());
        File libx = new File("cygvaca.dll");
        System.load(libx.getAbsolutePath());
      //  loadLibrary("cygvaca.dll");
    }
    public static native String getStringFromC();

    public static void main(String[] args) {
        System.out.println(getStringFromC());

    }
}
