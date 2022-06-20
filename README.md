# TextSimplifier
- This Programme is a small project that takes a sentence or paragraph (string) in via the console. I the Project files there is a google-1000.txt that has the most commen words used on google in 2019/20.

- Also with the google-1000 words they will never change as they must stay the same as it contains the words such as **the, of, and, to, a, in, for, is, on, that** so with these staying the same it 

- The second file is a MobyThesaurus.txt which contains over 2 million words but for each first word at the start of the sentence it has something that is similar to it IE **a cappella** is the first word and then **,abbandono,accrescendo,affettuoso,agilmente,agitato,amabile,amoroso,appassionatamente,appassionato,brillante,capriccioso,con affetto,con agilita,con agitazione,con amore,crescendo,decrescendo,diminuendo,dolce,forte,fortissimo,lamentabile,leggiero,morendo,parlando,pianissimo,piano,pizzicato,scherzando,scherzoso,sordo,sotto voce,spiccato,staccato,stretto,tremolando,tremoloso,trillando** all follow.
So if **a cappella** is entered it will swap with one of the words listed at random.

- With what you enter could make loads of sense but when it gets all jumbled up and has a chance to actually be a readable sentence or paragraph. 

- To see how this is coded up you can take a look [Parser.java](https://github.com/Davidpurtill1101011/TextSimplifier/blob/master/Word%20Swapper/src/gmit/Parser.java). parseGoogle reads in the words from the google-1000 and the parse does all the work for the MobyThesaurus.txt
