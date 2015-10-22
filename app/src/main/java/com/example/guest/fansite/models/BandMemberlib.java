package com.example.guest.fansite.models;

import com.example.guest.fansite.R;

import java.util.ArrayList;

/**
 * Created by Guest on 10/21/15.
 */
public class BandMemberlib {

    private ArrayList<BandMember> mBandMembers;

    public BandMemberlib(){
        setBandMembers();
    }

    public ArrayList<BandMember> getBandMembers(){
        return mBandMembers;
    }


    private void setBandMembers() {
        mBandMembers = new ArrayList<>();

        mBandMembers.add(new BandMember(
                "Colin Meloy",
                "Singer, front man",
                "Meloy was born in Helena, Montana. He attended the University of Oregon in Eugene for two years, studying English and theatre, before returning to Montana and enrolling in the creative writing program at the University of Montana in Missoula, where he graduated in 1998.",
                R.drawable.colin_meloy
        ));

        mBandMembers.add(new BandMember(
                "Jenny Conlee",
                "Hammond organ, accordion, piano, organ, backing voice",
                "Aside from her work with the Decemberists, Conlee has made guest appearances on several records by other artists, including Hush Records artist Reclinerland, Lewi Longmire, Jerry Joseph, Buoy LaRue and many others. Before the Decemberists, she played piano for the 1990s Portland, Oregon, band Calobo. She is also a member of Portland-based Casey Neill & The Norway Rats where she plays keyboards, accordion, and glockenspiel. Her most recent project is the acoustic band Black Prairie, in which she plays with a number of other Portland artists.",
                R.drawable.jenny_conlee
        ));

        mBandMembers.add(new BandMember(
                "Chris Funk",
                "vocals, guitar, mandolin, banjo ",
                "Funk joined the Decemberists after meeting Colin Meloy at a solo show Meloy was performing. He has been a member of the band since its formation, appearing on every Decemberists record since. Funk most commonly contributes guitar, pedal steel, and mandolin tracks to the band's songs, though he has laid down tracks with several other instruments as well. After an incident in which the band's equipment trailer was stolen in 2005, Funk wrote \"This Machine Kills Thieves\" on his banjo, in reference to Pete Seeger and Woody Guthrie.\n" +
                        "\n" +
                        "He is a member of Knock-knock with DJ Rev. Shines (from the hip-hop group Lifesavas on Quannum Projects). He is also a member of the string band Black Prairie who released their first album, Feast of the Hunter’s Moon, in 2010. He plays in the country rock group Blue Giant. He has produced records for The Builders and The Butchers, Langhorne Slim, and Red Fang,[citation needed] and curated the Portland edition of Burn to Shine DVD released in 2006.[clarification needed]\n" +
                        "\n" +
                        "On December 20, 2006, Funk appeared on Comedy Central's The Colbert Report to end a longstanding mock feud with the show's host, Stephen Colbert. A contest ensued in which Funk and Colbert would each play a guitar solo while a panel of judges decided the winner. After Funk's solo, Colbert (who cannot play the guitar) feigned an injured hand, having Peter Frampton fill in for him instead. The contest ended with Colbert/Frampton being decided the winners by show guests Eliot Spitzer and Henry Kissinger, and Colbert was awarded The Crane Wife by The Decemberists as the grand prize. Funk then performed an \"all-guitar jam\" alongside Frampton, Robert Schneider (of The Apples in Stereo), and Rick Nielsen.",
                R.drawable.chris_funk
        ));

        mBandMembers.add(new BandMember(
                "John Moen",
                "drums, percussion, backing voice",
                "John Moen is a musician and member of The Decemberists, Black Prairie, Boston Spaceships, Eyelids, and Perhapst. He sings, plays the drums, banjo, the melodica, occasionally the keyboard, and dances around with a floor tom.[citation needed] Moen has played the drums since he was 15 years old.[1]\n" +
                        "\n" +
                        "Prior to joining The Decemberists, John played with over 20 bands including singer-songwriter Elliott Smith, The Jicks,[2] Cavemanish Boys, The Dharma Bums, The Minus 5 (sometimes) and the Maroons. More recently, John has been working with Decemberists side project Black Prairie, playing on their most recent album and performing live.\n" +
                        "\n" +
                        "He was born in Brainerd, Minnesota and raised in Salem, Oregon. He has been an integral part of the music scene in and around Portland, Oregon since the 1980s. He has one daughter and has expressed interest in gardening and cooking. He is also a big fan of the Portland Trail Blazers NBA team.[3]\n" +
                        "\n" +
                        "Moen's nicknames include Spydur, Hot Dog, Crazy Uncle John, Jack, Banjo, Dusty, Johnny Go Go Go, and Mighty Music Cotton Candy Man.",
                R.drawable.john_moen

        ));

        mBandMembers.add(new BandMember(
                "Nate Query",
                "Upright bass, electric bass, cello, percussion",
                "Nate Query is an American musician best known as the bassist of the Portland, Oregon indie rock band The Decemberists. He is also a member of Black Prairie. He makes appearances on many albums by Portland artists, including Laura Gibson, Rebecca Gates, the Minus 5, and Laura Veirs. He is also credited on Michael Zapruder's record. Former bands include Calobo and Everyday Dirt. His most recent project is the acoustic band Black Prairie with a number of other Portland artists. He attended Portland's West Sylvan Middle School. He is an avid homebrewer.",
                R.drawable.nate_query
        ));




    }
}
