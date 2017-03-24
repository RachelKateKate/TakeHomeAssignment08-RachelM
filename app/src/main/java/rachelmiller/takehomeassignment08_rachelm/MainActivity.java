package rachelmiller.takehomeassignment08_rachelm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("title");
    private DatabaseReference homeworkRef = database.getReference("homework");
    private TextView title;
    private TextView name;
    private TextView hours;
    private CheckBox complete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        name = (TextView) findViewById(R.id.assignment);
        hours = (TextView) findViewById(R.id.hours);
        complete = (CheckBox) findViewById(R.id.complete);
    }

    public void setTitle(View view) {
        titleRef.setValue(title.getText().toString());
    }

    public void addAssignment(View view) {
        String assignmentName = name.getText().toString();
        int taskhours = Integer.parseInt(hours.getText().toString());
        boolean completed = ((CheckBox) findViewById(R.id.complete)).isChecked();
        homeworkRef.push().setValue(new Assignment(assignmentName, taskhours, completed));
    }
}

