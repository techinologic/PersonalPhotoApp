package net.androidbootcamp.personalphotoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Integer[] Students = {R.drawable.eagle, R.drawable.elephant, R.drawable.gorilla,
            R.drawable.panda, R.drawable.panther, R.drawable.polar};

    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView grid = (GridView) findViewById(R.id.gridView);
        final ImageView pic = (ImageView) findViewById(R.id.imgLarge);

        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getBaseContext(), "Selected Student Ahmed", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "Selected Student Emebet", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "Selected Student Manoj", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                    case 3:
                        Toast.makeText(getBaseContext(), "Selected Student Paolo", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                    case 4:
                        Toast.makeText(getBaseContext(), "Selected Student Zaid", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                    case 5:
                        Toast.makeText(getBaseContext(), "Selected Student Bruk", Toast.LENGTH_SHORT).show();
                        pic.setImageResource(Students[position]);
                        break;
                }
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return Students.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Students[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,300));
            return pic;
        }
    }
}