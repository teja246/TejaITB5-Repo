package com.App;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bigbasket {
	public void billing() {
		Double fruits_cost=fruits();
		System.out.println("Total fruits         ---"+fruits_cost);
		System.out.println();
		Double cakes_cost=cakes();
		System.out.println("Total cakes          ---"+cakes_cost);
		System.out.println();
		Double kitchitems_cost=kitchen();
		System.out.println("Total kitchen -----"+kitchitems_cost);
		System.out.println();
		Double snacks_cost=snacks();
		System.out.println("Total snacks-------"+snacks_cost);
		System.out.println();
		Double total_items_cost=fruits_cost+cakes_cost+kitchitems_cost+snacks_cost;
		System.out.println("------------------------------------------------");
		System.out.println("Total Bill is-----------------"+total_items_cost);
	}	
	public Double fruits() {
		Double fruits_cost=0.0;
		Map<String,Double> fruits=new HashMap<String, Double>();
							fruits.put("Mango", 250.50);
							fruits.put("Banana", 350.50);
							fruits.put("Orange", 250.50);
							fruits.put("guwa", 650.50);
		for(Entry<String, Double> fru:fruits.entrySet()) {
			System.out.println(fru.getKey()+"               --"+fru.getValue());
			Double cost=fru.getValue();
			fruits_cost=cost+fruits_cost;
		}
		Double total_fruits_cost=gst(fruits_cost,Catagory.fruits);
		return total_fruits_cost;
	}	
	public Double cakes() {
		Double cakes_cost=0.0;
		Map<String,Double>  cakes=new HashMap<String, Double>();
							cakes.put("choclate", 250.50);
							cakes.put("strwaberry", 350.50);
							cakes.put("coolckake", 250.50);
						
		for(Entry<String, Double> cake:cakes.entrySet()) {
			System.out.println(cake.getKey()+"               --"+cake.getValue());
			Double cost=cake.getValue();
			cakes_cost=cost+cakes_cost;
		}
		Double total_cakes_cost=gst(cakes_cost, Catagory.cakes);
		return total_cakes_cost;
	}
	public Double snacks() {
		Double snacks_cost=0.0;
		Map<String,Double>  snacks=new HashMap<String, Double>();
							snacks.put("biscut", 250.50);
							snacks.put("lays", 350.50);
							snacks.put("choclate", 250.50);
						
		for(Entry<String, Double> snack:snacks.entrySet()) {
			System.out.println(snack.getKey()+"               --"+snack.getValue());
			Double cost=snack.getValue();
			snacks_cost=cost+snacks_cost;
		}
		Double total_snacks_cost=gst(snacks_cost, Catagory.snacks);
		return total_snacks_cost;
	}
	public Double kitchen() {
		Double kitchenItems_cost=0.0;
		Map<String,Double>  kitchen=new HashMap<String, Double>();
							kitchen.put("atta", 250.50);
							kitchen.put("chilli powder", 350.50);
							kitchen.put("gingar", 250.50);
						
		for(Entry<String, Double> kitchenitem:kitchen.entrySet()) {
			System.out.println(kitchenitem.getKey()+"               --"+kitchenitem.getValue());
			Double cost=kitchenitem.getValue();
			kitchenItems_cost=cost+kitchenItems_cost;
		}
		Double total_kitchen_cost=gst(kitchenItems_cost, Catagory.kitchen);
		return total_kitchen_cost;
	}
	public Double gst(Double itemCost, String itemType) {
		Double gstValue;
	if(itemType.equals(Catagory.fruits)) {
		gstValue=1.15;
		System.out.println("gst on fruits "+gstValue);
	   return itemCost*gstValue;
	}else if(itemType.equals(Catagory.cakes)) {
		gstValue=1.16;
		System.out.println("gst on cakes "+gstValue);
		return itemCost*gstValue;
	}else if(itemType.equals(Catagory.kitchen)) {
		gstValue=1.17;
		System.out.println("gst on cakes "+gstValue);
		return itemCost*gstValue;
	}else {
		gstValue=1.18;
		System.out.println("gst on items "+gstValue);
	  return itemCost*gstValue;
	}
	}
	public static void main(String[] args) {
		Bigbasket bb=new Bigbasket();
		bb.billing();
	}

 }
