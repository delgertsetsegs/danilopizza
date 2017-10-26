package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane size=new GridPane();
			size.getStyleClass().addAll("brdr");
			Label ttSize=new Label("Size");
			
			RadioButton sBtn=new RadioButton("Small");
			RadioButton mBtn=new RadioButton("Medim");
			RadioButton lBtn=new RadioButton("Large");
			
			TextField sfld=new TextField("8.95");
			TextField mfld=new TextField("12.75");
			TextField lfld=new TextField("14.55");
			
			sfld.setMaxWidth(55);
			mfld.setMaxWidth(55);
			lfld.setMaxWidth(55);
			
			sBtn.setSelected(true);
			final ToggleGroup group=new ToggleGroup();
			sBtn.setToggleGroup(group);
			mBtn.setToggleGroup(group);
			lBtn.setToggleGroup(group);
			
			size.add(sBtn, 0 ,0);
			size.add(mBtn, 0 ,1);
			size.add(lBtn, 0 ,2);
			size.add(sfld, 1 ,0);
			size.add(mfld, 1 ,1);
			size.add(lfld, 1 ,2);
			
			GridPane sideItem=new GridPane();
			sideItem.getStyleClass().addAll("brdr");
			Label BufalloWings=new Label("Bufallo Wings");
			Label Qty=new Label("Qty");
			Label Price=new Label("Price");
			Label Total=new Label("Total");
			Label Bread=new Label("Bread & Sticks");
			
			TextField qtyBuf=new TextField("1");
			TextField priceBuf=new TextField("12.75");
			TextField totalBuf=new TextField("14.55");
			TextField qtyBread=new TextField("0");
			TextField totalBread=new TextField("12.75");
			TextField priceBread=new TextField("14.55");
			qtyBuf.setMaxWidth(55);
			priceBuf.setMaxWidth(55);
			totalBuf.setMaxWidth(55);
			qtyBread.setMaxWidth(55);
			totalBread.setMaxWidth(55);
			priceBread.setMaxWidth(55);
			
			sideItem.add(BufalloWings, 0, 2);
			sideItem.add(Bread, 0, 3);
			sideItem.add(Qty, 1, 0);
			sideItem.add(qtyBuf, 1, 1);
			sideItem.add(qtyBread, 1, 2);
			sideItem.add(Price, 2, 0);
			sideItem.add(priceBuf, 2, 1);
			sideItem.add(priceBread, 2, 2);
			sideItem.add(Total, 3, 0);
			sideItem.add(totalBuf, 3, 1);
			sideItem.add(totalBread, 3, 2);
			
			GridPane Toppings=new GridPane();
			Toppings.getStyleClass().addAll("brdr");
			CheckBox cb1=new CheckBox("Pepperoni");
			CheckBox cb2=new CheckBox("Suasage");
			CheckBox cb3=new CheckBox("Extra Cheese");
			CheckBox cb4=new CheckBox("Onioins");
			CheckBox cb5=new CheckBox("Oli&ves");
			
			cb1.setSelected(true);
			cb3.setSelected(true);
			
			TextField tf1=new TextField("0.45");
			TextField tf2=new TextField("0.35");
			TextField tf3=new TextField("0.45");
			TextField tf4=new TextField("0.25");
			TextField tf5=new TextField("0.55");
			tf1.setMaxWidth(55);
			tf2.setMaxWidth(55);
			tf3.setMaxWidth(55);
			tf4.setMaxWidth(55);
			tf5.setMaxWidth(55);
			
			Toppings.add(cb1, 0, 0);
			Toppings.add(cb2, 0, 1);
			Toppings.add(cb3, 0, 2);
			Toppings.add(cb4, 0, 3);
			Toppings.add(cb5, 0, 4);
			Toppings.add(tf1, 1, 0);
			Toppings.add(tf2, 1, 1);
			Toppings.add(tf3, 1, 2);
			Toppings.add(tf4, 1, 3);
			Toppings.add(tf5, 1, 4);
			
			GridPane Drinks= new GridPane();
			Drinks.getStyleClass().addAll("brdr");
			
			Label lb1=new Label("Pepsi");
			Label lb2=new Label("Diet Pepsi");
			Label lb3=new Label("Sprite");
			Label lb4=new Label("Orange Juice");
			Label lb5=new Label("Root Beer");
			
			TextField qtyPep=new TextField("1");
			TextField pricePep=new TextField("12.75");
			TextField totalPep=new TextField("14.55");
			TextField qtyDp=new TextField("1");
			TextField totalDp=new TextField("12.75");
			TextField priceDp=new TextField("14.55");
			TextField qtySp=new TextField("2");
			TextField priceSp=new TextField("12.75");
			TextField totalSp=new TextField("14.55");
			TextField qtyOr=new TextField("0");
			TextField totalOr=new TextField("12.75");
			TextField priceOr=new TextField("14.55");
			TextField qtyRoo=new TextField("0");
			TextField totalRoo=new TextField("12.75");
			TextField priceRoo=new TextField("14.55");
			qtyPep.setMaxWidth(55);
			pricePep.setMaxWidth(55);
			totalPep.setMaxWidth(55);
			qtyDp.setMaxWidth(55);
			totalDp.setMaxWidth(55);
			priceDp.setMaxWidth(55);
			qtySp.setMaxWidth(55);
			totalSp.setMaxWidth(55);
			priceSp.setMaxWidth(55);
			qtyOr.setMaxWidth(55);
			priceOr.setMaxWidth(55);
			totalOr.setMaxWidth(55);
			qtyRoo.setMaxWidth(55);
			totalRoo.setMaxWidth(55);
			priceRoo.setMaxWidth(55);
			
			Drinks.add(lb1, 0, 1);
			Drinks.add(lb2, 0, 2);
			Drinks.add(lb3, 0, 3);
			Drinks.add(lb4, 0, 4);
			Drinks.add(lb5, 0, 5);
			Drinks.add(Qty, 1, 0);
			Drinks.add(qtyPep, 1, 1);
			Drinks.add(qtyDp, 1, 2);
			Drinks.add(qtySp, 1, 3);
			Drinks.add(qtyOr, 1, 4);
			Drinks.add(qtyRoo, 1, 5);
			Drinks.add(Price, 2, 0);
			Drinks.add(pricePep, 2, 1);
			Drinks.add(priceDp, 2, 2);
			Drinks.add(priceSp, 2, 3);
			Drinks.add(priceOr, 2, 4);
			Drinks.add(priceRoo, 2, 5);
			Drinks.add(Total, 3, 0);
			Drinks.add(totalPep, 3, 1);
			Drinks.add(totalDp, 3, 2);
			Drinks.add(totalSp, 3, 3);
			Drinks.add(totalOr, 3, 4);
			Drinks.add(totalRoo, 3, 5);
			
			HBox btn=new HBox();
			btn.getStyleClass().addAll("brdr");
			
			Button ok=new Button("OK");
			Button cancel=new Button("Cancel");
			Label totalOrder=new Label("Total Order:");
			TextField order=new TextField("0.0");
			btn.getChildren().addAll(ok,cancel,totalOrder,order);
			
			ok.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
			    	System.out.println(":");
			    	setText("a");

			    }
			    

				private TextField setText(String valueOf) {
					// TODO Auto-generated method stub
					double PriceSize = 0, Pepperoni, Sausage = 0,
			        ExtraCheese=0, Onions=0, Olives=0, BWings, Bread,
			        Pepsi, DietPepsi, Sprite, OJ, RootBeer, TotalOrder;
					double total1=Double.parseDouble(qtyBuf.getText())*Double.parseDouble(priceBuf.getText());
					totalBuf.setText(String.valueOf(total1));
					
					double total2=Double.parseDouble(qtyBuf.getText())*Double.parseDouble(priceBuf.getText());
					totalBread.setText(String.valueOf(total2));
					
					double total3=Double.parseDouble(qtyDp.getText())*Double.parseDouble(qtyDp.getText());
					totalDp.setText(String.valueOf(total3));
					
					double total4=Double.parseDouble(qtyPep.getText())*Double.parseDouble(pricePep.getText());
					totalPep.setText(String.valueOf(total4));
					
					double total5=Double.parseDouble(qtySp.getText())*Double.parseDouble(priceSp.getText());
					totalSp.setText(String.valueOf(total5));
					
					double total6=Double.parseDouble(qtyRoo.getText())*Double.parseDouble(qtyRoo.getText());
					totalRoo.setText(String.valueOf(total6));
					
					double total7=Double.parseDouble(qtyOr.getText())*Double.parseDouble(qtyOr.getText());
					totalOr.setText(String.valueOf(total7));
					if(sBtn.isSelected()) {
						PriceSize=Double.parseDouble(sfld.getText());
					}
					if(mBtn.isSelected()) {
						PriceSize=Double.parseDouble(mfld.getText());
					}
					if(lBtn.isSelected()) {
						PriceSize=Double.parseDouble(lfld.getText());
					}
					if(cb1.isSelected()) {
						Pepperoni=Double.parseDouble(sfld.getText());
					}
					if(cb2.isSelected()) {
						Sausage=Double.parseDouble(sfld.getText());
					}
					if(cb3.isSelected()) {
						ExtraCheese=Double.parseDouble(sfld.getText());
					}
					if(cb4.isSelected()) {
						Onions=Double.parseDouble(sfld.getText());
					}
					if(cb5.isSelected()) {
						Olives=Double.parseDouble(sfld.getText());
					}
					double total=
			    			Double.parseDouble(totalBuf.getText()) +
			    			Double.parseDouble(totalBread.getText()) +
			    			Double.parseDouble(totalPep.getText()) +
			    			Double.parseDouble(totalDp.getText()) +
			    			Double.parseDouble(totalOr.getText()) +
			    			Double.parseDouble(totalRoo.getText()) +
			    			Double.parseDouble(totalSp.getText()) +
			    			PriceSize+
			    			Sausage+
			    			ExtraCheese+
			    			Onions+
			    			Olives;
					order.setText(String.valueOf(total));
					return null;
				}
			});
			
			
			GridPane root = new GridPane();
			root.setHgap(10);
			root.setVgap(10);
			root.setPadding(new Insets(10,10,10,20));
			Total.setPadding(new Insets(10,10,10,20));
			Drinks.setPadding(new Insets(10,10,10,20));
			size.setPadding(new Insets(10,10,10,20));
			sideItem.setPadding(new Insets(20,10,10,20));
			root.add(size, 0, 0);
			root.add(sideItem, 1, 0);
			root.add(Toppings, 0, 1);
			root.add(Drinks,1,1);
			root.add(btn, 0, 2);
			root.setColumnSpan(btn, 2);
			Scene scene = new Scene(root,500,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Danillo Pizza");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
