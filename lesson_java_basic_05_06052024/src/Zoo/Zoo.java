package Zoo;

public class Zoo {

    public String getSsort () {
        Monkey mon = new Monkey();
        return mon.getGetSort();
    }

    public class Monkey {

        public String getGetSort () {
            Banana banan = new Banana();
            return banan.getSort();
        }

        public class Banana {

            private String sort = "yellow";

            public String getSort () {
                return this.sort;
            }



        }
    }
}
