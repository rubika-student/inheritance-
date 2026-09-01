class Father {

    void job() {
        System.out.println("retired professor");
    }

    void hobby() {
        System.out.println("dancing watching tv");
    }

    void property() {
        System.out.println("one house and four acre land");
    }
}

class Daughter extends Father {
   void job(){

      System.out.println("student");
    }
   void hobby() {
        System.out.println("dancing watching tv");
    }
   
   void property() {
        System.out.println("one house and four acre land");
    }



    public static void main(String[] args) {

        Father f = new Father();

        f.job();
        f.hobby();
        f.property();

        Daughter d = new Daughter();

        d.job();
        d.hobby();
        d.property();
        
        Father f1 = new Daughter();

        f1.job();
        f1.hobby();
        f1.property();
}
}
