package com.MaGrosskopf;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTests {

    @Test
    public void ZooObjektKannErstelltWerden(){
        Zoo meinZoo = new Zoo();
    }

    @Test
    public void KasseObjektKannErstelltWerden(){
        Kasse kasse = new Kasse();
    }
    @Test
    public void TicketObjektKannErstelltWerden(){
        Ticket ticket = new Ticket();
    }
    @Test
    public void BesucherObjektKannErstelltWerden(){
        Besucher besucher = new Besucher();
    }


}
