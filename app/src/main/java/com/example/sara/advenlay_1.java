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

public class advenlay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advenlay1);
        String topic_1="THE KIDNAPPING of SNOW WHITE";
        String story_1="In one kingdom on our planet living in peace and harmony were Snow White and the seven dwarves.One day, some ruffians appeared and kidnapped Snow White, leaving a note that said:\n" +
                "“Give us 100 million dollars If you want to see Snow White again. Signed: The Evil Witch”\n" +
                "When the seven dwarves arrived home they were very concerned, not just because Snow White had been kidnapped but also because nobody would cook for them, or clean the house while they were working.So they hastily rushed to the police.  When they arrived they were sent to talk to the team which specialized in combating kidnapping. The team was made up of Little Red Riding Hood, the leader who had mental powers, Cinderella, who was responsible for team organization and computer systems and Pinocchio, who was a ninja expert in martial arts.\n" +
                "\n" +
                "During the investigation, Little Red Riding Hood used her mental powers to locate the place where Snow White was locked up.Cinderella immediately searched for the address of The Evil Witch on the internet, and located her by using a GPS system.Meanwhile, the Evil Witch was in her castle watching their steps using her magic mirror. When she realized they were on the way to her castle, she sent her loyal assistant, Peter Pan to ambush them with a weapon and some hand grenades.\n" +
                "Luckily, Cinderella used her computer to introduce a virus and published a video showing a car exploding during an ambush. When the evil witch saw it she was very happy as she thought that her plan had worked and so went to relax by taking a bath, feeling very confident.\n" +
                "Luckily, peter Pan failed during the ambush, because “Mobilejustice”; that was the name of their armoured Hummer, had no problem passing the ambush.When they arrived at the castle, the team couldn’t get inside, because it was closed. So, they asked Pinocchio to climb over a wall and open the door from the inside.\n" +
                "A big battle then started inside. The Evil Witch and her gang were winning little by little. Peter Pan reached them and began a sword battle against the brave Pinocchio. They had built a special trap for him and suddenly he fell into a hole full of termites who wanted to eat him.\n" +
                "Fortunately, Little Red Riding Hood stopped the termites using her mental powers, and when they were about to be defeated, a fast red Ferrari, skidding around the bends, with the music very loud, appeared. Everybody was shocked, because they couldn’t see anybody inside until the door opened and the Seven Dwarves appeared. They began to beat up those who were in the middle of the battle.\n" +
                "Finally, they managed to stop Peter Pan and his henchmen. Pinocchio and Little Red Riding Hood went to catch the witch, who was inside her castle, making herself pretty in front of the mirror and it was a very unpleasant moment for the witch when they arrested her.Snow White was freed by the specialist team and thanks to the Seven Dwarves help. The team triumphed one more time and achieved their objective – to rescue Snow White.\n";
        String topic_2="THE STORY OF BUBU AND COCO";
        String story_2="This is the story of Bubu and Coco, two little mice brothers, who love adventure. Coco is very curious and careful, but Bubu loves pranks.Coco wakes up early and greets his parents before going to have a wash the bathroom, but Bubu loves sleeping late.Coco makes the bed with his dad´s help, and gets dressed, but Bubu is so small and his gestures are so tender that his mum dresses him.\n" +
                "At breakfast time the whole family are together. Coco sets the table and enjoys his food, while Bubu jumps happily on the furniture.\n" +
                "At the weekend it is time to go out and play. The two brothers go out to the field in search of a new adventure.\n" +
                "Mum and Dad let them go, because Coco is responsible and always looks after his brother. Bubu gives a big kiss to his mother and holds Coco´s hand.\n" +
                "-“Well done, Bubu!, says his Dad, “Now obey your brother always, and do not get separated from him!”\n" +
                "The siblings arrive to the forest, Bubu runs to climb a tree, Coco warns him to be careful, because there are bees flying around.\n" +
                "Bubu ingnores him and begins to annoy the bees. The bees surround him and Coco chases them away harmlessly. Bubu hugs his brother as he was quite scared, Coco warns him to be careful.The two brothers arrive at a lake. Bubu loves water and goes in with his clothes on. Coco says:\n" +
                "-“No, wait! You will catch a cold  and that will make mum very worried”.\n" +
                "Coco puts on his swimming trunks and the two mice have fun. Once out of the lake, a strong “achoo!” sounds. Bubu has caught a cold, Coco wraps him up warmly and takes him home.Bubu, who has caught a fever and is sneezing, apologises to his Mum and Dad and says:\n" +
                "-“Thank you brother, for always taking care of me, I will be like you when I´m older”.\n";
        String topic_3="MARY THE KANGAROO AND KAREN THE BEE";
        String story_3="\"Once upon a time…There was a friendly monster called Merlin, who didn´t like being bad, but everybody was afraid of him.There were also dragons and, as they were bad, people thought that Merlin was bad too.Merlin decided to go out for a walk with his friend Lisa. They met a group of girls who, when they saw Merlin, were really scared.\\n\" +\n" +
                "                \"One of them was the King´s daughter who then told her father what she had seen. the King sent his best hunters in kingdom to search for the monster.\\n\" +\n" +
                "                \"They looked for him everywhere as they did not want him to scare the town’s inhabitants again.\\n\" +\n" +
                "                \"Merlin saw them and ran away. He was afraid for himself and for his friend Lisa as he did not want her to be hurt.\\n\" +\n" +
                "                \"They were running away from the hunters when Lisa fell into a trap the hunters had set and was injured.\\n\" +\n" +
                "                \"Merlin pulled her out of the trap and saved her and they went to live in another place. There, they demonstrated to everybody that they were not bad and that sometimes appearances are decieving. From then on, they could go out for walks and nobody was scared of them or tried to hurt them.\\n";
        String topic_4="MERLIN THE FRIENDLY MONSTER";
        String story_4="Once upon a time…There was a friendly monster called Merlin, who didn´t like being bad, but everybody was afraid of him.There were also dragons and, as they were bad, people thought that Merlin was bad too.Merlin decided to go out for a walk with his friend Lisa. They met a group of girls who, when they saw Merlin, were really scared.\n" +
                "One of them was the King´s daughter who then told her father what she had seen. the King sent his best hunters in kingdom to search for the monster.\n" +
                "They looked for him everywhere as they did not want him to scare the town’s inhabitants again.\n" +
                "Merlin saw them and ran away. He was afraid for himself and for his friend Lisa as he did not want her to be hurt.\n" +
                "They were running away from the hunters when Lisa fell into a trap the hunters had set and was injured.\n" +
                "Merlin pulled her out of the trap and saved her and they went to live in another place. There, they demonstrated to everybody that they were not bad and that sometimes appearances are decieving. From then on, they could go out for walks and nobody was scared of them or tried to hurt them.\n";
        String topic_5="PLAY DOUGH BOY";
        String story_5="Once upon a time…In a faraway school there was a toy house where Steve was living. He was a play dough boy, and had many friends; but one day, the kids made an exhibition of play dough monsters.\n" +
                "That house, which was lively and peaceful became so stressful. The monster ran from one place to another to scare them, stealing their little beds, the chocolates and sweets that the kids gave them, even left them hanging from the ceiling.\n" +
                "During mornings, the toys were happy when heard the kids´ laughs when were arriving. They were safe with them…well…almost safe, because they were quite naughty.One night, Steve was playing marbles at the playground when saw Turbo passing with Tina, the doll, and did not have legs.\n" +
                "Tina was screaming, help! help! while turbo was throwing her into a well. Steve tried to help  her, but he could barely walk with his play dough legs, which were sticking to the ground. Turbo was laughing at him.\n" +
                "Rupert, the plastic action figure began to slip as fast as his roller skates let him, threw Turbo to the ground with a slap and gave one of his roller skates to Steve. The two toys went to save Tina, who was shivering with cold, then took her to the nursery.\n" +
                "Turbo was very annoyed and promised himself that was going to throw Steve and the plastic boy to the well when he had a chance.\n" +
                "The next day, the teacher asked the kids to make snakes made of play dough. “What a horror!” the toys said, “How many toys will survive?! If they destroy us, they won´t have toys to play with, and will be sad”.\n" +
                "One of the kids saw Steve and caught him, kneaded him with his little hands and the play dough boy was now a play dough ball, was crying thinking that he was not going to be a kid any more, but a dangerous snake!…he would never play with his friends again!.\n" +
                "Said goodbye to Rupert with a sad gaze, who saw him from a crib playing with a little girl.Suddenly, Steve was not there any more, but how? the kid had turned Steve into a play dough hero, gave him a pair of shoes, which he took everywhere.\n" +
                "The kid gave him lots of powers with his imagination, Meanwhile, the other kids had made the snakes and where preparing the exhibition in the classroom.That night, the snakes where up on the trees eating fruits, the monsters were flying around and the rest of the toys were hiding in safety places.\n" +
                "Turbo threw Steve to the playground where the most dangerous snakes were resting, but, suddenly, Steve squashed the snakes using his shoes, spun around to break the tying, and beat the monsters and snakes.\n" +
                "Al the toys clapped Steve´s bravery. The monsters and the snakes promised not to hurt anyone again and live in peace. Turbo was named the captain of the monsters and he was the responsible for fulfilling the deal. And the doctor made two plastic legs to Tina, so she could walk again.Steve was very happy and was named the “toy house guardian”. They all lived happily since then, made the kids really happy and helped them with their homework.\n";
        String topic_6="LINDA´S ADVENTURES";
        String story_6="In a faraway place there was a beautiful island with flowers, leafy trees, a candy house, chocolate buildings…that is to say that is was a world where people were never unhappy.That place had a castle in where a king called Leonard was living; his wife was called Miss Juliet and their daughter was Linda.\n" +
                "One day, the king had to make a business trip to Spain, when he came back, brought lots of presents; but the most special presents were for his daughter; three dolls that belonged to her spanish grandmother, who died before the princess was born.\n" +
                "The biggest doll had brown hair, and it was called Peich, in honor of a friend of her. The smallest one was blond and was called Phoebe, because of her mother; but the most special was blond and was called Piper, like her.\n" +
                "One day, Linda was playing with the dolls when Piper fell, the girl took it from the floor and said.\n" +
                "– “Oh, my poor doll! Are you ok?”\n" +
                "And a voice said suddenly:\n" +
                "– “Now that you are asking…I´m ok”.\n" +
                "The girl said scared:\n" +
                "– “Is that is a joke? Can you talk? Is the best thing I have ever seen”.\n" +
                "– “Help us! children don´t take care of their dolls, every time a doll is broken we become more fragile and could disappear forever some day”. – replied the doll.\n" +
                "“Everything began when a girl, who did not have any doll, envied her friends for having. One day her parents gave her one, it was very ugly, bald without eyes, the girl broke it even more, and then broke her friend´s dolls one by one. And When she grew founded a factory , where the dolls are now being broken, and then she makes dresses and clothes for the girls”.\n" +
                "The princess said:\n" +
                "-“But, how ca that be possible? ”\n" +
                "– “Only girls like you, who take care of their dolls, can destroy her”.\n" +
                "– “But…what can I do?” – asked the girl.\n" +
                "– “go to DollLand, where dolls are born, every time somebody destroys a doll, another doll disappears, but nobody cares”.The girl stayed thoughtful for a while, and then said.\n" +
                "– “I will save them!”\n" +
                "The dolls began to jump with joy.The next day, the girl woke up, took everything she needed and painted a circle on the wall, to create a magic door to DollLand.\n" +
                "It was most beautiful than her island, big dolls, middle dolls, small, bread dolls, glass dolls, soap dolls, and many other things; but they were all crying for having lost all those dolls.Linda could not bear that no longer and started crying.Then, she made a map of the factory to rescue the dolls, and destroy the woman. They reached the factory, but fell into a trap and the evil woman locked them.\n" +
                "Linda remembered what Piper had said “Only girls like you, who take care of their dolls, can destroy her” so, she took her three dolls, hugged them and kissed them, and then said:\n" +
                "– “I love all the dolls in the world”.\n" +
                "Suddenly, one of the arms of the woman disappeared, then the other, and then the rest of her body.When the princess went back home, everything was fine, her parents were already sleeping, thinking she was in her bedroom, so were not worried.\n";
        String topic_7="THE MONSTER";
        String story_7="Once upon a time…there was a man called Andrew that was hunting monsters. One day caught a huge monster and so, he became famous.A little monster was living with a family in their house; somebody told Andrew about him, and he went running to find him and finally caught the little monster.\n" +
                "Andrew began to earn so much money with his hunting monsters job, and became millionaire. One day, he decided to hire someone to help him, because had so much work to do.\n" +
                "Another day, somebody called Andrew asking him to catch a medium size monster. What a surprise, when Andrew went to look for him and realized how nice and colorful the monster was. They became good friends immediately.\n" +
                "\n" +
                "He realized that the monsters were very nice, as he got along with them, decided to buy a bigger house to live with the monsters in it. And they were all very happy, being very good friends and living together.\n";
        String topic_8="ENCHANTED WINGS PRINCESS";
        String story_8="Once upon a time, there was beautiful fairy princess, she was living in her kingdom with her father the king and her mother the queen.Everybody there was able to fly but her and her family; because and evil wizard had put a curse on the whole family, and the spell could only be undone by a good witch, good hearted with feelings. But unfortunately, the good witch of the kingdom had died.\n" +
                "She said to herself:\n" +
                "-“I won´t give up and I will find a good witch to undo the spell!”\n" +
                "But she knew that her parents would never let her go to look for the witch.\n" +
                "One day, at midnight, she dressed up as a maidservant, and went out of the castle. When her parents went to wake her up at sunrise, did not find her.\n" +
                "The princess searched inside an abandone cave in where she found a book of spells, searched and searched around to see if there was any wizard that had forgotten it. But she did not find anyone, so went back to the castle. When she arrived, waited a punishment for having escaped.\n" +
                "Went into the room and remembered the book, looked for it and opened it, reading page after page, discovered many spells, one for swimming, another, for surfing…but none of them were the one she needed, until found a note between two pages saying:\n" +
                "“Whoever finds and reads this book will be the next good witch or good wizard of the kingdom“.\n" +
                "Suddenly, a ray of light came in through the window until her, she was shocked and began to fly, breaking the spell and becoming the good witch of the kingdom.\n";
        String topic_9="BOBBY´S ADVENTURES";
        String story_9="It was a nice summer day, it was very hot and Bobby, a very naughty boy, had nothing new to do and so was very bored. Bored of being inside the house, went to the backyard to try to catch some insects to begin a collection. Got a jar, a little spade, and a little net to hunt butterflies.\n" +
                "He had got some animals, but wanted many more, was so enthusiastic getting insects at the garden, that decided to go further to discover what kind of animals were outside the house. Suddenly saw a butterfly with the colors of the rainbow and decided to include it in his collection. He was so anxious of getting the butterfly, that went to the deepest part of the mountain without realizing it. Finally, the butterfly lied on a ceiba tree trunk that had a big hole in the middle, and the butterfly went inside the hole.\n" +
                "Bobby was so sad, because was scared of the things that could be inside the huge tree, but could not resist the impulse of going inside the tree to see what was inside.Got inside the tree little by little with out realizing that it was a magical tree. When half of his body was inside the tree it was so dark, and suddenly began to fall down to the deep of the tree, was so scared that closed his eyes crying and screaming, until touched a soft surface. Opened his eyes terrified and found out a beautiful place, he had fell on a spider web which was holding him as if he was an insect.\n" +
                "“I won´t stay here finding out who spun this spider web” – said Bobby before getting down of the cobweb.\n" +
                "There was a big garden inside the tree, the plants and flowers were like huge skyscrapers; but he hadn´t seen an animal yet. Suddenly heard a noise of a train approaching him, then saw a centipede coming fast with lots of ants on his back, that were going to their jobs or school. Then saw Mr. Cricket allowing him to get into the train, and the firefly helping him.\n" +
                "There was a butterfly beside him, who asked:\n" +
                "– “What kin d of insect are you?”\n" +
                "Bobby replied: “I am not an insect, I am a kid”\n" +
                "-“A kid?” – asked the butterfly – “Strange…I have never heard about that weird insect, what do you do? Can you fly, or drag? can you spin a spider web or make beautiful silk?come on, tell me! I am curious to know what you do”\n" +
                "– “I can´t jump like the cricket, either spin a spider web or flying like you; because I am a human”.\n" +
                "“A human? what a horror, you are one of those who hurt us, mash us, destroy our houses and don´t respect us at all”.\n" +
                " “I hadn´t seen it that way, but maybe you are right. Let´s make a deal. I want to know this beautiful place, in exchange, I promise I wont hunt innocent insects just to have them inside a jar, I actually will free them and they will live here, I will visit them every time I want to see them”.\n" +
                "The butterfly was so happy, flied living a nice rainbow on her way, suddenly Bobby realized that it was the same butterfly he had pursued and now it was his friend. He observed the insects and realized that it was way more excited to see them in their own ambient than inside a jar. So, went back home by nightfall accompanied by a group of fireflies illuminating the way, when he arrived home, freed all the insect he had caught, he knew where to find them every time he was bored and wanted to see them again.\n";
        String topic_10="SUPER TRUCKS";
        String story_10="I have a passion since I´m small. Cars! I collect them, I have small and big. When I go to main square my dad rents me a kart, and I am a real driver!, and I´m fast, of course. I drive on the pavement like if it was a real race kart. I train too much to be the best. Sometimes, if I see another boy driving a kart, I try to have a race.\n" +
                "My neighborhood organized a race at the main square for Children´s day. I knew it was my chance to be a Champion. I was so happy that I convinced my friend Maxi to come to the race with me. I knew it was a risk because he is one of the best also, but this way, if we won, we would both enjoy it, and it would not be so hard in case we lost.\n" +
                "It was two days before the race, and were the longest days I ever lived.\n" +
                "I wore my runner suit for the first time the day of the race, I went very early to rent the best kart, I tried different karts to choose the fastest; I finally chose the number 5, which my dad called Mach 5, i don´t know why…\n" +
                "The race consisted in driving four laps around the block, so the streets were closed to other vehicles.\n" +
                "A man gave us the signal for the start, I began to pedal the fastest I could to arrive the first to the curve, but I  was blocked and arrived the third at the curve. The runners in front were trying to stop me, but I knew there were still three laps left.\n" +
                "I almost passed the second runner at the second lap, but a boy in a green kart hit me making me lose the control for a moment. I recovered and I reached the second position again. There was just one lap left and one car left, we reached the last curve together, I knew he was going to block me so I anticipated taking the curve wide, slowed down later and then I passed the other car and we began to drive in parallel crossing the final line at the same time. When we stopped I saw it was Max, we hugged each other and they told us that it was a tie. It was a great day.\n";
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
        list.add(topic_10);
        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_4);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_5);
                    startActivity(intent);

                }
                else if(i==5){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_9);
                    intent.putExtra("topic",topic_9);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent=new Intent(advenlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_10);
                    intent.putExtra("topic",topic_10);
                    startActivity(intent);
                }




            }
        });
    }
}

