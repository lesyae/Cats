package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Мейн-кун", "Порода кошек, которая произошла от кошек штата Мэн на северо-востоке США. Аборигенная порода кошек Северной Америки.",
                R.drawable.maycun, "Численность большая"));
        animals.add( new Animal("Бенгальская кошка", "Межродовой гибрид домашней кошки и собственно бенгальской кошки.",
                R.drawable.beng, "Численность ,jkmifz"));
        animals.add( new Animal("Русская голубая кошка", "Порода домашней кошки, признанная международными фелинологическими организациями, которая стала известна в России только с началом фелинологического движения.",
                R.drawable.rus, "Численность средняя"));
        animals.add( new Animal("Сибирская кошка", "Порода полудлинношёрстных кошек. Окрас различный. По неофициальной версии от сибирской кошки произошла невская маскарадная кошка.",
                R.drawable.sib, "Численность большая"));
        animals.add( new Animal("Экзотическая кошка", "искусственно выведенная порода короткошёрстных кошек. Экзоты внешне схожи с кошками персидской породы. ",
                R.drawable.eczot, "Численность небольшая"));
    }
}