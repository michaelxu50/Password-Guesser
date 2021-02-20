class Pattern {

    //public static void main(String args[]) {
    public boolean Run() {

        String passwd = "Aa";
        String var = "";

        for (int a = 65; a <= 90; a++) { //1
            String ca = Character.toString(a);
            for (int b = 97; b <= 122; b++) { //2
                String cb = Character.toString(b);
                for (int c = 97; c <= 122; c++) { //3
                    String cc = Character.toString(c);
                    for (int d = 97; d <= 122; d++) { //4
                        String cd = Character.toString(d);
                        for (int e = 33; e <= 126; e++) { //5
                            String ce = Character.toString(e);
                            for(int f=33; f<=126; f++) { //6
                                String cf = Character.toString(f);
                                //var = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d) + " " + Integer.toString(e); //+ Integer.toString(f);
                                var = ca + cb + cc + cd + ce + cf;
                                if (var.equals(passwd)) {
                                    System.out.println("The password is " + var);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Processed " + a);
        }
        return false;
    }
}

