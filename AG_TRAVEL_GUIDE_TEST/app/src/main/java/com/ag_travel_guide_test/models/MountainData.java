package com.ag_travel_guide_test.models;

import java.util.ArrayList;

public class MountainData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Nandi Hills",
                    "1,478 m (4849 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/1/12/Nandi_hills_Banglore.jpg",
                    "Nandi Hills, or Nandidurg, is a hill fortress in the south Indian state of Karnataka. Tipu Sultan Fort, a summer retreat of the namesake 18th-century ruler, features stone carvings and wall paintings. Prisoners are said to have been thrown to their death from Tipu’s Drop, now known for its panoramic views. Local Hindu temples include the hilltop Yoga Nandeeshwara Temple, guarded by a huge statue of a bull (nandi).",
                    "Banglore, Karnataka, India"},
            {"Antergange",
                    "1712 m (5616 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/3/31/Antergange.jpg",
                    "Antara Gange (also known as Anthargange) is a mountain situated in the Shathashrunga mountain range in the southeastern portion of the Indian state of Karnataka, Kolar district. Antara Gange literally means Ganges from deep in Kannada. It is about two miles from the town of Kolar and seventy kilometers from Bangalore. Antara Gange is famous for Sri Kashi Vishweshwara temple, also known as Kashi of South. The temple is dedicated to Lord Shiva. In the temple is a pond which gets a continuous flow of underground water from the mouth of a Basava (stone bull). It is believed that drinking water from the pond cleanse one from many diseases.",
                    "Banglore, Karnataka, India"},
            {"Mysore Palace",
                    "72 acres",
                    "https://upload.wikimedia.org/wikipedia/commons/7/79/Mysore_Palace_Mysore.jpg",
                    "The Mysore Palace is a historical palace and the royal residence at Mysore in the Indian State of Karnataka. It is the official residence of the Wadiyar dynasty and the seat of the Kingdom of Mysore. The palace is in the centre of Mysore, and faces the Chamundi Hills eastward. Mysore is commonly described as the 'City of Palaces', and there are seven palaces including this one; however, 'Mysore Palace' refers specifically to this one within the Old fort.",
                    "Mysore, Karnataka, India"},
            {"Bannerghatta Biological Park",
                    "260.5 km²",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Bannerghatta_national_park_Banglore.jpg",
                    "Bannerghatta National Park, near Bangalore, Karnataka, was founded in 1970 and declared as a national park in 1974.[1] In 2002 a portion of the park, became a biological reserve, the Bannerghatta Biological Park. It is a popular tourist destination with a zoo, a pet corner, an animal rescue centre, a butterfly enclosure, an aquarium, a snake house and a safari park.There are ancient temples in the park for worship and it is a destination for trekking and hiking. The Zoo Authority of Karnataka, the University of Agricultural Sciences, Bangalore, and the Ashoka Trust for Research in Ecology and Environment (ATREE), Bangalore, are collaborating agencies.",
                    "Karnataka, India"},
            {"Bangalore Palace",
                    "454 acres",
                    "https://upload.wikimedia.org/wikipedia/commons/c/c5/Bangalore_palace_Banglore.jpg",
                    "Bangalore Palace, a palace located in Bengaluru, Karnataka, India, was built by Rev. J. Garrett, who was the first Principal of the Central High School in Bangalore, now known as Central College. Rev. J. Garrett, the first principal of the Central High School, built this palace with a floor area of 45,000 sq ft (4200 m²). The palace and the grounds surrounding it are spread across 454 acres (183 hectares). British officials who were in charge of the education of the young prince HH Chamaraja Wodeyar bought the palace in 1873 A.D. from him at a cost of Rs. 40,000 and later renovated it. The palace was built in Tudor style architecture with fortified towers, battlements and turrets.",
                    "Banglore, Karnataka, India"},
            {"Vidhana Soudha",
                    "107 metres (699 by 351 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/2/2f/Vidhana_Souda_Bangalore.jpg",
                    "The Vidhana Soudha located in Bengaluru, is the seat of the state legislature of Karnataka. It is an imposing building, constructed in a style sometimes described as Mysore Neo-Dravidian, and incorporates elements of Indo-Saracenic and Dravidian styles. The construction was completed in 1956.",
                    "Bangalore, Karnataka, India"},
            {" ISKCON Temple",
                    "8.5 m (28 ft)",
                    "https://upload.wikimedia.org/wikipedia/commons/8/83/Iskcon_temple.jpg",
                    "In May 1997, Bangalore ISKCON Temple was inaugurated by the ninth president of India—Shankar Dayal Sharma.[2][4] Since 1999 it is under control of ISKCON Revival Movement.Darshan timings\n" +
                            "The temple is open from 4:30 a.m. to 5:00 am. The day begins with a Grand arati ceremony called mangala-arati followed by worship of Tulasi Devi, Sri Narasimha Arati and Suprabhata Seva for Sri Srinivasa Govinda. The temple again opens at 7:15 a.m. for Shringara Darshana Arati. 5:15 a.m. to 7:15 a.m.: Japa Meditation session. The temple remains open until 1:00 p.m. In the evening the temple is open from 4:15 to 8:15. During weekends and public holidays Temple timings are 4:30 a.m. to 5:00 a.m. and 7:00 a.m. to 8:30 p.m. without any break in the afternoon. The evening arati starts at 7:00 where devotees sing kirtan. In the main temple the arati is performed by three priests. This arati is followed again by kirtan where devotees can be seen dancing to the rhythm of \"Hare Krishna Hare Rama\".",
                    "Banglore, Karnataka, India"},
            {"Lalbagh Botanical Garden",
                    "0.971246 km2 (0.375000 sq mi)",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5d/Botanical_Garden_Banglore.jpg",
                    "Lalbagh Botanical Garden, or shortened Lalbagh, is an old botanical garden in Bengaluru, India. First planned and laid out during the Dalavaiship of Hyder Ali and later adorned with unique plant species by his son Tippu, it was later managed under numerous British Superintendents before Indian Independence. It was responsible for the introduction and propagation of numerous ornamental plants as well as those of economic value. It also served a social function as a park and recreational space, with a central glasshouse dating from 1890 which was used for flower shows. In modern times it hosts two flower shows coinciding with the week of Republic Day (26 January) and Independence Day (15 August). As an urban green space along with Cubbon Park, it is also home to numerous wild species of birds and other wildlife. The garden also has a lake adjoining a large rock on which a watchtower had been constructed during the reign of Kempegowda II.",
                    "Banglore, Karnataka, India"},
            {"Fun World",
                    "22 acres ",
                    "https://upload.wikimedia.org/wikipedia/commons/3/37/Fun_world.jpg",
                    "Fun World Amusement Park is one of the most popular amusement parks in Bangalore situated in the neighborhood of JC Nagar. Sprawling over 22 acres of land, the park has both water rides and regular rides. Besides the locker rooms, changing areas and several pools, the theme park also has a food court, a green garden and food court to satiate your taste buds.\n" + "\n",
                    "Banglore, Karnataka, India"},
            {"Snow City",
                    "12,500 sq ft",
                    "https://upload.wikimedia.org/wikipedia/commons/e/ef/Snow_City_Banglore_P.jpg",
                    "Snow City is a unique, one of a kind amusement located in JC Nagar in Bangalore. Covered in artificial snow and generously sprinkled with snow animal sculptures, toys and igloos, the theme park is a popular destination for the city folks especially the kids. Besides, the park also has a plethora of swings and slide for the children and a gorgeous snow castle.",
                    "Banglore, Karnataka, India"}


    };

    public static ArrayList<Mountain> getListData() {
        Mountain mountain;
        ArrayList<Mountain> list = new ArrayList<>();

        for (String[] mData : data) {
            mountain = new Mountain();
            mountain.setName(mData[0]);
            mountain.setElevation(mData[1]);
            mountain.setPhoto(mData[2]);
            mountain.setDescription(mData[3]);
            mountain.setLocation(mData[4]);

            list.add(mountain);
        }

        return list;
    }

}
