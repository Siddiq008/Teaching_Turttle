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

public class Scificlay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scificlay1);
        String story_1="A 24 year old boy seeing out from the train’s window shouted…\n" +
                "\n" +
                "“Dad, look the trees are going behind!”\n" +
                "\n" +
                "Dad smiled and a young couple sitting nearby, looked at the 24 year old’s childish behavior with pity, suddenly he again exclaimed…\n" +
                "\n" +
                "“Dad, look the clouds are running with us!”\n" +
                "\n" +
                "The couple couldn’t resist and said to the old man…\n" +
                "\n" +
                "“Why don’t you take your son to a good doctor?” The old man smiled and said…“I did and we are just coming from the hospital, my son was blind from birth, he just got his eyes today.”\n" +
                "\n" +
                "Every single person on the planet has a story. Don’t judge people before you truly know them. The truth might surprise you.\n";
        String topic_1="Everyone Has a Story in Life";
        String story_2="There once was a very wealthy and curious king. This king had a huge boulder placed in the middle of a road. Then he hid nearby to see if anyone would try to remove the gigantic rock from the road.\n" +
                "\n" +
                "The first people to pass by were some of the king’s wealthiest merchants and courtiers. Rather than moving it, they simply walked around it. A few loudly blamed the King for not maintaining the roads. Not one of them tried to move the boulder.\n" +
                "\n" +
                "Finally, a peasant came along. His arms were full of vegetables. When he got near the boulder, rather than simply walking around it as the others had, the peasant put down his load and tried to move the stone to the side of the road. It took a lot of effort but he finally succeeded.\n" +
                "The peasant gathered up his load and was ready to go on his way when he say a purse lying in the road where the boulder had been. The peasant opened the purse. The purse was stuffed full of gold coins and a note from the king. The king’s note said the purse’s gold was a reward for moving the boulder from the road.\n" +
                "\n" +
                "The king showed the peasant what many of us never understand: every obstacle presents an opportunity to improve our condition.\n";
        String topic_2="The Obstacle in our Path";
        String story_3="Once, a dog ran into a museum full of mirrors. The museum was unique, the walls, ceiling, doors, and even floors were made of mirrors. Seeing his reflections, the dog froze in the middle of the hall surprisingly. He could see a whole pack of dogs surrounding him from all sides, from top to bottom.\n" +
                "\n" +
                "The dog bared its teeth and barked all the reflexes that responded in the same way. Horrified, the dog barked feverishly, the dog’s reflexes followed and raised him many times. The dog barked even louder, but the echo was enlarged. The dog flung from side to side while its reflexes also stirred and cracked its teeth.\n" +
                "\n" +
                "The next morning, security guards at the museum found the miserable and lifeless dog surrounded by thousands of reflections of the lifeless dog. There was no one to hurt the dog. The dog died in battle with its reflexes.\n";
        String topic_3="The reflections";
        String story_4="A brick slammed into a businessman’s car door. He slammed on the brakes to check what happened.\n" +
                "The angry man jumped out of his car and grabbed the closest boy and yelled, “What was that? What the hell have you done to my car? Why did you do that?” The boy was very scared but extremely polite. and apologized. “Sorry, sir. I didn’t know what else to do,” he said. “I had to throw bricks because no one else would stop to ask for my help.” With tears rolling down his cheeks. He pointed to the parked cars and said “this is my brother, he rolled forward and fell from the wheelchair, and he is seriously injured. I cannot lift him.”\n" +
                "The crying boy asked the man, “Could you help me get him back in his wheelchair? He is injured and too heavy for me.” He quickly lifted the other boy from the place and put him back in the wheelchair. He also helped the boy with his bruises and cuts.\n" +
                "When he thought everything would be fine, he went back to his car. “Thank you, sir, and God bless you,” said the grateful boy. The young man was too shocked for any word. When he got out of the car, he looked at the bulging door of his car. The damage was very noticeable, but he didn’t bother to repair it. He held the money to remind him of the message; “Don’t go through life so fast that someone has to throw a brick at you to get your attention.”\n";
        String topic_4="Stopped by a brick";
        String story_5="A carpenter with many years of experience was ready to retire. He announced to his contractor his plans to leave the house building to live a more relaxed retired life with his wife and family. The contractor felt a little upset that his good and experienced carpenter was leaving the job, but he requested the carpenter to build another house for him.\n" +
                "The carpenter agreed with the contractor, but his heart was not in his work as it used to be. He worked quickly and carelessly and used inferior materials to build the last house of his career. It was an awful way to end his career. When the carpenter finished the house and the employer came to inspect the house.\n" +
                "He looked around the house and, just before leaving the house, he handed the key to the carpenter. “This is your house,” he said, “my special present to you.” Although it should be a good surprise, he did not feel good as he felt a deep shame inside him. If only he had known he was building his own house, he would have done it all differently. Now he had to live in a home that wasn’t built so well.\n";
        String topic_5="The Old Carpenter";
        String story_6="A well-known speaker began his seminar by holding up a new twenty-dollar bill. In the crowded room, he asked if anyone would like to have their $ 20 bill. Hands in the rooms began to rise. He crumpled and crumbled the bill and asked the crowd if anyone was still interested in receiving the bill. His hands were still raised to indicate that people still wanted the crumpled $ 20 bill.\n" +
                "At that point, he dropped the bill to the ground and started crushing it on the ground with his shoe. He got, presently folded and grimy $ 20 bill. “Does anybody despite everything need the bill?” However, the hands were brought up noticeable all around.\n" +
                "The speaker stated: “Today we have all taken in a significant exercise. Regardless of what I did, you wanted it since it hasn’t lost its worth. “\n" +
                "“Many times in our lives, the decisions we make and the circumstances that come our way let us fall, huddled, and sunk in the ground. We can feel useless; But no matter what happens or what happens, it will never lose its value. “\n";
        String topic_6="Twenty Dollar Bill";
        String story_7="One night, after spending several days with his new wife, a man leaned down and whispered, “I love you.”\n" +
                "She smiled, and the man smiled back, and said, “When I am eighty years old and think of my whole life, I know I will remember this moment.”\n" +
                "A few minutes later, she fell asleep. The man was left with the silence of the room and the soft sound of his wife’s breathing. He stayed awake, remembering about everything they had done together, from their first date to their first holiday together and, ultimately, to their big wedding. These were just some of the life choices the couple had made together that had led to this very moment of silence in each other’s presence.\n" +
                "At one point, the man realized that it didn’t matter what they had done or where they had gone. It didn’t matter where they were going either.\n" +
                "The only thing that mattered was the serenity of that moment.\n" +
                "Just be together. Breathing together and resting together.\n";
        String topic_7="Just Be Together";
        String story_8="A mother camel and her baby were lying down, basking in the sun. The baby camel asked her mother, “Why do we have these big bumps on our backs?”\n" +
                "The mother stopped to think and then said: “We live in the desert where there is not much water available. Our humps store water to help us survive on long trips. “\n" +
                "The baby camel stopped to think and said, “Well why do we have long legs with rounded feet?”\n" +
                "Her mother replied, “They are meant to assist us to walk on the sand.”\n" +
                "The baby asked a third question: “Why are my lashes so long?”\n" +
                "The mother replied, “Your long eyelashes provide you with protection from the sand when the wind blows.”\n" +
                "Finally, the baby said, “If we have all these natural abilities that have given us to walk in the desert, what the use of camels in the zoo?”\n";
        String topic_8="What a Waste";
        String story_9="A professor entered the classroom with half a glass of water in his hand. Students asked the old common question “Was it half empty or half full?” Hoped but amazed he asked them, “How heavy is this glass of water?”\n" +
                "\n" +
                "The answers given by the students were ooze. Up to 25 oz. But the professor replied that the actual weight of the glass with water does not always differ but how long you hold the glass matters.\n" +
                "\n" +
                "If you hold the glass for a minute, you will not feel much weight. But if you hold on for 10 minutes, you will feel a little heavier and it will be heavier for you for hours.\n" +
                "\n" +
                "If you hold it all day, then your hands get numb and sore. This is the case when you have stress. If you think about it for a while and leave it, there is no problem but if you think about it for hours, it starts to become a problem and it gets worse if you sleep with it.\n";
        String topic_9="Let go of your stress";
        String story_10="There was a blind girl who completely hated the fact that she was blind. The only person he didn’t hate was his girlfriend, because he was always there for her. She says she married him if she could only see the world.\n" +
                "One day, someone donated a pair of eyes to him; Now she can see everything, including her boyfriend. Her boyfriend asked her, “Now you can see everything, will you marry me?”\n" +
                "The girl was shocked when she found out that her boyfriend was also blind and refused to marry him. Her boyfriend was in tears, and later wrote her a letter:\n" +
                "Just take care of my eyes dear.\n" +
                "The moral of the story: When our situation changes, so does our mind. Some people may not be able to see things as they used to be, and they may not be able to understand them.\n";
        String topic_10="The blind girl";
        String story_11="Some time ago, a man punished her 3-year-old daughter for wasting a roll of gold wrapping paper. Money was tight and he was furious when the girl tried to decorate a box to put under the Christmas tree.\n" +
                "However, the girl brought the gift to her father the next morning and said: This is for you, Dad.\n" +
                "The man was embarrassed by his overreaction earlier, but his anger continued when he saw that the box was empty. He yelled at her; Don’t you know, when you give someone a gift, is there supposed to be something inside?\n" +
                "The girl looked at him with tears in her eyes and cried;\n" +
                "Oh, Daddy, it’s not empty at all. I blew kisses in the box. They are all for you, daddy.\n" +
                "The father was crushed. Hee put her arms around her little girl and begged him to forgive her.\n" +
                "A short time later, an accident took the girl’s life.\n" +
                "His father kept the gold box by his bed for many years, and each time he became discouraged, he drew an imaginary kiss and remembered the love of the girl who had put it there.\n";
        String topic_11="Box Full of Kisses";
        String story_12="“A shop owner placed a sign above his door that said: ‘Puppies For Sale.’\n" +
                "Signs like this always have a way of attracting young children, and to no surprise, a boy saw the sign and approached the owner; ‘How much are you going to sell the puppies for?’ he asked.\n" +
                "The store owner replied, ‘Anywhere from $30 to $50.’\n" +
                "The little boy pulled out some change from his pocket. ‘I have $2.37,’ he said. ‘Can I please look at them?’\n" +
                "The shop owner smiled and whistled. Out of the kennel came Lady, who ran down the aisle of his shop followed by five teeny, tiny balls of fur.\n" +
                "One puppy was lagging considerably behind. Immediately the little boy singled out the lagging, limping puppy and said, ‘What’s wrong with that little dog?’\n" +
                "The shop owner explained that the veterinarian had examined the little puppy and had discovered it didn’t have a hip socket. It would always limp. It would always be lame.\n" +
                "The little boy became excited. ‘That is the puppy that I want to buy.’\n" +
                "The shop owner said, ‘No, you don’t want to buy that little dog. If you really want him, I’ll just give him to you.’\n" +
                "The little boy got quite upset. He looked straight into the store owner’s eyes, pointing his finger, and said;\n" +
                "‘I don’t want you to give him to me. That little dog is worth every bit as much as all the other dogs and I’ll pay full price. In fact, I’ll give you $2.37 now, and 50 cents a month until I have him paid for.’\n" +
                "The shop owner countered, ‘You really don’t want to buy this little dog. He is never going to be able to run and jump and play with you like the other puppies.’\n" +
                "To his surprise, the little boy reached down and rolled up his pant leg to reveal a badly twisted, crippled left leg supported by a big metal brace. He looked up at the shop owner and softly replied, ‘Well, I don’t run so well myself, and the little puppy will need someone who understands!'”\n";
        String topic_12="Damaged souls still have worth";
        String story_13="“As a man was passing the elephants, he suddenly stopped, confused by the fact that these huge creatures were being held by only a small rope tied to their front leg. No chains, no cages. It was obvious that the elephants could, at anytime, break away from their bonds but for some reason, they did not.\n" +
                "He saw a trainer nearby and asked why these animals just stood there and made no attempt to get away. ‘Well,’ trainer said, ‘when they are very young and much smaller we use the same size rope to tie them and, at that age, it’s enough to hold them. As they grow up, they are conditioned to believe they cannot break away. They believe the rope can still hold them, so they never try to break free.’\n" +
                "The man was amazed. These animals could at any time break free from their bonds but because they believed they couldn’t, they were stuck right where they were.”\n";
        String topic_13="Never let one failure from the past hold you back in the future";
        String story_14="A popular speaker started off a seminar by holding up a $20 bill. A crowd of 200 had gathered to hear him speak. He asked, ‘Who would like this $20 bill?’\n" +
                "200 hands went up.\n" +
                "He said, ‘I am going to give this $20 to one of you but first, let me do this.’ He crumpled the bill up.\n" +
                "He then asked, ‘Who still wants it?’\n" +
                "All 200 hands were still raised.\n" +
                "‘Well,’ he replied, ‘What if I do this?’ Then he dropped the bill on the ground and stomped on it with his shoes.\n" +
                "He picked it up, and showed it to the crowd. The bill was all crumpled and dirty.\n" +
                "‘Now who still wants it?’\n" +
                "All the hands still went up.\n" +
                "‘My friends, I have just showed you a very important lesson. No matter what I did to the money, you still wanted it because it did not decrease in value. It was still worth $20. Many times in our lives, life crumples us and grinds us into the dirt. We make bad decisions or deal with poor circumstances. We feel worthless. But no matter what has happened or what will happen, you will never lose your value. You are special – Don’t ever forget it!’\n";
        String topic_14="Stop stressing so much";
        String story_15="“Once upon a time a psychology professor walked around on a stage while teaching stress management principles to an auditorium filled with students. As she raised a glass of water, everyone expected they’d be asked the typical ‘glass half empty or glass half full’ question. Instead, with a smile on her face, the professor asked, ‘How heavy is this glass of water I’m holding?’\n" +
                "Students shouted out answers ranging from eight ounces to a couple pounds.\n" +
                "She replied, ‘From my perspective, the absolute weight of this glass doesn’t matter.  It all depends on how long I hold it. If I hold it for a minute or two, it’s fairly light. If I hold it for an hour straight, its weight might make my arm ache a little. If I hold it for a day straight, my arm will likely cramp up and feel completely numb and paralyzed, forcing me to drop the glass to the floor. In each case, the weight of the glass doesn’t change, but the longer I hold it, the heavier it feels to me.’\n" +
                "As the class shook their heads in agreement, she continued, ‘Your stresses and worries in life are very much like this glass of water. Think about them for a while and nothing happens. Think about them a bit longer and you begin to ache a little. Think about them all day long, and you will feel completely numb and paralyzed – incapable of doing anything else until you drop them.'”\n";
        String topic_15="Stop stressing so much";
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
        list.add(topic_11);
        list.add(topic_12);
        list.add(topic_13);
        list.add(topic_14);
        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_4);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_5);
                    startActivity(intent);

                }
                else if(i==5){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_9);
                    intent.putExtra("topic",topic_9);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_10);
                    intent.putExtra("topic",topic_10);
                    startActivity(intent);
                }
                else if(i==10){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_11);
                    intent.putExtra("topic",topic_11);
                    startActivity(intent);
                }
                else if(i==11){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_12);
                    intent.putExtra("topic",topic_12);
                    startActivity(intent);
                }
                else if(i==12){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_13);
                    intent.putExtra("topic",topic_13);
                    startActivity(intent);
                }
                else if(i==13){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_14);
                    intent.putExtra("topic",topic_14);
                    startActivity(intent);
                }
                else if(i==14){
                    Intent intent=new Intent(Scificlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_15);
                    intent.putExtra("topic",topic_15);
                    startActivity(intent);

                }


            }
        });
    }
}
