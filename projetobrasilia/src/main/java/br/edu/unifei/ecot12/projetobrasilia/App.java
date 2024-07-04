package br.edu.unifei.ecot12.projetobrasilia;
import br.edu.unifei.ecot12.projetobrasilia.art.*;
import br.edu.unifei.ecot12.projetobrasilia.localization.*;
import br.edu.unifei.ecot12.projetobrasilia.peopleandrecorder.*;
import br.edu.unifei.ecot12.projetobrasilia.politicalcontext.*;
import java.lang.Thread;

public class App 
{

    public static void sleepMain(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
        }
    }

    public static void trackStart(){

        new Thread(){
            @Override
            public void run(){
                LyricSector lyricSector = new LyricSector();
                InstrumentalSector instrumentalSector = new InstrumentalSector();
        
                Writer viniciusMoraes = lyricSector.buildArtist();
                viniciusMoraes.setName("Vinicius de Moraes");
                viniciusMoraes.setTypeOfArt("Literary");
                viniciusMoraes.setLiterarySchool("Modernimso");
                viniciusMoraes.setGenre("Male");
        
                Composer tomJobim = instrumentalSector.buildArtist();
                tomJobim.setName("Tom Jobim");
                tomJobim.setTypeOfArt("Musical");
                tomJobim.setComposerDayHours(5);
                tomJobim.setGenre("Male");
        
                Album sinfoniaDaAlvorada = new Album(viniciusMoraes, tomJobim);
                sinfoniaDaAlvorada.setNumOfTracks(5);
                sinfoniaDaAlvorada.setTitle("Sinfonia da Alvorada");
                
                sleepMain(1500);
                System.out.println("At the same time, with the development enviroment, a new musical type " + 
                "emerged in the country. Bossa nova was made in this context, and" + 
                " could not pass without mention the Brasilia city\n");
                sleepMain(3000);

                System.out.println("\n" + sinfoniaDaAlvorada.getComposer().getName() + " and " + 
                sinfoniaDaAlvorada.getWriter().getName() + " made the album " + 
                sinfoniaDaAlvorada.getTitle() + " for the city contruction process");
                Song otrabalhoeaconstrucao = new Song();
                String path = "C:\\Users\\sirle\\OneDrive\\Documentos\\Projeto de Software\\finalproject\\projetobrasilia\\src\\main\\java\\br\\edu\\unifei\\ecot12\\projetobrasilia\\otrabalhoeaconstrucao.wav";
                otrabalhoeaconstrucao.setSongPath(path);
        
                sinfoniaDaAlvorada.getSongs().add(otrabalhoeaconstrucao);
                sinfoniaDaAlvorada.playTrack(0);

            }
        }.start();
}
    public static void main( String[] args )
    {


        //Country
        Country brazil = new Country();
        brazil.setName("Brazil");
        brazil.setCoin("Real");
        brazil.setContinent("South America");

        //Capital 
        Capital rioDeJaneiro = new Capital();
        rioDeJaneiro.setName("Rio de Janeiro");
        brazil.setCapital(rioDeJaneiro);
        System.err.println("The capital of " + brazil.getName() + " was " +
                            brazil.getCapital().getName());

        System.out.println();
        sleepMain(1500);


        //Suggestion for internalization of the capital:
        Monarchy brazilMonarchy = new Monarchy();
        brazilMonarchy.setTypology("Constitutional monarchy");
        FederalGnmt fdr = new FederalGnmt();
        brazil.setGnmt(fdr);
        fdr.setRegime(brazilMonarchy);
        fdr.setYear(1889);
        fdr.toRule();


        Monarch domPedro2 = new Monarch();
        domPedro2.setFamily("Real brazilian Family");
        domPedro2.setName("Pedro de Alcântara");
        domPedro2.setRank("Emperor");
        brazilMonarchy.setHeadOfState("Emperor");
        brazilMonarchy.getMonarchs().add(domPedro2);
        System.out.println("Brazil was one " + brazilMonarchy.getTypology() + 
                            " and the head of state was " + brazilMonarchy.getHeadOfState()
                            + " " + domPedro2.getName());

        System.out.println();
        sleepMain(4000);

        
        //Brazilian republic proclamation in 1889:
        Order order = new Order();
        Conservative conservative = new Conservative();
        order.setIdeology(conservative);
        fdr = order.buildFederal();
        fdr.setYear(1889);

        President president = President.getPresident();
        president.setName("Deodoro da Fonseca");
        Republic brazilRepublic = new Republic(president);
        brazilRepublic.setHeadOfState(president.getName());
        fdr.setRegime(brazilRepublic);
        System.out.println("The republic proclamation in Brazil was in " + fdr.getYear() + 
                            " and the first president was " + brazilRepublic.getPresident().getName());
        fdr.toRule();

        System.out.println();
        sleepMain(4000);


        //The suggestion to internalization of the capital(1891):
        fdr.setYear(1891);
        Monarch marquesPombal = new Monarch();
        marquesPombal.setName("Sebastião José de Carvalho e Melo");
        marquesPombal.setRank("Marques");
        marquesPombal.setGenre("Male");
        System.out.println(marquesPombal.getName() + 
                                            " was the first to suggest about internalization of the capital");
        State goias = new State();
        goias.setName("Goiás");
        goias.setRegion("Centro-oeste");
        brazil.getStates().add(goias);
        System.out.println("The chosen region for new capital was " + goias.getRegion());

        System.out.println();
        sleepMain(4000);



        //President Juscelino Kubitscheck years:
        president.setName("Juscelino Kubitschek");
        president.setGenre("Male");
        president.setUnity("Federation");
        president.setYears(4);
        brazilRepublic.setHeadOfState(president.getName());
        brazilRepublic.setElectionYear(1955);
        fdr.setSlogan("50 years in 5");
        System.out.println("President " + president.getName() +" was the responsible for the construction" +
                            " of the new capital with his Government slogan: " + fdr.getSlogan());

        System.out.println();
        trackStart();
        sleepMain(8000);

        //Designer for new Capital:
        Architech oscarNiemeyer = new Architech();
        oscarNiemeyer.setName("Oscar Niemeyer");
        oscarNiemeyer.setGenre("Male");
        oscarNiemeyer.setCollege("Escola de Belas Artes da Universidade Federal do Rio de Janeiro");

        UrbanPlanner lucioCosta = new UrbanPlanner();
        lucioCosta.setName("Lúcio Costa");
        lucioCosta.setGenre("Male");
        lucioCosta.setCollege("Escola de Belas Artes da Universidade Federal do Rio de Janeiro");

        Engineer joaquimCardozo = new Engineer();
        joaquimCardozo.setName("Joaquim Cardozo");
        joaquimCardozo.setGenre("Male");
        joaquimCardozo.setCollege("Escola de Engenharia de Pernambuco");
        joaquimCardozo.setEngineerCourse(EngineerCourseEnum.STRUCTURAL);



        //Emergence of the city:
        fdr.setYear(1956);
        Capital brasilia = new Capital();
        brasilia.setName("Brasília");
        brasilia.setGnmt(fdr);
        brasilia.setArchitech(oscarNiemeyer);
        brasilia.setUrbanPlanner(lucioCosta);
        brasilia.setEngineer(joaquimCardozo);

        System.out.println("\nBrasilia was designed by: ");
        System.out.println(brasilia.getArchitech().getName());
        System.out.println(brasilia.getUrbanPlanner().getName());
        System.out.println(brasilia.getEngineer().getName());

        brasilia.setFoundedIn(fdr.getYear());
        brasilia.setParliamentName("National congress");
        brazil.setCapital(brasilia);

        System.out.println();
        sleepMain(6000);

        System.out.println("Brasilia was founded in " + brasilia.getFoundedIn() +
                            " incomplete, but with many ihanbitants");
        sleepMain(3000);
        System.out.println("The city still draws attention today for its modern architecture" + 
                            " and urban structure. The country has developed a lot with " + 
                            brazilRepublic.getPresident().getName() +
                            "'s target plan, but there are those who say that the country " +
                            " is still paying the bills for this development");

        System.out.println();

    }
}
