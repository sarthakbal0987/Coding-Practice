package Solve_.OwnSelf.SlefProblems;

public class Solve_AnandSir_Question {
    public static void main(String[] args) {
        long rem, rem1=0,rem2=0,rem3 = 0,rem4=0,rem5=0,rem6=0,rem7=0,rem8=0,rem9=0,rem10=0;

        long result;
        for (long i = 1000L; i<=100000L; i++) {
            long temp = i;
            int count = 0;
            while (temp !=0){
                rem = temp %10;
                count++;
                if (count ==1)
                    rem1 = rem;
                if (count ==2)
                    rem2 = rem;
                if (count ==3)
                    rem3 = rem;
                if (count ==4)
                    rem4 = rem;
                if (count ==5)
                    rem5 = rem;
                if (count ==6)
                    rem6 = rem;
                temp = temp/10;
            }
            result = (long)(  Math.pow(rem6,rem5) * Math.pow(rem4,rem3) * Math.pow(rem2,rem1)) ;
            if (result == i){
                System.out.println(result);
            }
        }

    }

}
