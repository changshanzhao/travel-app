package lvjian.zhaojunbo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travle.Adapters.CategoryAdapter;
import com.example.travle.Adapters.PupolarAdapter;
import com.example.travle.Domains.CategoryDomain;
import com.example.travle.Domains.PopularDomain;
import java.util.ArrayList;

public class DingZhi extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular,adapterCat;
    private RecyclerView recyclerViewPopular,recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dingzhi);
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("Mar caible,avendia lago","Miami Beach",
                "This 2 bed /1 bath home boasts an enormous," +
                        "Open-living plan, accented by striking " +
                        "Feel inspired by open sight lines that" +
                        "embrace the outdoors, crowned by stunning" +
                        " coffered ceilings. ",2,true,4.8,"pic1",true,1000
        ));

        items.add(new PopularDomain("Passo Rolle, Tn","Hawaii Beach",
                "This 2 bed /1 bath home boasts an enormous," +
                        "Open-living plan, accented by striking " +
                        "Feel inspired by open sight lines that" +
                        "embrace the outdoors, crowned by stunning" +
                        " coffered ceilings. ",1,false,5,"pic2",false,2500
        ));
        items.add(new PopularDomain("Mar caible, avendia lago","Hawaii Beach",
                "This 2 bed /1 bath home boasts an enormous," +
                        "Open-living plan, accented by striking " +
                        "Feel inspired by open sight lines that" +
                        "embrace the outdoors, crowned by stunning" +
                        " coffered ceilings. ",3,true,4.3,"pic3",true,30000
        ));

        recyclerViewPopular = findViewById(R.id.view_pop);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterPopular = new PupolarAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

        ArrayList<CategoryDomain> catsList = new ArrayList<>();
        catsList.add(new CategoryDomain("Beaches","cat1"));
        catsList.add(new CategoryDomain("Camps","cat2"));
        catsList.add(new CategoryDomain("Forest","cat3"));
        catsList.add(new CategoryDomain("Desert","cat4"));
        catsList.add(new CategoryDomain("Mountain","cat5"));

        recyclerViewCategory = findViewById(R.id.view_cat);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapterCat = new CategoryAdapter(catsList);
        recyclerViewCategory.setAdapter(adapterCat);

    }
}

