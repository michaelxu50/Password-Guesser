class Force {
    String passwd = "";

    Force(String code) {
        passwd = code;
    }

    String var = "";
    //6 + 13 0s
    //60,000,000,000,000
    //60 trillion
    //600x more combinations than pattern

    public String Run() {
        for (int a = 33; a <= 126; a++) { //1
            String ca = Character.toString(a);
            for (int b = 33; b <= 126; b++) { //2
                String cb = Character.toString(b);
                for (int c = 33; c <= 126; c++) { //3
                    String cc = Character.toString(c);
                    for (int d = 33; d <= 126; d++) { //4
                        String cd = Character.toString(d);
                        for (int e = 33; e <= 126; e++) { //5
                            String ce = Character.toString(e);
                            for(int f=33; f<=126; f++) { //6
                                String cf = Character.toString(f);
                                for(int g=33; g<=126; g++) { //7
                                    String cg = Character.toString(g);
                                    //var = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d) + " " + Integer.toString(e); //+ Integer.toString(f);
                                    var = ca + cb + cc + cd + ce + cf + cg;
                                    if (var.equals(passwd)) {
                                        System.out.println("The password is " + var);
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
                System.out.println("Subclass " + b); //progress report.
            }
            System.out.println("Processed " + a); //progress report.
        }
        return var;
    }
}

