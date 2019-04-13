package Program;

public class DcChar implements Comparable<DcChar> {
    String name;
    String id;
    String sex;
    String align;
    String eye;
    String hair;
    String GSM;
    String alive;
    String appe;
    String fappe;
    String year;

    public DcChar(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }

    public void setAlign(String align){
        this.align = align;
    }

    public String getAlign(){
        return align;
    }

    public void setEye(String eye){
        this.eye = eye;
    }

    public String getEye(){
        return eye;
    }

    public void setHair(String hair){
        this.hair = hair;
    }

    public String getHair(){
        return hair;
    }

    public void setGSM(String GSM){
        this.GSM = GSM;
    }

    public String getGSM(){
        return GSM;
    }

    public void setAlive(String alive){
        this.alive = alive;
    }

    public String getAlive(){
        return alive;
    }

    public void setappearance(String appe){
        this.appe = appe;
    }

    public String getAppearance(){
        return appe;
    }

    public void setFAppearance(String fappe){
        this.fappe = fappe;
    }

    public String getFAppearance(){
        return fappe;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getYear(){
        return year;
    }

    @Override public String toString() {
        return "Name: " + name + "\nHair: " + hair + "\nAlignment: " + align
                + "\nsex: " + sex + "\nEye color: " + eye + "\nAlive: " + alive + "\nappearance: " + appe
                + "\nFirst appearance: " + fappe + "\nyear: " + year;

    }

    @Override
    public int compareTo(DcChar O) {
        int len1 = getName().length();
try{        int len2 = O.getName().length();
        int lim = Math.min(len1, len2);
        char v1[] = name.toCharArray();
        char v2[] = O.getName().toCharArray();
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;} catch (NullPointerException e){return -1;}
    }}
