package com.bangkit.myacne.data

data class SkincareProduct(
    val type: String,
    val level: Int,
    val name: String,
    val mainIngredient: String,
    val description: String,
    val price: Int
)

val skincareProducts = listOf(
//    level 1 lurrr
    SkincareProduct(
        type = "Face Wash",
        level = 1,
        name = "Jarte- Cica Care Gentle Wash",
        mainIngredient = "Centella Asiatica Extract, Tea Tree Oil",
        description = "Alcohol-Free",
        price = 90000
    ),
    SkincareProduct(
        type = "Face Wash",
        level = 1,
        name = "Somthinc-Low pH Gentle Jelly Cleanser",
        mainIngredient = "Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 99000
    ),
    SkincareProduct(
        type = "Toner",
        level = 1,
        name = "Madame Gie- Madame Clarify Face Toner Pimple Fight Tea Tree",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Sulfate-Free, Alcohol-Free, Silicone-Free",
        price = 26000
    ),
    SkincareProduct(
        type = "Toner",
        level = 1,
        name = "Jarte-Cica Care Toner",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 95000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 1,
        name = "Erha-Acne Care Lab Gentle Acne Moisturizer",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Sulfate-Free, Alcohol-Free, EU Allergen-Free, Fungal Acne (Malassezia) Safe",
        price = 88560
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 1,
        name = "Somthinc -Ceramic Skin Saviour",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 169000
    ),
    SkincareProduct(
        type = "Serum",
        level = 1,
        name = "Breylee- Acne Treatment Serum",
        mainIngredient = "Niacinamide Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 80000
    ),
    SkincareProduct(
        type = "Serum",
        level = 1,
        name = "Skin game- Acne Combat Serum",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 149000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 1,
        name = "Somthinc- Acne Shot Ac Spot Gel",
        mainIngredient = "Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free",
        price = 85000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 1,
        name = "acnoc- Acneser Spot Gel",
        mainIngredient = "Niacinamide",
        description = "Paraben-Free, Silicone-Free, Sulfate-Free, EU Allergen-Free, Fungal Acne Safe",
        price = 180000
    ),

//    Level 2 lurrr
    SkincareProduct(
        type = "Face Wash",
        level = 2,
        name = "Elsheskin- Acne Cleansing Wash",
        mainIngredient = "salicilyc acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free",
        price = 65000
    ),
    SkincareProduct(
        type = "Face Wash",
        level = 2,
        name = "Avoskin - Miraculous Acne Solution Bubble-Serum Infused Cleanser",
        mainIngredient = "Salicilyc acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 139000
    ),
    SkincareProduct(
        type = "Toner",
        level = 2,
        name = "Inez - Acne Care Facial Toner",
        mainIngredient = "Salicilyc acid 2%",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free, EU Allergen-Free, Minimal Ingredients",
        price = 65000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 2,
        name = "Elsheskin - Moisturizer For Acne",
        mainIngredient = "salicilyc acid 2%",
        description = "Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 87000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 2,
        name = "Wardah - Acnederm Night Treatment Moisturizer",
        mainIngredient = "salicylic acid 2%",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 34000
    ),
    SkincareProduct(
        type = "Serum",
        level = 2,
        name = "Somthinc - Bakuchiol Skinpair Oil Serum",
        mainIngredient = "salicilyc acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free",
        price = 89000
    ),
    SkincareProduct(
        type = "Serum",
        level = 2,
        name = "Somthinc - 2% BHA Salicylic Acid Liquid Perfector",
        mainIngredient = "salicilyc acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 119000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 2,
        name = "Skin game - Acne Warrior",
        mainIngredient = "salicylic acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 125000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 2,
        name = "Avoskin - Your Skin Bae Salicylic Acid 2% + Zinc",
        mainIngredient = "salicylic acid 2%",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 139000
    ),

//    Level 3 lurr
    SkincareProduct(
        type = "Face Wash",
        level = 3,
        name = "Citra - Green Tea Antiacne Power Cleanser Facial Foam",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Sulfate-Free, Silicone-Free",
        price = 22000
    ),
    SkincareProduct(
        type = "Face Wash",
        level = 3,
        name = "Erto's - Why Acne Facial Wash",
        mainIngredient = "salicilyc acid 2%, sulfur",
        description = "Alcohol-Free, Fragrance and Essential oil-Free",
        price = 100000
    ),
    SkincareProduct(
        type = "Toner",
        level = 3,
        name = "Everwhite - Acnepair Toner",
        mainIngredient = "Niacinamide, Salicylic Acid, Tea tree oil",
        description = "Sulfate-Free, Alcohol-Free, EU Allergen-Free",
        price = 72000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 3,
        name = "N'pure - Night Cream Centella",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 90000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 3,
        name = "N'pure - Night Cream Centella",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 90000
    ),
    SkincareProduct(
        type = "Serum",
        level = 3,
        name = "Noolab - Breezy Willow Moist Serum",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 99000
    ),
    SkincareProduct(
        type = "Serum",
        level = 3,
        name = "Avoskin - Miraculous Refining Serum",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 239000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 3,
        name = "Whitelab - Acne Cream",
        mainIngredient = "Niacinamide, Salicylic Acid, Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 62000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 3,
        name = "N'pure - Cica Acne Spot",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 69000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 3,
        name = "Skintific - Salicylic Acid Anti Acne Spot Treatment",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 105000
    ),

//    Level 4 lurrr
    SkincareProduct(
        type = "Face Wash",
        level = 4,
        name = "Citra - Green Tea Antiacne Power Cleanser Facial Foam",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Sulfate-Free, Silicone-Free",
        price = 22000
    ),
    SkincareProduct(
        type = "Face Wash",
        level = 4,
        name = "Erto's - Why Acne Facial Wash",
        mainIngredient = "salicilyc acid 2%, sulfur",
        description = "Alcohol-Free, Fragrance and Essential oil-Free",
        price = 100000
    ),
    SkincareProduct(
        type = "Toner",
        level = 4,
        name = "Whitelab - Acne Toner",
        mainIngredient = "Salicilyc acid 2%",
        description = "Paraben-Free, Sulfate-Free",
        price = 59000
    ),
    SkincareProduct(
        type = "Toner",
        level = 4,
        name = "Everwhite - Acnepair Toner",
        mainIngredient = "Niacinamide, Salicylic Acid, Tea tree oil",
        description = "Sulfate-Free, Alcohol-Free, EU Allergen-Free",
        price = 72000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 4,
        name = "N'pure - Night Cream Centella",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 90000
    ),
    SkincareProduct(
        type = "Moisturizer",
        level = 4,
        name = "Citra - Green Tea Antiacne Essence Cream",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Sulfate-Free, Alcohol-Free, EU Allergen-Free",
        price = 45000
    ),
    SkincareProduct(
        type = "Serum",
        level = 4,
        name = "Noolab - Breezy Willow Moist Serum",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 99000
    ),
    SkincareProduct(
        type = "Serum",
        level = 4,
        name = "Avoskin - Miraculous Refining Serum",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 239000
    ),
    SkincareProduct(
        type = "Serum",
        level = 4,
        name = "Aubree - Centella Herb Serum",
        mainIngredient = "Niacinamide, Salicylic Acid, Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 99000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "Whitelab - Acne Cream",
        mainIngredient = "Niacinamide, Salicylic Acid, Tea tree oil",
        description = "Paraben-Free, Alcohol-Free, Silicone-Free",
        price = 62000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "N'pure - Cica Acne Spot",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 69000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "Skintific - Salicylic Acid Anti Acne Spot Treatment",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 105000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "Ms Glow - Acne Spot Treatment",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 100000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "Jarte - Bye Bye Acne Spot Treatment",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Silicone-Free",
        price = 115000
    ),
    SkincareProduct(
        type = "Acne Spot",
        level = 4,
        name = "The Originote - Acne Spot Cream",
        mainIngredient = "Niacinamide, Salicylic Acid",
        description = "Paraben-Free, Alcohol-Free, Fragrance and Essential oil-Free, Silicone-Free",
        price = 30000
    ),
    SkincareProduct(
        type = "Oral Medications",
        level = 4,
        name = "Acnor - Acnor 30'S",
        mainIngredient = "Pumpkin seed extract, Wheat seed extract, Kiwi Seed Extract, dan Chasteberry",
        description = "-",
        price = 135000
    ),
    SkincareProduct(
        type = "Oral Medications",
        level = 4,
        name = "Kapsida - Kapsida",
        mainIngredient = "coriandri fructus 17mg, centella herba 35mg, imperatae rhizoma 14mg",
        description = "-",
        price = 10000
    )

// contoh pemanggilannya begini lurr
//    val level4Products = skincareProducts.filter { it.level == 4 && it.type == "Face Wash" }
//    for (product in level4Products) {
//        println("Type: ${product.type}")
//        println("Name: ${product.name}")
//        println("Main Ingredient: ${product.mainIngredient}")
//        println("Description: ${product.description}")
//        println("Price: ${product.price}")
//        println()
//    }
)