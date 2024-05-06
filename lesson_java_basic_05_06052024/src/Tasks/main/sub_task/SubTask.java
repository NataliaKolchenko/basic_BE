package Tasks.main.sub_task;

public class SubTask {
    private String info = "subTask class";

    public String getInfo () {
        return this.info;
    }

//    public String getSomeInfo () {
//        SomeInnerClass someInnerClass = new SomeInnerClass ();
//        return SomeInnerClass.
//    }

    private class SomeInnerClass {
        private  String someInfo = "Hello from Inner Class";
    }

//   private String  getInfoNew () {
//        return
//   }

    public String getData () {
        class SomeInnerLocalClass {
            private String data = "Local Class";

            public String getData() {
                return this.data;
            }
        }
        SomeInnerLocalClass someInnerLocalClass = new SomeInnerLocalClass ();
        return someInnerLocalClass.getData();
    }
}
