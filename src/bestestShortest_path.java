import java.util.HashMap;

public class bestestShortest_path {
    String moby = "It will be seen that this mere painstaking burrower and grub-worm of a poor devil of a Sub-Sub appears to have gone through the long Vaticans and street-stalls of the earth, picking up whatever random allusions to whales he could anyways find in any book whatsoever, sacred or profane. Therefore you must not, in every case at least, take the higgledy-piggledy whale statements, however authentic, in these extracts, for veritable gospel cetology. Far from it. As touching the ancient authors generally, as well as the poets here appearing, these extracts are solely valuable or entertaining, as affording a glancing bird's eye view of what has been promiscuously said, thought, fancied, and sung of Leviathan, by many nations and generations, including our own.\n"+
            "\n"+
            "So fare thee well, poor devil of a Sub-Sub, whose commentator I am. Thou belongest to that hopeless, sallow tribe which no wine of this world will ever warm; and for whom even Pale Sherry would be too rosy-strong; but with whom one sometimes loves to sit, and feel poor-devilish, too; and grow convivial upon tears; and say to them bluntly, with full eyes and empty glasses, and in not altogether unpleasant sadness—Give it up, Sub-Subs! For by how much the more pains ye take to please the world, by so much the more shall ye for ever go thankless! Would that I could clear out Hampton Court and the Tuileries for ye! But gulp down your tears and hie aloft to the royal-mast with your hearts; for your friends who have gone before are clearing out the seven-storied heavens, and making refugees of long-pampered Gabriel, Michael, and Raphael, against your coming. Here ye strike but splintered hearts together—there, ye shall strike unsplinterable glasses!\n"+
            "\n"+
            "EXTRACTS.\n"+
            "“And God created great whales.” —Genesis.\n"+
            "\n"+
            "“Leviathan maketh a path to shine after him; One would think the deep to be hoary.” —Job.\n"+
            "\n"+
            "“Now the Lord had prepared a great fish to swallow up Jonah.” —Jonah.\n"+
            "\n"+
            "“There go the ships; there is that Leviathan whom thou hast made to play therein.” —Psalms.\n"+
            "\n"+
            "“In that day, the Lord with his sore, and great, and strong sword, shall punish Leviathan the piercing serpent, even Leviathan that crooked serpent; and he shall slay the dragon that is in the sea.” —Isaiah.\n"+
            "\n"+
            "“And what thing soever besides cometh within the chaos of this monster's mouth, be it beast, boat, or stone, down it goes all incontinently that foul great swallow of his, and perisheth in the bottomless gulf of his paunch.” —Holland's Plutarch's Morals.\n"+
            "\n"+
            "“The Indian Sea breedeth the most and the biggest fishes that are: among which the Whales and Whirlpooles called Balaene, take up as much in length as four acres or arpens of land.” —Holland's Pliny.\n"+
            "\n"+
            "“Scarcely had we proceeded two days on the sea, when about sunrise a great many Whales and other monsters of the sea, appeared. Among the former, one was of a most monstrous size.... This came towards us, open-mouthed, raising the waves on all sides, and beating the sea before him into a foam.” —Tooke's Lucian. “The True History.”\n"+
            "\n"+
            "“He visited this country also with a view of catching horse-whales, which had bones of very great value for their teeth, of which he brought some to the king.... The best whales were catched in his own country, of which some were forty-eight, some fifty yards long. He said that he was one of six who had killed sixty in two days.” —Other or Other's verbal narrative taken down from his mouth by King Alfred, A.D. 890.\n"+
            "\n"+
            "“And whereas all the other things, whether beast or vessel, that enter into the dreadful gulf of this monster's (whale's) mouth, are immediately lost and swallowed up, the sea-gudgeon retires into it in great security, and there sleeps.” —MONTAIGNE. —Apology for Raimond Sebond.\n"+
            "\n"+
            "“Let us fly, let us fly! Old Nick take me if is not Leviathan described by the noble prophet Moses in the life of patient Job.” —Rabelais.\n"+
            "\n"+
            "“This whale's liver was two cartloads.” —Stowe's Annals.\n"+
            "\n"+
            "“The great Leviathan that maketh the seas to seethe like boiling pan.” —Lord Bacon's Version of the Psalms.\n"+
            "\n"+
            "“Touching that monstrous bulk of the whale or ork we have received nothing certain. They grow exceeding fat, insomuch that an incredible quantity of oil will be extracted out of one whale.” —Ibid. “History of Life and Death.”\n"+
            "\n"+
            "“The sovereignest thing on earth is parmacetti for an inward bruise.” —King Henry.\n"+
            "\n"+
            "“Very like a whale.” —Hamlet.\n"+
            "\n"+
            "     “Which to secure, no skill of leach's art\n"+
            "     Mote him availle, but to returne againe\n"+
            "     To his wound's worker, that with lowly dart,\n"+
            "     Dinting his breast, had bred his restless paine,\n"+
            "     Like as the wounded whale to shore flies thro' the maine.”\n"+
            "      —The Faerie Queen.\n"+
            "“Immense as whales, the motion of whose vast bodies can in a peaceful calm trouble the ocean till it boil.” —Sir William Davenant. Preface to Gondibert.\n"+
            "\n"+
            "“What spermacetti is, men might justly doubt, since the learned Hosmannus in his work of thirty years, saith plainly, Nescio quid sit.” —Sir T. Browne. Of Sperma Ceti and the Sperma Ceti Whale. Vide his V. E.\n"+
            "\n"+
            "     “Like Spencer's Talus with his modern flail\n"+
            "     He threatens ruin with his ponderous tail.\n"+
            "   ...\n"+
            "     Their fixed jav'lins in his side he wears,\n"+
            "     And on his back a grove of pikes appears.”\n"+
            "      —Waller's Battle of the Summer Islands.\n"+
            "“By art is created that great Leviathan, called a Commonwealth or State—(in Latin, Civitas) which is but an artificial man.” —Opening sentence of Hobbes's Leviathan.\n"+
            "\n"+
            "“Silly Mansoul swallowed it without chewing, as if it had been a sprat in the mouth of a whale.” —Pilgrim's Progress.\n"+
            "\n"+
            "     “That sea beast\n"+
            "     Leviathan, which God of all his works\n"+
            "     Created hugest that swim the ocean stream.” —Paradise Lost.\n"+
            "\n"+
            "     —“There Leviathan,\n"+
            "     Hugest of living creatures, in the deep\n"+
            "     Stretched like a promontory sleeps or swims,\n"+
            "     And seems a moving land; and at his gills\n"+
            "     Draws in, and at his breath spouts out a sea.” —Ibid.\n"+
            "“The mighty whales which swim in a sea of water, and have a sea of oil swimming in them.” —Fuller's Profane and Holy State.\n"+
            "\n"+
            "     “So close behind some promontory lie\n"+
            "     The huge Leviathan to attend their prey,\n"+
            "     And give no chance, but swallow in the fry,\n"+
            "     Which through their gaping jaws mistake the way.”\n"+
            "      —Dryden's Annus Mirabilis.\n"+
            "“While the whale is floating at the stern of the ship, they cut off his head, and tow it with a boat as near the shore as it will come; but it will be aground in twelve or thirteen feet water.” —Thomas Edge's Ten Voyages to Spitzbergen, in Purchas.\n"+
            "\n"+
            "“In their way they saw many whales sporting in the ocean, and in wantonness fuzzing up the water through their pipes and vents, which nature has placed on their shoulders.” —Sir T. Herbert's Voyages into Asia and Africa. Harris Coll.\n"+
            "\n"+
            "“Here they saw such huge troops of whales, that they were forced to proceed with a great deal of caution for fear they should run their ship upon them.” —Schouten's Sixth Circumnavigation.\n"+
            "\n"+
            "“We set sail from the Elbe, wind N.E. in the ship called The Jonas-in-the-Whale.... Some say the whale can't open his mouth, but that is a fable.... They frequently climb up the masts to see whether they can see a whale, for the first discoverer has a ducat for his pains.... I was told of a whale taken near Shetland, that had above a barrel of herrings in his belly.... One of our harpooneers told me that he caught once a whale in Spitzbergen that was white all over.” —A Voyage to Greenland, A.D. 1671. Harris Coll.\n"+
            "\n"+
            "“Several whales have come in upon this coast (Fife) Anno 1652, one eighty feet in length of the whale-bone kind came in, which (as I was informed), besides a vast quantity of oil, did afford 500 weight of baleen. The jaws of it stand for a gate in the garden of Pitferren.” —Sibbald's Fife and Kinross.\n"+
            "\n"+
            "“Myself have agreed to try whether I can master and kill this Sperma-ceti whale, for I could never hear of any of that sort that was killed by any man, such is his fierceness and swiftness.” —Richard Strafford's Letter from the Bermudas. Phil. Trans. A.D. 1668.\n"+
            "\n"+
            "“Whales in the sea God's voice obey.” —N. E. Primer.\n"+
            "\n"+
            "“We saw also abundance of large whales, there being more in those southern seas, as I may say, by a hundred to one; than we have to the northward of us.” —Captain Cowley's Voyage round the Globe, A.D. 1729.\n"+
            "\n"+
            "“... and the breath of the whale is frequently attended with such an insupportable smell, as to bring on a disorder of the brain.” —Ulloa's South America.\n"+
            "\n"+
            "     “To fifty chosen sylphs of special note,\n"+
            "     We trust the important charge, the petticoat.\n"+
            "     Oft have we known that seven-fold fence to fail,\n"+
            "     Tho' stuffed with hoops and armed with ribs of whale.”\n"+
            "      —Rape of the Lock.\n"+
            "“If we compare land animals in respect to magnitude, with those that take up their abode in the deep, we shall find they will appear contemptible in the comparison. The whale is doubtless the largest animal in creation.” —Goldsmith, Nat. Hist.\n"+
            "\n"+
            "“If you should write a fable for little fishes, you would make them speak like great whales.” —Goldsmith to Johnson.\n"+
            "\n"+
            "“In the afternoon we saw what was supposed to be a rock, but it was found to be a dead whale, which some Asiatics had killed, and were then towing ashore. They seemed to endeavor to conceal themselves behind the whale, in order to avoid being seen by us.” —Cook's Voyages.\n"+
            "\n"+
            "“The larger whales, they seldom venture to attack. They stand in so great dread of some of them, that when out at sea they are afraid to mention even their names, and carry dung, lime-stone, juniper-wood, and some other articles of the same nature in their boats, in order to terrify and prevent their too near approach.” —Uno Von Troil's Letters on Banks's and Solander's Voyage to Iceland in 1772.\n"+
            "\n"+
            "“The Spermacetti Whale found by the Nantuckois, is an active, fierce animal, and requires vast address and boldness in the fishermen.” —Thomas Jefferson's Whale Memorial to the French minister in 1778.\n"+
            "\n"+
            "“And pray, sir, what in the world is equal to it?” —Edmund Burke's reference in Parliament to the Nantucket Whale-Fishery.\n"+
            "\n"+
            "“Spain—a great whale stranded on the shores of Europe.” —Edmund Burke. (somewhere.)\n"+
            "\n"+
            "“A tenth branch of the king's ordinary revenue, said to be grounded on the consideration of his guarding and protecting the seas from pirates and robbers, is the right to royal fish, which are whale and sturgeon. And these, when either thrown ashore or caught near the coast, are the property of the king.” —Blackstone.\n"+
            "\n"+
            "     “Soon to the sport of death the crews repair:\n"+
            "     Rodmond unerring o'er his head suspends\n"+
            "     The barbed steel, and every turn attends.”\n"+
            "      —Falconer's Shipwreck.\n"+
            "\n"+
            "     “Bright shone the roofs, the domes, the spires,\n"+
            "     And rockets blew self driven,\n"+
            "     To hang their momentary fire\n"+
            "     Around the vault of heaven.\n"+
            "\n"+
            "     “So fire with water to compare,\n"+
            "     The ocean serves on high,\n"+
            "     Up-spouted by a whale in air,\n"+
            "     To express unwieldy joy.”\n"+
            "      —Cowper, on the Queen's Visit to London.\n"+
            "“Ten or fifteen gallons of blood are thrown out of the heart at a stroke, with immense velocity.” —John Hunter's account of the dissection of a whale. (A small sized one.)\n"+
            "\n"+
            "“The aorta of a whale is larger in the bore than the main pipe of the water-works at London Bridge, and the water roaring in its passage through that pipe is inferior in impetus and velocity to the blood gushing from the whale's heart.” —Paley's Theology.\n"+
            "\n"+
            "“The whale is a mammiferous animal without hind feet.” —Baron Cuvier.\n"+
            "\n"+
            "“In 40 degrees south, we saw Spermacetti Whales, but did not take any till the first of May, the sea being then covered with them.” —Colnett's Voyage for the Purpose of Extending the Spermaceti Whale Fishery.\n"+
            "\n"+
            "     “In the free element beneath me swam,\n"+
            "     Floundered and dived, in play, in chace, in battle,\n"+
            "     Fishes of every colour, form, and kind;\n"+
            "     Which language cannot paint, and mariner\n"+
            "     Had never seen; from dread Leviathan\n"+
            "     To insect millions peopling every wave:\n"+
            "     Gather'd in shoals immense, like floating islands,\n"+
            "     Led by mysterious instincts through that waste\n"+
            "     And trackless region, though on every side\n"+
            "     Assaulted by voracious enemies,\n"+
            "     Whales, sharks, and monsters, arm'd in front or jaw,\n"+
            "     With swords, saws, spiral horns, or hooked fangs.”\n"+
            "      —Montgomery's World before the Flood.\n"+
            "\n"+
            "     “Io!  Paean!  Io! sing.\n"+
            "     To the finny people's king.\n"+
            "     Not a mightier whale than this\n"+
            "     In the vast Atlantic is;\n"+
            "     Not a fatter fish than he,\n"+
            "     Flounders round the Polar Sea.”\n"+
            "      —Charles Lamb's Triumph of the Whale.\n"+
            "“In the year 1690 some persons were on a high hill observing the whales spouting and sporting with each other, when one observed: there—pointing to the sea—is a green pasture where our children's grand-children will go for bread.” —Obed Macy's History of Nantucket.\n"+
            "\n"+
            "“I built a cottage for Susan and myself and made a gateway in the form of a Gothic Arch, by setting up a whale's jaw bones.” —Hawthorne's Twice Told Tales.\n"+
            "\n"+
            "“She came to bespeak a monument for her first love, who had been killed by a whale in the Pacific ocean, no less than forty years ago.” —Ibid.\n"+
            "\n"+
            "“No, Sir, 'tis a Right Whale,” answered Tom; “I saw his spout; he threw up a pair of as pretty rainbows as a Christian would wish to look at. He's a raal oil-butt, that fellow!” —Cooper's Pilot.\n"+
            "\n"+
            "“The papers were brought in, and we saw in the Berlin Gazette that whales had been introduced on the stage there.” —Eckermann's Conversations with Goethe.\n"+
            "\n"+
            "“My God! Mr. Chace, what is the matter?” I answered, “we have been stove by a whale.” —“Narrative of the Shipwreck of the Whale Ship Essex of Nantucket, which was attacked and finally destroyed by a large Sperm Whale in the Pacific Ocean.” By Owen Chace of Nantucket, first mate of said vessel. New York, 1821.\n"+
            "\n"+
            "     “A mariner sat in the shrouds one night,\n"+
            "     The wind was piping free;\n"+
            "     Now bright, now dimmed, was the moonlight pale,\n"+
            "     And the phospher gleamed in the wake of the whale,\n"+
            "     As it floundered in the sea.”\n"+
            "      —Elizabeth Oakes Smith.\n"+
            "“The quantity of line withdrawn from the boats engaged in the capture of this one whale, amounted altogether to 10,440 yards or nearly six English miles....\n"+
            "\n"+
            "“Sometimes the whale shakes its tremendous tail in the air, which, cracking like a whip, resounds to the distance of three or four miles.” —Scoresby.\n"+
            "\n"+
            "“Mad with the agonies he endures from these fresh attacks, the infuriated Sperm Whale rolls over and over; he rears his enormous head, and with wide expanded jaws snaps at everything around him; he rushes at the boats with his head; they are propelled before him with vast swiftness, and sometimes utterly destroyed.... It is a matter of great astonishment that the consideration of the habits of so interesting, and, in a commercial point of view, so important an animal (as the Sperm Whale) should have been so entirely neglected, or should have excited so little curiosity among the numerous, and many of them competent observers, that of late years, must have possessed the most abundant and the most convenient opportunities of witnessing their habitudes.” —Thomas Beale's History of the Sperm Whale, 1839.\n"+
            "\n"+
            "“The Cachalot” (Sperm Whale) “is not only better armed than the True Whale” (Greenland or Right Whale) “in possessing a formidable weapon at either extremity of its body, but also more frequently displays a disposition to employ these weapons offensively and in manner at once so artful, bold, and mischievous, as to lead to its being regarded as the most dangerous to attack of all the known species of the whale tribe.” —Frederick Debell Bennett's Whaling Voyage Round the Globe, 1840.\n"+
            "\n"+
            "     October 13.  “There she blows,” was sung out from the mast-head.\n"+
            "     “Where away?” demanded the captain.\n"+
            "     “Three points off the lee bow, sir.”\n"+
            "      “Raise up your wheel.  Steady!”  “Steady, sir.”\n"+
            "      “Mast-head ahoy!  Do you see that whale now?”\n"+
            "      “Ay ay, sir!  A shoal of Sperm Whales!  There she blows!  There she\n"+
            "     breaches!”\n"+
            "      “Sing out! sing out every time!”\n"+
            "      “Ay Ay, sir!  There she blows! there—there—thar she\n"+
            "     blows—bowes—bo-o-os!”\n"+
            "      “How far off?”\n"+
            "      “Two miles and a half.”\n"+
            "      “Thunder and lightning! so near!  Call all hands!”\n"+
            "      —J. Ross Browne's Etchings of a Whaling Cruize.  1846.\n"+
            "“The Whale-ship Globe, on board of which vessel occurred the horrid transactions we are about to relate, belonged to the island of Nantucket.” —“Narrative of the Globe Mutiny,” by Lay and Hussey survivors. A.D. 1828.\n"+
            "\n"+
            "Being once pursued by a whale which he had wounded, he parried the assault for some time with a lance; but the furious monster at length rushed on the boat; himself and comrades only being preserved by leaping into the water when they saw the onset was inevitable.” —Missionary Journal of Tyerman and Bennett.\n"+
            "\n"+
            "“Nantucket itself,” said Mr. Webster, “is a very striking and peculiar portion of the National interest. There is a population of eight or nine thousand persons living here in the sea, adding largely every year to the National wealth by the boldest and most persevering industry.” —Report of Daniel Webster's Speech in the U. S. Senate, on the application for the Erection of a Breakwater at Nantucket. 1828.\n"+
            "\n"+
            "“The whale fell directly over him, and probably killed him in a moment.” —“The Whale and his Captors, or The Whaleman's Adventures and the Whale's Biography, gathered on the Homeward Cruise of the Commodore Preble.” By Rev. Henry T. Cheever.\n"+
            "\n"+
            "“If you make the least damn bit of noise,” replied Samuel, “I will send you to hell.” —Life of Samuel Comstock (the mutineer), by his brother, William Comstock. Another Version of the whale-ship Globe narrative.\n"+
            "\n"+
            "“The voyages of the Dutch and English to the Northern Ocean, in order, if possible, to discover a passage through it to India, though they failed of their main object, laid-open the haunts of the whale.” —McCulloch's Commercial Dictionary.\n"+
            "\n"+
            "“These things are reciprocal; the ball rebounds, only to bound forward again; for now in laying open the haunts of the whale, the whalemen seem to have indirectly hit upon new clews to that same mystic North-West Passage.” —From “Something” unpublished.\n"+
            "\n"+
            "“It is impossible to meet a whale-ship on the ocean without being struck by her near appearance. The vessel under short sail, with look-outs at the mast-heads, eagerly scanning the wide expanse around them, has a totally different air from those engaged in regular voyage.” —Currents and Whaling. U.S. Ex. Ex.\n"+
            "\n"+
            "“Pedestrians in the vicinity of London and elsewhere may recollect having seen large curved bones set upright in the earth, either to form arches over gateways, or entrances to alcoves, and they may perhaps have been told that these were the ribs of whales.” —Tales of a Whale Voyager to the Arctic Ocean.\n"+
            "\n"+
            "“It was not till the boats returned from the pursuit of these whales, that the whites saw their ship in bloody possession of the savages enrolled among the crew.” —Newspaper Account of the Taking and Retaking of the Whale-Ship Hobomack.\n"+
            "\n"+
            "“It is generally well known that out of the crews of Whaling vessels (American) few ever return in the ships on board of which they departed.” —Cruise in a Whale Boat.\n"+
            "\n"+
            "“Suddenly a mighty mass emerged from the water, and shot up perpendicularly into the air. It was the whale.” —Miriam Coffin or the Whale Fisherman.\n"+
            "\n"+
            "“The Whale is harpooned to be sure; but bethink you, how you would manage a powerful unbroken colt, with the mere appliance of a rope tied to the root of his tail.” —A Chapter on Whaling in Ribs and Trucks.\n"+
            "\n"+
            "“On one occasion I saw two of these monsters (whales) probably male and female, slowly swimming, one after the other, within less than a stone's throw of the shore” (Terra Del Fuego), “over which the beech tree extended its branches.” —Darwin's Voyage of a Naturalist.\n"+
            "\n"+
            "“'Stern all!' exclaimed the mate, as upon turning his head, he saw the distended jaws of a large Sperm Whale close to the head of the boat, threatening it with instant destruction;—'Stern all, for your lives!'” —Wharton the Whale Killer.\n"+
            "\n"+
            "“So be cheery, my lads, let your hearts never fail, While the bold harpooneer is striking the whale!” —Nantucket Song.\n"+
            "\n"+
            "     “Oh, the rare old Whale, mid storm and gale\n"+
            "     In his ocean home will be\n"+
            "     A giant in might, where might is right,\n"+
            "     And King of the boundless sea.”\n"+
            "      —Whale Song.\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "CHAPTER 1. Loomings.\n"+
            "Call me Ishmael. Some years ago—never mind how long precisely—having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world. It is a way I have of driving off the spleen and regulating the circulation. Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people's hats off—then, I account it high time to get to sea as soon as I can. This is my substitute for pistol and ball. With a philosophical flourish Cato throws himself upon his sword; I quietly take to the ship. There is nothing surprising in this. If they but knew it, almost all men in their degree, some time or other, cherish very nearly the same feelings towards the ocean with me.\n"+
            "\n"+
            "There now is your insular city of the Manhattoes, belted round by wharves as Indian isles by coral reefs—commerce surrounds it with her surf. Right and left, the streets take you waterward. Its extreme downtown is the battery, where that noble mole is washed by waves, and cooled by breezes, which a few hours previous were out of sight of land. Look at the crowds of water-gazers there.\n"+
            "\n"+
            "Circumambulate the city of a dreamy Sabbath afternoon. Go from Corlears Hook to Coenties Slip, and from thence, by Whitehall, northward. What do you see?—Posted like silent sentinels all around the town, stand thousands upon thousands of mortal men fixed in ocean reveries. Some leaning against the spiles; some seated upon the pier-heads; some looking over the bulwarks of ships from China; some high aloft in the rigging, as if striving to get a still better seaward peep. But these are all landsmen; of week days pent up in lath and plaster—tied to counters, nailed to benches, clinched to desks. How then is this? Are the green fields gone? What do they here?\n"+
            "\n"+
            "But look! here come more crowds, pacing straight for the water, and seemingly bound for a dive. Strange! Nothing will content them but the extremest limit of the land; loitering under the shady lee of yonder warehouses will not suffice. No. They must get just as nigh the water as they possibly can without falling in. And there they stand—miles of them—leagues. Inlanders all, they come from lanes and alleys, streets and avenues—north, east, south, and west. Yet here they all unite. Tell me, does the magnetic virtue of the needles of the compasses of all those ships attract them thither?\n"+
            "\n"+
            "Once more. Say you are in the country; in some high land of lakes. Take almost any path you please, and ten to one it carries you down in a dale, and leaves you there by a pool in the stream. There is magic in it. Let the most absent-minded of men be plunged in his deepest reveries—stand that man on his legs, set his feet a-going, and he will infallibly lead you to water, if water there be in all that region. Should you ever be athirst in the great American desert, try this experiment, if your caravan happen to be supplied with a metaphysical professor. Yes, as every one knows, meditation and water are wedded for ever.\n"+
            "\n"+
            "But here is an artist. He desires to paint you the dreamiest, shadiest, quietest, most enchanting bit of romantic landscape in all the valley of the Saco. What is the chief element he employs? There stand his trees, each with a hollow trunk, as if a hermit and a crucifix were within; and here sleeps his meadow, and there sleep his cattle; and up from yonder cottage goes a sleepy smoke. Deep into distant woodlands winds a mazy way, reaching to overlapping spurs of mountains bathed in their hill-side blue. But though the picture lies thus tranced, and though this pine-tree shakes down its sighs like leaves upon this shepherd's head, yet all were vain, unless the shepherd's eye were fixed upon the magic stream before him. Go visit the Prairies in June, when for scores on scores of miles you wade knee-deep among Tiger-lilies—what is the one charm wanting?—Water—there is not a drop of water there! Were Niagara but a cataract of sand, would you travel your thousand miles to see it? Why did the poor poet of Tennessee, upon suddenly receiving two handfuls of silver, deliberate whether to buy him a coat, which he sadly needed, or invest his money in a pedestrian trip to Rockaway Beach? Why is almost every robust healthy boy with a robust healthy soul in him, at some time or other crazy to go to sea? Why upon your first voyage as a passenger, did you yourself feel such a mystical vibration, when first told that you and your ship were now out of sight of land? Why did the old Persians hold the sea holy? Why did the Greeks give it a separate deity, and own brother of Jove? Surely all this is not without meaning. And still deeper the meaning of that story of Narcissus, who because he could not grasp the tormenting, mild image he saw in the fountain, plunged into it and was drowned. But that same image, we ourselves see in all rivers and oceans. It is the image of the ungraspable phantom of life; and this is the key to it all.\n"+
            "\n"+
            "Now, when I say that I am in the habit of going to sea whenever I begin to grow hazy about the eyes, and begin to be over conscious of my lungs, I do not mean to have it inferred that I ever go to sea as a passenger. For to go as a passenger you must needs have a purse, and a purse is but a rag unless you have something in it. Besides, passengers get sea-sick—grow quarrelsome—don't sleep of nights—do not enjoy themselves much, as a general thing;—no, I never go as a passenger; nor, though I am something of a salt, do I ever go to sea as a Commodore, or a Captain, or a Cook. I abandon the glory and distinction of such offices to those who like them. For my part, I abominate all honorable respectable toils, trials, and tribulations of every kind whatsoever. It is quite as much as I can do to take care of myself, without taking care of ships, barques, brigs, schooners, and what not. And as for going as cook,—though I confess there is considerable glory in that, a cook being a sort of officer on ship-board—yet, somehow, I never fancied broiling fowls;—though once broiled, judiciously buttered, and judgmatically salted and peppered, there is no one who will speak more respectfully, not to say reverentially, of a broiled fowl than I will. It is out of the idolatrous dotings of the old Egyptians upon broiled ibis and roasted river horse, that you see the mummies of those creatures in their huge bake-houses the pyramids.\n"+
            "\n"+
            "No, when I go to sea, I go as a simple sailor, right before the mast, plumb down into the forecastle, aloft there to the royal mast-head. True, they rather order me about some, and make me jump from spar to spar, like a grasshopper in a May meadow. And at first, this sort of thing is unpleasant enough. It touches one's sense of honor, particularly if you come of an old established family in the land, the Van Rensselaers, or Randolphs, or Hardicanutes. And more than all, if just previous to putting your hand into the tar-pot, you have been lording it as a country schoolmaster, making the tallest boys stand in awe of you. The transition is a keen one, I assure you, from a schoolmaster to a sailor, and requires a strong decoction of Seneca and the Stoics to enable you to grin and bear it. But even this wears off in time.\n"+
            "\n"+
            "What of it, if some old hunks of a sea-captain orders me to get a broom and sweep down the decks? What does that indignity amount to, weighed, I mean, in the scales of the New Testament? Do you think the archangel Gabriel thinks anything the less of me, because I promptly and respectfully obey that old hunks in that particular instance? Who ain't a slave? Tell me that. Well, then, however the old sea-captains may order me about—however they may thump and punch me about, I have the satisfaction of knowing that it is all right; that everybody else is one way or other served in much the same way—either in a physical or metaphysical point of view, that is; and so the universal thump is passed round, and all hands should rub each other's shoulder-blades, and be content.\n"+
            "\n"+
            "Again, I always go to sea as a sailor, because they make a point of paying me for my trouble, whereas they never pay passengers a single penny that I ever heard of. On the contrary, passengers themselves must pay. And there is all the difference in the world between paying and being paid. The act of paying is perhaps the most uncomfortable infliction that the two orchard thieves entailed upon us. But being paid,—what will compare with it? The urbane activity with which a man receives money is really marvellous, considering that we so earnestly believe money to be the root of all earthly ills, and that on no account can a monied man enter heaven. Ah! how cheerfully we consign ourselves to perdition!\n"+
            "\n"+
            "Finally, I always go to sea as a sailor, because of the wholesome exercise and pure air of the fore-castle deck. For as in this world, head winds are far more prevalent than winds from astern (that is, if you never violate the Pythagorean maxim), so for the most part the Commodore on the quarter-deck gets his atmosphere at second hand from the sailors on the forecastle. He thinks he breathes it first; but not so. In much the same way do the commonalty lead their leaders in many other things, at the same time that the leaders little suspect it. But wherefore it was that after having repeatedly smelt the sea as a merchant sailor, I should now take it into my head to go on a whaling voyage; this the invisible police officer of the Fates, who has the constant surveillance of me, and secretly dogs me, and influences me in some unaccountable way—he can better answer than any one else. And, doubtless, my going on this whaling voyage, formed part of the grand programme of Providence that was drawn up a long time ago. It came in as a sort of brief interlude and solo between more extensive performances. I take it that this part of the bill must have run something like this:\n"+
            "\n"+
            "“Grand Contested Election for the Presidency of the United States. “WHALING VOYAGE BY ONE ISHMAEL. “BLOODY BATTLE IN AFFGHANISTAN.”\n"+
            "\n"+
            "Though I cannot tell why it was exactly that those stage managers, the Fates, put me down for this shabby part of a whaling voyage, when others were set down for magnificent parts in high tragedies, and short and easy parts in genteel comedies, and jolly parts in farces—though I cannot tell why this was exactly; yet, now that I recall all the circumstances, I think I can see a little into the springs and motives which being cunningly presented to me under various disguises, induced me to set about performing the part I did, besides cajoling me into the delusion that it was a choice resulting from my own unbiased freewill and discriminating judgment.\n"+
            "\n"+
            "Chief among these motives was the overwhelming idea of the great whale himself. Such a portentous and mysterious monster roused all my curiosity. Then the wild and distant seas where he rolled his island bulk; the undeliverable, nameless perils of the whale; these, with all the attending marvels of a thousand Patagonian sights and sounds, helped to sway me to my wish. With other men, perhaps, such things would not have been inducements; but as for me, I am tormented with an everlasting itch for things remote. I love to sail forbidden seas, and land on barbarous coasts. Not ignoring what is good, I am quick to perceive a horror, and could still be social with it—would they let me—since it is but well to be on friendly terms with all the inmates of the place one lodges in.\n"+
            "\n"+
            "By reason of these things, then, the whaling voyage was welcome; the great flood-gates of the wonder-world swung open, and in the wild conceits that swayed me to my purpose, two and two there floated into my inmost soul, endless processions of the whale, and, mid most of them all, one grand hooded phantom, like a snow hill in the air.\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "CHAPTER 2. The Carpet-Bag.\n"+
            "I stuffed a shirt or two into my old carpet-bag, tucked it under my arm, and started for Cape Horn and the Pacific. Quitting the good city of old Manhatto, I duly arrived in New Bedford. It was a Saturday night in December. Much was I disappointed upon learning that the little packet for Nantucket had already sailed, and that no way of reaching that place would offer, till the following Monday.\n"+
            "\n"+
            "As most young candidates for the pains and penalties of whaling stop at this same New Bedford, thence to embark on their voyage, it may as well be related that I, for one, had no idea of so doing. For my mind was made up to sail in no other than a Nantucket craft, because there was a fine, boisterous something about everything connected with that famous old island, which amazingly pleased me. Besides though New Bedford has of late been gradually monopolising the business of whaling, and though in this matter poor old Nantucket is now much behind her, yet Nantucket was her great original—the Tyre of this Carthage;—the place where the first dead American whale was stranded. Where else but from Nantucket did those aboriginal whalemen, the Red-Men, first sally out in canoes to give chase to the Leviathan? And where but from Nantucket, too, did that first adventurous little sloop put forth, partly laden with imported cobblestones—so goes the story—to throw at the whales, in order to discover when they were nigh enough to risk a harpoon from the bowsprit?\n"+
            "\n"+
            "Now having a night, a day, and still another night following before me in New Bedford, ere I could embark for my destined port, it became a matter of concernment where I was to eat and sleep meanwhile. It was a very dubious-looking, nay, a very dark and dismal night, bitingly cold and cheerless. I knew no one in the place. With anxious grapnels I had sounded my pocket, and only brought up a few pieces of silver,—So, wherever you go, Ishmael, said I to myself, as I stood in the middle of a dreary street shouldering my bag, and comparing the gloom towards the north with the darkness towards the south—wherever in your wisdom you may conclude to lodge for the night, my dear Ishmael, be sure to inquire the price, and don't be too particular.\n"+
            "\n"+
            "With halting steps I paced the streets, and passed the sign of “The Crossed Harpoons”—but it looked too expensive and jolly there. Further on, from the bright red windows of the “Sword-Fish Inn,” there came such fervent rays, that it seemed to have melted the packed snow and ice from before the house, for everywhere else the congealed frost lay ten inches thick in a hard, asphaltic pavement,—rather weary for me, when I struck my foot against the flinty projections, because from hard, remorseless service the soles of my boots were in a most miserable plight. Too expensive and jolly, again thought I, pausing one moment to watch the broad glare in the street, and hear the sounds of the tinkling glasses within. But go on, Ishmael, said I at last; don't you hear? get away from before the door; your patched boots are stopping the way. So on I went. I now by instinct followed the streets that took me waterward, for there, doubtless, were the cheapest, if not the cheeriest inns.\n"+
            "\n"+
            "Such dreary streets! blocks of blackness, not houses, on either hand, and here and there a candle, like a candle moving about in a tomb. At this hour of the night, of the last day of the week, that quarter of the town proved all but deserted. But presently I came to a smoky light proceeding from a low, wide building, the door of which stood invitingly open. It had a careless look, as if it were meant for the uses of the public; so, entering, the first thing I did was to stumble over an ash-box in the porch. Ha! thought I, ha, as the flying particles almost choked me, are these ashes from that destroyed city, Gomorrah? But “The Crossed Harpoons,” and “The Sword-Fish?”—this, then must needs be the sign of “The Trap.” However, I picked myself up and hearing a loud voice within, pushed on and opened a second, interior door.\n"+
            "\n"+
            "It seemed the great Black Parliament sitting in Tophet. A hundred black faces turned round in their rows to peer; and beyond, a black Angel of Doom was beating a book in a pulpit. It was a negro church; and the preacher's text was about the blackness of darkness, and the weeping and wailing and teeth-gnashing there. Ha, Ishmael, muttered I, backing out, Wretched entertainment at the sign of 'The Trap!'\n"+
            "\n"+
            "Moving on, I at last came to a dim sort of light not far from the docks, and heard a forlorn creaking in the air; and looking up, saw a swinging sign over the door with a white painting upon it, faintly representing a tall straight jet of misty spray, and these words underneath—“The Spouter Inn:—Peter Coffin.”\n"+
            "\n"+
            "Coffin?—Spouter?—Rather ominous in that particular connexion, thought I. But it is a common name in Nantucket, they say, and I suppose this Peter here is an emigrant from there. As the light looked so dim, and the place, for the time, looked quiet enough, and the dilapidated little wooden house itself looked as if it might have been carted here from the ruins of some burnt district, and as the swinging sign had a poverty-stricken sort of creak to it, I thought that here was the very spot for cheap lodgings, and the best of pea coffee.\n"+
            "\n"+
            "It was a queer sort of place—a gable-ended old house, one side palsied as it were, and leaning over sadly. It stood on a sharp bleak corner, where that tempestuous wind Euroclydon kept up a worse howling than ever it did about poor Paul's tossed craft. Euroclydon, nevertheless, is a mighty pleasant zephyr to any one in-doors, with his feet on the hob quietly toasting for bed. “In judging of that tempestuous wind called Euroclydon,” says an old writer—of whose works I possess the only copy extant—“it maketh a marvellous difference, whether thou lookest out at it from a glass window where the frost is all on the outside, or whether thou observest it from that sashless window, where the frost is on both sides, and of which the wight Death is the only glazier.” True enough, thought I, as this passage occurred to my mind—old black-letter, thou reasonest well. Yes, these eyes are windows, and this body of mine is the house. What a pity they didn't stop up the chinks and the crannies though, and thrust in a little lint here and there. But it's too late to make any improvements now. The universe is finished; the copestone is on, and the chips were carted off a million years ago. Poor Lazarus there, chattering his teeth against the curbstone for his pillow, and shaking off his tatters with his shiverings, he might plug up both ears with rags, and put a corn-cob into his mouth, and yet that would not keep out the tempestuous Euroclydon. Euroclydon! says old Dives, in his red silken wrapper—(he had a redder one afterwards) pooh, pooh! What a fine frosty night; how Orion glitters; what northern lights! Let them talk of their oriental summer climes of everlasting conservatories; give me the privilege of making my own summer with my own coals.\n"+
            "\n"+
            "But what thinks Lazarus? Can he warm his blue hands by holding them up to the grand northern lights? Would not Lazarus rather be in Sumatra than here? Would he not far rather lay him down lengthwise along the line of the equator; yea, ye gods! go down to the fiery pit itself, in order to keep out this frost?\n"+
            "\n"+
            "Now, that Lazarus should lie stranded there on the curbstone before the door of Dives, this is more wonderful than that an iceberg should be moored to one of the Moluccas. Yet Dives himself, he too lives like a Czar in an ice palace made of frozen sighs, and being a president of a temperance society, he only drinks the tepid tears of orphans.\n"+
            "\n"+
            "But no more of this blubbering now, we are going a-whaling, and there is plenty of that yet to come. Let us scrape the ice from our frosted feet, and see what sort of a place this “Spouter” may be.\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "\n"+
            "CHAPTER 3. The Spouter-Inn.\n"+
            "Entering that gable-ended Spouter-Inn, you found yourself in a wide, low, straggling entry with old-fashioned wainscots, reminding one of the bulwarks of some condemned old craft. On one side hung a very large oil-painting so thoroughly besmoked, and every way defaced, that in the unequal cross-lights by which you viewed it, it was only by diligent study and a series of systematic visits to it, and careful inquiry of the neighbors, that you could any way arrive at an understanding of its purpose. Such unaccountable masses of shades and shadows, that at first you almost thought some ambitious young artist, in the time of the New England hags, had endeavored to delineate chaos bewitched. But by dint of much and earnest contemplation, and oft repeated ponderings, and especially by throwing open the little window towards the back of the entry, you at last come to the conclusion that such an idea, however wild, might not be altogether unwarranted.\n"+
            "\n"+
            "But what most puzzled and confounded you was a long, limber, portentous, black mass of something hovering in the centre of the picture over three blue, dim, perpendicular lines floating in a nameless yeast. A boggy, soggy, squitchy picture truly, enough to drive a nervous man distracted. Yet was there a sort of indefinite, half-attained, unimaginable sublimity about it that fairly froze you to it, till you involuntarily took an oath with yourself to find out what that marvellous painting meant. Ever and anon a bright, but, alas, deceptive idea would dart you through.—It's the Black Sea in a midnight gale.—It's the unnatural combat of the four primal elements.—It's a blasted heath.—It's a Hyperborean winter scene.—It's the breaking-up of the icebound stream of Time. But at last all these fancies yielded to that one portentous something in the picture's midst. That once found out, and all the rest were plain. But stop; does it not bear a faint resemblance to a gigantic fish? even the great leviathan himself?\n"+
            "\n"+
            "In fact, the artist's design seemed this: a final theory of my own, partly based upon the aggregated opinions of many aged persons with whom I conversed upon the subject. The picture represents a Cape-Horner in a great hurricane; the half-foundered ship weltering there with its three dismantled masts alone visible; and an exasperated whale, purposing to spring clean over the craft, is in the enormous act of impaling himself upon the three mast-heads.\n"+
            "\n"+
            "The opposite wall of this entry was hung all over with a heathenish array of monstrous clubs and spears. Some were thickly set with glittering teeth resembling ivory saws; others were tufted with knots of human hair; and one was sickle-shaped, with a vast handle sweeping round like the segment made in the new-mown grass by a long-armed mower. You shuddered as you gazed, and wondered what monstrous cannibal and savage could ever have gone a death-harvesting with such a hacking, horrifying implement. Mixed with these were rusty old whaling lances and harpoons all broken and deformed. Some were storied weapons. With this once long lance, now wildly elbowed, fifty years ago did Nathan Swain kill fifteen whales between a sunrise and a sunset. And that harpoon—so like a corkscrew now—was flung in Javan seas, and run away with by a whale, years afterwards slain off the Cape of Blanco. The original iron entered nigh the tail, and, like a restless needle sojourning in the body of a man, travelled full forty feet, and at last was found imbedded in the hump.\n"+
            "\n"+
            "Crossing this dusky entry, and on through yon low-arched way—cut through what in old times must have been a great central chimney with fireplaces all round—you enter the public room. A still duskier place is this, with such low ponderous beams above, and such old wrinkled planks beneath, that you would almost fancy you trod some old craft's cockpits, especially of such a howling night, when this corner-anchored old ark rocked so furiously. On one side stood a long, low, shelf-like table covered with cracked glass cases, filled with dusty rarities gathered from this wide world's remotest nooks. Projecting from the further angle of the room stands a dark-looking den—the bar—a rude attempt at a right whale's head. Be that how it may, there stands the vast arched bone of the whale's jaw, so wide, a coach might almost drive beneath it. Within are shabby shelves, ranged round with old decanters, bottles, flasks; and in those jaws of swift destruction, like another cursed Jonah (by which name indeed they called him), bustles a little withered old man, who, for their money, dearly sells the sailors deliriums and death.\n"+
            "\n"+
            "Abominable are the tumblers into which he pours his poison. Though true cylinders without—within, the villanous green goggling glasses deceitfully tapered downwards to a cheating bottom. Parallel meridians rudely pecked into the glass, surround these footpads' goblets. Fill to this mark, and your charge is but a penny; to this a penny more; and so on to the full glass—the Cape Horn measure, which you may gulp down for a shilling.\n"+
            "\n"+
            "Upon entering the place I found a number of young seamen gathered about a table, examining by a dim light divers specimens of skrimshander. I sought the landlord, and telling him I desired to be accommodated with a room, received for answer that his house was full—not a bed unoccupied. “But avast,” he added, tapping his forehead, “you haint no objections to sharing a harpooneer's blanket, have ye? I s'pose you are goin' a-whalin', so you'd better get used to that sort of thing.”\n"+
            "\n"+
            "I told him that I never liked to sleep two in a bed; that if I should ever do so, it would depend upon who the harpooneer might be, and that if he (the landlord) really had no other place for me, and the harpooneer was not decidedly objectionable, why rather than wander further about a strange town on so bitter a night, I would put up with the half of any decent man's blanket.\n"+
            "\n"+
            "“I thought so. All right; take a seat. Supper?—you want supper? Supper'll be ready directly.”\n"+
            "\n"+
            "I sat down on an old wooden settle, carved all over like a bench on the Battery. At one end a ruminating tar was still further adorning it with his jack-knife, stooping over and diligently working away at the space between his legs. He was trying his hand at a ship under full sail, but he didn't make much headway, I thought.\n"+
            "\n"+
            "At last some four or five of us were summoned to our meal in an adjoining room. It was cold as Iceland—no fire at all—the landlord said he couldn't afford it. Nothing but two dismal tallow candles, each in a winding sheet. We were fain to button up our monkey jackets, and hold to our lips cups of scalding tea with our half frozen fingers. But the fare was of the most substantial kind—not only meat and potatoes, but dumplings; good heavens! dumplings for supper! One young fellow in a green box coat, addressed himself to these dumplings in a most direful manner.\n"+
            "\n"+
            "“My boy,” said the landlord, “you'll have the nightmare to a dead sartainty.”\n"+
            "\n"+
            "“Landlord,” I whispered, “that aint the harpooneer is it?”\n"+
            "\n"+
            "“Oh, no,” said he, looking a sort of diabolically funny, “the harpooneer is a dark complexioned chap. He never eats dumplings, he don't—he eats nothing but steaks, and he likes 'em rare.”\n"+
            "\n"+
            "“The devil he does,” says I. “Where is that harpooneer? Is he here?”\n"+
            "\n"+
            "“He'll be here afore long,” was the answer.\n"+
            "\n"+
            "I could not help it, but I began to feel suspicious of this “dark complexioned” harpooneer. At any rate, I made up my mind that if it so turned out that we should sleep together, he must undress and get into bed before I did.\n"+
            "\n"+
            "Supper over, the company went back to the bar-room, when, knowing not what else to do with myself, I resolved to spend the rest of the evening as a looker on.\n"+
            "\n"+
            "Presently a rioting noise was heard without. Starting up, the landlord cried, “That's the Grampus's crew. I seed her reported in the offing this morning; a three years' voyage, and a full ship. Hurrah, boys; now we'll have the latest news from the Feegees.”\n"+
            "\n"+
            "A tramping of sea boots was heard in the entry; the door was flung open, and in rolled a wild set of mariners enough. Enveloped in their shaggy watch coats, and with their heads muffled in woollen comforters, all bedarned and ragged, and their beards stiff with icicles, they seemed an eruption of bears from Labrador. They had just landed from their boat, and this was the first house they entered. No wonder, then, that they made a straight wake for the whale's mouth—the bar—when the wrinkled little old Jonah, there officiating, soon poured them out brimmers all round. One complained of a bad cold in his head, upon which Jonah mixed him a pitch-like potion of gin and molasses, which he swore was a sovereign cure for all colds and catarrhs whatsoever, never mind of how long standing, or whether caught off the coast of Labrador, or on the weather side of an ice-island.\n"+
            "\n"+
            "The liquor soon mounted into their heads, as it generally does even with the arrantest topers newly landed from sea, and they began capering about most obstreperously.\n"+
            "\n"+
            "I observed, however, that one of them held somewhat aloof, and though he seemed desirous not to spoil the hilarity of his shipmates by his own sober face, yet upon the whole he refrained from making as much noise as the rest. This man interested me at once; and since the sea-gods had ordained that he should soon become my shipmate (though but a sleeping-partner one, so far as this narrative is concerned), I will here venture upon a little description of him. He stood full six feet in height, with noble shoulders, and a chest like a coffer-dam. I have seldom seen such brawn in a man. His face was deeply brown and burnt, making his white teeth dazzling by the contrast; while in the deep shadows of his eyes floated some reminiscences that did not seem to give him much joy. His voice at once announced that he was a Southerner, and from his fine stature, I thought he must be one of those tall mountaineers from the Alleghanian Ridge in Virginia. When the revelry of his companions had mounted to its height, this man slipped away unobserved, and I saw no more of him till he became my comrade on the sea. In a few minutes, however, he was missed by his shipmates, and being, it seems, for some reason a huge favourite with them, they raised a cry of “Bulkington! Bulkington! where's Bulkington?” and darted out of the house in pursuit of him.\n"+
            "\n"+
            "It was now about nine o'clock, and the room seeming almost supernaturally quiet after these orgies, I began to congratulate myself upon a little plan that had occurred to me just previous to the entrance of the seamen.\n"+
            "\n"+
            "No man prefers to sleep two in a bed. In fact, you would a good deal rather not sleep with your own brother. I don't know how it is, but people like to be private when they are sleeping. And when it comes to sleeping with an unknown stranger, in a strange inn, in a strange town, and that stranger a harpooneer, then your objections indefinitely multiply. Nor was there any earthly reason why I as a sailor should sleep two in a bed, more than anybody else; for sailors no more sleep two in a bed at sea, than bachelor Kings do ashore. To be sure they all sleep together in one apartment, but you have your own hammock, and cover yourself with your own blanket, and sleep in your own skin.\n"+
            "\n"+
            "The more I pondered over this harpooneer, the more I abominated the thought of sleeping with him. It was fair to presume that being a harpooneer, his linen or woollen, as the case might be, would not be of the tidiest, certainly none of the finest. I began to twitch all over. Besides, it was getting late, and my decent harpooneer ought to be home and going bedwards. Suppose now, he should tumble in upon me at midnight—how could I tell from what vile hole he had been coming?\n"+
            "\n"+
            "“Landlord! I've changed my mind about that harpooneer.—I shan't sleep with him. I'll try the bench here.”\n"+
            "\n"+
            "“Just as you please; I'm sorry I can't spare ye a tablecloth for a mattress, and it's a plaguy rough board here”—feeling of the knots and notches. “But wait a bit, Skrimshander; I've got a carpenter's plane there in the bar—wait, I say, and I'll make ye snug enough.” So saying he procured the plane; and with his old silk handkerchief first dusting the bench, vigorously set to planing away at my bed, the while grinning like an ape. The shavings flew right and left; till at last the plane-iron came bump against an indestructible knot. The landlord was near spraining his wrist, and I told him for heaven's sake to quit—the bed was soft enough to suit me, and I did not know how all the planing in the world could make eider down of a pine plank. So gathering up the shavings with another grin, and throwing them into the great stove in the middle of the room, he went about his business, and left me in a brown study.\n"+
            "\n"+
            "I now took the measure of the bench, and found that it was a foot too short; but that could be mended with a chair. But it was a foot too narrow, and the other bench in the room was about four inches higher than the planed one—so there was no yoking them. I then placed the first bench lengthwise along the only clear space against the wall, leaving a little interval between, for my back to settle down in. But I soon found that there came such a draught of cold air over me from under the sill of the window, that this plan would never do at all, especially as another current from the rickety door met the one from the window, and both together formed a series of small whirlwinds in the immediate vicinity of the spot where I had thought to spend the night.\n"+
            "\n"+
            "The devil fetch that harpooneer, thought I, but stop, couldn't I steal a march on him—bolt his door inside, and jump into his bed, not to be wakened by the most violent knockings? It seemed no bad idea; but upon second thoughts I dismissed it. For who could tell but what the next morning, so soon as I popped out of the room, the harpooneer might be standing in the entry, all ready to knock me down!\n"+
            "\n"+
            "Still, looking round me again, and seeing no possible chance of spending a sufferable night unless in some other person's bed, I began to think that after all I might be cherishing unwarrantable prejudices against this unknown harpooneer. Thinks I, I'll wait awhile; he must be dropping in before long. I'll have a good look at him then, and perhaps we may become jolly good bedfellows after all—there's no telling.\n"+
            "\n"+
            "But though the other boarders kept coming in by ones, twos, and threes, and going to bed, yet no sign of my harpooneer.\n"+
            "\n"+
            "“Landlord!” said I, “what sort of a chap is he—does he always keep such late hours?” It was now hard upon twelve o'clock.\n"+
            "\n"+
            "The landlord chuckled again with his lean chuckle, and seemed to be mightily tickled at something beyond my comprehension. “No,” he answered, “generally he's an early bird—airley to bed and airley to rise—yes, he's the bird what catches the worm. But to-night he went out a peddling, you see, and I don't see what on airth keeps him so late, unless, may be, he can't sell his head.”\n"+
            "\n"+
            "“Can't sell his head?—What sort of a bamboozingly story is this you are telling me?” getting into a towering rage. “Do you pretend to say, landlord, that this harpooneer is actually engaged this blessed Saturday night, or rather Sunday morning, in peddling his head around this town?”\n"+
            "\n"+
            "“That's precisely it,” said the landlord, “and I told him he couldn't sell it here, the market's overstocked.”\n"+
            "\n"+
            "“With what?” shouted I.\n"+
            "\n"+
            "“With heads to be sure; ain't there too many heads in the world?”\n"+
            "\n"+
            "“I tell you what it is, landlord,” said I quite calmly, “you'd better stop spinning that yarn to me—I'm not green.”\n"+
            "\n"+
            "“May be not,” taking out a stick and whittling a toothpick, “but I rayther guess you'll be done brown if that ere harpooneer hears you a slanderin' his head.”\n"+
            "\n"+
            "“I'll break it for him,” said I, now flying into a passion again at this unaccountable farrago of the landlord's.\n"+
            "\n"+
            "“It's broke a'ready,” said he.\n"+
            "\n"+
            "“Broke,” said I—“broke, do you mean?”\n"+
            "\n"+
            "“Sartain, and that's the very reason he can't sell it, I guess.”\n"+
            "\n"+
            "“Landlord,” sai";

    public static HashMap<String, Integer> findShortestPathsToOtherPlacesYeah_WOW(Graph g, String wya){

    }
}

