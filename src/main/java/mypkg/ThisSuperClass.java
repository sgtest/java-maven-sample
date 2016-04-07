package mypkg;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;
import java.util.HashMap;

class ThisSuperClass extends HashMap<String, String> {

    private int counter;

    ThisSuperClass foo() {
        // .class
        Class c = ThisSuperClass.class;
        // ClassName.this
        ThisSuperClass.this.counter++;
        // this
        return this;
    }

    void bar() {
        // this.X
        this.counter++;
        // super.X
        super.get("");
    }

    void baz() {
        new JFrame().addPropertyChangeListener(e -> {
            // this from lambda
            this.counter++;
            // super from lambda
            super.get("");
        });
    }

    class Qux extends BigInteger {

        Qux() {
            // super()
            super("1");
            // super.X
            super.byteValue();
            // this.X
            this.byteValue();
            // ClassName.this
            ThisSuperClass.this.counter++;

        }

        class Norf {

            Norf() {
                this.hashCode();
                Qux.this.hashCode();
                ThisSuperClass.this.hashCode();
                super.hashCode();
                Qux.super.hashCode();
                ThisSuperClass.super.hashCode();
            }
        }

    }
}