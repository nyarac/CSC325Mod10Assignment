package org.example;

// Abstract Factory design
interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}

class ProfessionalGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new ProfessionalTop();
    }

    public Pants createPants() {
        return new ProfessionalPants();
    }

    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}

class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }

    public Pants createPants() {
        return new CasualPants();
    }

    public Shoes createShoes() {
        return new CasualShoes();
    }
}

class PartyGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new PartyTop();
    }

    public Pants createPants() {
        return new PartyPants();
    }

    public Shoes createShoes() {
        return new PartyShoes();
    }
}

interface Top {
    String toString();
}

interface Pants {
    String toString();
}

interface Shoes {
    String toString();
}

// Concrete Product classes
class ProfessionalTop implements Top {
    public String toString() {
        return "Professional Top";
    }
}

class ProfessionalPants implements Pants {
    public String toString() {
        return "Professional Pants";
    }
}

class ProfessionalShoes implements Shoes {
    public String toString() {
        return "Professional Shoes";
    }
}

class CasualTop implements Top {
    public String toString() {
        return "Casual Top";
    }
}

class CasualPants implements Pants {
    public String toString() {
        return "Casual Pants";
    }
}

class CasualShoes implements Shoes {
    public String toString() {
        return "Casual Shoes";
    }
}

class PartyTop implements Top {
    public String toString() {
        return "Party Top";
    }
}

class PartyPants implements Pants {
    public String toString() {
        return "Party Pants";
    }
}

class PartyShoes implements Shoes {
    public String toString() {
        return "Party Shoes";
    }
}

// Client code
public class Main {
    static void createGarments(GarmentFactory factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        System.out.println(top + ", " + pants + ", " + shoes);
    }

    public static void main(String[] args) {
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        GarmentFactory casualFactory = new CasualGarmentFactory();
        GarmentFactory partyFactory = new PartyGarmentFactory();

        createGarments(professionalFactory);
        createGarments(casualFactory);
        createGarments(partyFactory);
    }
}
