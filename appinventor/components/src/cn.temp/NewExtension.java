package cn.tmp;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;

@DesignerComponent(version = NewExtension.VERSION,
                    description = "this is a test for extension",
                    category = ComponentCategory.EXTENSION,
                    nonVisible = true//不可见
                    )

@SimpleObject(external = true)

public class NewExtension extends AndroidNonvisibleComponent {
    public static final int VERSION = 1;
    private static final String LOG_TAG = "NewEx";

    public NewExtension(ComponentContainer container) {
        super(container.$form());

    }
    @SimpleFunction(description = " add ")
    public String addab(int a, int b){
        return ""+(a+b);
    }
}
