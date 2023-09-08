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

public class horrorlay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horrorlay1);
        String  story_1="We bought an old house, my boyfriend and I. He's in charge of the \"new\" construction – converting the kitchen in to the master bedroom for instance, while I'm on wallpaper removal duty. The previous owner papered EVERY wall and CEILING! Removing it is brutal, but oddly satisfying. The best feeling is getting a long peel, similar to your skin when you're peeling from a sunburn. I don't know about you but I kinda make a game of peeling, on the hunt for the longest piece before it rips.Under a corner section of paper in every room is a person’s name and a date. Curiosity got the best of me one night when I Googled one of the names and discovered the person was actually a missing person, the missing date matching the date under the wallpaper! The next day, I made a list of all the names and dates. Sure enough each name was for a missing person with dates to match. We notified the police who naturally sent out the crime scene team. I overhead one tech say \"yup, it's human.\" Human? What's human? \"Ma'am, where is the material you removed from the walls already? This isn't wallpaper you were removing.\"";
        String topic_1="This new old house";
        String  story_2="I hate it when my brother Charlie has to go away. My parents constantly try to explain to me how sick he is. That I am lucky for having a brain where all the chemicals flow properly to their destinations like undammed rivers. When I complain about how bored I am without a little brother to play with, they try to make me feel bad by pointing out that his boredom likely far surpasses mine, considering his confine to a dark room in an institution. I always beg for them to give him one last chance. Of course, they did at first. Charlie has been back home several times, each shorter in duration than the last. Every time without fail, it all starts again. The neighbourhood cats with gouged out eyes showing up in his toy chest, my dad's razors found dropped on the baby slide in the park across the street, mom's vitamins replaced by bits of dishwasher tablets. My parents are hesitant now, using \"last chances\" sparingly. They say his disorder makes him charming, makes it easy for him to fake normalcy, and to trick the doctors who care for him into thinking he is ready for rehabilitation. That I will just have to put up with my boredom if it means staying safe from him. I hate it when Charlie has to go away. It makes me have to pretend to be good until he is back.";
        String topic_2="I hate it when my brother Charlie has toy go awa";
        String  story_3="He awoke to the huge, insect like creatures looming over his bed and screamed his lungs out. They hastily left the room and he stayed up all night, shaking and wondering if it had been a dream.The next morning, there was a tap on the door. Gathering his courage, he opened it to see one of them gently place a plate filled with fried breakfast on the floor, then retreat to a safe distance. Bewildered, he accepted the gift. The creatures chittered excitedly.This happened every day for weeks. At first he was worried they were fattening him up, but after a particularly greasy breakfast left him clutching his chest from heartburn, they were replaced with fresh fruit. As well as cooking, they poured hot steamy baths for him and even tucked him in when he went to bed. It was bizarre.One night, he awoke to gunshots and screaming. He raced downstairs to find a decapitated burglar being devoured by the insects. He was sickened, but disposed of the remains as best he could. He knew they had just been protecting him.One morning the creatures wouldn't let him leave his room. He lay down, confused but trusting as they ushered him back into bed. Whatever their motives, they weren't going to hurt him.Hours later a burning pain spread throughout his body. It felt like his stomach was filled with razor wire. The insects chittered as he spasmed and moaned. It was only when he felt a terrible squirming feeling beneath his skin that he realised the insects hadn't been protecting him. They had been protecting their young.";
        String topic_3="Guardians";
        String  story_4="Everyone loves the first day of school, right? New year, new classes, new friends. It's a day full of potential and hope, before all the dreary depressions of reality show up to ruin all the fun.I like the first day of school for a different reason, though. You see, I have a sort of power. When I look at people, I can...sense a sort of aura around them. A colored outline based on how long that person has to live. Most everyone I meet around my age is surrounded by a solid green hue, which means they have plenty of time left.A fair amount of them have a yellow-orangish tinge to their auras, which tends to mean a car crash or some other tragedy. Anything that takes people \"before their time\" as they say.The real fun is when the auras venture into the red end of the spectrum, though. Every now and again I'll see someone who's basically a walking stoplight. Those are the ones who get murdered or kill themselves. It's such a rush to see them and know their time is numbered.With that in mind, I always get to class very early so I can scout out my classmates' fates. The first kid who walked in was basically radiating red. I chuckled to myself. Too damn bad, bro. But as people kept walking in, they all had the same intense glow. I finally caught a glimpse of my rose-tinted reflection in the window, but I was too stunned to move. Our professor stepped in and locked the door, his aura a sickening shade of green.";
        String topic_4="'Seeing Red (The First Day of School)";
        String  story_5="It has been said that the definition of insanity is \"doing the same \n" +
                "thing over and over and expecting different results\". I \n" +
                "understand the sentiment behind the saying, but it's wrong.I \n" +
                "entered the building on a bet. I was strapped for cash and didn't \n" +
                "buy into the old legends of the hotel to begin with, so fifty bucks \n" +
                "was more than enough to get me do it. It was simple. Just reach \n" +
                "the top floor, the 45th floor, shine my flashlight from a \n" +
                "window.The hotel was old and broken, including the elevator, so \n" +
                "that meant hiking up the stairs. So up the stairs I went. As I \n" +
                "reached each platform, I noted the old brass plaques displaying \n" +
                "the floor numbers. 15, 16, 17, 18. I felt a little tired as I crept \n" +
                "higher, but so far, no ghosts, no cannibals, no demons. Piece of \n" +
                "cake.I can't tell you how happy I was as I entered that last \n" +
                "stretch of numbers. I joyfully counted them aloud at each \n" +
                "platform. 40, 41, 42, 43, 44, 44. I stopped and looked back down \n" +
                "the stairs. I must have miscounted, so I continued up. 44. One \n" +
                "more flight. 44. And then down ten flights. 44. Fifteen flights. \n" +
                "44.And so it's been for as long as I can remember. So really, \n" +
                "insanity isn't doing something repeatedly and expecting \n" +
                "different results. It's knowing that the results will never ever \n" +
                "change; that each door leads to the same staircase, to the same\n" +
                " number. It’s realizing you no longer fall asleep. It's not knowing\n" +
                " whether you've been running for days or weeks or years. It's \n" +
                "when the sobbing slowly turns into laughter.\n";
        String topic_5="'They got the definition wrong";
        String  story_6="He had been given the watch on his tenth birthday. It was an ordinary grey \n" +
                "plastic wristwatch in every respect except for the fact that it was counting \n" +
                "down. \"That is all of the time you have left in the world, son. Use it wisely.\" \n" +
                "And indeed he did. As the watch ticked away, the boy, now a man, lived life \n" +
                "to the fullest. He climbed mountains and swam oceans. He talked and \n" +
                "laughed and lived and loved. The man was never afraid, for he knew \n" +
                "exactly how much time he had left.Eventually, the watch began its final\n" +
                " countdown. The old man stood looking over everything he had done, \n" +
                "everything he had built. 5. He shook hands with his old business partner, \n" +
                "the man who had long been his friend and confidant. 4. His dog came and \n" +
                "licked his hand, earning a pat on the head for its companionship. 3. He \n" +
                "hugged his son, knowing that he had been a good father. 2. He kissed his \n" +
                "wife on the forehead one last time. 1. The old man smiled and closed his eyes.\n" +
                "Then, nothing happened. The watch beeped once and turned off. The man \n" +
                "stood standing there, very much alive. You would think that in that moment \n" +
                "he would have been overjoyed. Instead, for the first time in his life, the man\n" +
                " was scared.\n";
        String topic_6="Timekeeper";
        String  story_7="When my sister Betsy and I were kids, our family lived for awhile in a \n" +
                "charming old farmhouse. We loved exploring its dusty corners and \n" +
                "climbing the apple tree in the backyard. But our favorite thing was the\n" +
                " ghost.We called her Mother, because she seemed so kind and \n" +
                "nurturing. Some mornings Betsy and I would wake up, and on each of\n" +
                " our nightstands, we'd find a cup that hadn't been there the night \n" +
                "before. Mother had left them there, worried that we'd get thirsty during the night. She just wanted to take care of us.Among the house's original furnishings was an antique wooden chair, which we kept against the back wall of the living room. Whenever we were preoccupied, watching TV or playing a game, Mother would inch that chair forward, across the room, toward us. Sometimes she'd manage to move it all the way to the center of the room. We always felt sad putting it back against the wall. Mother just wanted to be near us.Years later, long after we'd moved out, I found an old newspaper article about the farmhouse's original occupant, a widow. She'd murdered her two children by giving them each a cup of poisoned milk before bed. Then she'd hanged herself.The article included a photo of the farmhouse's living room, with a woman's body hanging from a beam. Beneath her, knocked over, was that old wooden chair, placed exactly in the center of the room.\n";
        String topic_7="'There's no Reason to be Afraid";
        String  story_8="On Monday, I came up with the perfect plan. No one even knew we were friends.On Tuesday, he stole the gun from his dad.On Wednesday, we decided to make our move during the following day's pep rally.On Thursday, while the entire school was in the gym, we waited just outside the doors. I was to use the gun on whoever walked out first. Then he would take the gun and go into the gym blasting.I walked up to Mr. Quinn the guidance counselor and shot him in the face three times. He fell back into the gym, dead. The shots were deafening. We heard screams in the auditorium.No one could see us yet. I handed him the gun and whispered, \"your turn.\" He ran into the gym and started firing. I followed a moment after.He hadn't hit anyone yet. Kids were scrambling and hiding. It was mayhem.I ran up behind him and tackled him. We struggled. I wrenched the gun out of his hands, turned it on him, and killed him. I closed his mouth forever.On Friday, I was anointed a hero.It was indeed the perfect plan.";
        String topic_8="The Perfect Plan";
        String  story_9="\"If God exists, why is there so much evil in the world?\" It's a common question, but it is misplaced.All things must have balance. Light and dark. Good and evil. Sound and silence. Without one, the other cannot exist.\"So if that's true, then God does NOTHING to fight evil?\" That might be your follow up question.Of course he fights evil. Relentlessly. I am Dartalian, one of His most Holy and Righteous angels.I roam the Earth, disposing of evil wherever I find it. I kill the monsters you don't ever want to know about. I crush them completely so you can sleep at night. You humans have no idea how many of you live because of the work I do.\"But what about Stalin? Hitler? Ted Bundy? Jack the Ripper?\"Well, those are the minor ones I had to let live. For balance. The ones I destroy are ....too horrible and vile to survive.What's funny, is while I would wager you never have heard the name Dartalian in any relegious texts, I bet you have heard of me.Americans, for example, have their own name for me.Sudden Infant Death Syndrome.";
        String topic_9="Warrior of god";
        String  story_10="There was no pearly gate.The only reason I knew I was in a cave was because I had just passed the entrance. The rock wall rose behind me with no ceiling in sight.I knew this was it, this was what religion talked about, what man feared .. I had just entered the gate to hell.I felt the presence of the cave as if it was a living, breathing creature. The stench of rotten flesh overwhelmed me.Then there was the voice, it came from inside and all around.\"Welcome\"\"Who are you?\", I asked, trying to keep my composure.\"You know\", the thing answered.I did know.\"You are the devil\", I stuttered, quickly losing my composure. \"Why me? I've lived as good as I could\".The silence took over the space as my words died out. It seemed like an hour went by before the response came.\"What did you expect?\"The voice was penetrating but patient.\"I don't know .. I never believed any of this\", I uttered \"Is that why I am here?\"Silence.I continued: \"They say the greatest trick you ever pulled was convincing the world you don't exist\"\"No, the greatest trick I ever pulled was convincing the world that there is an alternative\"\"There is no God?\" I shivered.The cave trembled with the words: \"I am God.\"";
        String topic_10="Hell";
        String  story_11="";
        String topic_11="";
        String  story_12="";
        String topic_12="";
        String  story_13="";
        String topic_13="";
        String  story_14="";
        String topic_14="";
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
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_1);
                    intent.putExtra("topic",topic_1);
                    startActivity(intent);
                }
                else if(i==1){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("topic",topic_2);
                    intent.putExtra("story",story_2);
                    startActivity(intent);

                }
                else if(i==2){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_3);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==3){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_4);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);

                }
                else if(i==6){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_5);
                    intent.putExtra("topic",topic_3);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_6);
                    intent.putExtra("topic",topic_6);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_7);
                    intent.putExtra("topic",topic_7);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_8);
                    intent.putExtra("topic",topic_8);
                    startActivity(intent);
                }
                else if(i==10){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_9);
                    intent.putExtra("topic",topic_9);
                    startActivity(intent);
                }
                else if(i==11){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_10);
                    intent.putExtra("topic",topic_10);
                    startActivity(intent);
                }
                else if(i==12){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
                    intent.putExtra("story",story_11);
                    intent.putExtra("topic",topic_11);
                    startActivity(intent);
                }
                else if(i==13){
                    Intent intent=new Intent(horrorlay_1.this,romancelay_2.class);
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