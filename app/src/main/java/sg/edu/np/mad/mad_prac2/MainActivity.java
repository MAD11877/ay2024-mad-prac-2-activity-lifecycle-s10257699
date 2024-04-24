package sg.edu.np.mad.mad_prac2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        UserTest userTest = new UserTest("John Doe ", "MAD Developer", 1, false);

        // Get the TextViews and Button from the layout
        TextView tvName = findViewById(R.id.textView); // Update to match the ID in your layout
        TextView tvDescription = findViewById(R.id.textView1); // Update to match the ID in your layout
        Button btnFollow = findViewById(R.id.button1);

        // Set the TextViews with the User's name, description and default button message
        tvName.setText(userTest.name);
        tvDescription.setText(userTest.description);
        btnFollow.setText("Follow");

        //set the click listener
        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check the current text of the button
                String buttonText = btnFollow.getText().toString();

                // Toggle between "Follow" and "Unfollow"
                if (buttonText.equals("Follow")) {
                    btnFollow.setText("Unfollow");
                    Log.i(TAG, "Unfollow");
                } else {
                    btnFollow.setText("Follow");
                    Log.i(TAG, "Follow");
                }
            }
        });
    }
}