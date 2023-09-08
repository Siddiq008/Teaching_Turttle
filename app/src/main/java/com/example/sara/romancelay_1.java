package com.example.sara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class romancelay_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romancelay1);
        String story_1="        There once lived a father and his four-year-old daughter in a small shack after they had become bankrupt. One of the most valuable things the man kept was gold wrapping paper.\n" +
                "One day, he found his daughter cutting the wrapping paper to decorate a gift box. He was furious and lashed at her for wasting the little precious things they could sell and buy necessities. However, the girl was unmoved by her dad’s anger and went on about her business.\n" +
                "Three days later came the man’s birthday although due to lots of financial stress, he’d forgotten about it. The daughter came and hugged his feet saying, “Happy birthday daddy! I have an amazing gift for you!”\n" +
                "Before the man could say anything, she rushed to her bedroom excitedly and came back with a box wrapped in gold paper. Realizing his overreaction three days earlier, he said, “Oh my dear, I’m sorry for scolding you. I didn’t…”\n" +
                "Before he could finish his apology, he opened the box and was confused at what he saw. He saw nothing but an empty box. In irritation, he asked her, “Don’t you know gift boxes need to have gifts inside?”\n" +
                "With eyes filled with tears, the child told him, “I knew you love this gold paper daddy. So with it, I wrapped the box full of my kisses. This is my love for you daddy…”\n" +
                "Broken by his behavior but melted by her gesture, he scooped her up and hugged her, asking for forgiveness.\n" +
                "Near the end of that summer, the daughter got into an accident and died. However, he kept her gift with him for the rest of his life, hugging it and taking kisses whenever he craved to feel her presence close to him.\n";
        String topic_1="A BOX FULL OF LOVE";
        String topic_2="No arms, no legs but love";
        String story_2="In 2012, bomb disposal expert Taylor Morris was severely injured after the explosion of an improvised bomb in Afghanistan. The explosion took all his limbs and changed the life of the 23-year-old US military soldier forever. \n" +
                "While recovering from the injuries in hospital, Taylor was confronted with the painful realization that his limbs had gone. He also had to face the fact that he would be dependent on assistance for the rest of his life. \n" +
                "It was an incredibly difficult situation not only for him but also his family and especially his long-term girlfriend Danielle. But instead of ever giving him up, Danielle became Taylor’s pillar in life. She helped him recover and took care of him during this incredibly challenging time.\n" +
                "Danielle played an important role in Taylor’s quick recovery. She never went away from his side and assisted him greatly when he learned to walk again with his new prosthetic limbs. \n" +
                "After Taylor had recovered, he proposed to his beloved girlfriend and they got married. It’s a beautiful ending of an incredibly inspiring love story that shows that nothing can ever stand in-between to people who really love each other.\n";
        String topic_3="A Weightlifter's Promise";
        String story_3="                   When Susann saw Matthias Steiner, an Austrian weightlifter, during a contest on TV, she immediately became interested in him. She was so determined to meet the athlete that she kept asking the TV commentators for his contact details for so long until they finally gave in. Once she had his email address, she contacted him and they both agreed to meet each other. It was love at first sight and the two married not long after meeting for the first time.\n" +
                "The young weightlifter moved for his wife to Germany and applied for the German citizenship. He was so in love with her that he also promised her that he would one day bring her an Olympic medal. Matthias Steiner was determined to live up to his promise, but things came differently. In 2007, his beautiful wife Susann died in a car accident. It was an unimaginable tragedy for the young man. But he remembered what he had promised his wife. It was the promise that kept him going through this difficult time. He became so determined that he was finally selected to become part of the German Olympic team at the 2008 Beijing Olympics.\n" +
                "During the contest, Matthias Steiner was faced with incredibly challenging competitors. He had three weightlifting attempts but failed in two. Seeing his chances of ever reaching the podium diminishing, he put everything he had left into the third and final attempt. And as luck would have it, he managed to lift the incredibly heavy weight, which won him the Olympic gold medal. The scene when he was awarded the medal was broadcasted to millions of viewers all around the world and Steiner simply couldn’t help himself but broke out into tears while holding a picture of his wife into the cameras.\n";
        String topic_4="The Bicycle Ride";
        String story_4="It is the year 1975, when Charlotte Von Sledvin, a 19-year-old student of a Swedish royal family, travels to India to get a portrait made by a gifted artist. The artist was born into a poor Indian family of the lowest caste, also known as the “untouchables.” Despite the incredibly difficult circumstances, the artist named Pradyumna Kumar Mahanandia had gained an outstanding reputation for being a gifted painter. His reputation led Charlotte Von Sledvin to travel all the way to India to get her portrait done.\n" +
                "By the time the portrait was finished, the two had fallen in love. Pradyumna was fascinated with Charlotte’s beauty. Never before had he seen a more beautiful woman from the Western world. He gave his best to capture all her beauty in the portrait, yet never fully succeeded. Nonetheless, the portrait was magnificent and Charlotte fell for his simplicity and his beautiful character. Because of him, she spontaneously decided to stay longer in India. Out of a couple of days became weeks and then even months. The two had fallen so deeply in love that they decided to get married according to traditional Indian rituals.\n" +
                "Unfortunately, the time came when Charlotte had to leave again in order to complete her studies in London. Thousands of miles separated the two but their feelings for each other never changed. They stayed in contact through letters, which they exchanged almost weekly with each other. Naturally, the newlyweds terribly struggled with the great distance between each other. Charlotte offered her husband to buy him air tickets, which he refused. He had not only decided to complete his studies first, but he had also set his mind on reuniting with the love of his life on his own terms. He even made her the promise that he would do anything he can to see her again.\n" +
                "After Pradyumna had finished his studies, he took all his possessions and sold them. Unfortunately, the money he earned didn’t even come close to a flight ticket. All he could afford was a cheap and used bicycle. Many would have been greatly disappointed, some would have even given up. But not Pradyumna. Instead of allowing the difficult circumstances to stop him from seeing his beloved wife again, he met the decision to use what he had in order to see her again. Nothing could stop him from reuniting with his wife, even if that meant an exhausting bicycle ride half around the world.\n" +
                "His decision was the beginning of a bicycle journey from India to the Western world. Pradyumna took all his paintings and brushes along with him in order to financially support his endeavor. His voyage led him through eight countries and took more than four months. But eventually, he arrived at Charlotte’s hometown in Sweden and finally saw her again. From then on, the two did never leave each other’s side for too long.\n";
        String topic_5="No arms, no legs but love";
        String story_5="In 2012, bomb disposal expert Taylor Morris was severely injured after the explosion of an improvised bomb in Afghanistan. The explosion took all his limbs and changed the life of the 23-year-old US military soldier forever. \n" +
                "While recovering from the injuries in hospital, Taylor was confronted with the painful realization that his limbs had gone. He also had to face the fact that he would be dependent on assistance for the rest of his life. \n" +
                "It was an incredibly difficult situation not only for him but also his family and especially his long-term girlfriend Danielle. But instead of ever giving him up, Danielle became Taylor’s pillar in life. She helped him recover and took care of him during this incredibly challenging time.\n" +
                "Danielle played an important role in Taylor’s quick recovery. She never went away from his side and assisted him greatly when he learned to walk again with his new prosthetic limbs. \n" +
                "After Taylor had recovered, he proposed to his beloved girlfriend and they got married. It’s a beautiful ending of an incredibly inspiring love story that shows that nothing can ever stand in-between to people who really love each other.\n";
        String topic_6="A heartwarming farewell gift";
        String story_6="When Gene was diagnosed with melanoma, he had only been given six weeks left to live. It was a shocking diagnosis but Gene decided to use the time he had left to make all the necessary arrangements for his wife Carol, with whom he had been married for 30 years. He cashed out his pension and used the money to pay off the house they were living in.\n" +
                " The second step was to arrange a trip for his wife Carol and the rest of the family to Italy. When they visited a specific church in Venice, a priest was already waiting for the couple. It was in this church that Gene’s parents had married more than 50 years ago. At that day, Gene and Carol renewed their wedding vows and had the most beautiful day.\n" +
                "After Gene had died, his wife Carol discovered that he hid hundreds of Post-it notes around the entire house, shortly before he died. Throughout the course of many months, she found one note after another.\n" +
                " The notes are beautiful and very personal statements meant to encourage Carol in this difficult time. But Gene also reminded his wife in these statements to fully enjoy every aspect of life, to sell his car and to move on with her life. It was the most heartwarming farewell gift one could ever imagine.\n";
        String topic_7="Runaway";
        String story_7="When a young student of a Catholic Church asked her teacher about the reasons why she decided to become a religious sister, her teacher told her a heartwarming love story.\n" +
                " Many years ago, when she was at a similar age, the teacher (let’s call her Ms. Patterson) fell in love with a young man stemming from a wealthy family. The two began seeing each other and quickly developed a deep connection with each other. \n" +
                "Unfortunately, the young man’s family was not at all in agreement with the relationship. They even threatened to enroll their son at a university overseas and far away. As Ms. Patterson came from a poor background, she couldn’t possibly have afforded to go with him at that time. This meant that if they wanted to continue the relationship, they would be separated from each other if they wanted or not.\n" +
                "But they both had fallen so in love with each other that ending the relationship – no matter in what way – was not an option. For this reason, they decided to run away. In great secrecy, they planned their escape and set these plans into action when the young man’s family finally found out about it.\n" +
                " But instead of quickly returning back home after running away, the two never went back. They joined the church, took holy orders and began traveling the world for various humanitarian missions. The two spent 40 years traveling and even got married, shortly before the man’s life came to an end.\n";
        String topic_8="The “make-up guy”";
        String story_8="Dave is a make-up artist who regularly holds makeup artistry classes at the local community college. Usually, the majority of his students are middle-aged housewives who want to fine-tune their makeup skills. But this one time, he held a class that was attended by man as well. The new student was a gentleman in his best years with a seemingly boundless interest in makeup artistry. He was keen to learn as much as he possibly could and wouldn’t stop until he was satisfied with the result of his work.\n" +
                "Understandably, the man was the number one subject of conversation when the other women were alone. Speculations quickly started to spread. Was he perhaps a transvestite? Why else would he attend such a class? The community college was placed in a conservative rural area, which is why the other participants were quite doubtful of the man’s intentions.\n" +
                "Throughout the lessons, the man carefully listened and wrote everything down he learned. When the day and class were slowly coming to an end, the outer attendees simply could not hide their curiosity any longer. When they finally asked him why he was so interested in makeup artistry, he gave the most inspiring beautiful reply.\n" +
                "He said, “You know, my beloved wife partially lost her eyesight because of diabetes. She’s no longer able to apply her makeup. I think she’s absolutely beautiful, even more so without makeup. She knows this and I tell her every day. But the thing is this,… she simply feels not comfortable leaving the home without make-up. She never went outside without wearing any makeup-up. Seeing the love of my life like this makes me really sad. So I decided to take this course to surprise her! I do not only want to learn how to apply her makeup; I want her to wear the most beautiful make-up so her inner beauty also shines on the outside.”\n";
        String topic_9="ACCIDENTWITH A HAPPY ENDING ";
        String story_9="When Frank’s wife had a car accident, she was so injured that she fell into a coma. Years passed but Frank did not stop visiting his wife at the hospital. Even though almost everyone – including the doctors – had given up hope, he remained faithful that she would one day recover. Every time he visited her, he began talking to her, recounting all those beautiful moments they spend with each other.\n" +
                " One day, when he showed her the video of their wedding day, she slowly began to move her hand. She whispered his name and began gaining consciousness. Several weeks after she had woken up, she had fully recovered and was finally allowed to leave the hospital for good. \n" +
                "When the couple left, she told Frank that she heard his voice while she was in a coma and that it was his voice that was the greatest aid in helping her to return to consciousness.\n";
        String topic_10="THE BLIND HUSBAND AND HIS TOUCHING LOVE STORY";
        String story_10="A man married a very beautiful girl. After marriage they were living happily. Man admired her beauty and loved her very much. But after few months, wife came to know that she was suffering from a skin disease and because of that gradually she will lose her beauty. Knowing this, wife started thinking to herself, \"What if i become ugly, my husband would start hating me.. I won't be able to tolerate his hatred.\" Meanwhile, one day her husband had to go out of town for some work. When he was returning home after finishing his work, he met with an accident. He lost both his eyes in that accident.\n" +
                "In-spite of all this, their married life continued to progress normally. Time passed and wife completely lost her beauty due to her skin disease. She turned ugly but her blind husband couldn't see it. So it didn't effect their married life. He kept on loving her like always.\n" +
                " One day wife died. Now, husband was sad and alone. He decided to leave that city. He completed all funeral rites for her wife. Next day, when he was about to leave, his neighbor saw him and went to him and said, \"How will you be able to live without support of your wife? You can't see and your wife was always there for you to support you and help you for many years. It would be difficult for you.\" Husband replied, \"Friend, i am not blind. I was just pretending to be blind. Because when my wife came to know about her disease i realized that she was bother by it and scared. If my wife had known that i could see her ugliness, it would have hurt her more than her illness. She was very good wife and i just wanted to keep her happy. That's why for all these years, i pretended to be blind.\"\n";
        String topic_11="TRUE LOVE-VALENTINE'S SPECIAL STORY";
        String story_11="Once a girl and boy fell in love. Girl's parents weren't too happy with this relation, So boy decided not only to court girl but her parents as well. In time, Girl's parent realized that he was good man and agreed for their marriage. When parents agreed, another problem arised. Boy was in army and soon war broke out, he was called out to be sent to overseas for a year. Week before he left, they were engaged. They agreed that they would get married once boy return from war. A few days later, girl got into an vehicular accident. When she woke up, she saw her mother and father crying. Immediately she knew that there was something wrong.\n" +
                "She found that she suffered from brain injury, parts of her brain that controlled her face muscles were damaged. Her once lovely face was now disfigured. Her body was covered with so many wounds. Seeing herself in mirror and her wounds she cried and said, \"Yesterday, i was beautiful but today it's all gone.\" Right there and then she decided to release her fiance from their promise. She didn't want him to see her like this. For one year, boy wrote many letter, called many times but she didn't replied. After one year, Girl mother walked into her room and said, \"He is back from war. He is here to meet you.\" Girl shouted, \"No, please don't tell him about me and ask him to leave.\" Mother said, \"He is getting married and he is here to give his wedding invitation.\"\n" +
                "Saying this, mother handed her, boy's wedding invitation. Girl was sad, her heart sank. She knew that she still loved him but now she had to forget him now. With great sadness, She opened it. And then she saw Her Name on it..! Confused she asked her mother, \"What's this?\" Just then young man entered her room with a bouquet of flowers. he knelt beside her and asked, \"Will you marry me?\" Girl covered her face with her hands and said, \"Don't look.. Please.. I am not Beautiful anymore. I look ugly.\" Young man replied, \"Without your permission, your mother sent me photos of yours. When i saw those photos, i realized that nothing has changed. You are still the person i fell in love with. You are still as beautiful as ever. I Love You.\"\n";
        String topic_12="ARROGANT RICH GIRL STORY ";
        String story_12="Once a poor boy fell in love with a rich man daughter. Boy loved her a lot so one day he proposed to her. Girl rejected him by saying, \"Listen, your monthly salary is even less than my daily expenses. How can i live with you? How could you even thought of coming to me and ask me?? I can never ever love you. Forget about me and go find someone of your level to get engaged.\" Even after knowing girl's thought he still loved her and after getting rejected boy left but couldn't forget her. 10 years later they stumbled into each other in a shopping mall.\n" +
                "Girl recognized him and said, \"Hey!! You.. how are you?? I am married now He is very smart and do you know how much my husband's salary..!! it's 20,000$ per month. Can you beat that?? Boy eye's got wet hearing those words from same person. A few seconds later her husband came around. Before girl could say a word seeing the guy her husband said, \"Sir, you are here! you have met my wife.\" \"This is my boss. I am one those working for his 100 million $ project.\" husband said looking at his wife. Husband continued, \"He is very good person and do you know my dear, My boss loved a girl but he couldn't win her heart that's why he remained unmarried. How lucky would that girl have been, if she married my boss now..!! Now days who would have loved someone so much.\" Girl got totally shocked but couldn't say a word after that.\n";
        String topic_13="HEART TOCHING LOVE STORY";
        String story_13="It's story of a Boy and Girl. They were best friend for years and used to talk on phone for hours and text each other whole day. There wouldn't be a day on which they didn't contact and talk to each other. Everything was great. They used to be happy in each other company and enjoy. But one day boy didn't call of replied to girl for a day. Girl got worried and knew something was wrong. At night in her room she was crying and at that time she realized that how much he meant to her. Next day in morning she got a call. It was from boy. Boy: Hi Girl: I am so glad that you called, What happened to you yesterday? Boy: i was busy.\n" +
                "Boy: I think we should stop talking. \n" +
                "Girl: What? but why? \n" +
                "Boy: Sorry. Bye. \n" +
                "After this boy disconnected call. Girl was shocked. She couldn't understand anything and was feeling lonely, rejected and broken. After thinking she decided to make a last try to get him back. So, She called him.\n" +
                " Girl: Hi Boy: Why are you calling me?\n" +
                " Girl: I need to ask u something.\n" +
                " Boy: Go ahead Girl (With heavy heart): Are you alright? She tried to talk but she thought may be he really doesn't care. She broke off and left her house leaving a note.\n" +
                " Few hours later boy got a call. It was to inform him that girl got hit by a car and her condition was serious. Boy rushed to hospital and went to see her. He was sitting beside her holding her hand.\n" +
                " Boy: I am sorry it's all my fault But.. i promise i will make it up to u. \n" +
                "Girl: I am not gonna get better!!\n" +
                " Boy: Don't say that.\n" +
                " Girl: Just tell me one thing why you asked me to leave? To this question of her boy tell her the truth that he has heart problem and he didn't wanted her to get worried because there was risk that he would die.\n" +
                " Boy continued ans said, \"I did this because I Love You...!!\" I Love u Too.. Girl said and her heart stop beating. Just after 10 mins boy also died because of heart attack. As he could live with the thought that she died because of him.\n";
        String story_14="It's story of girl and boy who loved but..!! 10th Grade: As I sat there in English class, I stared at the girl next to me. She was my 'best friend'. I stared at her long, silky hair, and wished she was mine. But she didn't notice me like that, and I knew it. After class, she walked up to me and asked me for the notes. I handed them to her. She Thanked me and gave a Kiss on my Cheek. All I wanted to do is to tell her how I feel about her. I lover her and wanted to tell her that I want her to be mine but I was too shy to tell her. 11th grade: The phone rang. On the other end, it was her. She was in tears, mumbling on and on about how her love had broke her heart. She asked me to come over because she didn't want to be alone, So I did. As I sat next to her on the sofa, I stared at her soft eyes, wishing she was mine. After 2 hours, one Drew Barrymore movie, and three bags of chips, she decided to go home.\n" +
                "She Thanked me and gave a Kiss on my Cheek. All I wanted to do is to tell her how I feel about her. I lover her and wanted to tell her that I want her to be mine but I was too shy to tell her. Senior year: One fine day she walked to my locker. \"My date is sick\" she said, \"hes not gonna go\" well, I didn't have a date, and in 7th grade, we made a promise that if neither of us had dates, we would go together just as 'best friends'. So we did. That night, after everything was over, I was standing at her front door step. I stared at her as She smiled at me and stared at me with her crystal eyes. She Thanked me and gave a Kiss on my Cheek. All I wanted to do is to tell her how I feel about her. I lover her and wanted to tell her that I want her to be mine but I was too shy to tell her. Graduation: A day passed, then a week, then a month. Before I could blink, it was graduation day. I watched as her perfect body floated like an angel up on stage to get her diploma. I wanted her to be mine-but she didn't notice me like that, and I knew it. Before everyone went home, she came to me in her smock and hat, and cried as I hugged her. She said, \"you are my Best friend.\" and gave a Kiss on my Cheek. All I wanted to do is to tell her how I feel about her. I lover her and wanted to tell her that I want her to be mine but I was too shy to tell her.\n" +
                "Marriage: Now I sit in church. That girl is getting married now. and drive off to her new life, married to another man. I wanted her to be mine, but she didn't see me like that, and I knew it. But before she drove away, she came to me and said 'you came !'. She Thanked me and gave a Kiss on my Cheek. All I wanted to do is to tell her how I feel about her. I lover her and wanted to tell her that I want her to be mine but I was too shy to tell her. \n" +
                "Death: Years passed, I looked down at the coffin of a girl who used to be my 'best friend'. At the service, they read a diary entry she had wrote in her high school years. This is what it read: \"I stare at him wishing he was mine, but he doesn't notice me like that, and I know it. I want to tell him, I want him to know that I don't want to be just friends, I love him but I'm just too shy, and I don't know why. I wish he would tell me he loved me!\" \"I wish I did too\" I thought to my self, and I cried!!\n";
        String topic_14="STORY OF BOY AND GIRL WHO LOVED BUT....!!";
        ListView listView=findViewById(R.id.Listview);
        List<String> list= new ArrayList<>();
        List<String> sty=new ArrayList<>();
        sty.add(story_1);
        sty.add(story_2);
        sty.add(story_3);
        sty.add(story_4);
        sty.add(story_5);
        sty.add(story_6);
        sty.add(story_7);
        sty.add(story_8);
        sty.add(story_9);
        sty.add(story_10);
        sty.add(story_11);
        sty.add(story_12);
        sty.add(story_13);
        sty.add(story_14);
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

                    Intent intent=new Intent(romancelay_1.this,romancelay_2.class);
                    intent.putExtra("story",sty.get(i));
                    intent.putExtra("topic",list.get(i));
                    startActivity(intent);
                }

        });
    }
}