package src.main.java.Compositive.Kata4;

public class AppProduct {
        public static void main(String[] args){
            ProductComponent laptop = new Product("Laptop", 1000);
            ProductComponent mouse = new Product("Mouse", 50);

            ProductPackage oficina = new ProductPackage("Oficina");
            oficina.addComponent(laptop);
            oficina.addComponent(mouse);

            oficina.showDetails();

        }
         
       
    }
