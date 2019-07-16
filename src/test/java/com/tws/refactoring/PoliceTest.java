package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    @Test
    public void should_return_true_when_age_is_larger_than_18(){
        //given
        Driver driver=new Driver(19);
        Police police=new Police();
        //when
        boolean ageCompareto18=police.checkDriver(driver);
        //then
        assertTrue(ageCompareto18);

    }
    @Test
    public void should_return_true_when_age_is_18(){
        //given
        Driver driver=new Driver(18);
        Police police=new Police();
        //when
        boolean ageCompareto18=police.checkDriver(driver);
        //then
        assertTrue(ageCompareto18);

    }
    @Test
    public void should_return_true_when_age_is_smaller_than_18(){
        //given
        Driver driver=new Driver(17);
        Police police=new Police();
        //when
        boolean ageCompareto18=police.checkDriver(driver);
        //then
        assertFalse(ageCompareto18);

    }
}