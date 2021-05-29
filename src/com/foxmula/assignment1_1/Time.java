package com.foxmula.assignment1_1;


class Time{
    private int hour;
    private int min;
    private int sec;

    public Time(int hr, int mi, int se){
        hour=hr;
        min=mi;
        sec=se;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }





    public void add(Time t){


        this.sec= this.sec+ t.getSec();
        if(this.sec>59)
        {
            this.min++;
            this.sec=this.sec-60;
        }

        this.min=this.min+ t.getMin();

        if(this.min>59)
        {
            this.hour++;
            this.min=this.min-60;
        }

        this.hour=this.hour + t.getHour();

        if(this.hour>24)
        {
            this.hour=this.hour-24;

        }
        System.out.println("sum = "+this.hour+":"+this.min+":"+this.sec);



    }
}

