package com.bridgelap.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Contacts contact = new Contacts();
        contact.setFirstName("mohita");
        System.out.println(contact.getFirstName());
    }

    }

