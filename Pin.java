class Pin {
    void Run() {
        long a;
        long num = 966976976;
        long digits = 999999999;
        boolean accurate = false;
        for (a = 0; a <= digits; a++) {
            if (a == num) accurate = true;
            else accurate = false;
            if (accurate == true) {
                System.out.println(a);
                System.exit(0);
            }
        }
    }
}