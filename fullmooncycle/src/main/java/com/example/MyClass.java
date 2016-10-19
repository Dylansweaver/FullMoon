package com.example;
import java.util.*;
public class MyClass {

    public static void main(String args[]) {

        //Variables
        int month;
        int day;
        int year;

        //Functions

        //**************************************************************************************

        System.out.println("Hello what is todays date?(mm/dd/yyyy)");
        System.out.print("Month: ");
        Scanner scanner = new Scanner(System.in);//initiates a new scanner
        month = scanner.nextInt();//creates an input method for month
        while (month < 1 || month > 12) {//makes sure that the user will only put in a correct month
            System.out.println("Sorry Month must be 1-12");
            System.out.print("Month: ");
            month = scanner.nextInt();
        }

        System.out.print("\nDay: ");
        day = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            while (day < 1 || day > 31) {
                System.out.println("There is 31 days in this month, Please choose 1-31");
                System.out.print("\nDay: ");
                day = scanner.nextInt();
            }
        }
        if (month == 2) {

            while (day < 1 || day > 29) {
                System.out.println("There is 29 possible days in this month, please choose 1-29");
                System.out.print("\nDay: ");
                day = scanner.nextInt();
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {

            while (day < 1 || day > 30) {
                System.out.println("There is 30 possible days in this month, please choose 1-30");
                System.out.print("\nDay: ");
                day = scanner.nextInt();
            }
        }
        System.out.print("\nYear: ");
        year = scanner.nextInt();

        while (year < 2015 || year > 2017) {
            System.out.println("Year must be between 2015 and 2017");
            System.out.print("\nYear: ");
            year = scanner.nextInt();
        }

        System.out.print(month + "/" + day + "/" + year);


        //********************HARDCODED DATES FOR MOONS*******************************************
        //2015
        String jan2015 = "1/4/2015";
        String feb2015 = "2/3/2015";
        String mar2015 = "3/5/2015";
        String apr2015 = "4/4/2015";
        String may2015 = "5/3/2015";
        String jun2015 = "6/2/2015";
        String jul2015 = "7/1/2015";
        String july2015 = "7/31/2015";
        String aug2015 = "8/29/2015";
        String sep2015 = "9/27/2015";
        String oct2015 = "10/27/2015";
        String nov2015 = "11/25/2015";
        String dec2015 = "12/25/2015";
        //2016
        String jan2016 = "1/23/2016";
        String feb2016 = "2/22/2016";
        String mar2016 = "3/23/2016";
        String apr2016 = "4/22/2016";
        String may2016 = "5/21/2016";
        String jun2016 = "6/20/2016";
        String jul2016 = "7/19/2016";
        String aug2016 = "8/18/2016";
        String sep2016 = "9/16/2016";
        String oct2016 = "10/16/2016";
        String nov2016 = "11/14/2016";
        String dec2016 = "12/13/2016";
        //2017
        String jan2017 = "1/12/2017";
        String feb2017 = "2/10/2017";
        String mar2017 = "3/12/2017";
        String apr2017 = "4/11/2017";
        String may2017 = "5/10/2017";
        String jun2017 = "6/9/2017";
        String jul2017 = "7/9/2017";
        String aug2017 = "8/7/2017";
        String sep2017 = "9/6/2017";
        String oct2017 = "10/5/2017";
        String nov2017 = "11/4/2017";
        String dec2017 = "12/3/2017";
        String jan2018 = "1/1/2018";
        //********************HARDCODED DATES FOR MOONS*******************************************

        if (year == 2015) {
            switch (month) {
                case 1:
                    if (day <= 4) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jan2015);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2015);
                    }
                    break;
                case 2:
                    if (day <= 3) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2015);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2015);
                    }
                    break;
                case 3:
                    if (day <= 5) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2015);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2015);
                    }
                    break;
                case 4:
                    if (day <= 4) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2015);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2015);
                    }
                    break;
                case 5:
                    if (day <= 3) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2015);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jun2015);
                    }
                    break;
                case 6:if (day <= 2) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jun2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2015);
                }
                    break;
                case 7:if (day <=1) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(july2015);
                }
                    break;
                case 8:if (day <= 29) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(aug2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2015);
                }
                    break;
                case 9:if (day <= 27) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2015);
                }
                    break;
                case 10:if (day <= 27) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2015);
                }
                    break;
                case 11:if (day <= 25) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2015);
                }
                    break;
                case 12:if (day <= 25) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2015);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jan2016);
                }
                    break;
            }
        }
        if(year==2016){
            switch (month) {
                case 1:
                    if (day <= 23) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jan2016);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2016);
                    }
                    break;
                case 2:
                    if (day <= 22) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2016);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2016);
                    }
                    break;
                case 3:
                    if (day <= 23) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2016);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2016);
                    }
                    break;
                case 4:
                    if (day <= 22) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2016);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2016);
                    }
                    break;
                case 5:
                    if (day <= 21) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2016);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jun2016);
                    }
                    break;
                case 6:if (day <= 20) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jun2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2016);
                }
                    break;
                case 7:if (day <=19) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(aug2016);
                }
                    break;
                case 8:if (day <= 18) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(aug2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2016);
                }
                    break;
                case 9:if (day <= 16) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2016);
                }
                    break;
                case 10:if (day <= 16) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2016);
                }
                    break;
                case 11:if (day <= 14) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2016);
                }
                    break;
                case 12:if (day <= 13) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2016);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jan2017);
                }
                    break;
            }
        }
        if(year==2017){
            switch (month) {
                case 1:
                    if (day <= 12) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jan2017);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2017);
                    }
                    break;
                case 2:
                    if (day <= 10) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(feb2017);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2017);
                    }
                    break;
                case 3:
                    if (day <= 12) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(mar2017);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2017);
                    }
                    break;
                case 4:
                    if (day <= 11) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(apr2017);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2017);
                    }
                    break;
                case 5:
                    if (day <= 10) {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(may2017);
                    } else {
                        System.out.print("\nNext Full Moon is ");
                        System.out.print(jun2017);
                    }
                    break;
                case 6:if (day <= 9) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jun2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2017);
                }
                    break;
                case 7:if (day <=9) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jul2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(aug2017);
                }
                    break;
                case 8:if (day <= 7) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(aug2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2017);
                }
                    break;
                case 9:if (day <= 6) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(sep2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2017);
                }
                    break;
                case 10:if (day <= 5) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(oct2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2017);
                }
                    break;
                case 11:if (day <= 4) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(nov2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2017);
                }
                    break;
                case 12:if (day <= 3) {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(dec2017);
                } else {
                    System.out.print("\nNext Full Moon is ");
                    System.out.print(jan2018);
                }
                    break;
            }
        }
    }
}
