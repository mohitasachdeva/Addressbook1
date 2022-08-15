package com.bridgelap.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
   // Contacts contact = new Contacts();
   ArrayList<Contacts> list = new ArrayList<>();
    Scanner scr = new Scanner(System.in);

    void addContact(){
        Contacts contact = new Contacts();
        System.out.println("Enter first name");
        contact.setFirstName(scr.next());
        System.out.println("Enter last name");
        contact.setLastName(scr.next());
        System.out.println("Enter city");
        contact.setCity(scr.next());
        System.out.println("Enter state");
        contact.setState(scr.next());
        System.out.print("Enter address:  ");
        scr.nextLine();
        contact.setAddress(scr.nextLine());
        System.out.println("Enter phone Number");
        contact.setPhoneNumber(scr.nextLong());
        System.out.println("Enter email address");
        contact.setEmail(scr.next());
        list.add(contact);

    }
    void editContact() {
        System.out.println("Enter the first name of person to edit");
        String firstName = scr.next().toLowerCase();
        boolean found = false;
        for (Contacts contact : list) {
            if (firstName.equals(contact.getFirstName().toLowerCase())) {
                System.out.println("Edit the details of person");
                System.out.println("Enter first name");
                contact.setFirstName(scr.next());

                System.out.println("Enter last Name");
                contact.setLastName(scr.next());

                System.out.println("Enter Email");
                contact.setEmail(scr.next());

                System.out.print("Enter address:  ");
                scr.nextLine();
                contact.setAddress(scr.nextLine());

                System.out.println("Enter phone number");
                contact.setPhoneNumber(scr.nextLong());

                System.out.println("Enter state");
                contact.setState(scr.next());

                System.out.println("Enter city");
                contact.setCity(scr.next());


            } else {
                System.out.println("Person not found");
            }

        }
    }
    void deleteContact(){
        System.out.println("Enter the first name of person to edit");
        String firstName = scr.next().toLowerCase();
            boolean found = false;
            for (Contacts contact : list){
        if (firstName.equals(contact.getFirstName().toLowerCase())){
            list.remove(contact);
            found = true;
            System.out.println("Contact deleted successfully");
            break;
        }
            }
            if (!found){
                System.out.println("No contact found");
            }
        }



    Contacts display(){
        if(list.isEmpty()){
            System.out.println("No contacts to display");
        }
        else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }
    }
}




