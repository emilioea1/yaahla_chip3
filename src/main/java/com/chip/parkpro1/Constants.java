package com.chip.parkpro1;

public class Constants {

    //    public static String SERVER_URL = "https://192.168.1.8:9443/api/";
    public static String BETA_SERVER_URL = "https://192.168.1.8:9443/api/";
    public static String NOT_MAIN_SERVER_URL = "http://193.227.182.203:9101/api/";
    public static String THIS_MAIN_SERVER_URL = "http://guardpro.mobile.api.chip.com.lb:8084/api/";
//    public static String SERVER_URL = "https://10.20.5.218:44391/api/";
    public static String SERVER_URL = "http://193.227.182.203:9101/api/";

//    public static String SERVER_URL = "https://parkpro.mobile.api.chip.com.lb:9443/api/";

    public static String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    public static String TYPE_AUTOCOMPLETE = "/autocomplete";
    public static String OUT_JSON = "/json";








    public static final int SPLASH_DELAY = 5000;
    public static final String EMPTY = "";

    //fonts
    public static final String STREATWEAR_FONT = "fonts/streatwear.otf";
    public static final String DITI_SWEET_FONT = "fonts/diti_sweet.ttf";
    public static final String GERMANIA_ONE_FONT = "fonts/germania_one.ttf";
    public static final String SLIMJIM_FONT = "fonts/slimjim.ttf";
    public static final String VOLATIRE_FONT = "fonts/volatire.ttf";

    public static final String[] FONTS = {EMPTY, STREATWEAR_FONT, DITI_SWEET_FONT, GERMANIA_ONE_FONT, SLIMJIM_FONT, VOLATIRE_FONT};

    //flags
    public static final String FOR_WHAT = "forWhat";
    public static final int FOR_LOGO = 0;
    public static final int FOR_TEXT = 1;
    public static final String CONFIG = "config";

    //path
    public static final String DROID_LOGO = "M 149.22,22.00\n" +
            "           C 148.23,20.07 146.01,16.51 146.73,14.32\n" +
            "             148.08,10.21 152.36,14.11 153.65,16.06\n" +
            "             153.65,16.06 165.00,37.00 165.00,37.00\n" +
            "             194.29,27.24 210.71,27.24 240.00,37.00\n" +
            "             240.00,37.00 251.35,16.06 251.35,16.06\n" +
            "             252.64,14.11 256.92,10.21 258.27,14.32\n" +
            "             258.99,16.51 256.77,20.08 255.78,22.00\n" +
            "             252.53,28.28 248.44,34.36 246.00,41.00\n" +
            "             252.78,43.16 258.78,48.09 263.96,52.85\n" +
            "             281.36,68.83 289.00,86.62 289.00,110.00\n" +
            "             289.00,110.00 115.00,110.00 115.00,110.00\n" +
            "             115.00,110.00 117.66,91.00 117.66,91.00\n" +
            "             120.91,76.60 130.30,62.72 141.04,52.85\n" +
            "             146.22,48.09 152.22,43.16 159.00,41.00\n" +
            "             159.00,41.00 149.22,22.00 149.22,22.00 Z\n" +
            "           M 70.80,56.00\n" +
            "           C 70.80,56.00 97.60,100.00 97.60,100.00\n" +
            "             101.34,106.21 108.32,116.34 110.21,123.00\n" +
            "             113.76,135.52 103.90,147.92 91.00,147.92\n" +
            "             78.74,147.92 74.44,139.06 69.00,130.00\n" +
            "             69.00,130.00 39.80,82.00 39.80,82.00\n" +
            "             35.73,75.29 28.40,66.08 29.20,58.00\n" +
            "             30.26,47.20 38.61,40.47 49.00,39.72\n" +
            "             61.22,40.24 64.96,46.28 70.80,56.00 Z\n" +
            "           M 375.80,58.00\n" +
            "           C 376.60,66.08 369.27,75.29 365.20,82.00\n" +
            "             365.20,82.00 336.00,130.00 336.00,130.00\n" +
            "             330.71,138.82 326.73,147.24 315.00,147.89\n" +
            "             301.74,148.63 291.14,135.87 294.79,123.00\n" +
            "             296.68,116.34 303.66,106.21 307.40,100.00\n" +
            "             307.40,100.00 333.00,58.00 333.00,58.00\n" +
            "             339.02,47.98 342.23,40.92 355.00,39.72\n" +
            "             365.83,40.00 374.69,46.77 375.80,58.00 Z\n" +
            "           M 289.00,116.00\n" +
            "           C 289.00,116.00 289.00,239.00 289.00,239.00\n" +
            "             288.98,249.72 285.92,257.31 275.00,261.10\n" +
            "             265.22,264.50 258.37,259.56 255.02,264.43\n" +
            "             253.78,266.24 254.00,269.84 254.00,272.00\n" +
            "             254.00,272.00 254.00,298.00 254.00,298.00\n" +
            "             254.00,304.85 254.77,310.07 250.36,315.93\n" +
            "             242.35,326.68 226.84,326.49 218.80,315.93\n" +
            "             215.07,311.00 215.01,306.83 215.00,301.00\n" +
            "             215.00,301.00 215.00,262.00 215.00,262.00\n" +
            "             215.00,262.00 190.00,262.00 190.00,262.00\n" +
            "             190.00,262.00 190.00,301.00 190.00,301.00\n" +
            "             189.99,306.83 189.93,311.00 186.20,315.93\n" +
            "             178.16,326.49 162.65,326.68 154.64,315.93\n" +
            "             151.09,311.22 151.01,307.61 151.00,302.00\n" +
            "             151.00,302.00 151.00,272.00 151.00,272.00\n" +
            "             151.00,269.84 151.22,266.24 149.98,264.43\n" +
            "             146.53,259.42 138.97,264.76 129.00,260.86\n" +
            "             118.39,256.72 116.02,248.29 116.00,238.00\n" +
            "             116.00,238.00 116.00,116.00 116.00,116.00\n" +
            "             116.00,116.00 289.00,116.00 289.00,116.00 Z";


    public static final String PARKPRO = "M481,452.9c0,15.5-12.6,28.1-28.1,28.1H59.1C43.6,481,31,468.4,31,452.9V59.1C31,43.6,43.6,31,59.1,31h393.8c15.5,0,28.1,12.6,28.1,28.1V452.9z"
           + "M256.4,397.8l-0.1-0.1l-119.9-71.4v-115l0,0l120.4,64.2l0,0l0.1,0l0,0V398l0,0l-0.1-0.1L256.4,397.8z"+
            "M375.7,211.3l-118.8,64.3V398l118.8-71.9L375.7,211.3L375.7,211.3z"+
            "M375.7,211.3v84.2L312.3,328l-55.5-52.4v0L375.7,211.3L375.7,211.3z"+
            "M433.3,244.4L375.7,274l-64,32.9l-54.8-31.3v0l118.8-64.3l0,0L433.3,244.4z"+
            "M255.2,147l120.5,64.3l0,0l54.5-31.3l-54.5-30.7l-63-35.4L255.2,147L255.2,147L255.2,147L255.2,147z"+
            "M78.6,178.3l57.6-29.6l64-32.9l54.8,31.3v0l-118.8,64.3l0,0L78.6,178.3z"+
            "M255.1,147l1.8,128.7l-0.1,0l-120.5-64.3L255.1,147z"+
            "M256.9,275.7L256.9,275.7L255.1,147l0,0l0.1,0l120.5,64.3L256.9,275.7z"+
            "M256.9,275.7V350l-91-48.6l9.6-6.1l23.8,13.4L256.9,275.7L256.9,275.7z"+
            "M256.8,275.6L256.8,275.6l-0.1,122.3l0.2,0.1L256.8,275.6L256.8,275.6z"+
            "M256.8,275.6l-120.5-64.3l0,0l-54.5,31.3l54.5,30.7l63,35.4L256.8,275.6L256.8,275.6L256.8,275.6L256.8,275.6z";

    public static final String PLOGO = "M44.2,100.4c-7.1,2.5 -12.2,10.1 -12.2,18 0,7.8 7.4,15.9 15.8,17.2 8.4,1.3 17.8,-4.8 20.1,-13.3 1.3,-4.7 1.3,-4.9 0.1,-9.5 -2.9,-10.2 -14,-16 -23.8,-12.4z"+
            "M78.4,100.3c-0.2,0.7 -0.3,8.9 -0.2,18.2l0.3,17 18.8,0.3 18.7,0.2 0,-2.4c0,-4.5 -4,-15.1 -7.5,-19.8 -4.5,-6.1 -12.3,-11.3 -20,-13.3 -7.2,-1.8 -9.4,-1.9 -10.1,-0.2z"+
            "M78,164.1l0,18.1 5.4,-0.4c15.4,-1.3 29.9,-15.2 32.1,-31.1l0.7,-4.7 -19.1,-0 -19.1,-0 0,18.1z"+
            "M32,165l0,18 18.5,-0 18.5,-0 0,-18 0,-18 -18.5,-0 -18.5,-0 0,18z"+
            "M32.4,197.7c1.5,11.3 10.2,23.4 20.2,28 5.2,2.4 14.3,4.5 15.6,3.7 0.5,-0.3 0.8,-8.6 0.8,-18.5l0,-17.9 -18.6,-0 -18.7,-0 0.7,4.7z";

    public static final String GOOGLE = "\"M142.9,24.2c40.2-13.9,85.3-13.6,125.3,1.1c22.2,8.2,42.5,21,59.9,37.1c-5.8,6.3-12.1,12.2-18.1,18.3 c-11.4,11.4-22.8,22.8-34.2,34.2c-11.3-10.8-25.1-19-40.1-23.6c-17.6-5.3-36.6-6.1-54.6-2.2c-21,4.5-40.5,15.5-55.6,30.9 c-12.2,12.3-21.4,27.5-27,43.9c-20.3-15.8-40.6-31.5-61-47.3C59,73.6,97.6,39.7,142.9,24.2z\n" +
            "          \"M21.4,163.2c3.3-16.2,8.7-32,16.2-46.8c20.3,15.8,40.6,31.5,61,47.3c-8,23.3-8,49.2,0,72.4 c-20.3,15.8-40.6,31.6-60.9,47.3C18.9,246.7,13.2,203.6,21.4,163.2z\n" +
            "          \"M203.7,165.1c58.3,0,116.7,0,175,0c5.8,32.7,4.5,66.8-4.7,98.8c-8.5,29.3-24.6,56.5-47.1,77.2 c-19.7-15.3-39.4-30.6-59.1-45.9c19.5-13.1,33.3-34.3,37.2-57.5c-33.8,0-67.6,0-101.4,0C203.7,213.5,203.7,189.3,203.7,165.1z\n" +
            "          \"M37.5,283.5c20.3-15.7,40.6-31.5,60.9-47.3c7.8,22.9,22.8,43.2,42.6,57.1c12.4,8.7,26.6,14.9,41.4,17.9 c14.6,3,29.7,2.6,44.4,0.1c14.6-2.6,28.7-7.9,41-16.2c19.7,15.3,39.4,30.6,59.1,45.9c-21.3,19.7-48,33.1-76.2,39.6 c-31.2,7.1-64.2,7.3-95.2-1c-24.6-6.5-47.7-18.2-67.6-34.1C67,328.9,49.6,307.5,37.5,283.5z";
}