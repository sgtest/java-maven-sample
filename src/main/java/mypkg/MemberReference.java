package mypkg;

import java.io.File;

public class MemberReference {

        static {
            new File(".").listFiles(File::isDirectory);
        }
}
