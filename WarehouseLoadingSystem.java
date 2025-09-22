import java.util.*;

class Item {
	private String code;
	private String name;
	private int quantity;
	
	public Item(String code, String name, int quantity) {
		this.code = code;
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String toString () {
		return code + " | " + name + " | " + quantity;
	}
}

class Truck {
	private String plate;
	private String driver;
	
	public Truck(String plate, String driver) {
		this.plate = plate;
		this.driver = driver;
	}
	
	@Override
	public String toString () {
		return plate + " | " + driver;
}

class WarehouseLoadSystem {
	ArrayDeque<Item> warehouseStack = new ArrayDeque<>();
	ArrayDeque<Truck> truckQueue = new ArrayDeque<>();
}
void storeItem() {
	System.out.println("");
	// ask user for code, name, quantity
	// create Item object
	// warehouseStack.push(item);
}

void viewWarehouseStack() {
System.out.println("TOP →");
//loop through warehouseStack
//print each item
System.out.println( "← BOTTOM");

}

void registerTruck() {
	System.out.println("Plate: ");
	System.out.println();
//ask user for plate, driver
//create Truck object
//truckQueue.offer(truck);
}

void viewWaitingTrucks() {
System.out.println( "FRONT →");
//loop through truckQueue
//print each truck
System.out.println("← REAR");
}

void loadNextTruck() {
	// pop item from warehouseStack
	// poll truck from truckQueue
	// if both not null → print "Loaded: [item] → [truck]"
	// else → print "No items or trucks available"
	}
//Main menu
void run() {
int choice;
do {
//display menu
//read choice
switch(choice) {
case 1: storeItem(); break;
case 2: viewWarehouseStack(); break;
case 3: registerTruck(); break;
case 4: viewWaitingTrucks(); break;
case 5: loadNextTruck(); break;
case 0: System.out.println("Exiting..."); break;
}
} while(choice != 0);
}
public static void main (String[] args) {
	
	Scanner sc = new canner(System.in) {
	}
