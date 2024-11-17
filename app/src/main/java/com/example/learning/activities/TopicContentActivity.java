package com.example.learning.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learning.R;
import com.example.learning.others.TopicsDataProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicContentActivity extends AppCompatActivity {

    String cat_name, module_name;
    int total_topics;
    SeekBar content_seekbar;
    TextView content_topic, content;
    Button content_previous, content_next;
    int current_progress = 0;
    Map<String, String[]> moduleContentMap = new HashMap<>();
    Map<String, List<String>> topicsMap;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_content);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


        content_seekbar = findViewById(R.id.content_seekbar);
        content_topic = findViewById(R.id.content_topic);
//        content = findViewById(R.id.content);
        content_previous = findViewById(R.id.content_previous);
        content_next = findViewById(R.id.content_next);

        Intent intent = getIntent();
        cat_name = intent.getStringExtra("cat_name");
        module_name = intent.getStringExtra("module_name");
        total_topics = intent.getIntExtra("total_topics", 0);

        content_seekbar.setMax(total_topics);
        content_seekbar.setProgress(1);
        current_progress = content_seekbar.getProgress();

        String[] what_is_cloud_computing = getResources().getStringArray(R.array.what_is_cloud_computing);
        String[] types_of_cloud = getResources().getStringArray(R.array.types_of_cloud);
        String[] cloud_service_models = getResources().getStringArray(R.array.cloud_service_models);
        String[] virtualization = getResources().getStringArray(R.array.virtualization);

        moduleContentMap.put("What is Cloud Computing ?", what_is_cloud_computing);
        moduleContentMap.put("Types Of Cloud", types_of_cloud);
        moduleContentMap.put("Cloud Service Models", cloud_service_models);
        moduleContentMap.put("Virtualization", virtualization);

        String[] microsoft_azure_tutorial = getResources().getStringArray(R.array.microsoft_azure_tutorial);
        String[] azure_storage_services = getResources().getStringArray(R.array.azure_storage_service);
        String[] network_services = getResources().getStringArray(R.array.network_services);
        String[] compute_services = getResources().getStringArray(R.array.compute_services);
        String[] app_services = getResources().getStringArray(R.array.app_services);
        String[] database_services = getResources().getStringArray(R.array.database_services);

        moduleContentMap.put("Microsoft Azure Tutorial",microsoft_azure_tutorial);
        moduleContentMap.put("Azure Storage Service", azure_storage_services);
        moduleContentMap.put("Network Services", network_services);
        moduleContentMap.put("Compute Services", compute_services);
        moduleContentMap.put("App Services", app_services);
        moduleContentMap.put("Database Services", database_services);

        String[] aws_tutorial = getResources().getStringArray(R.array.microsoft_azure_tutorial);
        String[] aws_iam = getResources().getStringArray(R.array.aws_iam);
        String[] storage_services = getResources().getStringArray(R.array.storage_services);
        String[] ec2_backbone_of_aws = getResources().getStringArray(R.array.ec2_backbone_of_aws);
        String[] aws_route53 = getResources().getStringArray(R.array.aws_route53);
        String[] aws_database_services = getResources().getStringArray(R.array.aws_database_services);
        String[] application_services = getResources().getStringArray(R.array.application_services);

        moduleContentMap.put("AWS Tutorial",aws_tutorial);
        moduleContentMap.put("AWS IAM",aws_iam);
        moduleContentMap.put("Storage Services", storage_services);
        moduleContentMap.put("EC2 - Backbone of AWS", ec2_backbone_of_aws);
        moduleContentMap.put("AWS Route53", aws_route53);
        moduleContentMap.put("Database Services", aws_database_services);
        moduleContentMap.put("Application Services", application_services);

        String[] google_cloud_platform_tutorial = getResources().getStringArray(R.array.google_cloud_platform_tutorial);

        moduleContentMap.put("Google Cloud Platform Tutorial", google_cloud_platform_tutorial);

        String[] sql_tutorial = getResources().getStringArray(R.array.sql_tutorial);
        String[] sql_database = getResources().getStringArray(R.array.sql_database);
        String[] sql_table = getResources().getStringArray(R.array.sql_table);
        String[] sql_select = getResources().getStringArray(R.array.sql_select);
        String[] sql_clause = getResources().getStringArray(R.array.sql_clause);
        String[] sql_order_by = getResources().getStringArray(R.array.sql_order_by);
        String[] sql_insert = getResources().getStringArray(R.array.sql_insert);
        String[] sql_update = getResources().getStringArray(R.array.sql_update);
        String[] sql_delete = getResources().getStringArray(R.array.sql_delete);
        String[] sql_join = getResources().getStringArray(R.array.sql_join);
        String[] sql_keys = getResources().getStringArray(R.array.sql_keys);
        String[] sql_string_functions = getResources().getStringArray(R.array.sql_string_functions);

        moduleContentMap.put("SQL Tutorial", sql_tutorial);
        moduleContentMap.put("SQL Database", sql_database);
        moduleContentMap.put("SQL Table", sql_table);
        moduleContentMap.put("SQL Select", sql_select);
        moduleContentMap.put("SQL Clause", sql_clause);
        moduleContentMap.put("SQL Order By", sql_order_by);
        moduleContentMap.put("SQL Insert", sql_insert);
        moduleContentMap.put("SQL Update", sql_update);
        moduleContentMap.put("SQL Delete", sql_delete);
        moduleContentMap.put("SQL Join", sql_join);
        moduleContentMap.put("SQL Keys", sql_keys);
        moduleContentMap.put("SQL String Functions", sql_string_functions);

        String[] mysql_tutorial = getResources().getStringArray(R.array.mysql_tutorial);
        String[] mysql_workbench = getResources().getStringArray(R.array.mysql_workbench);
        String[] user_management = getResources().getStringArray(R.array.user_management);
        String[] mysql_database = getResources().getStringArray(R.array.mysql_database);
        String[] table_and_views = getResources().getStringArray(R.array.table_and_views);
        String[] mysql_queries = getResources().getStringArray(R.array.mysql_queries);
        String[] mysql_clauses = getResources().getStringArray(R.array.mysql_clauses);
        String[] mysql_privileges = getResources().getStringArray(R.array.mysql_privileges);
        String[] control_flow_statement = getResources().getStringArray(R.array.control_flow_statement);
        String[] mysql_conditions = getResources().getStringArray(R.array.mysql_conditions);
        String[] mysql_join = getResources().getStringArray(R.array.mysql_join);
        String[] mysql_key = getResources().getStringArray(R.array.mysql_key);
        String[] mysql_trigger = getResources().getStringArray(R.array.mysql_trigger);

        moduleContentMap.put("MySQL Tutorial", mysql_tutorial);
        moduleContentMap.put("MySQL Workbench", mysql_workbench);
        moduleContentMap.put("User Management", user_management);
        moduleContentMap.put("MySQL Database", mysql_database);
        moduleContentMap.put("Table & Views", table_and_views);
        moduleContentMap.put("MySQL Queries", mysql_queries);
        moduleContentMap.put("MySQL Clauses", mysql_clauses);
        moduleContentMap.put("MySQL Privileges", mysql_privileges);
        moduleContentMap.put("Control Flow Function", control_flow_statement);
        moduleContentMap.put("MySQL Conditions", mysql_conditions);
        moduleContentMap.put("MySQL Join", mysql_join);
        moduleContentMap.put("MySQL Key", mysql_key);
        moduleContentMap.put("MySQL Triggers", mysql_trigger);

        String[] oracle_tutorial = getResources().getStringArray(R.array.oracle_tutorial);
        String[] oracle_tables = getResources().getStringArray(R.array.oracle_tables);
        String[] oracle_views = getResources().getStringArray(R.array.oracle_views);
        String[] oracle_query = getResources().getStringArray(R.array.oracle_query);
        String[] oracle_clauses = getResources().getStringArray(R.array.oracle_clauses);
        String[] oracle_operators = getResources().getStringArray(R.array.oracle_operators);
        String[] oracle_joins = getResources().getStringArray(R.array.oracle_joins);

        moduleContentMap.put("Oracle Tutorial", oracle_tutorial);
        moduleContentMap.put("Oracle Tables", oracle_tables);
        moduleContentMap.put("Oracle Views", oracle_views);
        moduleContentMap.put("Oracle Query", oracle_query);
        moduleContentMap.put("Oracle Clauses", oracle_clauses);
        moduleContentMap.put("Oracle Operators", oracle_operators);
        moduleContentMap.put("Oracle Joins", oracle_joins);

        String[] sqlite_tutorial = getResources().getStringArray(R.array.sqlite_tutorial);
        String[] sqlite_databases = getResources().getStringArray(R.array.sqlite_databases);
        String[] sqlite_tables = getResources().getStringArray(R.array.sqlite_tables);
        String[] sqlite_crud_operation = getResources().getStringArray(R.array.sqlite_crud_operation);
        String[] sqlite_clause_and_conditions = getResources().getStringArray(R.array.sqlite_clause_and_conditions);
        String[] sqlite_joins = getResources().getStringArray(R.array.sqlite_joins);
        String[] sqlite_date_and_time = getResources().getStringArray(R.array.sqlite_date_and_time);
        String[] sqlite_aggregate_functions = getResources().getStringArray(R.array.sqlite_aggregate_functions);
        String[] sqlite_triggers = getResources().getStringArray(R.array.sqlite_triggers);
        String[] sqlite_keys = getResources().getStringArray(R.array.sqlite_keys);

        moduleContentMap.put("SQLite Tutorial", sqlite_tutorial);
        moduleContentMap.put("Databases", sqlite_databases);
        moduleContentMap.put("Table", sqlite_tables);
        moduleContentMap.put("CRUD Operation", sqlite_crud_operation);
        moduleContentMap.put("Clauses/Conditions", sqlite_clause_and_conditions);
        moduleContentMap.put("SQLite Joins", sqlite_joins);
        moduleContentMap.put("SQLite Date & Time", sqlite_date_and_time);
        moduleContentMap.put("Aggregate Functions", sqlite_aggregate_functions);
        moduleContentMap.put("SQLite Triggers", sqlite_triggers);
        moduleContentMap.put("SQLite Keys", sqlite_keys);


        moduleContentMap.put("HTML Tutorial", null);
        moduleContentMap.put("HTML Attributes", null);
        moduleContentMap.put("HTML Tags List", null);
        moduleContentMap.put("HTML API", null);

        moduleContentMap.put("CSS Tutorial", null);
        moduleContentMap.put("CSS Properties", null);
        moduleContentMap.put("CSS Design", null);
        moduleContentMap.put("CSS Advance", null);

        String[] javascript_tutorial = getResources().getStringArray(R.array.javascript_tutorial);
        String[] javascrit_basic = getResources().getStringArray(R.array.javascript_basics);
        String[] javascript_objects = getResources().getStringArray(R.array.javascript_object);
        String[] javascript_bom = getResources().getStringArray(R.array.javascript_BOM);
        String[] javascript_dom = getResources().getStringArray(R.array.javascript_DOM);
        String[] javascript_validation = getResources().getStringArray(R.array.javascript_validation);
        String[] javascript_oops = getResources().getStringArray(R.array.javascript_OOPS);
        String[] javascript_cookies = getResources().getStringArray(R.array.javascript_cookies);
        String[] javascript_events = getResources().getStringArray(R.array.javascript_events);
        String[] javascript_handling = getResources().getStringArray(R.array.javascript_exception_handling);

        moduleContentMap.put("JavaScript Tutorial", javascript_tutorial);
        moduleContentMap.put("JavaScript Basics", javascrit_basic);
        moduleContentMap.put("JavaScript Objects", javascript_objects);
        moduleContentMap.put("JavaScript BOM", javascript_bom);
        moduleContentMap.put("JavaScript DOM", javascript_dom);
        moduleContentMap.put("JavaScript Validation", javascript_validation);
        moduleContentMap.put("JavaScript OOPs", javascript_oops);
        moduleContentMap.put("JavaScript Cookies", javascript_cookies);
        moduleContentMap.put("JavaScript Events", javascript_events);
        moduleContentMap.put("JavaScript Handling", javascript_handling);

        moduleContentMap.put("Bootstrap Tutorial", null);
        moduleContentMap.put("Bootstrap Examples", null);
        moduleContentMap.put("Bootstrap Advance", null);
        moduleContentMap.put("Bootstrap Utilities", null);

        moduleContentMap.put("AngularJS Tutorial", null);

        moduleContentMap.put("jQuery Tutorial", null);
        moduleContentMap.put("jQuery Effects", null);
        moduleContentMap.put("jQuery HTML/CSS", null);
        moduleContentMap.put("jQuery Form", null);
        moduleContentMap.put("jQuery Events", null);

        moduleContentMap.put("AJAX Tutorial", null);
        moduleContentMap.put("Java AJAX", null);
        moduleContentMap.put("JSON AJAX", null);

        moduleContentMap.put("Laravel Tutorial", null);
        moduleContentMap.put("Installation on Windows", null);
        moduleContentMap.put("Laravel Routing", null);
        moduleContentMap.put("Laravel Controllers", null);
        moduleContentMap.put("Laravel Views", null);
        moduleContentMap.put("Laravel Blade Template", null);
        moduleContentMap.put("Laravel Migration", null);
        moduleContentMap.put("Laravel Database", null);

        moduleContentMap.put("Android Tutorial", null);
        moduleContentMap.put("Android Widgets", null);
        moduleContentMap.put("Activity and Intents", null);
        moduleContentMap.put("Android Fragments", null);
        moduleContentMap.put("Android Menu", null);
        moduleContentMap.put("Android Service", null);
        moduleContentMap.put("Android AlarmManager", null);
        moduleContentMap.put("Android Storage", null);
        moduleContentMap.put("Android SQLite", null);
        moduleContentMap.put("Android Multimedia", null);
        moduleContentMap.put("Android Telephony", null);
        moduleContentMap.put("Android Device", null);
        moduleContentMap.put("Camera Tutorial", null);
        moduleContentMap.put("Sensor Tutorial", null);
        moduleContentMap.put("Android Graphics", null);
        moduleContentMap.put("Android Animation", null);
        moduleContentMap.put("Android Web Service", null);
        moduleContentMap.put("Google Map", null);
        moduleContentMap.put("Adding Ads", null);
        moduleContentMap.put("Android Social", null);

        moduleContentMap.put("Dart Tutorial", null);
        moduleContentMap.put("Dart Data Types", null);
        moduleContentMap.put("Control Flow Statement", null);
        moduleContentMap.put("Dart Function", null);
        moduleContentMap.put("Object Oriented", null);
        moduleContentMap.put("Dart Advance Topics", null);

        moduleContentMap.put("Flutter Tutorial", null);
        moduleContentMap.put("Dart Programming", null);
        moduleContentMap.put("Flutter Basics", null);
        moduleContentMap.put("Flutter Widgets", null);
        moduleContentMap.put("Flutter Routing", null);
        moduleContentMap.put("Advanced Concepts", null);

        moduleContentMap.put("Kotlin Tutorial", null);
        moduleContentMap.put("Control Flow", null);
        moduleContentMap.put("Function", null);
        moduleContentMap.put("Array", null);
        moduleContentMap.put("String", null);
        moduleContentMap.put("Exception Handling", null);
        moduleContentMap.put("Null Safety", null);
        moduleContentMap.put("Collections", null);
        moduleContentMap.put("Annotations", null);
        moduleContentMap.put("Reflection", null);
        moduleContentMap.put("Kotlin OOPs", null);
        moduleContentMap.put("Ranges", null);
        moduleContentMap.put("Kotlin Android", null);

        moduleContentMap.put("Swift Tutorial", null);
        moduleContentMap.put("Control Statement", null);
        moduleContentMap.put("Swift Loops", null);
        moduleContentMap.put("Swift String", null);
        moduleContentMap.put("Swift Functions", null);
        moduleContentMap.put("Swift Collection", null);
        moduleContentMap.put("Swift OOPs", null);

        String[] net_framework = getResources().getStringArray(R.array.net_framework);
        String[] csharp_tutorial = getResources().getStringArray(R.array.csharp_tutorial);
        String[] csharp_control_statement = getResources().getStringArray(R.array.csharp_control_statement);
        String[] csharp_function = getResources().getStringArray(R.array.csharp_function);
        String[] csharp_arrays = getResources().getStringArray(R.array.csharp_arrays);
        String[] csharp_object_class = getResources().getStringArray(R.array.csharp_object_class);
        String[] csharp_properties = getResources().getStringArray(R.array.csharp_properties);
        String[] csharp_inheritance = getResources().getStringArray(R.array.csharp_inheritance);
        String[] csharp_polymorphism = getResources().getStringArray(R.array.csharp_polymorphism);
        String[] csharp_abstractions = getResources().getStringArray(R.array.csharp_abstractions);
        String[] csharp_namespace = getResources().getStringArray(R.array.csharp_namespace);
        String[] csharp_strings = getResources().getStringArray(R.array.csharp_strings);
        String[] csharp_exception_handling = getResources().getStringArray(R.array.csharp_exception_handling);
        String[] csharp_file_io = getResources().getStringArray(R.array.csharp_file_io);
        String[] csharp_collections = getResources().getStringArray(R.array.csharp_collections);
        String[] csharp_generics = getResources().getStringArray(R.array.csharp_generics);
        String[] csharp_delegated = getResources().getStringArray(R.array.csharp_delegated);
        String[] csharp_reflection = getResources().getStringArray(R.array.csharp_reflection);
        String[] csharp_anonymous_function = getResources().getStringArray(R.array.csharp_anonymous_function);
        String[] csharp_multithreading = getResources().getStringArray(R.array.csharp_multithreading);
        String[] csharp_synchronization = getResources().getStringArray(R.array.csharp_synchronization);


        moduleContentMap.put(".NET Framework", net_framework);
        moduleContentMap.put("C# Tutorial", csharp_tutorial);
        moduleContentMap.put("C# Control Statement", csharp_control_statement);
        moduleContentMap.put("C# Function", csharp_function);
        moduleContentMap.put("C# Arrays", csharp_arrays);
        moduleContentMap.put("C# Object Class", csharp_object_class);
        moduleContentMap.put("C# Properties", csharp_properties);
        moduleContentMap.put("C# Inheritance", csharp_inheritance);
        moduleContentMap.put("C# Polymorphism", csharp_polymorphism);
        moduleContentMap.put("C# Abstraction", csharp_abstractions);
        moduleContentMap.put("C# Namespace", csharp_namespace);
        moduleContentMap.put("C# Strings", csharp_strings);
        moduleContentMap.put("C# Exception Handling", csharp_exception_handling);
        moduleContentMap.put("C# File IO", csharp_file_io);
        moduleContentMap.put("C# Collection", csharp_collections);
        moduleContentMap.put("C# Generics", csharp_generics);
        moduleContentMap.put("C# Delegates", csharp_delegated);
        moduleContentMap.put("C# Reflection", csharp_reflection);
        moduleContentMap.put("C# Anonymous Function", csharp_anonymous_function);
        moduleContentMap.put("C# MultiThreading", csharp_multithreading);
        moduleContentMap.put("C# Synchronization", csharp_synchronization);

//        moduleContentMap.put("Python Tutorial", new String[]{"hel;lo", "dbhbhb", "sdhdsbh"});
//        moduleContentMap.put("Python OOPs", null);
//        moduleContentMap.put("Python MySQL", null);
//        moduleContentMap.put("Python MongoDB", null);
//        moduleContentMap.put("Python SQLite", null);
//
//        moduleContentMap.put("C tutorial", null);
//        moduleContentMap.put("C Control Statements", null);
//        moduleContentMap.put("C Functions", null);
//        moduleContentMap.put("C Array", null);
//        moduleContentMap.put("C Pointers", null);
//        moduleContentMap.put("C Dynamic Memory", null);
//        moduleContentMap.put("C String", null);
//        moduleContentMap.put("C Math", null);
//        moduleContentMap.put("C File Handling", null);
//
//        moduleContentMap.put("C++ Tutorials", null);
//        moduleContentMap.put("C++ Control Statement", null);
//        moduleContentMap.put("C++ Functions", null);
//        moduleContentMap.put("C++ Arrays", null);
//        moduleContentMap.put("C++ Pointers", null);
//        moduleContentMap.put("C++ Object Class", null);
//        moduleContentMap.put("C++ Inheritance", null);
//        moduleContentMap.put("C++ Polymorphism", null);
//        moduleContentMap.put("C++ Abstraction", null);
//        moduleContentMap.put("C++ Namespace", null);
//        moduleContentMap.put("C++ strings", null);
//        moduleContentMap.put("C++ Exceptions", null);
//
//        moduleContentMap.put("Ruby Tutorial", null);
//        moduleContentMap.put("Control Statements", null);
//        moduleContentMap.put("Ruby Core", null);
//
//        moduleContentMap.put("Go Language Tutorial", null);
//        moduleContentMap.put("Go Controls", null);
//        moduleContentMap.put("Go Functions", null);
//        moduleContentMap.put("Go Arrays", null);
//        moduleContentMap.put("Go Strings", null);
//        moduleContentMap.put("Go Types", null);
//        moduleContentMap.put("Go Map", null);
//        moduleContentMap.put("Go Error", null);
//        moduleContentMap.put("Go Time", null);
//        moduleContentMap.put("Go Concurrency", null);

//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);
//
//        moduleContentMap.put("What is Cloud Computing ?", null);
//        moduleContentMap.put("Types Of Cloud", null);
//        moduleContentMap.put("Cloud Service Models", null);
//        moduleContentMap.put("Virtualization", null);
//        moduleContentMap.put("Cloud Service Providers", null);


        String[] software_testing = getResources().getStringArray(R.array.software_testing);
        String[] sdlc_models = getResources().getStringArray(R.array.sdlc_models);
        String[] types_of_testing = getResources().getStringArray(R.array.types_of_testing);
        String[] types_of_manual = getResources().getStringArray(R.array.types_of_manual);
        String[] white_box_techniques = getResources().getStringArray(R.array.white_box_techniques);
        String[] black_box_techniques = getResources().getStringArray(R.array.black_box_techniques);
        String[] types_of_black_box = getResources().getStringArray(R.array.types_of_black_box);
        String[] types_of_functional = getResources().getStringArray(R.array.types_of_functional);
        String[] types_of_non_functional = getResources().getStringArray(R.array.types_of_non_functional);
        String[] test_case_development = getResources().getStringArray(R.array.test_case_development);
        String[] testing_techniques = getResources().getStringArray(R.array.testing_techniques);
        String[] test_management = getResources().getStringArray(R.array.test_management);
        String[] defect_tracking = getResources().getStringArray(R.array.defect_tracking);

        moduleContentMap.put("Software Testing", software_testing);
        moduleContentMap.put("SDLC models", sdlc_models);
        moduleContentMap.put("Types of Testing", types_of_testing);
        moduleContentMap.put("Types of Manual", types_of_manual);
        moduleContentMap.put("White Box Techniques", white_box_techniques);
        moduleContentMap.put("Black Box Techniques", black_box_techniques);
        moduleContentMap.put("Types of Black Box", types_of_black_box);
        moduleContentMap.put("Types of Functional", types_of_functional);
        moduleContentMap.put("Types of Non-functional", types_of_non_functional);
        moduleContentMap.put("Test case development", test_case_development);
        moduleContentMap.put("Testing Techniques", testing_techniques);
        moduleContentMap.put("Test Management", test_management);
        moduleContentMap.put("Defect Tracking", defect_tracking);

        moduleContentMap.put("Selenium Tutorial", null);
        moduleContentMap.put("Selenium IDE", null);
        moduleContentMap.put("Selenium WebDriver", null);

        String[] quality_assurance_tutorial = getResources().getStringArray(R.array.quality_assurance_tutorial);
        String[] qa_software_testing = getResources().getStringArray(R.array.qa_software_testing);
        String[] qa_black_box_testing = getResources().getStringArray(R.array.qa_black_box_testing);
        String[] qa_white_box_testing = getResources().getStringArray(R.array.qa_white_box_testing);
        String[] qa_types_of_testing = getResources().getStringArray(R.array.qa_types_of_testing);

        moduleContentMap.put("Quality Assurance", quality_assurance_tutorial);
        moduleContentMap.put("Software Testing", qa_software_testing);
        moduleContentMap.put("Black Box Testing", qa_black_box_testing);
        moduleContentMap.put("White Box Testing", qa_white_box_testing);
        moduleContentMap.put("Types of Testing", qa_types_of_testing);

        String[] appium_tutorial = getResources().getStringArray(R.array.appium_tutorial);
        moduleContentMap.put("Appium Tutorial", appium_tutorial);

        String[] cyber_security_tutorial = getResources().getStringArray(R.array.cyber_security_tutorial);
        moduleContentMap.put("Cyber Security Tutorial", cyber_security_tutorial);

        updateButtonVisibility();
        updateContent();

        content_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_progress > 0) {
                    current_progress--;
                    content_seekbar.setProgress(current_progress);
                    updateButtonVisibility();
                    updateContent();
                }
            }
        });

        content_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_progress < total_topics) {
                    current_progress++;
                    content_seekbar.setProgress(current_progress);
                    updateButtonVisibility();
                    updateContent();
                }
            }
        });
    }

    private void updateButtonVisibility() {
        content_previous.setVisibility(current_progress == 1 ? View.INVISIBLE : View.VISIBLE);
        content_next.setVisibility(current_progress == total_topics ? View.INVISIBLE : View.VISIBLE);
    }

    private void updateContent() {
        String[] moduleContent = moduleContentMap.get(module_name);

        // Fetch topics dynamically based on the selected module
        topicsMap = TopicsDataProvider.getTopicsForCourse(cat_name);
        List<String> moduleTopics = topicsMap.get(module_name);

        if (moduleContent != null && current_progress >= 0 && current_progress <= moduleContent.length) {
//            content.setText(HtmlCompat.fromHtml(moduleContent[current_progress - 1], HtmlCompat.FROM_HTML_MODE_LEGACY));
            String htmlContent = moduleContent[current_progress - 1];


            // Define CSS to load font files
            String css = "<style>@font-face { font-family: 'Montserrat'; src: url('file:///android_res/font/montserrat.ttf'); }" +
                    "@font-face { font-family: 'MontserratMedium'; src: url('file:///android_res/font/montserrat_medium.ttf'); }" +
                    "#exa { background: #E9F5FF; padding-top: 20px; padding-bottom: 20px; padding-left:10px; padding-right:10px; font-family:monospace; font-size:14px; border-radius: 10px; }"+
                    "h3{color:#00417E;}"+
                    "pre { background: #E9F5FF; padding-top: 20px; padding-bottom: 20px; padding-left:10px; padding-right:10px; font-family:monospace; font-size:14px; border-radius: 10px; }"+
                    "table{border-collapse: collapse;width: 100%;font-family: arial, sans-serif;}"+
                    "td,th{text-align: left;padding: 8px;}"+
                    "tr:nth-child(even) {  background-color: #E9F5FF;}"+
                    "body { background:#FFFFFF; font-family: 'Times New Roman'; font-style:bold; color:#000000; font-size:16px; letter-spacing:0.2px; text-align:justify; padding:3px;}</style>";

            // Append CSS and HTML content
            htmlContent = "<!DOCTYPE html><html><head>" + css + "</head><body>" + htmlContent + "</body></html>";

            // Initialize WebView
            WebView webView = findViewById(R.id.webView);

            webView.getSettings().setAllowFileAccessFromFileURLs(true);
            webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

            // Load HTML content into WebView
            webView.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null);

            if (moduleTopics != null && current_progress >= 0 && current_progress <= moduleTopics.size()) {
                content_topic.setText(moduleTopics.get(current_progress - 1));
            }
        }
    }

}
/*<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".activities.AfterEnrollActivity">

    <androidx.appcompat.widget.Toolbar
        android:id="@+id/toolbar"
        android:background="@color/Blue"
        android:layout_width="match_parent"
        android:layout_height="50dp">

        <ImageView
            android:id="@+id/back_icon"
            android:layout_width="30dp"
            android:layout_height="30dp"
            android:src="@drawable/baseline_arrow_back_24"
            android:padding="7dp"/>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/activity_name"
            android:text="all Courses"
            android:textSize="16sp"
            android:textColor="@color/white"
            android:layout_marginStart="30dp"
            android:fontFamily="@font/montserrat_medium"/>
    </androidx.appcompat.widget.Toolbar>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/afterenroll_rv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/toolbar"
        android:layout_marginTop="14dp"
        android:paddingStart="15dp"
        android:paddingTop="10dp"
        android:paddingRight="15dp"/>

    <androidx.cardview.widget.CardView
        android:layout_below="@id/afterenroll_rv"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:cardCornerRadius="10dp"
        android:layout_marginStart="20dp"
        android:layout_marginEnd="20dp"
        android:layout_marginTop="30dp"
        android:id="@+id/claim_certificate">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="13dp"
            android:background="@color/White">

            <TextView
                android:paddingTop="4dp"
                android:id="@+id/module_name"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="Claim your course certificate"
                android:textSize="14sp"
                android:textStyle="bold"
                android:fontFamily="@font/montserrat_medium"
                android:textColor="@color/Black" />

            <com.makeramen.roundedimageview.RoundedImageView
                android:id="@+id/module_drop"
                android:layout_alignParentEnd="true"
                android:layout_width="30dp"
                android:layout_height="30dp"
                android:padding="7dp"
                android:src="@drawable/next_icon"/>


        </RelativeLayout>


    </androidx.cardview.widget.CardView>


</RelativeLayout>*/