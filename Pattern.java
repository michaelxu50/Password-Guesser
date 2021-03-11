class Pattern {
    String passwd = "";
    Pattern(String code) {
        passwd = code;
    }

    //1 + 11 0s
    //100,000,000,000
    //100 billion

    public boolean Run() {

        for (int a = 65; a <= 90; a++) { //1
            String ca = Character.toString(a);
            for (int b = 97; b <= 122; b++) { //2
                String cb = Character.toString(b);
                for (int c = 97; c <= 122; c++) { //3
                    String cc = Character.toString(c);
                    for (int d = 97; d <= 122; d++) { //4
                        String cd = Character.toString(d);
                        for (int e = 97; e <= 122; e++) { //5
                            String ce = Character.toString(e);
                            for(int f=33; f<=126; f++) { //6
                                String cf = Character.toString(f);
                                for(int g=33; g<=126; g++) { //7
                                    String cg = Character.toString(g);
                                    //var = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d) + " " + Integer.toString(e); //+ Integer.toString(f);
                                    String var = ca + cb + cc + cd + ce + cf + cg;
                                    if (var.equals(passwd)) {
                                        System.out.println("The password is " + var);
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Processed " + a); //progress report.
        }
        return false;
    }
}

