import view.WarehouseView;

public class Test {

    public static void main(String[] args){

        //create a warehouse and display as plain text
        Warehouse warehouse = new Warehouse();

        //check for forceQuit
        if (Config.forceQuit > 0 || Config.error > 0){

            //check for errors
            if (Config.error > 0){

                System.out.println();
                System.out.println("ERROR SOMETHING WENT WRONG");
                System.out.println("System shutdown. Error code "+Config.error);

            }

        }else{

            //show warehouse in GUI
            WarehouseView warehouseView = new WarehouseView(warehouse.getWarehouseBooleans(), warehouse.getEntrance_X(), warehouse.getEntrance_Y());

        }

    }

}
