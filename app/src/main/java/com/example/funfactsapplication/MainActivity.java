package com.example.funfactsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Declare our view variables
    private TextView factTextView;
    private Button showFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Assign the Views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.factButton);

        // create listener, it is a View because its a button

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] facts = {
                        "The blue whale is the largest animal on Earth, with an average weight of around 200,000 pounds.",
                        "The peregrine falcon is the fastest animal in the world, capable of reaching speeds of over 240 miles per hour when diving.",
                        "The axolotl, also known as the Mexican walking fish, can regrow lost body parts such as limbs and even parts of its brain and spinal cord.",
                        "Honeybees are capable of recognizing human faces and can communicate the location of food sources to each other through a complex dance.",
                        "The mimic octopus is able to mimic the appearance and movement of other animals, including poisonous ones, in order to scare off predators.",
                        "A group of flamingos is called a flamboyance.",
                        "Cows have best friends and become stressed when they are separated from them.",
                        "A male seahorse is the one that carries and gives birth to the babies.",
                        "The mantis shrimp has the most complex eyes in the animal kingdom, with 16 color-receptive cones (compared to our 3) and the ability to see polarized light.",
                        "Sloths only defecate once a week and have special bacteria in their stomachs that help break down the tough leaves they eat.",
                        "The blue whale is the largest animal on the planet, growing up to 100 feet long and weighing up to 200 tons.",
                        "The heart of a blue whale is the size of a small car and can weigh up to 1,000 pounds.",
                        "A newborn kangaroo is only about 1 inch long and weighs less than a penny.",
                        "The tongue of a blue whale can weigh as much as an elephant.",
                        "The peregrine falcon is the fastest bird in the world, capable of diving at speeds of over 200 mph.",
                        "The sea otter is the only marine mammal that uses tools, such as rocks, to crack open shellfish.",
                        "A group of otters is called a romp.",
                        "The giraffe has the longest neck of any animal, with a neck that can be up to 6 feet long.",
                        "The honey badger is known for its fearlessness and can take on animals much larger than itself, including lions and crocodiles.",
                        "A group of hedgehogs is called a prickle.",
                        "The cheetah is the fastest land animal, capable of running at speeds of up to 75 mph.",
                        "The star-nosed mole has a nose with 22 tentacle-like appendages that it uses to feel its way around and detect prey.",
                        "A group of sloths is called a bed.",
                        "The bombardier beetle can spray a hot, noxious chemical from its abdomen as a defense mechanism.",
                        "The Tasmanian devil is the largest carnivorous marsupial and is known for its fierce temperament.",
                        "A group of zebras is called a dazzle.",
                        "The platypus is one of the few mammals that lay eggs.",
                        "The frilled shark is a prehistoric-looking deep-sea shark with a mouth full of needle-like teeth.",
                        "The axolotl is a type of salamander that can regenerate lost body parts, including limbs and even parts of its brain."
                };

                // the button was clicked, update the fact textView with a new fact
                // Select a fact by random
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                String fact = facts[randomNumber];

                // Update the screen with our new fact
                factTextView.setText(fact);
            }
        };
        // attach listener to button on XML
        showFactButton.setOnClickListener(listener);
    }
}