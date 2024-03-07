package miPrincipal;

public class Performance{
    private long ti;
    private long tf;
    private boolean stoped=false;
    public Performance(){
        start();
    }
    public void start(){
        ti=System.currentTimeMillis();
        stoped=false;
    }
    public void stop(){
        tf=System.currentTimeMillis();
        stoped=true;
    }
    public long getMillis(){
        return tf-ti;
    }
    public string toString(){
        if(!stoped){
            stop();
        }
        long diff=tf-ti;
        long min=diff/1000/60;
        long sec=(diff/1000)%60;
        return diff+" milisegundos ("+min+" minutos"+sec+" segundos)"; 
    }
    //Getters   
    public long getTi(){return ti;}
    public long getTf(){return tf;}
    public boolean getStoped(){return stoped;}
    //Setters
    public void setTi(long ti){this.ti=ti;}
    public void setTf(long tf){this.tf=tf;}
    public void setStop(boolean stoped){this.stoped=stoped;}


}