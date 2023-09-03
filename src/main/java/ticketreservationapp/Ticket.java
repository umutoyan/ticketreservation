package ticketreservationapp;

public class Ticket {
    //mesafe (km),koltuk no,fiyat,yolculuk tipi
    public double distance;
    public int typeNo;
    public String seatNo;
    private double price;//verilen bilgilere gore hesaplayacagiz
//5-bilet fiyatini hesaplama


    //6 bileti yazdiralim

    public void printTicket(Bus bus){
        System.out.println("*".repeat(42));
        System.out.println("--- Bilet Detayı ---");
        System.out.println("Otobüs Plakası  :"+bus.numberPlate);
        System.out.println("Mesafe          :"+this.distance);
        System.out.println("Yolculuk Tipi   :"+(this.typeNo==1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.println("Koltuk No       :"+this.seatNo);
        System.out.println("Toplam Tutar    :"+this.price);
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));


    }


    public void getTotalPrice(int age){
        double total =0;
        int seat=Integer.parseInt(this.seatNo);
        switch(this.typeNo){
            case 1://tek yon
                if(seat%3==0) {
                    total = this.distance * 1.2;
                }else {
                    total=this.distance*1;
                }
                System.out.println("toplam tutar:"+ total);
                break;
            case 2://cift yon
                if(seat%3==0) {
                    total = this.distance * 2.4;
                }else {
                    total=this.distance*2;

        }
                System.out.println(total);
                //cift yon indrimi..
                total=total*0.8;
                System.out.println("cift yon indirim tutari:"+ total);//yuzde 80


                break;

        }


        //son tutardan birde yas indirimi var
        if (age<12){
            total =total*0.5;
            System.out.println("12 yas alti indirimi tuta"+total);

        } else if (age>65) {
            total=total*07;
            System.out.println("65 yas ustu indirimi tuta"+total);

        }
        this.price=total;


    }}
