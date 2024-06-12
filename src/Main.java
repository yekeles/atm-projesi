import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullanici, parola;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adını Giriniz: ");
            kullanici = input.nextLine();
            System.out.print("Parolanızı Giriniz: ");
            parola = input.nextLine();
            int price;
            if (kullanici.equals("yekeles") && parola.equals("123456")) {
                System.out.println("Merhaba e-bank'a Hoşgeldiniz!...");
                do {
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz;");
                    System.out.println("Bakiyeniz :" + balance + "$");
                    System.out.println("1-Para Yatırma \n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama \n" +
                            "4-Çıkış Yap)");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatırılacak Miktarı Belirtiniz:");
                            price = input.nextInt();
                        balance += price;
                        System.out.println("Son Bakiyeniz " + balance + "$");
                        break;
                        case 2 :
                            System.out.println("Bankadan Çekilecek Miktarı Belirtiniz:" );
                            price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiyeniz Yetersiz." + balance + "$ Hesabınızda Para Var");
                        }else{
                            balance -= price;
                            System.out.println("Kalan Bakiyeniz " + balance + "$");
                        }
                        break;
                        case 3 :
                        System.out.println("Bakiyeniz: "+ balance + "$ ");
                        break;
                    }
                }while (select !=4);
                System.out.println("Tekrar Bekleriz!. İyi Günler :)");
                break;
            } else {
                right--;
                System.out.println("Kullanıcı veye Parolanızı Yanlış Girdiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur Banka İle İletişime Geçiniz. ");
                } else {
                    System.out.println("Kalan Hakkınız :" + right);
                }
            }


        }
    }
}