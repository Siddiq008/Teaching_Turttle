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

public class histlay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histlay1);
        String topic_1="JOAN OF ARC";
        String story_1="Joan of Arc grew up in a small town in France. Her father, Jacques, was a farmer who also worked as an official for the town. Joan worked on the farm and learned how to sew from her mother, Isabelle. Joan was also very religious.\n" +
                "When Joan was around twelve years old she had a vision. She saw Michael the Archangel. He told her that she was to lead the French in a battle against the English. After she drove the English out she was to take the king to be crowned at Rheims.\n" +
                "Joan continued to have visions and hear voices over the next several years. She said they were beautiful and wonderful visions from God. When Joan turned sixteen she decided it was time to listen to her visions and take action.\n" +
                "Journey to King Charles VII\n" +
                "Joan was just a peasant farm girl. How was she going get an army to defeat the English? She decided she would ask King Charles of France for an army. She first went to the local town and asked the commander of the garrison, Count Baudricourt, to take her to see the king. He just laughed at her. However, Joan did not give up. She continued to ask for his help and gained the support of some local leaders. Soon he agreed to provide her with an escort to the royal court in the city of Chinon.\n" +
                "Joan met with the king. At first the king was suspicious. Should he put this young girl in charge of his army? Was she a messenger from God or was she just crazy? Eventually, the king figured he had nothing to lose. He let Joan accompany a convoy of soldiers and supplies to the city of Orleans that was under siege from the English Army.\n" +
                "While Joan waited on the king, she practiced for battle. She became a proficient fighter and an expert horse rider. She was ready when the king said she could fight.\n" +
                "Siege of Orleans\n" +
                "News of Joan's visions from God reached Orleans before she did. The French people began to hope that God was going to save them from the English. When Joan arrived the people greeted her with cheering and celebrations.Joan had to wait for the rest of the French army to arrive. Once they were there, she launched an attack against the English. Joan led the attack and during one of the battles was wounded by an arrow. Joan didn't stop fighting. She stayed with the troops inspiring them to fight even harder. Eventually Joan and the French Army repelled the English troops and caused them to retreat from Orleans. She had won a great victory and saved the French from the English.\n" +
                "King Charles is Crowned\n" +
                "After winning the Battle of Orleans, Joan had only achieved part of what the visions had told her to do. She also needed to lead Charles to the city of Rheims to be crowned king. Joan and her army cleared the way to Rheims, gaining followers as she went. Soon they had made it to Rheims and Charles was crowned King of France.\n" +
                "Captured\n" +
                "Joan heard that the city of Compiegne was under attack by the Burgundians. She took a small force to help defend the city. With her force under attack outside the city, the drawbridge was raised and she was trapped. Joan was captured and later sold to the English.\n" +
                "Trial and Death\n" +
                "The English held Joan as prisoner and gave her a trial to prove that she was a religious heretic. They questioned her over the course of several days trying to find something that she had done that deserved death. They couldn't find anything wrong with her except that she had dressed as a man. They said that was enough to deserve death and announced her guilty.\n" +
                "Joan was burned alive at the stake. She asked for a cross before she died and an English soldier gave her a small wooden cross. Witnesses said she forgave her accusers and asked them to pray for her. She was only nineteen years old when she died.\n";
        String topic_2="Pablo Picasso";
        String story_2="Pablo Picasso grew up in Spain where he was born on October 25, 1881. His father was a painter and art teacher. Pablo liked to draw from an early age. Legend has it that his first word was \"piz\", short for \"pencil\" in Spanish. It soon became apparent that Pablo had little interest in school, but was an extremely talented artist.\n" +
                "When he was fourteen Pablo attended a famous art school in Barcelona. A few years later he went to another school in Madrid. However, Pablo was bored with the classic teachings of art school. He didn't want to paint like people hundreds of years ago. He wanted to create something new.\n" +
                "Blue Period (1901-1904)\n" +
                "In 1901, Pablo's close friend Carlos Casagemas committed suicide. Pablo became very sad. Around the same time he began painting in Paris. For the next four years his paintings were dominated by the color blue. Many of the subjects were sad and somber looking. He painted people with elongated features and faces. Some of his paintings from this period include Poor People on the Seashore and The Old Guitarist.\n" +
                "Rose Period (1904 - 1906)\n" +
                "Eventually Pablo got over his depression. He also fell in love with a French model. He began to use warmer colors in his paintings including pinks, reds, oranges, and beiges. Art historians call this time in Pablo's life the Rose Period. He also began to paint happier scenes such as circuses. Some of his paintings from this period include The Peasants and Mother and Child.\n" +
                "Cubism (1907 - 1921)\n" +
                "In 1907 Picasso began to experiment with a new style of painting. He worked with another artist named Georges Braque. By 1909 they had created a completely new style of painting called Cubism. In Cubism the subjects are analyzed and broken up into different sections. Then the sections are put back together and painted from different perspectives and angles. Go here to see an example of Picasso's Cubism art.\n" +
                "In 1912 Picasso began to combine Cubism and collage. This was where he would use sand or plaster in his paint to give it texture. He would also apply materials such as colored paper, newspapers, and wallpaper to his paintings to give them added dimension.Some of Picasso's Cubism paintings include Three Musicians and the Portrait of Ambroise Vollard.\n" +
                "Neoclassical Style\n" +
                "Although Picasso would continue to experiment with Cubism, around 1921 he went through a period of painting more classical style paintings. He borrowed ideas from Renaissance painters such as Raphael. He created powerful characters that almost appeared to be three-dimensional, like statues. Some of his works in this style include The Pipes of Pan and Woman in White.\n" +
                "Surrealism\n" +
                "Around 1924 Pablo became interested in the Surrealist movement. Surrealist paintings weren't supposed to make any sense. They often appear like something you would see in a dream or a nightmare. Although Picasso didn't become a member of the movement, he did incorporate some of their ideas into his paintings. Some people called this time his Monster period. Examples of the surrealism influence on Picasso's art include Guernica and The Red Armchair.\n" +
                "Legacy\n" +
                "Today, Pablo Picasso is considered the greatest artist of the 20th century. Many people consider him to be one of the greatest in all of art history. He painted in a number of different styles and created many unique contributions to the world of art. Near the end of his life he painted a number of self portraits. One of his last works of art was a self portrait done with crayon on paper entitled Self-Portrait Facing Death. He died a year later at the age of 91 on April 8, 1973.\n";
        String topic_3="Marco Polo";
        String story_3="Marco was born in Venice, Italy in 1254. Venice was a wealthy trading city and Marco's father was a merchant.\n" +
                "The Silk Road\n" +
                "The Silk Road referred to a number of trade routes between major cities and trading posts that went all the way from Eastern Europe to Northern China. It was called the Silk Road because silk cloth was the major export from China.\n" +
                "Not many people traveled the entire route. Trading was mostly between cities or small sections of the route and products would slowly make their way from one end to the other trading hands several times.\n" +
                "Marco Polo's father and uncle wanted to try something different. They wanted to travel all the way to China and bring the goods directly back to Venice. They thought they could make their fortune this way. It took them nine years, but they finally made it home.\n" +
                "When did he first travel to China?\n" +
                "Marco first left for China when he was 17 years old. He traveled there with his father and uncle. His father and uncle had met the Mongol Emperor Kublai Khan during their first trip to China and had told him they would return. Kublai was leader over all of China at the time.\n" +
                "Where did he travel?\n" +
                "It took Marco Polo three years to get to China. Along the way he visited many great cities and saw many sites including the holy city of Jerusalem, the mountains of the Hindu Kush, Persia, and the Gobi Desert. He met a lot of different types of people and had many adventures.\n" +
                "Living in China\n" +
                "Marco lived in China for many years and learned to speak the language. He traveled throughout China as a messenger and spy for Kublai Khan. He even traveled far to the south to where Myanmar and Vietnam are today. During these visits he learned about different cultures, foods, cities, and peoples. He saw many places and things that no one from Europe had ever seen before.\n" +
                "Marco was fascinated by the wealth and luxury of the Chinese cities and of Kublai Khan's court. It was nothing like he had experienced in Europe. The capital city of Kinsay was large, but well organized and clean. Wide roads and huge civil engineering projects like the Grand Canal were well beyond anything he had experienced back home. Everything from the food to the people to the animals, like orangutans and rhinos, were new and interesting.\n" +
                "How do we know about Marco Polo?\n" +
                "After twenty years of traveling, Marco, along with his father and uncle, decided to head home to Venice. They left home in 1271 and finally returned in 1295. A few years after returning home, Venice fought a war with the city of Genoa. Marco was put under arrest. While he was under arrest, Marco told detailed stories of his journeys to a writer named Rustichello who wrote them all down in a book called The Travels of Marco Polo.\n";

        String topic_4="Walt Disney";
        String story_4="Walter Elias Disney was born in Chicago, Illinois on December 5, 1901. When he was four years old his parents, Elias and Flora, moved the family to a farm in Marceline, Missouri. Walt enjoyed living on the farm with his three older brothers (Herbert, Raymond, and Roy) and his younger sister (Ruth). It was in Marceline that Walt first developed a love for drawing and art.\n" +
                "After four years in Marceline, the Disneys moved to Kansas City. Walt continued to draw and took art classes on the weekends. He even traded his drawings to the local barber for free haircuts. One summer Walt got a job working on a train. He walked back and forth on the train selling snacks and newspapers. Walt enjoyed his job on the train and would be fascinated by trains for the rest of his life.\n" +
                "Early Life\n" +
                "About the time Walt was entering high school, his family moved to the big city of Chicago. Walt took classes at the Chicago Art Institute and drew for the school newspaper. When he was sixteen, Walt decided he wanted to help fight in World War I. Since he was still too young to join the army, he dropped out of school and joined the Red Cross. He spent the next year driving ambulances for the Red Cross in France.\n" +
                "Work as an Artist\n" +
                "Disney returned from the war ready to begin his career as an artist. He worked at an art studio and then later at an advertising company. It was during this time that he met artist Ubbe Iwerks and learned about animation.\n" +
                "Early Animation\n" +
                "Walt wanted to make his own animation cartoons. He started his own company called Laugh-O-Gram. He hired some of his friends including Ubbe Iwerks. They created short animated cartoons. Although the cartoons were popular, the business didn't make enough money and Walt had to declare bankruptcy.\n" +
                "One failure was not going stop Disney, however. In 1923, he moved to Hollywood, California and opened a new business with his brother Roy called Disney Brothers' Studio. He again hired Ubbe Iwerks and number of other animators. They developed the popular character Oswald the Lucky Rabbit. The business was a success. However, Universal Studios gained control of the Oswald trademark and took all of Disney's animators except for Iwerks.\n" +
                "Once again, Walt had to start over. This time he created a new character named Mickey Mouse. He created the first animated film to have sound. It was called Steamboat Willie and starred Mickey and Minnie Mouse. Walt performed the voices for Steamboat Willie himself. \n" +
                "The film was a great success. Disney continued to work, creating new characters such as Donald Duck, Goofy, and Pluto. He had further success with the releases of the cartoon Silly Symphonies and the first color animated film, Flowers and Trees.\n" +
                "Snow White\n" +
                "In 1932, Disney decided he wanted to make a full-length animated film called Snow White. People thought he was crazy for trying to make a cartoon that long. They called the film \"Disney's folly.\" However, Disney was sure the film would be a success. It took five years to complete the film which was finally released in 1937. The film was a huge box office success becoming the top film of 1938.\n" +
                "More Movies and Television\n" +
                "Disney used the money from Snow White to build a movie studio and to produce more animated movies including Pinocchio, Fantasia, Dumbo, Bambi, Alice in Wonderland, and Peter Pan. During World War II, Disney's movie production slowed down as he worked on training and propaganda films for the U.S. government. After the war, Disney began to produce live action films in addition to animated films. His first big live action film was Treasure Island.In the 1950's, the new technology of television was taking off. Disney wanted to be a part of television as well. Early Disney television shows included Disney's Wonderful World of Color, the Davy Crockett series, and the Mickey Mouse Club.\n" +
                "Disneyland\n" +
                "Always coming up with new ideas, Disney had the idea to create a theme park with rides and entertainment based on his movies. Disneyland opened in 1955. It cost $17 million to build. The park was a huge success and is still one of the most popular vacation destinations in the world. Disney would later have the idea to build an even larger park in Florida called Walt Disney World. He worked on the plans, but died before the park opened in 1971.\n" +
                "Death and Legacy\n" +
                "Disney died on December 15, 1966 from lung cancer. His legacy lives on to this day. His movies and theme parks are still enjoyed by millions of people each year. His company continues to produce wonderful movies and entertainment every year.\n";
        String topic_5="Leonardo da Vinci ";
        String story_5="Biography:\n" +
                "Leonardo da Vinci was an artist, scientist, and inventor during the Italian Renaissance. He is considered by many to be one of the most talented and intelligent people of all time. The term Renaissance Man (someone who does many things very well) was coined from Leonardo's many talents and is today used to describe people who resemble da Vinci.\n" +
                "Where was Leonardo da Vinci born?\n" +
                "Leonardo was born in the town of Vinci, Italy on April 15, 1452. Not much is known about his childhood other than his father was wealthy and had a number of wives. About the age of 14 he became an apprentice to a famous artist named Verrocchio. This is where he learned about art, drawing, painting and more.\n" +
                "Leonardo the Artist\n" +
                "Leonardo da Vinci is regarded as one of the greatest artists in history. Leonardo excelled in many areas including drawing, painting, and sculpture. Although we don't have a lot of his paintings today, he is probably most famous for his paintings and also gained great fame during his own time due to his paintings. Two of his most famous paintings, and perhaps two of the most famous in the world, include the Mona Lisa and The Last Supper.\n" +
                "Leonardo's drawings are also quite extraordinary. He would keep journals full of drawings and sketches, often of different subjects that he was studying. Some of his drawings were previews to later paintings, some were studies of anatomy, some were closer to scientific sketches. One famous drawing is the Vitruvian Man drawing. It is a picture of man who has perfect proportions based off the notes from the Roman architect Vitruvius. Other famous drawings include a design for a flying machine and a self portrait.\n" +
                "Leonardo the Inventor and Scientist\n" +
                "Many of da Vinci's drawings and journals were made in his pursuit of scientific knowledge and inventions. His journals were filled with over 13,000 pages of his observations of the world. He drew pictures and designs of hang gliders, helicopters, war machines, musical instruments, various pumps, and more. He was interested in civil engineering projects and designed a single span bridge, a way to divert the Arno River, and movable barricades which would help protect a city in the case of attack.\n" +
                "Many of his drawings were on the subject of anatomy. He studied the human body including many drawings on muscles, tendons, and the human skeleton. He had detailed figures of various parts of the body including the heart, arms, and other internal organs. Leonardo didn't just study the human anatomy either. He also had a strong interest in horses as well as cows, frogs, monkeys, and other animals.\n";
        String topic_6="Alexander the Great ";
        String story_6="Biography:\n" +
                "Alexander the Great was the king of Macedonia or Ancient Greece. He is considered one of the greatest military commanders in history.\n" +
                "When did Alexander the Great live?\n" +
                "Alexander the Great was born on July 20, 356 BC. He died at the young age of 32 in 323 BC having accomplished much in his short life. He reigned as king from 336-323 BC.\n" +
                "Childhood of Alexander the Great\n" +
                "Alexander's father was King Philip the II. Philip II had built up a strong and united empire in Ancient Greece, which Alexander inherited.\n" +
                "Like most children of nobles at the time, Alexander was tutored as a child. He learned mathematics, reading, writing, and how to play the lyre. He also would have been instructed on how to fight, ride a horse, and hunt. When Alexander turned thirteen, his father Philip II wanted the best teacher possible for him. He hired the great philosopher Aristotle. In return for tutoring his son, Philip agreed to restore Aristotle's home town of Stageira, including setting many of its citizens free from slavery.\n" +
                "At school Alexander met many of his future generals and friends such as Ptolemy and Cassander. He also enjoyed reading the works of Homer, the Iliad and the Odyssey.\n" +
                "Alexander's Conquests\n" +
                "After securing the throne and getting all of Greece under his control, Alexander turned east to conquer more of the civilized world. He moved swiftly using his military genius to win battle after battle conquering many peoples and rapidly expanding the Greek empire.\n" +
                "Death of Alexander\n" +
                "Alexander only made it back to Babylon where he became suddenly sick and died. No one is sure what he died from, but many suspect poison. Upon his death the great empire he had built was divided up amongst his generals, called the Diadochi. The Diadochi ended up fighting each other for many years as the empire fell apart.\n";
        String topic_7="Adolf Hitler";
        String story_7="Biography:\n" +
                "Adolf Hitler was the leader of Germany from 1933 to 1945. He was leader of the Nazi party and became a powerful dictator. Hitler started World War II by invading Poland and then invading many other European countries. He is also known for wanting to exterminate the Jewish people in the Holocaust.\n" +
                "Where did Hitler grow up?\n" +
                "Adolf was born on April 20, 1889 in a city named Braunau am Inn in the country of Austria. His family moved around some, living a short while in Germany and then back to Austria. Hitler did not have a happy childhood. Both his parents died fairly young and many of his brothers and sisters died as well.Adolf did not do well in school. He was expelled from a couple of schools before he moved to Vienna, Austria to pursue his dream of becoming an artist. While living in Vienna, Hitler found that he did not have much artistic talent and he soon became very poor. He would later move to Munich, Germany in hopes of becoming an architect.\n" +
                "Soldier in World War I\n" +
                "When World War I began, Hitler joined the German army. Adolf was awarded twice with the Iron Cross for bravery. It was during World War I that Hitler became a strong German patriot and also came to love war.\n" +
                "Rise in Power\n" +
                "After the war, Hitler entered politics. Many Germans were upset that they had lost the war. They were also not happy with the Treaty of Versailles, which not only blamed the war on Germany, but took land from Germany. At the same time, Germany was in an economic depression. Many people were poor. Between the depression and the Treaty of Versailles, the time was ripe for Hitler to rise to power.\n" +
                "Once entering politics, Hitler discovered that he was gifted in giving speeches. His speeches were powerful and people believed what he said. Hitler joined the Nazi party and soon became its leader. He promised Germany that if he became leader he would restore Germany to greatness in Europe. In 1933 he was elected Chancellor of Germany.\n" +
                "After becoming Chancellor, there was no stopping Hitler. He had studied his idol, Benito Mussolini of Italy, about how to install a fascist government and become a dictator. Soon Hitler was dictator of Germany.\n" +
                "World War II\n" +
                "In order for Germany to grow, Hitler thought the country needed more land or \"living space\". He first annexed Austria as part of Germany and then took over part of Czechoslovakia. This wasn't enough, however. On September 1, 1939 Germany invaded Poland and World War II began. Hitler formed an alliance with the Axis Powers of Japan and Italy. They were fighting the Allied Powers of Britain, France, the Soviet Union, and the United States.\n" +
                "Hitler's army began to take over much of Europe. They attacked quickly in what was called Blitzkrieg or \"lightning war\". Soon Germany had captured much of Europe including France, Denmark, and Belgium.\n" +
                "However, the Allies fought back. On June 6, 1944 they invaded the beaches of Normandy and soon liberated France. By March of 1945 the Allies had defeated much of the German army. On April 30, 1945 Hitler committed suicide.\n" +
                "The Holocaust and Ethnic Cleansing\n" +
                "Hitler was responsible for some of the most horrible crimes committed in human history. He hated Jewish people and wanted to exterminate them from Germany. He forced Jewish people to go to concentration camps where 6 million Jews were killed during World War II. He also had other people and races he didn't like killed including handicapped people.\n";
        String topic_8="Christopher Columbus";
        String story_8="Biography:\n" +
                "Christopher Columbus is the explorer who is credited for discovering America. Of course, there were already people living in America at the time who we call Native Americans. There even was a European, Leif Ericsson, who had been to the Americas before. However, it was Columbus' voyage that started the exploration and colonization of the Americas.\n" +
                "Before the Voyage\n" +
                "Columbus was born in Genoa, Italy in 1451. He later lived in Lisbon where he worked as a trader. He learned how to make maps and navigate a ship.\n" +
                "A Shortcut to the East Indies (China and Southeast Asia)\n" +
                "Columbus and his brother, Bartholomew, knew that there were great riches to be had in the East Indies (China and Southeast Asia). However, traveling overland by the Silk Road was dangerous and a sea route around Africa seemed much too long. Columbus thought he could sail straight to the East Indies by crossing the Atlantic Ocean.\n" +
                "It would turn out that Columbus was wrong. The Earth was much larger than he thought and there was another land, the Americas, between Europe and Asia.\n" +
                "Three Ships and a Long Voyage\n" +
                "Columbus spent years trying to convince someone to pay for his voyage. He first tried to get King John II of Portugal to pay for his journey, but the King was not interested. Finally, he was able to convince Queen Isabella and King Ferdinand of Spain to pay for the trip.\n" +
                "He set sail on August 3, 1492 with three ships named the Nina, the Pinta, and the Santa Maria. The voyage was long and difficult. At one point his men threatened to mutiny and wanted to turn back. Columbus promised them he would turn back in two days if they didn't find land. In his journal, however, he wrote that he had no intention of turning back.\n" +
                "Finding Land\n" +
                "On October 12, 1492 land was spotted. It was a small island in the Bahamas that Columbus would name San Salvador. He met natives there that he called Indians because he was convinced that he had landed on islands off the coast of the East Indies. He also visited other islands in the Caribbean such as Cuba and Hispaniola.\n" +
                "Returning Home\n" +
                "After making his discovery, Columbus was eager to return home to Spain and claim his riches. Only the Pinta and the Nina were able to return to Spain, however, as the Santa Maria wrecked off the coast of Hispaniola. Columbus left 43 men behind on the island to start up an outpost.\n" +
                "Upon returning home, Columbus was treated like a hero. He presented some of the things he had found including turkeys, pineapples, and some natives he had captured. The King of Spain was pleased enough to fund future expeditions.\n" +
                "More Voyages\n" +
                "Columbus would make three more voyages to the Americas. He explored more of the Caribbean and even saw mainland America. He had some difficulties in being the local governor and was even arrested for his behavior and for mistreating some of the colonists. Columbus died on May 20, 1506. He died thinking he had discovered a shortcut to Asia across the Atlantic Ocean. He never knew what an amazing discovery he had made.\n";
        String topic_9="Henry Ford";
        String story_9="Biography:\n" +
                "Henry Ford is most famous for founding the Ford Motor Company. Ford is still one of the world's largest producers of cars including brands such as Ford, Lincoln, Mercury, Volvo, Mazda, and Land Rover. Ford was a pioneer in manufacturing using the assembly line. This enabled his company to manufacture cars on a large scale at a cheap price. For the first time, cars were affordable for the average American family.\n" +
                "Where did Henry Ford grow up?\n" +
                "Henry grew up in Greenfield Township, Michigan. His father was a farmer and wanted Henry to take over the family farm, but Henry had no interest in farming. He was much more interested in machines and building things. He left home at the age of 16 and went to Detroit to become an apprentice machinist. Ford had two brothers and two sisters.\n" +
                "What did Henry Ford invent?\n" +
                "The Assembly Line - It is often stated that Henry Ford invented the assembly line. This is where a large number of products are made one step at a time as they pass down a line. Using an assembly line allows for the mass production of products at a cheaper price than trying to build an entire product one at a time. What Henry Ford did was apply this concept to the automobile and perfect it for the mass production of cars at a much lower price than current production methods. Ford's work in streamlining the assembly line for cars was an example of just how powerful an assembly line could be in mass producing products.\n" +
                "The Model T Ford - This was the original car that Ford manufactured using the assembly line process. It was revolutionary in many ways, but primarily in its cost. It was very cheap compared to competitive cars and it was easy to drive and to repair. These features made it perfect for the middle class American. Over 15 million Model T cars were made and, by 1918, over 50% of the cars in America were Model Ts.\n";
        String topic_10="Stephen Hawking";
        String story_10="Biography:\n" +
                "Early Life\n" +
                "Stephen Hawking was born in Oxford, England on January 8, 1942. He grew up in a highly educated family. Both of his parents had attended Oxford University and his father, Frank, was a medical researcher.\n" +
                "Stephen enjoyed math and science in school where he earned the nickname \"Einstein.\" He wanted to study math at university but Oxford didn't have a math degree at the time so he chose physics and chemistry instead. Stephen found college coursework to be very easy. He enjoyed being a member of the school's boat club as well as classical music. After graduation, he went to Cambridge to study for his PhD.\n" +
                "Diagnosed with ALS\n" +
                "While Hawking was working on his PhD at Cambridge University, he began to have health issues. His speech became slurred and he became very clumsy, often dropping items or falling for no reason. After going through a series of tests, doctors discovered that Hawking had a disease called ALS (also called Lou Gehrig's disease). At the time, the doctors said he only had a few years to live.\n" +
                "Overcoming ALS\n" +
                "Although Hawking was initially depressed over his diagnosis, he decided that there were things he wanted to accomplish with his life. He began to study and work harder than ever before. He wanted to earn his PhD before he died. Around the same time, he met and fell in love with a girl named Jane Wilde. Between his work and Jane, Hawking had a reason to live.Despite the initial grim diagnosis from his doctors, Hawking lived a full and productive life with the help of science and modern medicine. Although he was confined to a wheelchair and could not talk for much of his life, he was able to communicate using a touch pad computer and a voice synthesizer.\n" +
                "Black Holes and Hawking Radiation\n" +
                "Stephen spent much of his academic work researching black holes and space-time theories. He wrote many important papers on the subject and became a noted expert on relativity and black holes. Perhaps his most famous theory was one that demonstrated that black holes emit some radiation. Prior to this it was thought that black holes could not get smaller because nothing could escape their enormous gravity. This radiation from black holes has become known as Hawking Radiation.You can go here to learn more about black holes.\n" +
                "A Brief History of Time\n" +
                "Stephen also enjoyed writing books. In 1988 he published A Brief History in Time. This book covered modern subjects on cosmology such as the big bang and black holes in terms that could be understood by the average reader. The book became very popular selling millions of copies and remaining on the London Sunday Times best-seller list for four years. He has since written many more books including A Briefer History in Time, On the Shoulders of Giants, and The Universe in a Nutshell.\n";
        ListView listView=findViewById(R.id.Listview);
        List<String> list= new ArrayList<>();
        list.add(topic_1);
        list.add(topic_2);
        list.add(topic_3);
        list.add(topic_4);
        list.add(topic_5);
        list.add(topic_6);
        list.add(topic_7);
        list.add(topic_8);
        list.add(topic_9);
        list.add(topic_10); ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_4);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_5);
                    startActivity(intent);

                }
                else if(i==5){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_9);
                    intent.putExtra("topic",topic_9);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent=new Intent(histlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_10);
                    intent.putExtra("topic",topic_10);
                    startActivity(intent);
                }



            }
        });
    }

}