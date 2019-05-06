public class task4_Olympiad {
    public static void main(String[] args) {
        int h1 = 3, m1 = 15, s1 = 6, h2 = 14, m2 = 16, s2 = 3;
        if (h1 >= 0 && h1 <= 23 && m1 >= 0 && m1 <= 59 && s1 >= 0 && s1 <= 59 && h2 >= 0 && h2 <= 24 && m2 >= 0 && m2 <= 59 && s2 >= 0 && s2 <= 59) {
            if (h1 <= h2) {
                if (h1 == h2) {
                    if (m1 <= m2) {
                        if (m1 == m2) {
                            if (s1 <= s2) {
                                System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                                System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                                int h3 = h2 - h1, m3 = m2 - m1, s3 = s2 - s1;
                                System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                            } else if (s1 > s2) {
                                System.out.println("End time seconds must be later than start time");
                            }
                        } else if (m1 < m2) {
                            if ((s2 - s1) >= 0) {
                                System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                                System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                                int h3 = h2 - h1, m3 = m2 - m1, s3 = s2 - s1;
                                System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                            } else if ((s2 - s1) < 0) {
                                System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                                System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                                int h3 = (h2 - h1), m3 = (m2 - m1 - 1), s3 = (60 + s2 - s1);
                                System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                            }
                        } else if (m1 > m2) {
                            System.out.println("End time minutes must be later than start time");
                        }
                    }
            } else if (h1 < h2) {
                if ((m2 - m1) >= 0) {
                    if ((s2 - s1) >= 0) {
                        System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                        System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                        int h3 = h2 - h1, m3 = m2 - m1, s3 = s2 - s1;
                        System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                    } else if ((s2 - s1) < 0) {
                        System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                        System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                        int h3 = (h2 - h1), m3 = (m2 - m1 - 1), s3 = (60 + s2 - s1);
                        System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                    }
                } else if ((m2 - m1) < 0) {
                    if ((s2 - s1) >= 0) {
                        System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                        System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                        int h3 = h2 - h1, m3 = m2 - m1, s3 = s2 - s1;
                        System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                    } else if ((s2 - s1) < 0) {
                        System.out.println("Start time: " + h1 + "h" + ":" + m1 + "m" + ":" + s1 + "s");
                        System.out.println("End time: " + h2 + "h" + ":" + m2 + "m" + ":" + s2 + "s");
                        int h3 = (h2 - h1 - 1), m3 = (60 + m2 - m1 - 1), s3 = (60 + s2 - s1);
                        System.out.println("Duration:" + h3 + "h" + ":" + m3 + "m" + ":" + s3 + "s");
                    }
                }
                }
            } else if (h1 > h2) {
                System.out.println("End time hours must be later than start time");
            }
        } else if (h1 < 0 && h1 > 24 && m1 < 0 && m1 > 59 && s1 < 0 && s1 > 59 && h2 < 0 && h2 > 24 && m2 < 0 && m2 > 59 && s2 < 0 && s2 > 59){
            System.out.println("Incorrect time format, try again");
        }
    }
}
