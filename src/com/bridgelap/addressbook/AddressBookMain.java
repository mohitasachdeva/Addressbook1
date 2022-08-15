package com.bridgelap.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook add = new AddressBook();

        add.addContact();
        System.out.println(add.display());
        add.editContact();
        System.out.println(add.display());
        add.deleteContact();
        System.out.println(add.display());

    }
    }



