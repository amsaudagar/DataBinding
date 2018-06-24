package com.globallogic.databinding.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.globallogic.databinding.R;
import com.globallogic.databinding.databinding.MyCustomItemName;
import com.globallogic.databinding.models.Employee;

/**
 * @author : Abdul Mateen
 * Describes the behaviour of employee detail screen
 */
public class EmployeeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Before Data Binding
//        setContentView(R.layout.employee_list_screen);
//
//        TextView textEmpId = (TextView) findViewById(R.id.text_emp_id);
//        TextView textEmpName = (TextView) findViewById(R.id.text_emp_name);
//        TextView textEmpDesignation = (TextView) findViewById(R.id.text_emp_designation);
//
//        textEmpId.setText(Integer.toString(1001));
//        textEmpName.setText("John Karter");
//        textEmpDesignation.setText("Software Engineer");


//        After Data Binding
        // your data is created here
        Employee employee = new Employee(1001, "John Karter", "Software Engineer");
        MyCustomItemName binding = DataBindingUtil.setContentView(this, R.layout.employee_details_screen);
        binding.setEmployee(employee); // generated setter based on the data in the layout file
    }
}
