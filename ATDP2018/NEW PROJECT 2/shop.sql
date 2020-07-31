
CREATE TABLE IF NOT EXISTS `shop` (
 `id` int NOT NULL AUTO_INCREMENT,
 `name` text,
 `type` text,
 `cost` float,
 `description` text,
 `stock` int,
 `url` text,
 PRIMARY KEY (`id`)
);
INSERT INTO `shop`
    (`name`, `type`, `cost`, `description`, `stock`, `url`)
VALUES
    ('Fingerling Potatoes','Food','4.95','These delicious foodstuffs will be sure to satisfy your hunger, comrade.','42','https://farmpickedforyou.com/wp-content/uploads/2017/06/Yukon_Gold_Potatoes_Farm_picked_for_you.png'),

    ('Blue Shirt','Clothing','2.49','This festive blue shirt is a fit for every zesty occasion.','203','https://advertsignment.co.uk/wp-content/uploads/2016/08/T-shirt.Front-Royal-Blue.png'),

    ('Camp Stove','Luxury','29.99','Perfect for both outdoor outings and everyday use, this luxury device will cook food and heat your cold, dead heart.','17','http://cdn.dealplanet.com/product_images/000/034/033/images/main.png?1449523780'),

    ('Sports Cap','Clothing','7.99','How to be the center of attention? All the time? Where this.','89','https://itsonatee.com/wp-content/uploads/maga-hat-1.png'),

    ('Shoelaces','Material','0.55','Buy this in bulk! we have way too much.','20000','https://shoepanda.com/images/zoom/strong-round_red.jpg'),

    ('Bike Helmet','Luxury','60.95','A luxury item, a symbol of aristocratic class and cranial safety.','45','https://cdn.shopify.com/s/files/1/1032/8857/products/2013-protec-classic-4_4_1_1200x.png?v=1503103028'),

    ('WiFi Router','Electronics','30.99','It will not work, but hey, you can say it does.','6','https://smedia.webcollage.net/rwvfp/wc/cp/27013947_legacycode/module/netgear//_cp/products/1515194544401/tab-a67d8670-b652-4c8c-8e60-586d7b9fac90/83959023-83d2-4803-bb89-69a48873144d.png.w960.png'),

    ('Soccer Jersey','Clothing','4.49','Silky and sleek, like a freshly freshed chicken.','32','http://www.imagehandler.net/?iset=0108&img=A85121000&fmt=png&w=300&h=300&iindex=0007&c=999&cmp=85'),

    ('Chicken','Food','7.99','Silky and sleek, like a freshly worn soccer jersey.','32','http://kindersay.com/files/images/chicken.png'),

    ('Sunglasses','Clothing','5.49','Only festive/viable on 4/20.','49','https://d3o2e4jr3mxnm3.cloudfront.net/Andes-Wayfarer-Sunglasses_LGANDES00BLCK_1_lg.png'),

    ('Evans Hall','Pet Supplies','9359999.99','UC Berkeley told us we cannot sell their property, but hey, when did that stop us?','1','https://www.ocf.berkeley.edu/~atwu/firstcultural/evanshall/evans_before.jpg'),

    ('Peanut Butter','Food','13.99','Delicious on its own, or with a helpful pile of steamed fingerling potatoes','29','https://d3cizcpymoenau.cloudfront.net/images/40191/SIL_CreamyPeanutButter_Skippy_Creamy_Peanut_Butter.png'),

    ('Sandpaper','Material','1.25','Hard and abrasive on the outside, but has a sensitive personality.','169','https://png.kisspng.com/20180407/dow/kisspng-sandpaper-wood-diy-store-glass-madeira-5ac8944689d545.0897880915230945985646.png'),

    ('Leather Armchair','Utility','110.49','Trash. trash! why would you buy this?! Peasant.','13','https://www.decorist.com/static/finds/product_images/full_size/123295-img2c.b0fb9e17c85332e9422848fa3226fd32.png'),

    ('Plastic Stool','Luxury','500.99','The snootiest of the snoot, this high class item is always low on stock.','1','https://www.jiachaoplastic.com/wp-content/uploads/2017/07/JC-2010.png'),

    ('Fax Machine','Electronics','45.95','Master of none! jack of all trades! thats what people would have called you if you did not buy this stupid item from 1997.','15','http://www.comculus.com/image/cache/Office%20Equipment/Fax/fax2840_left-800x800.png'),

    ('Used Wii U','Electronics','13.49','The worst game platform, but the best-selling.','12','https://www.nintendo.com/images/social/fb-wiiu-400x400.jpg'),

    ('Wool','Material','0.01','Many sheep. Shear, shear cheap.','1000131','https://www.cushionwarehouse.co.uk/wp-content/uploads/2013/10/wool-filling-2.jpg'),

    ('Anime Body Pillow','Pet Supplies','15.49','For those lonely people out there. We do not judge.','9','https://t5.rbxcdn.com/f74967b308eadb91b184eec5af215e45'),

    ('Neck Pillow','Luxury','9.95','Want to ride planes in style? then this is not for you.','64','https://www.conair.com/assets/images/database/products/preview/TS47NR-Travel-Smart-by-Conair-2-in-1-Travel-Pillow-Main.png'),

    ('Tooth Doll','Pet Supplies','34.49','Made from real human teeth... and souls.','7','https://mediaassets.khits.com/photo/2017/12/06/tooth%20doll%203_1512567469972_73713278_ver1.0_640_480.JPG'),

    ('Hoodie','Clothing','10.99','Standard Hoodie. Normal rates apply, 2 year warranty.','38','https://cdn.shopify.com/s/files/1/0128/9452/products/TSM-Red-Line-Grey-Black_1024x1024.png?v=1524684645'),

    ('Notebook','Utility','9.95','Did you know our notebooks were the model for the popular anime Death Note? yeah, neither did we.','150','https://cdn.shopify.com/s/files/1/0889/0550/products/N_professional_notebook_mini_01.png?v=1456305312'),

    ('Adam Sandler','Pet Supplies','0.34','Did you ever want a cheap, expendable actor that is also easily recognizable? here ya go.','1','https://78.media.tumblr.com/083eda51be7370fc7b8a6496c757340e/tumblr_ncb2gf9Rie1rgcqrbo1_r2_250.png'),

    ('The Entire State of North Dakota','Luxury','509.99','Yeah, we thought it would be cheaper too.','1','http://cdn2.hubspot.net/hub/424758/file-2617175332-png/Learners_Edge/State_Icons/ND-Icon.png'),

    ('Porta-Potty','Utility','29.49','For large parties and home use alike.','21','http://www.rentalsite.com/images/ada-handicap-portable-toilet.png'),

    ('Alerxa Smart Speaker','Electronics','79.99','This is so sad, Alerxa, play Despacito.','15','https://www.wink.com/img/product/amazon-alexa/variants/848719049763/hero_01.png'),

    ('Fanny Pack','Utility','9.49','To out-soccer mom the rival soccer moms, one must wield the tool of power.','2','https://cdn.shopify.com/s/files/1/1171/8456/products/jazz_fanny_1024x1024.png?v=1523486796'),

    ('Toothpaste','Utility','4.95','Goes well with dental plaque.','7','https://cdn.shopify.com/s/files/1/1550/9113/products/CLEAN-MINTclean-teeth-400_48a848f0-92e9-4a88-b93d-c9bb9707bcbb.png?v=1479482944'),

    ('Dental Plaque','Pet Supplies','0.01','A horrible decision, really. Do not buy this.','100000','https://i.kym-cdn.com/photos/images/original/001/328/602/3f2.png'),

    ('Peter Parker','Luxury','1.29','I-I don&quot;t feel so good Mr. Stark...','591','https://i.redditmedia.com/7fabU-SRuBjCwu4RCDtc9NDDf-6xnnjdnc-2jXbwDBU.png?w=256&s=401fdd824c621724a7e9274989ec6e83'),

    ('Bacon','Food','5.99','The best part of the pig.','51','https://toppng.com/public/uploads/preview/bacon-11528343557ucr9ympald.png'),

    ('Love and Affection','Pet Supplies','74.99','Here UwU. :) XD you deserve it UwU.','0','http://cdn.shopify.com/s/files/1/1061/1924/products/Revolving_Pink_Hearts_Emoji_grande.png?v=1480481033');

CREATE TABLE IF NOT EXISTS `users` (
   `id` int NOT NULL AUTO_INCREMENT,
   `username` text,
   `password_hash` text,
   `email` text,
   PRIMARY KEY(`id`)
);
INSERT INTO `users`
    (`username`)
VALUES
    ('adminBackdoor');
CREATE TABLE IF NOT EXISTS `cart` (
   `id` int NOT NULL AUTO_INCREMENT,
   `shop_id` int,
   `user_id` int,
   PRIMARY KEY(`id`)
);
