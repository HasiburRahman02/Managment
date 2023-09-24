package com.example.managment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.managment.Admin.PdfEbook;
import com.example.managment.Admin.UploadImage;
import com.example.managment.Admin.UploadNotice;
import com.example.managment.Faculty.UpdateFaculty;
import com.example.managment.notice.DeleteNoticeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  Toolbar mToolbar;

    CardView uploadNotice, addGalleryImage ,addE_book,addFaculty,Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("College_Management");



        uploadNotice=findViewById(R.id.addNotice);
        addGalleryImage=findViewById(R.id.addGallery_Image);
        addE_book=findViewById(R.id.addEbook);
        addFaculty=findViewById(R.id.addFaculty);
        Delete=findViewById(R.id.addDeleteNotice);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addE_book.setOnClickListener(this);
        addFaculty.setOnClickListener(this);
        Delete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {



        if (v.getId() == R.id.addNotice)
        {
            Intent intent= new Intent(MainActivity.this, UploadNotice.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.addGallery_Image)
        {

           Intent intent= new Intent(MainActivity.this, UploadImage.class);

           startActivity(intent);
        }

        else if (v.getId()==R.id.addEbook)
        {

            Intent intent= new Intent(getApplicationContext(), PdfEbook.class);
            startActivity(intent);
        }

        else if (v.getId()==R.id.addFaculty)
        {

            Intent intent= new Intent(getApplicationContext(), UpdateFaculty.class);
            startActivity(intent);
        }


        else if (v.getId()==R.id.addDeleteNotice)
        {

            Intent intent= new Intent(getApplicationContext(), DeleteNoticeActivity.class);
            startActivity(intent);
        }
    }

}