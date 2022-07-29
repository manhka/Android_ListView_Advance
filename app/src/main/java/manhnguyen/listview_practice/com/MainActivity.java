package manhnguyen.listview_practice.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Student> studentArrayList;
    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        studentAdapter = new StudentAdapter(this, R.layout.student_row, studentArrayList);
        listView.setAdapter(studentAdapter);
    }

    private void Anhxa() {
        listView = (ListView) findViewById(R.id.listView);
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("A", "12A1", R.drawable.minions8));
        studentArrayList.add(new Student("B", "12A2", R.drawable.minions5));
        studentArrayList.add(new Student("C", "12A3", R.drawable.minions6));
        studentArrayList.add(new Student("D", "12A4", R.drawable.minions7)); studentArrayList.add(new Student("A", "12A1", R.drawable.minions8));
        studentArrayList.add(new Student("B", "12A2", R.drawable.minions5));
        studentArrayList.add(new Student("C", "12A3", R.drawable.minions6));
        studentArrayList.add(new Student("D", "12A4", R.drawable.minions7)); studentArrayList.add(new Student("A", "12A1", R.drawable.minions8));
        studentArrayList.add(new Student("B", "12A2", R.drawable.minions5));
        studentArrayList.add(new Student("C", "12A3", R.drawable.minions6));
        studentArrayList.add(new Student("D", "12A4", R.drawable.minions7));
    }
}