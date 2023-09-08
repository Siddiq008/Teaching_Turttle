package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class actionlay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actionlay1);
        String topic_1="Julius Caesar";
        String story_1="A 25 year old Julius Caesar was sailing the Aegean Sea when he was kidnapped by Sicilian pirates. The pirates who captured him initially asked for a ransom of 20 talents of silver (which is about 620 kg of silver or $600,000 by today's silver prices). According to Plutarch, rather than send his associates off to gather the silver, he instead laughed at the pirates and demanded they ask for 50 (1550 kg of silver), as 20 talents of silver was too small of a ransom for himself. The pirates, of course, agreed and Caesar sent some of his associates off to gather the silver, which took 38 days to accomplish. Now nearly alone with the pirates (only keeping two servants and one of his friends), rather than cower, he instead took the route of treating them as if they were his subordinates. He even went so far as to demand they not talk whenever he decided to take a nap or go to sleep for the night. He spent most of his time with them composing and reciting poetry, as well as writing speeches. He would then recite the works to the pirates. He also joined in with playing various games with the pirates and participating in their exercises, generally acting as if he wasn't a prisoner, but rather, their leader. The pirates quickly grew to respect and like him and allowed him the freedom to more or less do as he pleased on their island and ships.\n" +
                "While he was friendly with them, he also didn't appreciate being held captive. As such, he swore to them that he would hunt them down and have them crucified, once the ransom was paid. Despite the fact that at that time he was just acting as a private citizen, once he was free, he manage to quickly raise a small fleet which he took back to the island the pirates had held him at. Apparently they hadn't taken his threats seriously, because they were still there when he arrived. He captured them and took back his 50 talents of silver, along with all their possessions. He then had them crucified under his own authority, despite the proconsul of the region telling him not too and wanting to sell the pirates as slaves.\n";

        String topic_2="The United States once planned on nuking the moon ";
        String story_2=" The United States once planned on shooting a nuclear bomb at the moon. If you presumed that the reasoning behind such an act was \"because we can\", you are absolutely correct. That is exactly why the U.S. wanted to do it, in order to one-up the Soviet Union, who were perceived as leading the space race at the time.\n" +
                "The project was labeled \"A Study of Lunar Research Flights\" or \"Project A119\" and was developed by the U.S. Air Force in the late 1950s. It was felt that this would be a relatively easy thing to do and would also boost public perception of how the U.S. was doing in comparison to the Soviet Union in terms of the space race.\n" +
                "According to one of the leaders of the project, physicist Leonard Reiffel, hitting the moon with an intercontinental ballistic missile would have been relatively easy to accomplish, including hitting the target with an accuracy of about two miles. This accuracy\n" +
                "would have been particularly important as the Air Force wanted the resulting explosion to be clearly visible from Earth. As such, it was proposed that the explosion happen on the border of the visible part of the moon, so that the resulting cloud would be clearly visible, being illuminated by the sun.\n" +
                "The project was eventually scrapped as it was felt that the public would not respond favorably to the U.S. dropping a nuclear bomb on the moon.\n";
        String topic_3="The Real Life White Whale ";
        String story_3="The massive 70 foot long albino sperm whale was named Mocha Dick and was one of the two whales that inspired the novel Moby Dick. Mocha Dick was given his name as he was first sighted off the coast of Chile near Mocha Island; the latter \"Dick\" part of the name is thought to have simply been after the practice of naming certain deadly whales common names like \"Dick\" or \"Tom\". The whalers that first spotted him attempted to kill him, but he survived the encounter.\n" +
                "Over the course of the next 28 years, Mocha Dick earned a reputation as one of the most cunning and feared whales in the ocean. During that span, he was spotted and attacked by at least 100 whaling ships. He successfully destroying around 20 of those ships that attacked him and escaped all but the last.\n" +
                "According to famed explorer and writer Jeremiah N. Reynolds, Mocha Dick finally met his downfall after observing a mother whale whose calf had just been killed by whalers. The mother whale first attempted to herd her calf away from the whalers after it had been harpooned, but soon the calf went belly up. When the whale realized her calf was dead, she turned on the whalers and attempted, unsuccessfully, to destroy their ship. Instead, she herself was harpooned and mortally wounded before she was able to strike the ship.\n" +
                "Upon observing all this, Mocha Dick decided to get in on the fray and also attacked the whaling ship directly after the missed hit by the mother. Mocha Dick successfully destroyed one of the smaller whaling boats, but was mortally injured in the process by a harpoon.\n";
        String topic_4="EXPLOSION  ";
        String story_4=" The Tunguska event occurred around 7:00 a.m. local time on June 30, 1908. near the Podkamennaya Tunguska River in Siberia. Witnesses saw a \"blue-ish light, nearly as bright as the Sun, moving across the sky.\" What followed was an estimated 15 megaton explosion which knocked over about 80 million trees in about a 1300 square mile area, forming a butterfly shape pattern. This also sent a shock wave throughout parts of Europe and Asia, registering as far away as England (about 4000 miles away). Further, the atmospheric pressure change was also significant enough to be measured all the way in Great Brittan. Another interesting side effect of this blast was that, for several days after the blast throughout most of Asia and Europe, the night sky glowed. It was so bright that people as far away as China reportedly were able to read in the middle of the night by nothing but the glow of the sky.\n" +
                "For a long time, there was much debate over exactly what caused this, but today scientists are reasonably certain it was a comet. The comet must have been around 30-40 meters across (around 120 feet) and must have been traveling around 30,000-40,000 mph (about 55,000-65,000 km/h). As it traveled through the atmosphere, the air around it heated up to as much as 50,000 degrees Fahrenheit (about 28,000 degrees Celsius) causing the comet to look like a giant fireball streaking through the sky.\n" +
                "Eventually, this also caused the comet to annihilate itself around 5 miles (8 km) above the Earth's surface in a fiery that the comet, was largely made of ice. Thus, you get a massive explosion, but no impact crater or much of any apparent evidence of what caused the explosion, unless you witness it or start taking very careful soil samples and the like.\n";
        String topic_5="Jenny John's murder ";
        String story_5="According to Jonathan Schmitz, he was completely blindsided by the revelation that Scott Amedure was his \"secret admirer.\" The Jenny Jones producers, however, argued that they told Schmitz that the person could be a man or a woman.\n" +
                "Regardless of which version of events you believe, the end result was still the same: Three days after the show was taped, Amedure reportedly left a suggestive note in Schmitz's mailbox, leading to a lethal confrontation.\n" +
                "After Amedure admitted to Schmitz that he left the note in the mailbox, Schmitz went to his car, pulled out a shotgun, and fired two rounds into Amedure's chest, killing him instantly in what became known as the \"Jenny Jones Murder.\" Schmitz then phoned 911 and confessed to the murder, though he would later testify that he felt \"gay panic\" in his defense.\n" +
                "Nevertheless, in 1996, he was ultimately convicted of second-degree murder. The conviction was subsequently overturned on appeal, but a 1999 retrial found Schmitz guilty of the same charge, and he received the same sentence.\n" +
                "In 2017, Jonathan Schmitz was released from jail. And though he's remained out of the spotlight ever since, Frank Amedure Jr. - Scott Amedure's brother - wasn't convinced that his brother's killer had learned his lesson.\n" +
                "\"I wanted assurance that the decision was not based on just good behavior in prison,\" he said to The Detroit Free Press. \"I'd like to know that he learned something, that he's a changed man, is no longer homophobic and has gotten psychological care.\"\n";
        String topic_6="Frankenstein (Mary Shelley, 1818)";
        String story_6="Mary Shelley's 1818 novel, which celebrates its 200th anniversary this year, is \"the quintessential story of the modern world\" says Roger Luckhurst, Professor of Modern and Contemporary Literature at Birkbeck College, London.\n" +
                " It's a \"violent reconfiguring of our understanding of life and death, God and human and machine, in the pitiless light of modernity,\" according to the US novelist and literary critic Lev Grossman. The compelling story of the scientist who brings a creature to life has become one of the most enduring images in modern literature and beyond, and the monster serves as the \"ultimate metaphor\", says Lena Wånggren, Research Fellow in English Literature at the University of Edinburgh. \n" +
                "The novel's impact, both in terms of literature and in wider culture is immeasurable, as Nilanjana S Roy, novelist and Financial Times columnist, points out: \"Frankenstein influenced scientists as well as writers... [and] speaks to the modern fear of the creations that spin out of our control\"; for Tess Taylor, poet and reviewer for NPR's All Things Considered \"this book has become not only a template whose basic narrative we now commonly share, but a lens through which to read our world.\" \n";
        String topic_7="The First University Opens in 895 CE in Fez";
        String story_7="The oldest existing, continually operating institution of higher learning in the world is the University of Karueein (University of al-Qarawiyyin), founded in 859 CE in Fez (Morocco) by Fatima bint Muhammad Al-Fihriya Al-Qurashiya. That's right: The first university was founded by a woman (although women were not admitted to the institution until the 1940s).\n" +
                "Although it started as a mosque, its teachings expanded over centuries and it morphed into a widely respected general educational institution (although it wasn't officially declared a state university until 1963). The Guinness Book of World records recognizes it as the first university in the world.\n" +
                "Can you imagine a world without schools? The idea that learning is important and that ideas should be valued, recorded, discussed, shared, and passed down is one that significantly changed the world. By 2040, it is estimated that there will be 600 million students enrolled in universities around the world per year.\n" +
                " facts:\n" +
                "-> The first education system was created in the Xia Dynasty (2076–1600 BC).\n" +
                "-> In Europe, the first university was established in Bologna, Italy in 1088 CE.\n" +
                "-> In the US, education has only been deemed a fundamental human right since December 10, 1948, the day the Universal Declaration of Human Rights was proclaimed.\n" +
                "8) First Vaccine Invented (The Start of the Medical Revolution)\n" +
                "Smallpox, one of history's deadliest diseases, was estimated to have killed at least 300 million people since the 1900s. But in 1980, the World Health Organization declared that it had been eradicated.\n" +
                "We have Edward Jenner to thank for this. In 1796, he used live cowpox virus to create the first vaccine (for smallpox). Although variolation (smearing a healthy person with an infected sample to confer immunity) had been practiced since 11th century in China, Jenner was the first to demonstrate it to a scientific community and his work led to the development of the first smallpox vaccine in 1798.\n" +
                "The hair-of-the-dog idea that you could use a virus against itself this way had a ripple effect, spurring many more vaccines and saving many more lives.\n";
        String topic_8="The Invention of the Internet, 1960s";
        String story_8="It's hard for Millennials to imagine a world without the internet. The internet has had such a huge impact on the way things work that it's hard for anyone alive to remember what things were like before.\n" +
                "ARPANET, the first working prototype, was invented by the US Department of Defense in the late 1960s. Although the internet wasn't widely adopted until later, on October 29, 1969, it delivered the first message was sent from UCLA to Stanford. The system crashed while delivering this one-word message (\"LOGIN\"), so Stanford only received the first two letters: LO, which seems apt, since the word \"lo\" is an old-fashioned word used to draw attention to an amazing, interesting thing: lo and behold!\n" +
                "It wasn't until 1983 that researchers finally began assembling the “network of networks” that morphed into the modern-day Internet as we know it, and in 1990, computer scientist Tim Berners-Lee invented the world-wide web (www).\n" +
                "In January, 2021, there were 4.66 billion active internet users in the world. Today, people spend, on average, 6 hours and 42 minutes online per day.\n";
        String topic_9="The Start of the First Industrial Revolution: 1760";
        String story_9="The first Industrial Revolution began in the 18th century, when new industrial innovations allowed societies to centralize, specialize, and grow. It began in Britain's textile industry and spread to other fields and countries with the transcontinental railroad, cotton gin, steam engine, factories, electricity, and other inventions that changed society forever.\n" +
                "\n" +
                "In 1790, Samuel Slater (known as the father of the American Industrial Revolution) built the first American factory. He brought textile manufacturing secrets from England and built cotton-spinning mills in Rhode Island. His factories became known as the Rhode Island System and his ideas were quickly imitated and improved upon.\n" +
                "The invention of factories powered by machines inspired an explosion of urban growth, increased international trade, social upheavals, new sources of wealth, and new systems of authority. It transformed how humans think about work and careers, social welfare, and what it means to earn a living.\n";




        ListView listView=findViewById(R.id.Listview);
        List<String> list= new ArrayList<>();
        list.add(topic_1);
        list.add(topic_2);
        list.add(topic_3);
        list.add(topic_4);
        list.add(topic_5);
        list.add(topic_6);
        list.add(topic_7);
        list.add(topic_7);
        list.add(topic_8);
        list.add(topic_9);

        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_4);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_5);
                    startActivity(intent);

                }
                else if(i==5){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(actionlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }




            }
        });
    }
}