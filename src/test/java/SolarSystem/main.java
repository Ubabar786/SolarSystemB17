package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystembasics solarsys = new solarSystembasics();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        //***FeatureSun***
        FeatureSun sun=new FeatureSun();
        sun.name="panther";
        sun.colour="black";
        sun.temp="-1223124kelvin";

        //***Planet1***
        Planet1 plato=new Planet1();
        plato.colour="green";
        plato.name="abracadabra";
        plato.temp="100000000k";
        plato.radius="800000k";


    }
}
