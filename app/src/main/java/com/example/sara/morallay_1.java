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

public class morallay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morallay1);
        String topic_1="THE BOY WHO CRIED FOR WOLF";
        String story_1="Once, there was a boy who became bored when he watched over the village sheep grazing on the hillside. To entertain himself, he sang out, “Wolf! Wolf! The wolf is chasing the sheep!” When the villagers heard the cry, they came running up the hill to drive the wolf away. But, when they arrived, they saw no wolf. The boy was amused when seeing their angry faces.\n" +
                "“Don’t scream wolf, boy,” warned the villagers, “when there is no wolf!” They angrily went back down the hill. Later, the shepherd boy cried out once again, “Wolf! Wolf! The wolf is chasing the sheep!” To his amusement, he looked on as the villagers came running up the hill to scare the wolf away. As they saw there was no wolf, they said strictly, “Save your frightened cry for when there really is a wolf! Don’t cry ‘wolf’ when there is no wolf!” But the boy grinned at their words while they walked grumbling down the hill once more.\n" +
                "Later, the boy saw a real wolf sneaking around his flock. Alarmed, he jumped on his feet and cried out as loud as he could, “Wolf! Wolf!” But the villagers thought he was fooling them again, and so they didn’t come to help. At sunset, the villagers went looking for the boy who hadn’t returned with their sheep. When they went up the hill, they found him weeping. “There really was a wolf here! The flock is gone! I cried out, ‘Wolf!’ but you didn’t come,” he wailed. An old man went to comfort the boy. As he put his arm around him, he said, “Nobody believes a liar, even when he is telling the truth!”\n\n" +
                "The Moral\n\n" +
                "Lying breaks trust — even if you’re telling the truth, no one believes a liar.\n";
        String topic_2="THE MILKMAID AND HER PAIL";
        String story_2="One day, Molly the milkmaid had filled her pails with milk. Her job was to milk the cows, and then bring the milk to the market to sell. Molly loved to think about what to spend her money on.\n" +
                "As she filled the pails with milk and went to market, she again thought of all the things she wanted to buy. As she walked along the road, she thought of buying a cake and a basket full of fresh strawberries.\n" +
                "A little further down the road, she spotted a chicken. She thought, “With the money I get from today, I’m going to buy a chicken of my own. That chicken will lay eggs,\n" +
                "Then I will be able to sell milk and eggs and get more money!”\n" +
                "She continued, “With more money, I will be able to buy a fancy dress and make all the other milkmaids jealous.” Out of excitement, Molly started skipping, forgetting about the milk in her pails. Soon, the milk started spilling over the edges, covering Molly. Drenched, Molly said to herself, “Oh no! I will never have enough money to buy a chicken now.” She went home with her empty pails.\n" +
                "“Oh, my goodness! What happened to you?” Molly’s mother asked. “I was too busy dreaming about all the things I wanted to buy that I forgot about the pails,” she answered. “Oh, Molly, my dear. How many times do I need to say, ‘Don’t count your chickens until they hatch?’”\n" +
                "The Moral\n" +
                "Don’t count your chickens before they hatch.\n" +
                "\n";
        String topic_3="THE FARMER AND THE WELL";
        String story_3="One day, a farmer was looking for a water source for his farm, when he bought a well from his neighbour. The neighbour, however, was cunning. The next day, as the farmer came to draw water from his well, the neighbour refused to let him take any water.\n" +
                "When the farmer asked why, the neighbour replied, “I sold you the well, not the water,” and walked away. Distraught, the farmer went to the emperor to ask for justice. He explained what had happened.\n" +
                "The emperor called on Birbal, one of his nine, and wisest, courtiers. Birbal proceeded to question the neighbour, “Why don’t you let the farmer take water from the well? You did sell the well to the farmer?”\n" +
                "The emperor called on Birbal, one of his nine, and wisest, courtiers. Birbal proceeded to question the neighbour, “Why don’t you let the farmer take water from the well? You did sell the well to the farmer?”\n" +
                "The Moral\n" +
                "Cheating will not get you anything. If you cheat, you’ll pay soon enough.\n" +
                "\n";
        String topic_4="THE ELEPHANT AND FRIENDS";
        String story_4="A lone elephant walked through the forest, looking for friends. She soon saw a monkey and proceeded to ask, ‘Can we be friends, monkey?’ The monkey quickly replied, ‘You are big and can’t swing on trees like I do, so I cannot be your friend.’\n" +
                "Defeated, the elephant continued to search when it stumbled across a rabbit. She proceeded to ask him, ‘Can we be friends, rabbit? ’The rabbit looked at the elephant and replied, “You are too big to fit inside my burrow. You cannot be my friend. ”Then, the elephant continued until she met a frog. She asked, “Will you be my friend, frog?” The frog replied, “You are too big and heavy; you cannot jump like me. I am sorry, but you can’t be my friend. ”The elephant continued to ask the animals she met on her way, but always received the same reply. The following day, the elephant saw all the forest animals run in fear. She stopped a bear to ask what was happening and was told the tiger was attacking all the small animals.\n" +
                "The elephant wanted to save the other animals, so she went to the tiger and said, “Please, sir, leave my friends alone. Do not eat them. ”The tiger didn’t listen. He merely told the elephant to mind her own business. Seeing no other way, the elephant kicked the tiger and scared him away. Upon hearing of the brave tale, the other animals agreed, “You are just the right size to be our friend.”\n" +
                "The Moral\n" +
                "Friends come in every shape and size.\n";
        String topic_5="THE NIDDLE TREE";
        String story_5="Once, there were two brothers who lived at the forest’s edge. The oldest brother was always unkind to his younger brother. The older brother took all the food and snatched all the good clothes. The oldest brother used to go into the forest in search of firewood to sell in the market. As he walked through the forest, he chopped off the branches of every tree, until he came upon a magical tree.\n" +
                "The tree stopped him before he chopped its branches and said, ‘Oh, kind sir, please spare my branches. If you spare me, I will provide you with golden apples.’ The oldest brother agreed but was feeling disappointed with how many apples the tree gave him.\n" +
                "Overcome by greed, the brother threatened to cut the entire tree if it didn’t provide him with more apples. But, instead of giving more apples, the tree showered him with hundreds of tiny needles. The brother fell to the ground, crying in pain as the sun began to set. Soon, the younger brother became worried and went to search for his older brother. He searched until he found him at the trunk of the tree, lying in pain with hundreds of needles on his body.\n" +
                "He rushed to him and started to painstakingly remove each needle with love. Once the needles were out, the oldest brother apologized for treating his younger brother so badly. The magical tree saw the change in the older brother’s heart and gifted them with all the golden apples they could need.\n" +
                "The Moral\n" +
                "It’s important to be kind, as it will always be rewarded.\n";
        String topic_6="THE BUNDLE OF THE STICKS";
        String story_6="Once upon a time, there was an old man who lived in a village with his three sons. Although his three sons were hard workers, they quarrelled all the time. The old man tried to unite them but failed. Months passed by, and the old man became sick. He asked his sons to remain united, but they failed to listen to him. At that moment, the old man decided to teach them a lesson — to forget their differences and come together in unity.\n" +
                "The old man summoned his sons, then proceeded to tell them, “I will provide you with a bundle of sticks. Separate each stick, and then break each into two. The one who finishes first will be rewarded more than the others.” And so, the sons agreed. The old man provided them with a bundle of ten sticks each, and then asked the sons to break each stick into pieces. The sons broke the sticks within minutes, then proceeded to quarrel among themselves again.\n" +
                "The old man said, “My dear sons, the game is not yet over. I will now give you another bundle of sticks. Only this time, you will have to break them together as a bundle, not separately. ”The sons readily agreed and then tried to break the bundle. Despite trying their best, they could not break the sticks. The sons told their father of their failure.\n" +
                "The old man said, \n" +
                "“My dear sons, see! Breaking every single stick individually was easy for you, but breaking them in a bundle, you could not do. By staying united, nobody can harm you. If you continue to quarrel, then anyone can quickly defeat you.”\n" +
                "The old man continued, “I ask that you stay united.” Then, the three sons understood there’s power in unity, and promised their father they would all stay together.\n" +
                "The Moral\n" +
                "There’s strength in unity.\n" +
                "\n";
        String topic_7="THE MISER AND HIS GOLD";
        String story_7="There once was an old miser who lived in a house with a garden. The old miser used to hide all his gold coins under stones in his garden. Every night, before he went to bed, the miser went out into his garden to count his coins. He continued the same routine every day, but he never spent a single, golden coin.\n" +
                "One day, a thief saw the old miser hiding his coins. Once the old miser went back into his house, the thief went to the hiding place and took all the gold. The following day, as the old man came out to count his coins, he found it was gone and started wailing loudly. His neighbour heard the cries and came running, asking what had happened. Upon learning what had occurred, the neighbour asked, “Why didn’t you just save the money inside your house where it would’ve been safe?”\n" +
                "The neighbour continued, “Having it inside the house would make it easier to access when you need to buy something.” “Buy something?” answered the miser, “I was never going to spend my gold.”\n" +
                "When hearing this, the neighbour picked up a stone and threw it. Then, he said, “If that’s the case, then save the stone. It’s as worthless as the gold you’ve lost.”\n" +
                "The Moral\n" +
                "A possession is as important as what it’s used for.\n" +
                "\n";
        String topic_8="CONTROLLING ANGER";
        String story_8="Once, there was a young boy. This boy had problems controlling his anger. When he got angry, he would say the first thing that came to mind, even if it affected people.\n" +
                "One day, his father gifted him a hammer and a bundle of nails, then said, “Whenever you get mad, hammer a nail into the backyard fence.”\n" +
                "In the first days, the boy used up half of the nails. Over the next weeks, he used up fewer nails, until his temper was under control. Then, his father asked the young boy to remove a nail for each day he didn’t lose his temper.\n" +
                "On the day when the boy removed his last nail, his father told him, “You have done good, boy. But, can you see the holes in the wall? The fence is never going to be the same. Likewise, when you say mean things in anger, you’ll leave a scar.”\n" +
                "The Moral\n" +
                "Anger is like a knife — one of the most dangerous weapons. When you use it, the wounds will heal, but the scars remain.\n" +
                "\n";
        String topic_9="THE POTATO, THE EGG, AND THE COFFE BEANS";
        String story_9="A boy named John was upset. His father found him crying.\n" +
                "When his father asked John why he was crying, he said that he had a lot of problems in his life.\n" +
                "\n" +
                "His father simply smiled and asked him to get a potato, an egg, and some coffee beans. He placed them in three bowls.\n" +
                "He then asked John to feel their texture and then fill each bowl with water.\n" +
                "\n" +
                "John did as he had been told. His father then boiled all three bowls.\n" +
                "Once the bowls had cooled down, John’s father asked him to feel the texture of the different food items again.\n" +
                "John noticed that the potato had become soft and its skin was peeling off easily; the egg had become harder; the coffee beans had completely changed and filled the bowl of water with aroma and flavour.\n" +
                "Moral of the story\n" +
                "Life will always have problems and pressures, like the boiling water in the story. It’s how you respond and react to these problems that counts the most!\n";
        String topic_10="THE GOLDEN GOOSE";
        String story_10="There lived a goose, special one as that, in a lake. It had beautiful golden feathers .Near the lake lived an old woman with her daughters. Even though they worked hard, they remained poor. One day, the goose thought: Maybe I can give one golden feather every day so that these women can sell it and have enough money to live. The next day, the goose went to the old woman. “I have nothing to give you!” said the old woman. “But, I have something for you!” said the goose and explained what she can do! The old woman and her daughters went to the market to sell the golden feather. That day, they came back happy with enough money on hand. Day after day, the goose continued to help the old woman and her daughters. The daughters loved to play with the bird and would take care of it on rainy and cold days! As time went by, the old woman became more greedy! How can one feather help her? “When the goose comes by tomorrow, we should pluck all of its feathers!” she told her daughters. Aghast, they refused to help her with this. The next day, the old woman waited for the goose to arrive. As soon as the bird arrived, it held by its next and began to pluck at its feathers. As soon as she plucked them, the feathers turned white. The old woman wailed and let go of the goose. “You have been greedy! When you plucked my golden feathers without my wish, they turned white!” The angry goose flew away never to be seen again! “You have been greedy! When you plucked my golden feathers without my wish, they turned white!”\n" +
                "The angry goose flew away never to be seen again!\n" +
                "\n" +
                "Moral of the story\n" +
                "Too much greed leads to a lot of loss. It is good to not steal from others or wish for others out of selfishness.\n";
        String topic_11="THE CAT AND MICE";
        String story_11="A long time ago, the mice had all gathered together to discuss their biggest issue!\n" +
                "A cat who was chasing and catching the mice!\n" +
                "“It is chaos!” said a mouse angrily.\n" +
                "“We need to find a solution that us warns of the cat!” said the other.\n" +
                "“Can we decide soon before the cat spots us,” said another worried mouse.\n" +
                "An old mouse raised its paw and said: “Let’s find a quick solution!”\n" +
                "The mice soon started to discuss and shout out ideas.\n" +
                "“We will have a watchtower to warn us!” said one\n" +
                "“We should all go in groups to avoid being eaten by the cat!” said another.\n" +
                "“I have an idea,” said another. “Let’s tie a bell around the cat’s neck! So when the cat strolls around the sound of the bell will warn us!”\n" +
                "All the mice agreed. This was the best idea!\n" +
                "“All right! So, who will bell the cat?” asked the old mouse.\n" +
                "There was silence! Soon, one by one all the mice ran away quietly until only the old mouse remained.\n" +
                "Moral of the story\n" +
                "Giving solutions or having ideas is fine but it action which defines the solution or idea.\n";
        String topic_12="CROWS IN THE KINGDOM";
        String story_12="One day on a stroll with his courtiers, Akbar sees crows flying in the sky and asks: “Can someone tell me how many crows are there in the kingdom?”\n" +
                "All the courtiers are baffled! “Jahapana! How is it possible to count the crows in the kingdom?” wondered a courtier. “It is impossible,” said another.\n" +
                "They murmured and shook their heads. “Birbal, what do you think?” asked Akbar.\n" +
                "“Even Birbal cannot respond to this question, my lord,” said a courtier with a smirk! “Yes, that’s why he is quiet!” said one of them.\n" +
                "“Hmm… hmm… There must be ninety-five thousand, four hundred and sixty-three crows in our kingdom, Jahapana,” said Birbal quietly.\n" +
                "“How is that even possible?” asked all the courtiers.\n" +
                "Even Akbar was surprised. “How sure are you, Birbal?” he asked.\n" +
                "“I’m very sure! Let’s send someone to count the number of crows in the kingdom, your majesty!” he said.\n" +
                "“Hmm.. what if there are less number of crows?” asked a courtier.\n" +
                "“Then, it means the crows have gone to visit their relatives in the neighbouring kingdoms!” quipped Birbal.\n" +
                "“But, what if there are more crows than your count?” asked another courtier.\n" +
                "“Oh, it means that the crows from the neighbouring kingdoms have come to visit their relatives,” said Birbal, just as Akbar burst into a bout of laughter.\n" +
                "Moral of the story\n" +
                "Where there is a will, there is a way. We can always find a solution to any problem.\n";
        ListView listView=findViewById(R.id.Listview);
        List<String> list= new ArrayList<>();
        list.add("THE BOY WHO CRIED FOR WOLF");
        list.add("THE MILKMAID AND HER PAIL");
        list.add("THE FARMER AND THE WELL");
        list.add("THE ELEPHANT AND FRIENDS");
        list.add("THE NIDDLE TREE");
        list.add("THE BUNDLE OF THE STICKS");
        list.add("THE MISER AND HIS GOLD");
        list.add("CONTROLLING ANGER");
        list.add("THE POTATO, THE EGG, AND THE COFFE BEANS");
        list.add("THE GOLDEN GOOSE");
        list.add("THE CAT AND MICE");
        list.add("CROWS IN THE KINGDOM");
        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_4);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_5);
                    startActivity(intent);

                }
                else if(i==5){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_9);
                    intent.putExtra("topic",topic_9);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_10);
                    intent.putExtra("topic",topic_10);
                    startActivity(intent);
                }
                else if(i==10){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_11);
                    intent.putExtra("topic",topic_11);
                    startActivity(intent);
                }
                else if(i==11){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_12);
                    intent.putExtra("topic",topic_12);
                    startActivity(intent);
                }
                else if(i==12){
                    Intent intent=new Intent(morallay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_12);
                    intent.putExtra("topic",topic_12);
                    startActivity(intent);
                }

                else{

                }


            }
        });
    }


}
