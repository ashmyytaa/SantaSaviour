import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SantaBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SantaBackground extends World
{
    GreenfootSound bgMusic = new GreenfootSound("magicalchristmas.wav");
    private Counter theCounter;
    /**
     * Constructor for objects of class SantaBackground.
     * 
     */
    public SantaBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 800, 1); 
        prepare();
        started();
        theCounter = new Counter();
        addObject(theCounter, 0, 0);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Santa santa = new Santa();
        addObject(santa,504,156);
        santa.setLocation(538,158);
        santa.setLocation(43,274);
        santa.setLocation(128,280);
        santa.setLocation(18,280);
        santa.setLocation(130,300);
        santa.setLocation(112,304);
        santa.setLocation(62,310);

        santa.setLocation(183,410);
        Snowflake snowflake = new Snowflake();
        addObject(snowflake,827,118);
        Snowflake snowflake2 = new Snowflake();
        addObject(snowflake2,563,174);
        Snowflake snowflake3 = new Snowflake();
        addObject(snowflake3,701,375);
        Snowflake snowflake4 = new Snowflake();
        addObject(snowflake4,335,278);
        Snowflake snowflake5 = new Snowflake();
        addObject(snowflake5,540,586);
        Snowflake snowflake6 = new Snowflake();
        addObject(snowflake6,816,699);
        Snowflake snowflake7 = new Snowflake();
        addObject(snowflake7,288,690);
        Star star = new Star();
        addObject(star,512,351);
        Star star2 = new Star();
        addObject(star2,788,520);
        Star star3 = new Star();
        addObject(star3,720,204);
        Star star4 = new Star();
        addObject(star4,140,164);
        snowflake4.setLocation(417,236);
        santa.setLocation(220,401);
        santa.setLocation(269,411);
        star.setLocation(451,447);
        snowflake4.setLocation(346,216);
        star.setLocation(493,391);
        star2.setLocation(722,581);
        snowflake7.setLocation(319,631);
        snowflake5.setLocation(385,641);
        snowflake5.setLocation(510,566);
        snowflake4.setLocation(394,290);
        snowflake2.setLocation(519,151);
        snowflake3.setLocation(764,359);
        snowflake3.setLocation(704,396);
        star2.setLocation(741,544);
        Star star5 = new Star();
        addObject(star5,846,395);
        Star star6 = new Star();
        addObject(star6,467,708);
        snowflake4.setLocation(372,240);
        santa.setLocation(116,420);
        removeObject(snowflake7);
        star.setLocation(352,487);
        snowflake4.setLocation(364,331);
        star3.setLocation(540,344);
        snowflake3.setLocation(729,235);
        star.setLocation(303,519);
        snowflake4.setLocation(366,245);
        santa.setLocation(168,415);
        star3.setLocation(553,428);
        snowflake2.setLocation(568,368);
        star3.setLocation(579,126);
        snowflake4.setLocation(376,319);
        snowflake4.setLocation(342,245);
        snowflake5.setLocation(499,503);
        snowflake3.setLocation(810,216);
        snowflake3.setLocation(736,434);
        star5.setLocation(800,262);
        snowflake3.setLocation(841,423);
        snowflake5.setLocation(512,521);
        snowflake2.setLocation(594,296);
        star.setLocation(412,403);
        snowflake5.setLocation(365,552);
        star6.setLocation(552,641);
        star2.setLocation(799,595);
        snowflake6.setLocation(633,487);
        star2.setLocation(784,631);
        removeObject(snowflake2);
        star.setLocation(412,413);
        removeObject(star);
        snowflake6.setLocation(557,365);
        removeObject(snowflake5);
        snowflake6.setLocation(499,489);
        star5.setLocation(680,363);
        snowflake4.setLocation(404,275);
        star6.setLocation(317,635);
        snowflake6.setLocation(527,500);
        snowflake6.setLocation(514,483);
        removeObject(snowflake6);
        star5.setLocation(481,507);
        snowflake4.setLocation(412,279);
        star3.setLocation(644,159);
        snowflake4.setLocation(480,321);
        star5.setLocation(668,494);
        snowflake4.setLocation(399,284);
        snowflake3.setLocation(610,350);
        removeObject(star5);
        snowflake3.setLocation(651,494);
        star2.setLocation(814,383);
        star6.setLocation(476,622);
        star4.setLocation(266,115);
        snowflake3.setLocation(636,476);
        snowflake3.setLocation(607,347);
        snowflake4.setLocation(426,248);
        Snowflake snowflake8 = new Snowflake();
        addObject(snowflake8,734,561);
        Snowflake snowflake9 = new Snowflake();
        addObject(snowflake9,459,450);
        snowflake4.setLocation(408,170);
        snowflake3.setLocation(673,375);
        star3.setLocation(577,275);
        snowflake9.setLocation(407,310);
        snowflake9.setLocation(408,359);
        star6.setLocation(404,568);
        snowflake8.setLocation(598,611);
        snowflake3.setLocation(683,446);
        star3.setLocation(635,208);
        snowflake9.setLocation(453,354);
        snowflake9.setLocation(247,296);
        snowflake8.setLocation(701,695);
        snowflake9.setLocation(158,655);
        snowflake4.setLocation(398,260);
        star3.setLocation(576,122);
        snowflake3.setLocation(736,541);
        star2.setLocation(610,407);
        snowflake3.setLocation(818,388);
        snowflake8.setLocation(719,661);
        star6.setLocation(480,576);
        snowflake4.setLocation(407,316);
        star3.setLocation(183,338);
        snowflake4.setLocation(596,198);
        star3.setLocation(441,299);
        star3.setLocation(400,336);
        star3.setLocation(357,274);
        star6.setLocation(376,583);
        star2.setLocation(620,474);
        snowflake3.setLocation(484,431);
        star2.setLocation(822,391);
        snowflake3.setLocation(566,488);
        snowflake8.setLocation(821,693);
        star6.setLocation(432,660);
        star3.setLocation(473,336);
        snowflake4.setLocation(652,177);
        snowflake4.setLocation(632,250);
        snowflake4.setLocation(586,196);
        snowflake3.setLocation(628,555);
        star6.setLocation(407,620);
        snowflake4.setLocation(603,180);
        snowflake.setLocation(858,101);
        star4.setLocation(246,144);
        star3.setLocation(522,355);
        snowflake4.setLocation(619,186);
        star6.setLocation(461,647);
        snowflake3.setLocation(667,540);
        snowflake9.setLocation(247,614);
        star3.setLocation(459,285);
        star3.setLocation(504,351);
        star2.setLocation(767,412);
        snowflake4.setLocation(624,151);
        snowflake3.setLocation(392,216);
        snowflake4.setLocation(704,172);
        star3.setLocation(560,426);
        star2.setLocation(809,350);
        star3.setLocation(560,413);
        snowflake8.setLocation(764,564);
        star3.setLocation(645,651);
        star3.setLocation(581,374);
        star2.setLocation(857,390);
        snowflake8.setLocation(778,668);
        star6.setLocation(478,676);
        snowflake3.setLocation(503,164);
        star4.setLocation(240,156);
        snowflake8.setLocation(756,650);
        snowflake8.setLocation(768,687);
        snowflake4.setLocation(724,283);
        snowflake8.setLocation(711,550);
        star6.setLocation(446,686);
        snowflake9.setLocation(366,540);
        star6.setLocation(564,667);
        snowflake8.setLocation(770,638);
        star6.setLocation(588,679);
        snowflake9.setLocation(394,525);
        star4.setLocation(283,235);
        snowflake3.setLocation(556,182);
        snowflake4.setLocation(748,282);
    }
    public Counter getCounter()
    {
        return theCounter;
    }
    public void started()
    {
        bgMusic.playLoop();
    }
}
