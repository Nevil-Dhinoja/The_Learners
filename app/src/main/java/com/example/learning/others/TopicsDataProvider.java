//package com.example.learning.others;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class TopicsDataProvider {
//
//    public static Map<String, List<String>> getTopicsForCourse(String course) {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        switch (course) {
//            case "Cloud Computing":
//                return cloudcomputingTopicsMap();
//            case "Azure":
//                return azureTopicsMap();
//            case "AWS":
//                return awsTopicsMap();
//            case "gCloud":
//                return gcloudTopicsMap();
//            case "SQL":
//                return sqlTopicsMap();
//            case "MySQL":
//                return mysqlTopicsMap();
//            case "Oracle":
//                return oracleTopicsMap();
//            case "MongoDB":
//                return mongodbTopicsMap();
//            case "SQLite":
//                return sqliteTopicsMap();
//            case "HTML":
//                return htmlTopicsMap();
//            case "CSS":
//                return cssTopicsMap();
//            case "JS":
//                return jsTopicsMap();
//            case "PHP":
//                return phpTopicsMap();
//            case "Bootstrap":
//                return bootstrapTopicsMap();
//            case "Angular.JS":
//                return angularjsTopicsMap();
//            case "Cyber Security":
//                return cybersecurityTopicsMap();
//            case "jQuery":
//                return jqueryTopicsMap();
//            case "AJAX":
//                return ajaxTopicsMap();
//            case "Laravel":
//                return laravelTopicsMap();
//            case "Android":
//                return androidTopicsMap();
//            case "Dart":
//                return dartTopicsMap();
//            case "Flutter":
//                return flutterTopicsMap();
//            case "Kotlin":
//                return kotlinTopicsMap();
//            case "Swift":
//                return swiftTopicsMap();
//            case ".NET":
//                return dotnetTopicsMap();
//            case "ASP.net":
//                return aspdotnetTopicsMap();
//            case "C#":
//                return csharpTopicsMap();
//            case "Python":
//                return pythonTopicsMap();
//            case "Programming in C":
//                return programmingincTopicsMap();
//            case "C++":
//                return cplusplusTopicsMap();
//            case "Ruby":
//                return rubyTopicsMap();
//            case "Golang":
//                return golangTopicsMap();
//            case "Content Marketing":
//                return contentmarketingTopicsMap();
//            case "Mobile Marketing":
//                return mobilemarketingTopicsMap();
//            case "Video Marketing":
//                return videomarketingTopicsMap();
//            case "Email Marketing":
//                return emailmarketingTopicsMap();
//            case "SEO":
//                return seoTopicsMap();
//            case "Social Media Marketing":
//                return socialmediamarketingTopicsMap();
//            case "Website Marketing":
//                return websitemarketingTopicsMap();
//            case "Software Testing":
//                return softwaretestingTopicsMap();
//            case "Selenium":
//                return seleniumTopicsMap();
//            case "Quality Assurance":
//                return qualityassuranceTopicsMap();
//            case "Manual Testing":
//                return manualtestingTopicsMap();
//            case "Appium":
//                return appiumTopicsMap();
//            default:
//                return topicsMap;
//        }
//    }
//
//
//    //    cloud technologies topics set
//    public static Map<String, List<String>> cloudcomputingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "Private Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> azureTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Microsoft Azure Tutorial", Arrays.asList("What is Azure ?", "Cloud Computing Overview", "Azure Portal"));
//        topicsMap.put("Azure Storage Service", Arrays.asList("Storage Service", "Azure Storage Account", "Azure Blob Storage", "Creating a Container", "Blob Configuration", "Azure Storage Security", "Azure File Storage", "Table & Queue Storage", "Azure Disk storage", "Storage Monitoring", "Storage Resource Tools"));
//        topicsMap.put("Network Services", Arrays.asList("Azure Network Service", "Azure Virtual Network", "Azure Network Security", "Azure Network Interface", "Availability Zones & Sets", "Azure Load Balancer", "Azure VNet Connectivity"));
//        topicsMap.put("Compute Services", Arrays.asList("Azure Compute Service", "Azure Virtual Machines", "Azure VM Storage", "Virtual Machine Scale Set", "Azure Backup", "Azure VM Security", "Azure VM Monitoring", "Azure Cloud Service"));
//        topicsMap.put("App Services", Arrays.asList("Azure App Services", "Azure Web App", "Azure Mobile App", "Azure Notification Hub", "Azure API Apps", "App Service Backup", "App Service Security", "App Service Monitoring", "Azure CDN", "Azure Media Service"));
//        topicsMap.put("Database Services", Arrays.asList("Azure Database Service", "Azure SQL Database", "SQL dat   abase Configuration", "SQL Managed Instance", "Azure COSMOS DB", "Azure Data Factory", "SQL Data Warehouse"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> awsTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("AWS Tutorial", Arrays.asList("What is AWS ?", "History of AWS", "AWS Features", "Global Infrastructure", "AWS Free Tier"));
//        topicsMap.put("AWS IAM", Arrays.asList("AWS IAM", "AWS SAML", "IAM Identities", "IAM Roles", "IAM Roles Use Cases", "Creating IAM Roles"));
//        topicsMap.put("Storage Services", Arrays.asList("AWS S3", "AWS S3 Concepts", "Creating S3 Bucket", "AWS Storage Classes", "AWS Versioning", "Cross Region Replication", "Lifecycle Management", "CloudFront CDN", "Creating CloudFront CDN", "Storage Gateway", "AWS Snowball", "S3 Transfer Acceleration"));
//        topicsMap.put("EC2 - Backbone of AWS ", Arrays.asList("AWS EC2", "AWS EBS", "Creating an EC2 instance", "EBS Volume", "Security Group", "AWS AMI", "Creating an AMI", "AWS Load Balancing", "Creating Load Balancer", "AWS Lambda", "Creating a Lambda", "CloudWatch EC2", "AWS Bash Script"));
//        topicsMap.put("AWS Route53", Collections.singletonList("What is DNS ?"));
//        topicsMap.put("Database Services", Arrays.asList("Relational Database", "Non Relational Database", "AWS Elasticache", "Creating an RDS Instance", "AWS DynamoDB", "AWS Aurora", "AWS Redshift"));
//        topicsMap.put("Application Services", Arrays.asList("AWS SQS", "AWS SWF", "AWS SNS", "Elastic Transcoder", "API Gateway", "AWS Kinesis"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> gcloudTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Google Cloud Plateform Tutorial", Collections.singletonList("GPC Tutorial"));
//        return topicsMap;
//    }
//
//
//    // database tutorial topics set
//    public static Map<String, List<String>> sqlTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("SQL Tutorial", Arrays.asList("What is SQL ?", "SQL Syntax", "SQL Data Types", "SQL Operators"));
//        topicsMap.put("SQL Database", Arrays.asList("SQL CREATE Database", "SQL DROP Database", "SQL RENAME Database", "SQL SELECT Database"));
//        topicsMap.put("SQL Table", Arrays.asList("What is Table", "SQL CREATE Table", "SQL DROP Table", "SQL DELETE  Table", "SQL RENAME Table", "SQL TRUNCATE Table", "SQL COPY Table", "SQL TEMP Table", "SQL ALTER Table"));
//        topicsMap.put("SQL Select", Arrays.asList("SELECT Statement", "SQL SELECT UNIQUE", "SQL SELECT DISTINCT", "SQL SELECT COUNT", "SQL SELECT TOP", "SQL SELECT FIRST", "SQL SELECT LAST", "SQL SELECT RANDOM", "SQL SELECT IN", "SQL SELECT Multiple", "SQL SELECT DATE", "SQL SELECT SUM", "SQL SELECT NULL"));
//        topicsMap.put("SQl Clause", Arrays.asList("SQL WHERE", "SQL AND", "SQL OR", "SQL WITH", "SQL AS", "SQL HAVING Clause"));
//        topicsMap.put("SQl Order By", Arrays.asList("ORDER BY Clause", "ORDER BY ASC", "ORDER BY DESC", "ORDER BY RANDOM", "ORDER BY LIMIT", "ORDER BY Multiple Cols"));
//        topicsMap.put("SQl Insert", Arrays.asList("INSERT Statement", "INSERT Multiple Rows"));
//        topicsMap.put("SQl Update", Arrays.asList("UPDATE Statement", "SQL UPDATE JOIN", "SQL UPDATE DATE"));
//        topicsMap.put("SQl Delete", Arrays.asList("DELETE Statement", "SQL DELETE TABLE", "SQL DELETE ROW", "SQL DELETE All Rows", "DELETE Duplicate Rows", "SQL DELETE DATABASE", "SQL DELETE VIEW", "SQL DELETE JOIN"));
//        topicsMap.put("SQl Join", Arrays.asList("SQL JOIN", "SQL Outer Join", "SQL Left Join", "SQL Right Join", "SQL Full Join", "SQL Cross Join"));
//        topicsMap.put("SQl Keys", Arrays.asList("Primary Key", "Foreign Key", "Composite Key", "Unique Key", "Alternate Key"));
//        topicsMap.put("SQl String Functions", Arrays.asList("SQL String Functions", "LTRIM Function in SQL", "UPPER Function in SQL", "RTRIM Function in SQL"));
//        return topicsMap;
//    }
//
//    public static Map<String, List<String>> mysqlTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("MySQL Tutorial", Arrays.asList("What is MySQL ?", "MySQL Features", "MySQL Versions", "MySQL Data Types", "MySQL Variable", "Install MySQL", "MySQL Connection"));
//        topicsMap.put("MySQL Workbench", Collections.singletonList("MySQL Workbench"));
//        topicsMap.put("User Management", Arrays.asList("MySQL Create User", "MySQL Drop User", "MySQL Show User", "MySQL User Password"));
//        topicsMap.put("MySQL Database", Arrays.asList("MySQL Create Database", "MySQL Select Database", "MySQL Show Database", "MySQL Drop Database", "MySQL Copy Database"));
//        topicsMap.put("Table & Views", Arrays.asList("MySQL CREATE Table", "MySQL ALTER Table", "MySQL Show Table", "MySQL Rename Table", "MySQL TRUNCATE Table", "MySQL Describe Table", "MySQL DROP Table", "MySQL Temporary Table", "MySQL COPY Table", "MySQL Repair Table", "MySQL Add/Delete Column", "MySQL Show Column", "MySQL Rename Column", "MySQL Views", "MySQL Table Locking", "MySQL Account Lock", "MySQL Account Unlock"));
//        topicsMap.put("MySQL Queries", Arrays.asList("MySQL Queries", "MySQL Constraint", "MySQL INSERT Record", "MySQL UPDATE Record", "MySQL DELETE Record", "MySQL SELECT Record", "MySQL Replace", "Insert On DuplicateKey Update", "MySQL INSERT IGNORE", "Insert Into Select"));
//        topicsMap.put("MySQL Indexes", Arrays.asList("MySQL Create Index", "MySQL Drop Index", "MySQL Show Index", "MySQL Unique Index", "MySQL Clustered Index", "MySQL Clustered vs Non-Clustered Index"));
//        topicsMap.put("MySQL Clauses", Arrays.asList("MySQL WHERE", "MySQL DISTINCT", "MySQL FROM", "MySQL ORDER BY", "MySQL GROUP BY", "MySQL HAVING"));
//        topicsMap.put("MySQL Privileges", Arrays.asList("MySQL Grant Privilege", "MySQL Revoke Privilege"));
//        topicsMap.put("Control Flow Function", Arrays.asList("MySQL IF()", "MySQL IFNULL()", "MySQL NULLIF()", "MySQL CASE", "MySQL IF Statement", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("MySQL Conditions", Arrays.asList("MySQL AND", "MySQL OR", "MySQL AND OR", "MySQL Boolean", "MySQL Like", "MySQL IN", "MySQL ANY", "MySQL EXISTS", "MySQL NOT", "MySQL Not Equal", "MySQL IS NULL", "MySQL IS NOT NULL", "MySQL BETWEEN"));
//        topicsMap.put("MySQL Join", Arrays.asList("MySQL JOIN", "MySQL Inner Join", "MySQL Left Join", "MySQL Right Join", "MySQL Cross Join", "MySQL Self Join", "MySQL Delete Join", "MySQL Update Join", "MySQL Equi Join", "MySQL Natural Join", "Left Join vs Right Join", "MySQL Union vs Join"));
//        topicsMap.put("MySQL Key", Arrays.asList("MySQL Unique Key", "MySQL Primary Key", "MySQL Foreign Key", "MySQL Composite Key"));
//        topicsMap.put("MySQL Triggers", Arrays.asList("MySQL Trigger", "MySQL Create Trigger", "MySQL Show Trigger", "MySQL Drop Trigger", "Before Insert Trigger", "After Insert Trigger", "MySQL Before Update Trigger", "MySQL After Update Trigger", "MySQL Before Delete Trigger", "MySQL After Delete Trigger"));
//        topicsMap.put("Aggregate Functions", Arrays.asList("MySQL Aggregate Functions", "MySQL count()", "MySQL sum()", "MySQL acg()", "MySQL min()", "MySQL max()", "MySQL GROUP_CONCAT()", "MySQL first()", "MySQL last()"));
//        return topicsMap;
//    }
//
//    public static Map<String, List<String>> oracleTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Oracle Tutorial" , Arrays.asList("Oracle Tutorial" , "What is Oracle ?"));
//        topicsMap.put("Oracle Tables" , Arrays.asList("Create Table" , "Create Table As" , "Alter Table" , "Drop Table" , "Global Temp Tables" , "Local Temp Tables"));
//        topicsMap.put("Oracle Views" , Collections.singletonList("Oracle View"));
//        topicsMap.put("Oracle Query" , Arrays.asList("Oracle Queries" , "Oracle Select" , "Oracle Insert" , "Oracle Insert All" , "Oracle Update" , "Oracle Delete" , "Truncate Table"));
//        topicsMap.put("Oracle Clauses" , Arrays.asList("Oracle DISTINCT" , "Oracle FROM" , "Oracle ORDER BY" , "Oracle GROUP BY" , "Oracle HAVING"));
//        topicsMap.put("Oracle Operators" , Arrays.asList("Oracle Union" , "Oracle Union All" , "Oracle Intersect" , "Oracle Minus" , "Oracle HAVING"));
//        topicsMap.put("Oracle Joins" , Arrays.asList("Oracle Joins" , "Inner Join" , "Outer Join" , "Equi Join" , "Self Join" , "Cross Join" , "Anti Join" , "Semi Join"));
//        topicsMap.put("Oracle Advance" , Arrays.asList("Oracle Procedure" , "Oracle Function" , "Oracle Cursor" , "Oracle Trigger" , "Oracle BEFORE Trigger" , "Oracle AFTER Trigger" , "Oracle DROP Trigger" , "Oracle DISABLE Trigger" , "Oracle ENABLE Trigger"));
//        return topicsMap;
//    }
//
//    public static Map<String, List<String>> mongodbTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("MongoDB Tutorial", Arrays.asList("What is MongoDB ?", "No SQL Databases", "Advantages Over RDBMS", "MongoDB Data Types", "Install MongoDB", "MongoDB Data Modeling"));
//        topicsMap.put("MongoDB Operators", Arrays.asList("Query & Projection Operator", "MongoDB Update Operator", "Aggregation Pipeline Stages", "MongoDB limit()", "MongoDB sort()", "Query Modifiers"));
//        topicsMap.put("Database Commands", Arrays.asList("Aggregation Commands", "Geospatial Command", "Query & Write Operation Command", "Query Plan Cache Commands", "Authentication Commands", "User Management Commands", "Role Management Commands", "Replication Commands", "Sharding Commands", "Session Commands"));
//        topicsMap.put("Database", Arrays.asList("Create Database", "Drop Database"));
//        topicsMap.put("Collection", Arrays.asList("Create Collection", "Drop Collection"));
//        topicsMap.put("CRUD: Documents", Arrays.asList("Insert Documents", "Update Documents", "Delete Documents", "Query Documents", "SQL to MongoDB Mapping", "MongoDB text search"));
//        topicsMap.put("MongoDB Shell", Arrays.asList("MongoDB Shell", "Shell Collection Methods", "Cursor Methods", "MongoDB Database Command", "Query Plan Cache Methods", "User Management Methods", "Roll Management Methods", "MongoDB Replication Methods", "Bulk Operation Methods", "Connection Methods", "Sharding Methods"));
//        topicsMap.put("MongoDB Cloud", Arrays.asList("MongoDB Stitch", "MongoDB Atlas", "MongoDB Cloud Manager", "MongoDB Ops Manager"));
//        topicsMap.put("MongoDB Tools", Arrays.asList("MongoDB Compass", "MongoDB BI connector"));
//        topicsMap.put("Connectivity", Arrays.asList("JAVA MongoDB", "PHP MongoDB", "Python MongoDB", "Node.js MongoDB"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> sqliteTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("SQLite Tutorial", Arrays.asList("What is SQLite ?", "SQL vs SQLite", "SQLite History", "SQLite Features", "SQLite Advantages", "SQLite Installation", "SQLite Commands", "SQLite Syntax", "SQLite Data Types", "SQLite Operators", "SQLite Expressions"));
//        topicsMap.put("Databases", Arrays.asList("SQLite Create DB", "SQLite Attach DB", "SQLite Detach DB"));
//        topicsMap.put("Table", Arrays.asList("SQLite Create Table", "SQLite Drop Table"));
//        topicsMap.put("CRUD Operation", Arrays.asList("SQLite Insert Query", "SQLite Select Query", "SQLite Update Query", "SQLite Delete Query"));
//        topicsMap.put("Clauses/Conditions", Arrays.asList("SQLite WHERE", "SQLite AND", "SQLite OR", "SQLite LIKE", "SQLite Glob", "SQLite Limit", "SQLite Order By", "SQLite Group By", "SQLite Having", "SQLite Distinct", "SQLite Union", "SQLite Union All"));
//        topicsMap.put("SQLite Joins", Arrays.asList("SQLite Joins", "SQLite Inner Join", "SQLite Outer Join", "SQLite Cross Join"));
//        topicsMap.put("SQLite Date & Time", Arrays.asList("SQLite Date & Time", "SQLite date()", "SQLite datetime()", "SQLite juliandday()", "SQLite now()", "SQLite strftime()", "SQLite time()"));
//        topicsMap.put("Aggregate Functions", Arrays.asList("Aggregate Functions", "SQLite MIN", "SQLite MAX", "SQLite AVG", "SQLite COUNT", "SQLite SUM"));
//        topicsMap.put("SQLite Triggers", Arrays.asList("SQLite Triggers", "After Insert", "After Update", "After Delete", "SQLite Drop Triggers"));
//        topicsMap.put("SQLite Keys", Arrays.asList("Primary key", "Foreign Key"));
//        topicsMap.put("Connectivity", Arrays.asList("Java SQLite", "PHP SQLite", "Python SQLite"));
//        return topicsMap;
//    }
//    // web tech topics set
//    public static Map<String, List<String>> htmlTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("HTML Tutorial", Arrays.asList("What is HTML ?", "HTML Text Editors", "HTML Building Blocks", "HTML tags", "HTML Attributes", "HTML Elements", "HTML Formatting", "HTML Heading", "HTML Paragraph", "HTML Phrase Tags", "HTML Anchor", "HTML Image", "HTML Table", "HTML List", "HTML Ordered List", "HTML Unordered List", "HTML Description List", "HTML Form", "HTML Form Input", "HTML Form Attribute", "HTML with CSS", "HTML Classes", "HTML Id", "HTML Iframes", "HTML JavaScript", "HTML Comments", "HTML File Path", "HTML Head", "HTML Layout", "HTML Layout Techniques", "HTML Responsive", "HTML Computercode", "HTML Entities", "HTML Symbols", "HTML Charset", "HTML URL Encode"));
//        topicsMap.put("HTML Attributes", Arrays.asList("HTML Global Attributes", "HTML Event Attributes"));
//        topicsMap.put("HTML Tags List", Arrays.asList("HTML <!DOCTYPE> Tag", "HTML <a> Tag", "HTML <abbr> Tag", "HTML <acronym> Tag", "HTML <address> Tag", "HTML <applet> Tag", "HTML <area> Tag", "HTML <article> Tag", "HTML <aside> Tag", "HTML <audio> Tag", "HTML <b> Tag", "HTML <base> Tag", "HTML <basefont> Tag", "HTML <bdi> Tag", "HTML <bdo> Tag", "HTML <big> Tag", "HTML <blockquote> Tag", "HTML <body> Tag", "HTML <br> Tag", "HTML <button> Tag", "HTML <canvas> Tag", "HTML <caption> Tag", "HTML <center> Tag", "HTML <cite> Tag", "HTML <code> Tag", "HTML <col> Tag", "HTML <colgroup> Tag", "HTML <data> Tag", "HTML <datalist> Tag", "HTML <dd> Tag", "HTML <del> Tag", "HTML <details> Tag", "HTML <dfn> Tag", "HTML <dialog> Tag", "HTML <dir> Tag", "HTML <div> Tag", "HTML <dl> Tag", "HTML <dt> Tag", "HTML <em> Tag", "HTML <embed> Tag", "HTML <fieldset> Tag", "HTML <figcaption> Tag", "HTML <figure> Tag", "HTML <font> Tag", "HTML <footer> Tag", "HTML <form> Tag", "HTML <frame> Tag", "HTML <frameset> Tag", "HTML <h1> to <h6> Tag", "HTML <head> Tag", "HTML <header> Tag", "HTML <hr> Tag", "HTML <html> Tag", "HTML <i> Tag", "HTML <iframe> Tag", "HTML <img> Tag", "HTML <input> Tag", "HTML <ins> Tag", "HTML <isindex> Tag", "HTML <kbd> Tag", "HTML <label> Tag", "HTML <legend> Tag", "HTML <li> Tag", "HTML <link> Tag", "HTML <main> Tag", "HTML <map> Tag", "HTML <map> Tag", "HTML <mark> Tag", "HTML <marquee> Tag", "HTML <menu> Tag", "HTML <meta> Tag", "HTML <meter> Tag", "HTML <nav> Tag", "HTML <noframes> Tag", "HTML <noscript> Tag", "HTML <object> Tag", "HTML <ol> Tag", "HTML <optgroup> Tag", "HTML <option> Tag", "HTML <output> Tag", "HTML <p> Tag", "HTML <param> Tag", "HTML <picture> Tag", "HTML <pre> Tag", "HTML <progress> Tag", "HTML <q> Tag", "HTML <rp> Tag", "HTML <rt> Tag", "HTML <ruby> Tag", "HTML <s> Tag", "HTML <samp> Tag", "HTML <script> Tag", "HTML <section> Tag", "HTML <select> Tag", "HTML <small> Tag", "HTML <source> Tag", "HTML <span> Tag", "HTML <strike> Tag", "HTML <strong> Tag", "HTML <style> Tag", "HTML <sub> Tag", "HTML <summary> Tag", "HTML <sup> Tag", "HTML <svg> Tag", "HTML <table> Tag", "HTML <tbody> Tag", "HTML <td> Tag", "HTML <template> Tag", "HTML <textarea> Tag", "HTML <tfoot> Tag", "HTML <th> Tag", "HTML <thead> Tag", "HTML <time> Tag", "HTML <title> Tag", "HTML <tr> Tag", "HTML <track> Tag", "HTML <tt> Tag", "HTML <u> Tag", "HTML <ul> Tag", "HTML <var> Tag", "HTML <video> Tag", "HTML <wbr> Tag"));
//        topicsMap.put("HTML API", Arrays.asList("HTML Drag & Drop", "HTML Geolocation", "HTML Web Storage", "HTML Web Workers", "HTML SS Event"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> cssTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("CSS Tutorial", Arrays.asList("What is CSS", "CSS Syntax", "CSS Selector", "How to Add CSS", "Inline CSS", "Internal CSS", "External CSS", "CSS Comments"));
//        topicsMap.put("CSS Properties", Arrays.asList("CSS Background", "CSS Border", "CSS border-radius", "CSS border-collapse", "CSS border-spacing", "CSS Display", "CSS Cursor", "CSS Buttons", "CSS Float", "CSS Font", "CSS Font-size", "CSS font-family", "CSS font-weight", "CSS font-stretch", "CSS Colors", "CSS Hover", "CSS Important", "CSS Background-color", "background-attachment", "background-size", "CSS Line Height", "CSS Margin", "CSS Opacity", "CSS filter", "CSS Images", "CSS Overflow", "CSS Padding", "CSS Position", "CSS Vertical Align", "CSS White Space", "CSS Width", "CSS height", "CSS Word Wrap", "Box-shadow CSS", "CSS Text-shadow", "CSS text-transform", "CSS Outline", "CSS Visibility", "CSS Counter", "CSS clearfix", "CSS icons", "CSS justify-content", "CSS text-decoration", "CSS Lists", "CSS nth selector", "CSS sticky", "CSS background-clip", "CSS checkbox style", "CSS letter-spacing", "CSS Navigation bar", "CSS overlay", "CSS root", "CSS Specificity", "CSS text-indent", "CSS text-stroke", "CSS Zoom", "CSS order", "CSS Descendant Selector", "CSS calc()", "CSS Clip", "CSS clip-path", "CSS Radio Button", "CSS Text Effects", "CSS text-align", "CSS Variables", "CSS content property", "CSS word-spacing", "CSS object-fit", "CSS object-position", "CSS columns", "CSS pointer-events", "CSS hyphens", "CSS font-variant", "CSS left property", "CSS right property", "CSS bottom property", "CSS top property", "word-break property", "CSS max-height", "CSS max-width", "CSS min-height", "CSS min-width", "CSS border-image", "CSS cubic-bezier", "CSS quotes", "CSS transform-origin", "CSS resize", "CSS text-overflow", "CSS writing-mode", "CSS background-origin", "CSS text-orientation", "CSS transition-delay"));
//        topicsMap.put("CSS Design", Arrays.asList("CSS Grid", "CSS Layout", "CSS Table", "CSS Box Model"));
//        topicsMap.put("CSS Advance", Arrays.asList("CSS Animation", "CSS @keyframes rule", "CSS pseudo-classes", "CSS Pseudo-elements", "CSS radial-gradient", "CSS translate", "CSS Gradient", "CSS z-index", "CSS minify", "CSS Loader", "CSS units", "CSS Combinators", "CSS masking", "CSS Transition", "CSS Arrow", "CSS FlexBox", "CSS flex property", "flex-basis property", "flex-grow property", "flex-shrink property", "flex-flow property", "CSS @Media Query", "CSS 2D Transforms", "CSS 3D Transforms", "CSS Aural Media"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> jsTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("JavaScript Tutorial", Arrays.asList("What is JavaScript ?", "External JavaScript"));
//        topicsMap.put("JavaScript Basics", Arrays.asList("JS Comment", "JS Variable", "JS Global Variable", "JS Data Types", "JS Operators", "JS If Statement", "JS Switch", "JS Loop", "JS Function"));
//        topicsMap.put("JavaScript Objects", Arrays.asList("JS Object", "JS Array", "JS String", "JS Date", "JS Math", "JS Number", "JS Boolean"));
//        topicsMap.put("JavaScript BOM", Arrays.asList("Browser Objects", "1) Window Object", "2) History Object", "3) Navigator Object", "4) Screen Object", "5) Document Object"));
//        topicsMap.put("JavaScript DOM", Arrays.asList("getElementById", "GetElementsByClassName()", "getElementsByName", "getElementsByTagName", "JS innerHTML property", "JS innerText property"));
//        topicsMap.put("JavaScript Validation", Arrays.asList("JS form validation", "JS email validation"));
//        topicsMap.put("JavaScript OOPs", Arrays.asList("JS Class", "JS Object", "JS Prototype", "JS constructor Method", "JS static Method", "JS Encapsulation", "JS Inheritance", "JS Polymorphism", "JS Abstraction"));
//        topicsMap.put("JavaScript Cookies", Arrays.asList("JS Cookies", "Cookie Attributes", "Cookie with multiple Name", "Deleting Cookies"));
//        topicsMap.put("JavaScript Events", Arrays.asList("JavaScript Events", "JavaScript addEventListener()", "JS onclick event", "JS dblclick event", "JS onload event", "JS onresize event"));
//        topicsMap.put("JavaScript Handling", Arrays.asList("JS Exception Handling", "JavaScript try-catch"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> phpTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("PHP Tutorial", Arrays.asList("What is PHP ?", "Install PHP", "PHP Code", "PHP Echo", "PHP Print", "PHP Echo vs Print", "PHP Variable", "PHP Variable Scope", "PHP $ and $$", "PHP Constants", "PHP Magic Constants", "PHP Data Types", "PHP Operators", "PHP Comments"));
//        topicsMap.put("Control Statement", Arrays.asList("PHP If else", "PHP Switch", "PHP For Loop", "PHP foreach loop", "PHP While Loop", "PHP Do While Loop", "PHP Break", "PHP Continue"));
//        topicsMap.put("PHP Functions", Arrays.asList("PHP Functions", "Parameterized Function", "PHP Call By Value", "PHP Call By Reference", "PHP Default Arguments", "PHP Variable Arguments", "PHP Recursive Function"));
//        topicsMap.put("PHP Arrays", Arrays.asList("PHP Array", "PHP Indexed Array", "PHP Associative Array", "Multidimensional Array", "PHP Array Functions"));
//        topicsMap.put("PHP Strings", Arrays.asList("PHP String", "PHP String Functions"));
//        topicsMap.put("PHP Math", Collections.singletonList("PHP Math Functions"));
//        topicsMap.put("PHP Form", Collections.singletonList("PHP Form: Get Post"));
//        topicsMap.put("PHP Include", Collections.singletonList("PHP include & require"));
//        topicsMap.put("State Management", Arrays.asList("PHP Cookie", "PHP Session"));
//        topicsMap.put("PHP File", Arrays.asList("PHP File Handling", "PHP Open File", "PHP Read File", "PHP Write File", "PHP Append File", "PHP Delete File"));
//        topicsMap.put("PHP Mail", Collections.singletonList("PHP Mail"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> bootstrapTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Bootstrap Tutorial", Arrays.asList("What is Bootstrap ?", "Bootstrap Example", "Bootstrap Container"));
//        topicsMap.put("Bootstrap Examples", Arrays.asList("Bootstrap Jumbotron", "Bootstrap Button", "Bootstrap Grid", "Bootstrap Table", "Bootstrap Form", "Bootstrap Alert", "Bootstrap Wells", "Bootstrap Badge & Label", "Bootstrap Panels", "Bootstrap Pagination", "Bootstrap Pager", "Bootstrap Image", "Bootstrap Glyphicon", "Bootstrap Carousel", "Bootstrap Progress Bar", "Bootstrap List Group", "Bootstrap Dropdown", "Bootstrap Collapse"));
//        topicsMap.put("Bootstrap Advance", Arrays.asList("Bootstrap Tabs/Pills", "Bootstrap Navbar", "Bootstrap Input Types", "Bootstrap Modals", "Bootstrap Popover", "Bootstrap Scrollspy"));
//        topicsMap.put("Bootstrap Utilities", Arrays.asList("Bootstrap Border", "Bootstrap Clearfix", "Bootstrap Close Icons", "Bootstrap Colors", "Bootstrap Flexbox", "Display property", "Image Replacement", "Invisible Content", "Bootstrap Position", "Responsive helpers", "Screen readers", "Bootstrap Sizing", "Bootstrap Spacing", "Bootstrap Typography", "Bootstrap CDN", "Bootstrap Spinners", "Bootstrap star rating", "Bootstrap Tooltip", "Bootstrap Alternatives", "Bootstrap picker"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> angularjsTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("AngularJS Tutorial", Arrays.asList("What is AngularJS ?", "AngularJS MVC", "AngularJS First App", "AngularJS Data Binding", "AngularJS Expressions", "AngularJS Directives", "AngularJS Controllers", "AngularJS Modules", "AngularJS Scopes", "AngularJS Dependency", "AngularJS Filters", "AngularJS Tables", "AngularJS Select", "AngularJS DOM", "AngularJS Forms", "AngularJS Validation", "AngularJS AJAX", "AngularJS Animation"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> jqueryTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("jQuery Tutorial", Arrays.asList("What is jQuery ?", "jQuery History", "jQuery Example", "jQuery Selectors"));
//        topicsMap.put("jQuery Effects", Arrays.asList("jQuery Effects", "jQuery hide()", "jQuery show()", "jQuery toggle()", "jQuery fadeIn()", "jQuery fadeOut()", "jQuery fadeToggle()", "jQuery fadeTo()", "jQuery slideDown()", "jQuery slideUp()", "jQuery slideToggle()", "jQuery animate()", "jQuery delay()"));
//        topicsMap.put("jQuery HTML/CSS", Arrays.asList("jQuery html()", "jQuery text()", "jQuery val()", "jQuery css()", "jQuery before()", "jQuery prepend()", "jQuery after()", "jQuery insertAfter()", "jQuery append()", "jQuery appendTo()", "jQuery clone()", "jQuery remove()", "jQuery empty()", "jQuery detach()", "jQuery scrollTop()", "jQuery attr()", "jQuery prop()", "jQuery offset()", "jQuery position()", "jQuery addClass()", "jQuery hasClass()", "jQuery toggleClass()", "jQuery width()", "jQuery height()", "jQuery innerWidth()", "jQuery innerHeight()", "jQuery outerWidth()", "jQuery outerHeight()", "jQuery wrap()", "jQuery wrapInner()", "jQuery wrapAll()", "jQuery unwrap()"));
//        topicsMap.put("jQuery Form", Arrays.asList("jQuery serialize()", "jQuery serializeArray()"));
//        topicsMap.put("jQuery Events", Arrays.asList("jQuery Events", "jQuery click()", "jQuery bind()", "jQuery unbind() method", "jQuery blur()", "jQuery focus()", "jQuery select()", "jQuery change()", "jQuery submit()", "jQuery keydown()", "jQuery keypress()", "jQuery keyup()", "jQuery mouseenter()", "jQuery mouseleave()", "jQuery hover()", "jQuery mousedown()", "jQuery mouseup()", "jQuery mouseover()", "jQuery mouseout()", "jQuery load()", "jQuery unload()", "jQuery delegate()"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> ajaxTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("AJAX Tutorial", Arrays.asList("What is AJAX ?", "Asynchronous", "Ajax Technologies", "XMLHttpRequest", "How AJAX Works?"));
//        topicsMap.put("Java AJAX", Arrays.asList("AJAX Example", "AJAX with Database", "Email Finder", "Comment Form", "Search Example"));
//        topicsMap.put("JSON AJAX", Collections.singletonList("AJAX JSON"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> laravelTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Laravel Tutorial", Arrays.asList("What is Laravel ?", "History of Laravel"));
//        topicsMap.put("Installation on Windows", Arrays.asList("XAMPP Installation", "Composer Installation", "Git Installation", "Creating First Laravel Project", "Laravel Application Structure"));
//        topicsMap.put("Laravel Routing", Arrays.asList("Laravel Basic Routing", "Routing Parameters", "Laravel Named Routes", "Laravel Middleware", "Laravel Route Groups"));
//        topicsMap.put("Laravel Controllers", Arrays.asList("Laravel Controllers", "Routing Controllers", "Resource Controllers", "Controller Middleware"));
//        topicsMap.put("Laravel Views", Arrays.asList("Laravel Views", "Passing data to views"));
//        topicsMap.put("Laravel Blade Template", Arrays.asList("Blade Template", "Template Inheritance", "Laravel Forms"));
//        topicsMap.put("Laravel Migration", Arrays.asList("Laravel Migration", "Migration Structure", "Generating Migrations", "Migration Commands"));
//        topicsMap.put("Laravel Database", Arrays.asList("Laravel Database", "Laravel Eloquent", "Laravel Relationship", "Laravel Tinker", "Laravel Crud"));
//        return topicsMap;
//    }
//
//
//    // app dev topics set
//    public static Map<String, List<String>> androidTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Android Tutorial", Arrays.asList("What is Android", "History and Version", "Android Architecture", "Core Building Blocks", "Android Emulator", "Install Android", "Setup Eclipse", "Hello Android example", "Internal Details", "Dalvik VM", "AndroidManifest.xml", "R.java", "Hide Title Bar", "Screen Orientation"));
//        topicsMap.put("Android Widgets", Arrays.asList("UI Widgets", "Working with Button", "Toast", "Custom Toast", "ToggleButton", "CheckBox", "Custom CheckBox", "RadioButton", "Dynamic RadioButton", "Custom RadioButton", "AlertDialog", "Spinner", "AutoCompleteTextView", "ListView", "Custom ListView", "RatingBar", "WebView", "SeekBar", "DatePicker", "TimePicker", "Analog and Digital", "ProgressBar", "Vertical ScrollView", "Horizontal ScrollView", "ImageSwitcher", "ImageSlider", "ViewStub", "TabLayout", "TabLayout with FrameLayout", "SearchView", "SearchView on Toolbar", "EditText with TextWatcher"));
//        topicsMap.put("Activity and Intents", Arrays.asList("Activity LifeCycle", "Implicit Intent", "Explicit Intent", "StartActivityForResult", "Share App Data"));
//        topicsMap.put("Android Fragments", Collections.singletonList("Android Fragments"));
//        topicsMap.put("Android Menu", Arrays.asList("Option Menu", "Context Menu", "Popup Menu"));
//        topicsMap.put("Android Service", Collections.singletonList("Android Service"));
//        topicsMap.put("Android AlarmManager", Collections.singletonList("Android AlarmManager"));
//        topicsMap.put("Android Storage", Arrays.asList("Android Preferences", "Internal Storage", "External Storage"));
//        topicsMap.put("Android SQLite", Arrays.asList("SQLite Tutorial", "SQLite Spinner"));
//        topicsMap.put("Android Multimedia", Arrays.asList("MediaPlayer: Audio", "VideoView: Video", "Recording Media"));
//        topicsMap.put("Android Telephony", Arrays.asList("TelephonyManager", "Get Call State", "Get Call State 2", "Simple Caller Talker", "Phone Call", "Send SMS", "Send Email"));
//        topicsMap.put("Android Device", Arrays.asList("Bluetooth Tutorial", "List Paired Devices", "WIFI"));
//        topicsMap.put("Camera Tutorial", Collections.singletonList("Camera Tutorial"));
//        topicsMap.put("Sensor Tutorial", Collections.singletonList("Sensor Tutorial"));
//        topicsMap.put("Android Graphics", Collections.singletonList("Android Graphics"));
//        topicsMap.put("Android Animation", Collections.singletonList("Android Animation"));
//        topicsMap.put("Android Web Service", Collections.singletonList("Android Web Service"));
//        topicsMap.put("Google Map", Arrays.asList("Android Google Map", "Current Location", "Search Location"));
//        topicsMap.put("Adding Ads", Arrays.asList("Android Google Admob", "1) Banner Ads", "2) Interstitial Ads"));
//        topicsMap.put("Android Social", Arrays.asList("Integrating Google Sign-In", "Integrating LinkedIn", "Integrating Twitter"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> dartTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Dart Tutorial", Arrays.asList("What is Dart ?", "Dart Features", "History Of Cloud", "Dart Installation", "Dart First Program", "Dart Basic Syntax", "Dart Comments", "Dart Keywords", "Dart Data Types", "Dart Variables", "Dart Operators"));
//        topicsMap.put("Dart Data Types", Arrays.asList("Dart Constants", "Dart Numbers", "Dart String", "Dart Lists", "Dart Sets", "Dart Map", "Dart Symbol", "Dart Runes", "Dart Enumeration"));
//        topicsMap.put("Control Flow Statement", Arrays.asList("Control Flow Statement", "Dart if Statement", "if else Statement", "if else-if Statement", "Switch case Statement", "Dart Loops", "Dart for Loop", "Dart For..in Loop", "Dart while Loop", "Dart do while Loop", "Dart Boolean"));
//        topicsMap.put("Dart Function", Arrays.asList("Dart Function", "Anonymous Function", "main() function", "Dart Recursion"));
//        topicsMap.put("Object Oriented", Arrays.asList("Object-Oriented Concepts", "Classes & Object", "Dart Constructor", "Dart this Keyword", "Dart static Keyword", "Dart super Keyword", "Dart Inheritance", "Super Constructor", "Dart Methods", "Method Overriding", "Getters & Setters", "Abstract Classes", "Dart Interfaces"));
//        topicsMap.put("Dart Advance Topics", Arrays.asList("Dart Exceptions", "Dart Typedef", "Dart Metadata", "Dart Collection", "Dart Generics", "Dart Packages", "Dart Libraries", "Dart Generators", "Dart Callable Classes", "Dart Isolates", "Dart Async", "Dart Concurrency", "Dart Unit Testing", "Dart HTML DOM"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> flutterTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Flutter Tutorial", Arrays.asList("What is Flutter ?", "Flutter Installation", "Flutter First Application", "Flutter Architecture", "Flutter vs React native"));
//        topicsMap.put("Dart Programming", Collections.singletonList("Dart Programming"));
//        topicsMap.put("Flutter Basics", Arrays.asList("Flutter Widgets", "Flutter Layouts", "Flutter Gestures", "State Management", "Flutter IDE"));
//        topicsMap.put("Flutter Widgets", Arrays.asList("Flutter Scaffold", "Flutter Container", "Flutter Row & Column", "Flutter Text", "Flutter TextField", "Flutter Buttons", "Flutter Stack", "Flutter Forms", "Flutter AlertDialog", "Flutter Icons", "Flutter Images", "Flutter Card", "Flutter Tabbar", "Flutter Drawer", "Flutter Lists", "Flutter GridView", "Flutter Toast", "Flutter Checkbox", "Flutter Radio Button", "Flutter Progress Bar", "Flutter Snackbar", "Flutter Tooltip", "Flutter Slider", "Flutter Switch", "Flutter Charts", "Bottom Navigation Bar", "Flutter Themes", "Flutter Table", "Flutter Calendar", "Flutter Animation"));
//        topicsMap.put("Flutter Routing", Collections.singletonList("Navigation & Routing"));
//        topicsMap.put("Advanced Concepts", Arrays.asList("Flutter Packages", "Flutter Splash Screen", "Flutter Google Maps", "Flutter Slivers", "Flutter REST API", "Flutter Database", "Flutter Testing"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> kotlinTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Kotlin Tutorial", Arrays.asList("What is Kotlin ?", "Environment Setup", "Hello World Program", "First Program Concept", "Environment Setup (IDE)", "First Program (IDE)", "Kotlin Variable", "Kotlin Data Type", "Kotlin Type Conversion", "Kotlin Operator", "Kotlin Input/Output", "Kotlin Comment"));
//        topicsMap.put("Control Flow", Arrays.asList("Kotlin if Expression", "Kotlin when Expression", "Kotlin for Loop", "Kotlin while Loop", "Kotlin Do while Loop", "Return and Jump", "Continue Structure"));
//        topicsMap.put("Function", Arrays.asList("Kotlin Function", "", "Recursion Function", "Default and Named Argument", "Kotlin Lambdas", "Higher order Function", "Kotlin Inline Function"));
//        topicsMap.put("Array", Collections.singletonList("Kotlin Array"));
//        topicsMap.put("String", Collections.singletonList("Kotlin String"));
//        topicsMap.put("Exception Handling", Arrays.asList("Exception Handling", "Kotlin Try Catch", "Multiple Catch Block", "Nested Try Block", "Kotlin Finally Block", "Kotlin Throw Keyword"));
//        topicsMap.put("Null Safety", Arrays.asList("Nullable Non Nullable Types", "Kotlin Smart Cast", "Unsafe and Safe Cast", "Kotlin Elvis Operator"));
//        topicsMap.put("Collections", Arrays.asList("Mutable Array", "Kotlin Collections", "List: listOf()", "mutableListOf()", "Kotlin ArrayList", "arrayListOf()", "Map: mapOf()", "Kotlin HashMap", "hashMapOf()", "mutableMapOf()", "Set: setOf()", "mutableSetOf()", "hashSetOf()"));
//        topicsMap.put("Annotations", Collections.singletonList("Kotlin Annotations"));
//        topicsMap.put("Reflection", Collections.singletonList("Kotlin Reflection"));
//        topicsMap.put("Kotlin OOPs", Arrays.asList("Class and Object", "Nested and Inner Class", "Kotlin Constructor", "Visibility Modifier", "Kotlin Inheritance", "Abstract Class", "Kotlin Interface", "Data Class", "Sealed Class", "Extension Function", "Kotlin Generics"));
//        topicsMap.put("Ranges", Arrays.asList("Integer type range", "Kotlin Working Ranges", "Kotlin Utility Function"));
//        topicsMap.put("Kotlin Android", Arrays.asList("Android TextView and EditText", "Kotlin Android Toast", "Android Button", "Android Custom Toast", "Android Explicit Intent", "Android Implicit Intent", "Android ListView", "Android AlertDialog", "Android Context Menu", "Android Custom ListView", "Android Options Menu", "Android Popup Menu", "Android WebView", "Kotlin Android SeekBar", "TabLayout with FrameLayout", "TabLayout with ViewPager", "DOM Parser", "SAX Parser", "XMLPullParser", "JSON Parsing using URL", "Android Media Player", "Android Video Player", "External Storage", "Internal Storage", "SharedPreferences", "SQLite Tutorial", "Android Notification", "Google reCAPTCHA", "Authentication - Google Login", "Google AdMob Banner Ads", "Google AdMob Interstitial Ads", "Google Map Current Location", "Google Map Fixed Location", "Google Map Search Location", "Android Web Service"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> swiftTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Swift Tutorial", Arrays.asList("What is Swift?", "History of Swift", "Swift Syntax", "Swift Datatypes", "Swift Variables", "Swift Constants", "Swift Literals", "Swift vs Objective C", "First Swift Program", "Swift Operators"));
//        topicsMap.put("Control Statement", Arrays.asList("Switch Statement", "if Statement", "if-else Statement", "if-else-if Statement", "Nested if-else Statement", "Gaurd Statement", "Break Statement", "Continue Statement", "Fallthrough Statement"));
//        topicsMap.put("Swift Loops", Arrays.asList("Swift Loops", "for-in loop", "while loop", "repeat-while loop"));
//        topicsMap.put("Swift String", Collections.singletonList("Swift Strings"));
//        topicsMap.put("Swift Functions", Arrays.asList("Swift Functions", "Swift Nested Function", "Parameter & Return Value", "Swift Recursion", "Function Overloading"));
//        topicsMap.put("Swift Collection", Arrays.asList("Swift Arrays", "Swift Dictionary", "Swift Sets", "Swift Closures", "Swift Typealias"));
//        topicsMap.put("Swift OOPs", Arrays.asList("Swift Enum", "Swift Structures", "Swift Classes", "Swift Properties", "Swift Inheritance", "Swift Methods", "Swift Subscripts", "Swift Deinitialization", "Swift Initialization", "Swift Typecasting", "Function vs Method", "Timers in Swift"));
//        return topicsMap;
//    }
//
//
//    // .net tech topics set
//    public static Map<String, List<String>> dotnetTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put(".NET Framwork", Arrays.asList(".NET Framwork", "CLR", "FCL"));
//        topicsMap.put("C# Tutorial", Arrays.asList("What is C# ?", "Java vs C#", "C# History", "C# Features", "C# Example", "C# Variables", "C# Data Types", "C# Operators", "C# Keywords"));
//        topicsMap.put("C# Control Statement", Arrays.asList("C# if-else", "C# switch", "C# For Loop", "C# While Loop", "C# Do-While Loop", "C# Break", "C# Continue", "C# Goto", "C# Comments"));
//        topicsMap.put("C# Function", Arrays.asList("C# Function", "C# Call By Value", "C# Call By Reference", "C# Out Parameter"));
//        topicsMap.put("C# Arrays", Arrays.asList("C# Arrays", "C# Array to Function", "C# Multidimensional Array", "C# Jagged Arrays", "C# Params", "C# Array class", "C# Command Line Args"));
//        topicsMap.put("C# Object Class", Arrays.asList("C# Object and Class", "C# Constructor", "C# Destructor", "C# this", "C# static", "C# static class", "C# static constructor", "C# Structs", "C# Enum"));
//        topicsMap.put("C# Properties", Collections.singletonList("C# Properties"));
//        topicsMap.put("C# Inheritance", Arrays.asList("C# Inheritance", "C# Aggregation"));
//        topicsMap.put("C# Polymorphism", Arrays.asList("C# Member Overloading", "C# Method Overriding", "C# Base", "C# Polymorphism", "C# Sealed"));
//        topicsMap.put("C# Abstraction", Arrays.asList("C# Abstract", "C# Interface"));
//        topicsMap.put("C# Namespace", Arrays.asList("C# Namespaces", "C# Access Modifiers", "C# Encapsulation"));
//        topicsMap.put("C# Strings", Collections.singletonList("C# Strings"));
//        topicsMap.put("C# Exception Handling", Arrays.asList("C# Exception Handling", "C# try/catch", "C# finally", "C# Custom Exception", "C# checked unchecked", "C# SystemException"));
//        topicsMap.put("C# File IO", Arrays.asList("C# FileStream", "C# StreamWriter", "C# StreamReader", "C# TextWriter", "C# TextReader", "C# BinaryWriter", "C# BinaryReader", "C# StringWriter", "C# StringReader", "C# FileInfo", "C# DirectoryInfo", "C# Serialization", "C# Deserialization", "C# System.IO"));
//        topicsMap.put("C# Collection", Arrays.asList("C# Collections", "C# List<T>", "C# HashSet<T>", "C# SortedSet<T>", "C# Stack<T>", "C# Queue<T>", "C# LinkedList<T>", "C# Dictionary<K,V>", "C# SortedDictionary<K,V>", "C# SortedList<K,V>"));
//        topicsMap.put("C# Generics", Collections.singletonList("C# Generics"));
//        topicsMap.put("C# Delegates", Collections.singletonList("C# Delegates"));
//        topicsMap.put("C# Reflection", Collections.singletonList("C# Reflection"));
//        topicsMap.put("C# Anonymous Function", Collections.singletonList("Anonymous Function"));
//        topicsMap.put("C# MultiThreading", Arrays.asList("C# Multithreading", "C# Thread Life Cycle", "C# Thread class", "C# Main Thread", "C# Thread Example", "C# Thread Sleep", "C# Thread Abort", "C# Thread Join", "C# Thread Name", "C# ThreadPriority"));
//        topicsMap.put("C# Synchronization", Collections.singletonList("C# Synchronization"));
//        topicsMap.put("C# Web Service", Collections.singletonList("Web Services in C#"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> aspdotnetTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("ASP.NET Tutorial", Arrays.asList("ASP .NET Introduction", "ASP.NET Life Cycle"));
//        topicsMap.put("ASP.NET Web Forms", Arrays.asList("ASP.NET WF Introduction", "ASP.NET WF Features", "ASP.NET WF Project", "ASP.NET WF Example", "ASP.NET Server Controls", "ASP.NET Label", "ASP.NET TextBox", "ASP.NET Button", "ASP.NET HyperLink", "ASP.NET RadioButton", "ASP.NET Calender", "ASP.NET CheckBox", "ASP.NET LinkButton", "ASP.NET FileUpload", "Multiple FileUpload", "ASP.NET Download File", "ASP.NET Cookie", "ASP.NET Session", "ASP.NET DropDownList", "ASP.NET DataList", "ASP.NET DataGrid", "WF User Registration", "WF Events Handling", "WF Authentication", "WF Model Binding", "HTML Server Controls"));
//        topicsMap.put("ASP.NET Validation", Arrays.asList("CompareValidator", "RangeValidator", "RegularExpressionValidator", "RequiredFieldValidator", "ValidationSummary"));
//        topicsMap.put("ASP.NET MVC", Arrays.asList("ASP.NET MVC", "MVC Project", "MVC Controller", "MVC Actions", "MVC Action Selectors", "MVC Action Filters", "MVC Model", "MVC Model Binding", "MVC View", "MVC Validation", "MVC Entity Framework", "MVC Authentication", "MVC Bootstrap", "MVC Routing", "MVC Scaffolding", "MVC ViewBag"));
//        topicsMap.put("ASP.NET Razor", Arrays.asList("ASP.NET Razor", "Razor Code Expressions", "Razor Code Blocks", "Razor Control Structures", "Razor HTML Helpers", "Razor Partial Views"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> csharpTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put(".NET Framwork", Arrays.asList(".NET Framwork", "CLR", "FCL"));
//        topicsMap.put("C# Tutorial", Arrays.asList("What is C# ?", "Java vs C#", "C# History", "C# Features", "C# Example", "C# Variables", "C# Data Types", "C# Operators", "C# Keywords"));
//        topicsMap.put("C# Control Statement", Arrays.asList("C# if-else", "C# switch", "C# For Loop", "C# While Loop", "C# Do-While Loop", "C# Break", "C# Continue", "C# Goto", "C# Comments"));
//        topicsMap.put("C# Function", Arrays.asList("C# Function", "C# Call By Value", "C# Call By Reference", "C# Out Parameter"));
//        topicsMap.put("C# Arrays", Arrays.asList("C# Arrays", "C# Array to Function", "C# Multidimensional Array", "C# Jagged Arrays", "C# Params", "C# Array class", "C# Command Line Args"));
//        topicsMap.put("C# Object Class", Arrays.asList("C# Object and Class", "C# Constructor", "C# Destructor", "C# this", "C# static", "C# static class", "C# static constructor", "C# Structs", "C# Enum"));
//        topicsMap.put("C# Properties", Collections.singletonList("C# Properties"));
//        topicsMap.put("C# Inheritance", Arrays.asList("C# Inheritance", "C# Aggregation"));
//        topicsMap.put("C# Polymorphism", Arrays.asList("C# Member Overloading", "C# Method Overriding", "C# Base", "C# Polymorphism", "C# Sealed"));
//        topicsMap.put("C# Abstraction", Arrays.asList("C# Abstract", "C# Interface"));
//        topicsMap.put("C# Namespace", Arrays.asList("C# Namespaces", "C# Access Modifiers", "C# Encapsulation"));
//        topicsMap.put("C# Strings", Collections.singletonList("C# Strings"));
//        topicsMap.put("C# Exception Handling", Arrays.asList("C# Exception Handling", "C# try/catch", "C# finally", "C# Custom Exception", "C# checked unchecked", "C# SystemException"));
//        topicsMap.put("C# File IO", Arrays.asList("C# FileStream", "C# StreamWriter", "C# StreamReader", "C# TextWriter", "C# TextReader", "C# BinaryWriter", "C# BinaryReader", "C# StringWriter", "C# StringReader", "C# FileInfo", "C# DirectoryInfo", "C# Serialization", "C# Deserialization", "C# System.IO"));
//        topicsMap.put("C# Collection", Arrays.asList("C# Collections", "C# List<T>", "C# HashSet<T>", "C# SortedSet<T>", "C# Stack<T>", "C# Queue<T>", "C# LinkedList<T>", "C# Dictionary<K,V>", "C# SortedDictionary<K,V>", "C# SortedList<K,V>"));
//        topicsMap.put("C# Generics", Collections.singletonList("C# Generics"));
//        topicsMap.put("C# Delegates", Collections.singletonList("C# Delegates"));
//        topicsMap.put("C# Reflection", Collections.singletonList("C# Reflection"));
//        topicsMap.put("C# Anonymous Function", Collections.singletonList("Anonymous Function"));
//        topicsMap.put("C# MultiThreading", Arrays.asList("C# Multithreading", "C# Thread Life Cycle", "C# Thread class", "C# Main Thread", "C# Thread Example", "C# Thread Sleep", "C# Thread Abort", "C# Thread Join", "C# Thread Name", "C# ThreadPriority"));
//        topicsMap.put("C# Synchronization", Collections.singletonList("C# Synchronization"));
//        topicsMap.put("C# Web Service", Collections.singletonList("Web Services in C#"));
//        return topicsMap;
//    }
//
//
//    // software dev topics set
//    public static Map<String, List<String>> pythonTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Python Tutorial", Arrays.asList("What is Python ?","Python Features","Python History","Python Applications","Python Install","Python Example","Python Variables","Python Data Types","Python Keywords","Python Literals","Python Operators","Python Comments","Python If else","Python Loops","Python For Loop","Python While Loop","Python Break","Python Continue","Python Pass","Python Strings","Python Lists","Python Tuples","Python Sets","Python Dictionary","Python Functions","Python Built-in Functions","Python Lambda Functions","Python Files I/O","Python Modules","Python Exceptions","Python Date","Python Regex","Python Sending Email","Read CSV File","Write CSV File","Read Excel File","Write Excel File","Python Assert","Python List Comprehension","Python Collection Module","Python Math Module","Python OS Module","Python Random Module","Python Statistics Module","Python Sys Module","Python IDEs","Python Arrays","Command Line Arguments","Python Magic Method","Python Stack & Queue","PySpark MLlib","Python Decorator","Python Generators","Web Scraping Using Python","Python JSON","Python Itertools","Python Multiprocessing","How to Calculate Distance between Two Points using GEOPY","Gmail API in Python","How to Plot the Google Map using folium package in Python","Grid Search in Python","Python High Order Function","nsetools in Python","Python program to find the nth Fibonacci Number","Python OpenCV object detection","Second Largest Number in Python","Python SimpleImputer module"));
//        topicsMap.put("Python OOPs", Arrays.asList("Python OOPs Concepts","Python Object Class","Python Constructors","Python Inheritance","Abstraction in Python"));
//        topicsMap.put("Python MySQL", Arrays.asList("Environment Setup","Database Connection","Creating New Database","Creating Tables","Insert Operation","Read Operation","Update Operation","Join Operation","Performing Transactions"));
//        topicsMap.put("Python MongoDB", Collections.singletonList("Python MongoDB"));
//        topicsMap.put("Python SQLite", Collections.singletonList("Python SQLite"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> programmingincTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("C tutorial", Arrays.asList("What is C language ?","History of C ","Features of C","How to install C","First C Program","Compilation Process in C","printf scanf","Variables in C","Data Types in c","Keywords in c","C Identifiers","C Operators","C Comments","C Format Specifier","C Escape Sequence","ASCII value in C","Constants in C","Literals in C","Tokens in C","C Boolean","Static in C","Programming Errors in C","Compile time vs Runtime","Conditional Operator in C","Bitwise Operator in C","2s complement in C","C Fundamental Test"));
//        topicsMap.put("C Control Statements", Arrays.asList("C if-else","C switch","if-else vs switch","C Loops","C do-while loop","C while loop","C for loop","Nested Loops in C","Infinite Loop in C","C break","C continue","C goto","Type Casting","C Control Statement Test"));
//        topicsMap.put("C Functions", Arrays.asList("What is function ?","Call: Value & Reference","Recursion in c","Storage Classes","C Functions Test"));
//        topicsMap.put("C Array", Arrays.asList("1-D Array","2-D Array","Return an Array in C","Array to Function","C Array Test"));
//        topicsMap.put("C Pointers", Arrays.asList("C pointers","C Pointer to Pointer","C Pointer Arithmetic","Dangling Pointers in C","sizeof() operator in C","const Pointer in C","void pointer in C","C Dereference Pointer","Null Pointer in C","C Function Pointer","Function pointer as argument in C","C Pointers Test"));
//        topicsMap.put("C Dynamic Memory", Collections.singletonList("Dynamic memory"));
//        topicsMap.put("C String", Arrays.asList("String in C","C gets() & puts()","C String Functions","C strlen()","C strcpy()","C strcat()","C strcmp()","C strrev()","C strlwr()","C strupr()","C strstr()","C String Test"));
//        topicsMap.put("C Math", Collections.singletonList("C Math Functions"));
//        topicsMap.put("C File Handling", Arrays.asList("C File Handling","C fprintf() fscanf()","C fputc() fgetc()","C fputs() fgets()","C fseek()","C rewind()","C ftell()"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> cplusplusTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("C++ Tutorials", Arrays.asList("C++ Tutorial","C vs C++","C++ History","C++ Features","C++ Installation ","C++ Program","C++ cout, cin, endl","C++ Variable","C++ Data types","C++ Keywords","C++ Operators","C++ Identifiers","C++ Expression"));
//        topicsMap.put("C++ Control Statement", Arrays.asList("C++ if-else","C++ switch","C++ For Loop","C++ While Loop","C++ Do-While Loop","C++ Break Statement","C++ Continue Statement","C++ Comments"));
//        topicsMap.put("C++ Functions", Arrays.asList("C++ Functions", "Call by value & reference", "C++ Recursion","C++ Storage Classes"));
//        topicsMap.put("C++ Arrays", Arrays.asList("What is C++ Arrays ?", "C++ Array to Function", "Multidimensional Arrays"));
//        topicsMap.put("C++ Pointers", Arrays.asList("C++ Pointers", "sizeof() operator in C++","C++ Array of Pointers","C++ Void Pointer","C++ References","Reference vs Pointer","Function Pointer in C++","C++ Memory Management","malloc() vs new in C++","free vs delete in C++"));
//        topicsMap.put("C++ Object Class", Arrays.asList("C++ OOPs Concepts","C++ Object Class","C++ Constructor","C++ Copy Constructor","C++ Destructor","C++ this Pointer","C++ static","C++ Structs","C++ Enumeration","C++ Friend Function","C++ Math Functions"));
//        topicsMap.put("C++ Inheritance", Arrays.asList("C++ Inheritance","C++ Aggregation"));
//        topicsMap.put("C++ Polymorphism", Arrays.asList("C++ Polymorphism","C++ Overloading","C++ Overriding","C++ Virtual Function"));
//        topicsMap.put("C++ Abstraction", Arrays.asList("C++ Interfaces", "C++ Data Abstraction"));
//        topicsMap.put("C++ Namespace", Collections.singletonList("C++ Namespace"));
//        topicsMap.put("C++ strings", Collections.singletonList("C++ Strings"));
//        topicsMap.put("C++ Exceptions", Arrays.asList("C++ Exception Handling", "C++ try/catch","C++ User-Defined"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> rubyTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Ruby Tutorial", Arrays.asList("Ruby Tutorial","What is Ruby ","Ruby Features","Ruby vs Python","Ruby Installation","Hello Ruby Program","Ruby Operators","Ruby Variables","Ruby Data Types"));
//        topicsMap.put("Control Statements", Arrays.asList("Ruby if-else","Ruby case","Ruby for","Ruby while do-while","Ruby Until","Ruby break next","Ruby redo retry","Ruby Comments"));
//        topicsMap.put("Ruby Core", Arrays.asList("Ruby Object Class","Ruby Methods","Ruby Blocks","Ruby Modules","Ruby Strings","Ruby Arrays","Ruby Hashes","Ruby Date & Time","Ruby Ranges","Ruby Iterators","Ruby File I/O","Ruby Directories","Ruby Exceptions"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> golangTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Go Language Tutorial", Arrays.asList("Go Tutorial","Go Installation","Go Hello World","Go Data Types","Go Package"));
//        topicsMap.put("Go Controls", Arrays.asList("Go if-else","Go Switch","Go For","Go For Range","Go Goto","Go Break","Go Continue","Go Comments","Go Constants","Go Type Casting"));
//        topicsMap.put("Go Functions", Arrays.asList("Go Functions","Go Recursion","Go Closure"));
//        topicsMap.put("Go Arrays", Arrays.asList("Go Array","Go Slice","Go Command Args"));
//        topicsMap.put("Go Strings", Arrays.asList("Go String", "Go Regex"));
//        topicsMap.put("Go Types", Arrays.asList("Go Struct", "Go Interface","Go Pointer","Go Reflect","Go Rune"));
//        topicsMap.put("Go Map", Collections.singletonList("Go Map"));
//        topicsMap.put("Go Error", Arrays.asList("Go Error","Go Recover","Go Defer","Go Panic"));
//        topicsMap.put("Go Time", Arrays.asList("Go Time", "Go Epoch","Go Tickers"));
//        topicsMap.put("Go Concurrency", Arrays.asList("Go Concurrency", "Go Race","Go Mutex","Go Atomic Variable","Go Channel","Go Worker Pools"));
//        return topicsMap;
//    }
//
//
//    // digital marketing topics set
//    public static Map<String, List<String>> contentmarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> mobilemarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> videomarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> emailmarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> seoTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> socialmediamarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> websitemarketingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
//        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
//        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
//        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
//        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
//        return topicsMap;
//    }
//    // software testing topics set
//    public static Map<String, List<String>> softwaretestingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Software Testing", Arrays.asList("What is Software Testing ?", "Software Testing Principles", "Software Development Life Cycle", "Software Testing Life Cycle", "Types of Software Testing", "Levels of Testing", "Test Maturity Model"));
//        topicsMap.put("SDLC models", Arrays.asList("Waterfall model", "Spiral Model", "Hybrid Model", "Prototype Model", "V-model"));
//        topicsMap.put("Types of Testing", Arrays.asList("Manual Testing", "Automation Testing"));
//        topicsMap.put("Types of Manual", Arrays.asList("White Box Testing", "Black Box Testing", "Grey Box Testing"));
//        topicsMap.put("White Box Techniques", Arrays.asList("Data Flow Testing", "Control Flow Testing", "Branch Coverage Testing", "Statement Coverage Testing", "Decision Coverage Testing"));
//        topicsMap.put("Black Box Techniques", Arrays.asList("Decision Table", "All-pair Testing", "Cause-Effect Testing", "State Transition", "Use Case"));
//        topicsMap.put("Types of Black Box", Arrays.asList("Functional Testing", "Non-Functional Testing"));
//        topicsMap.put("Types of Functional", Arrays.asList("Unit Testing", "Integration Testing", "System Testing"));
//        topicsMap.put("Types of Non-functional", Arrays.asList("Performance Testing", "Usability Testing", "Compatibility Testing"));
//        topicsMap.put("Test case development", Arrays.asList("Testing Documentation", "Test Scenario", "Test Case"));
//        topicsMap.put("Testing Techniques", Arrays.asList("Error Guessing", "Equivalence Portioning", "Boundary Value analysis"));
//        topicsMap.put("Test Management", Arrays.asList("Test case review process", "Requirement Traceability Matrix"));
//        topicsMap.put("Defect Tracking", Arrays.asList("Bug in Software Testing", "Bug Life cycle", "Severity & Priority", "Test Environment", "Defect Management Process"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> seleniumTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Selenium Tutorial", Arrays.asList("What is Selenium ?", "Basic Terminology", "Selenium Features", "Selenium Limitations", "Selenium vs QTP", "Selenium Tool Suite"));
//        topicsMap.put("Selenium IDE", Arrays.asList("Selenium IDE", "IDE-Installation", "IDE-Features", "IDE-First Test Case", "IDE-Login Test", "IDE-Commands", "IDE-Creating Test Cases", "IDE- Locating Strategies"));
//        topicsMap.put("Selenium WebDriver", Arrays.asList("Selenium WebDriver", "WebDriver Vs RC", "WebDriver-Installation", "First Test Case", "WebDriver Commands", "Running Test on Chrome", "Running Test on Firefox", "Running Test on IE", "Running Test on Safari", "Locating Strategies", "Handling Drop-Downs", "WebDriver-Drag and Drop", "WebDriver-Handling Alerts", "Scrolling a Web Page", "WebDriver - Browser Commands", "WebDriver - Navigation Commands", "WebDriver - WebElement Commands", "Handling Radio Buttons", "Handling Checkbox", "Selenium Assertions", "Selenium Grid"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> qualityassuranceTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Quality Assurance", Collections.singletonList("What is Quality Assurance ?"));
//        topicsMap.put("Software Testing", Arrays.asList("Testing Introduction", "Software Development Life Cycle", "Software Testing Life Cycle", "Quality Assurance vs Quality Control"));
//        topicsMap.put("Black Box Testing", Arrays.asList("Black Box Testing", "Decision Table", "Boundary Value", "State Transition", "All-pair Testing", "Cause-Effect", "Equivalence Portioning", "Error Guessing", "Use Case"));
//        topicsMap.put("White Box Testing", Arrays.asList("White Box Testing", "Data Flow Testing", "Control Flow Testing", "Branch Testing", "Statement Testing", "Decision Testing", "Grey Box Testing", "Visual Testing"));
//        topicsMap.put("Types of Testing", Arrays.asList("Manual Testing", "Automation Testing", "System Testing", "Smoke Testing", "Sanity Testing", "Smoke Testing vs Sanity Testing"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> manualtestingTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Software Testing", Arrays.asList("What is Software Testing ?", "Software Testing Principles", "Software Development Life Cycle", "Software Testing Life Cycle", "Types of Software Testing", "Levels of Testing", "Test Maturity Model"));
//        topicsMap.put("SDLC models", Arrays.asList("Waterfall model", "Spiral Model", "Hybrid Model", "Prototype Model", "V-model"));
//        topicsMap.put("Types of Testing", Arrays.asList("Manual Testing", "Automation Testing"));
//        topicsMap.put("Types of Manual", Arrays.asList("White Box Testing", "Black Box Testing", "Grey Box Testing"));
//        topicsMap.put("White Box Techniques", Arrays.asList("Data Flow Testing", "Control Flow Testing", "Branch Coverage Testing", "Statement Coverage Testing", "Decision Coverage Testing"));
//        topicsMap.put("Black Box Techniques", Arrays.asList("Decision Table", "All-pair Testing", "Cause-Effect Testing", "State Transition", "Use Case"));
//        topicsMap.put("Types of Black Box", Arrays.asList("Functional Testing", "Non-Functional Testing"));
//        topicsMap.put("Types of Functional", Arrays.asList("Unit Testing", "Integration Testing", "System Testing"));
//        topicsMap.put("Types of Non-functional", Arrays.asList("Performance Testing", "Usability Testing", "Compatibility Testing"));
//        topicsMap.put("Test case development", Arrays.asList("Testing Documentation", "Test Scenario", "Test Case"));
//        topicsMap.put("Testing Techniques", Arrays.asList("Error Guessing", "Equivalence Portioning", "Boundary Value analysis"));
//        topicsMap.put("Test Management", Arrays.asList("Test case review process", "Requirement Traceability Matrix"));
//        topicsMap.put("Defect Tracking", Arrays.asList("Bug in Software Testing", "Bug Life cycle", "Severity & Priority", "Test Environment", "Defect Management Process"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> appiumTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Appium Tutorial", Collections.singletonList("Appium Tutorial"));
//        return topicsMap;
//    }
//    public static Map<String, List<String>> cybersecurityTopicsMap() {
//        Map<String, List<String>> topicsMap = new HashMap<>();
//        topicsMap.put("Cyber Security Tutorial", Arrays.asList("What is Cyber Security ?", "Cyber Security History", "Cyber Security Goals", "Types of Cyber Attacks", "Types of Cyber Attackers", "Cyber Security Principles", "Data Security Considerations", "Cyber Security Technology", "Threats to E-Commerce", "Cyber Security Policies", "Cyber Security Standards", "Digital Signature", "Cyber Security Tools", "Cyber Security Challenges", "Security Risk Analysis", "Cyber Security Certification", "MITM Attacks", "Secure e-mail service provider", "Birthday Attack in Cryptography", "Implementing Atbash Cipher", "Anti-Keylogger", "Advantages and Disadvantages of Cyber Security", "Encryption Algorithms in Cryptography", "Blowfish Algorithm in Cryptography", "SHA Algorithm in Cryptography", "What is AES", "What is MD5 Algorithm", "What is SHA- 256 Algorithm", "What is DES", "Emerging Cyber Security threats", "Impact of IOT on Cyber Security"));
//        return topicsMap;
//    }
//}
package com.example.learning.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopicsDataProvider {
    public static Map<String, List<String>> getTopicsForCourse(String course) {
        Map<String, List<String>> topicsMap = new HashMap<>();
        switch (course) {
            case "Cloud Computing":
                return cloudcomputingTopicsMap();
            case "Azure":
                return azureTopicsMap();
            case "AWS":
                return awsTopicsMap();
            case "gCloud":
                return gcloudTopicsMap();
            case "SQL":
                return sqlTopicsMap();
            case "MySQL":
                return mysqlTopicsMap();
            case "Oracle":
                return oracleTopicsMap();
            case "MongoDB":
                return mongodbTopicsMap();
            case "SQLite":
                return sqliteTopicsMap();
            case "HTML":
                return htmlTopicsMap();
            case "CSS":
                return cssTopicsMap();
            case "JS":
                return jsTopicsMap();
            case "PHP":
                return phpTopicsMap();
            case "Bootstrap":
                return bootstrapTopicsMap();
            case "Angular.JS":
                return angularjsTopicsMap();
            case "Cyber Security":
                return cybersecurityTopicsMap();
            case "jQuery":
                return jqueryTopicsMap();
            case "AJAX":
                return ajaxTopicsMap();
            case "Laravel":
                return laravelTopicsMap();
            case "Android":
                return androidTopicsMap();
            case "Dart":
                return dartTopicsMap();
            case "Flutter":
                return flutterTopicsMap();
            case "Kotlin":
                return kotlinTopicsMap();
            case "Swift":
                return swiftTopicsMap();
            case ".NET":
                return dotnetTopicsMap();
            case "C#":
                return csharpTopicsMap();
            case "Python":
                return pythonTopicsMap();
            case "Programming in C":
                return programmingincTopicsMap();
            case "C++":
                return cplusplusTopicsMap();
            case "Ruby":
                return rubyTopicsMap();
            case "Golang":
                return golangTopicsMap();
            case "Content Marketing":
                return contentmarketingTopicsMap();
            case "Mobile Marketing":
                return mobilemarketingTopicsMap();
            case "Video Marketing":
                return videomarketingTopicsMap();
            case "Email Marketing":
                return emailmarketingTopicsMap();
            case "SEO":
                return seoTopicsMap();
            case "Social Media Marketing":
                return socialmediamarketingTopicsMap();
            case "Website Marketing":
                return websitemarketingTopicsMap();
            case "Software Testing":
                return softwaretestingTopicsMap();
            case "Selenium":
                return seleniumTopicsMap();
            case "Quality Assurance":
                return qualityassuranceTopicsMap();
            case "Appium":
                return appiumTopicsMap();
            default:
                return topicsMap;
        }
    }
    //    cloud technologies topics set
    public static Map<String, List<String>> cloudcomputingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "Private Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        return topicsMap;
    }
    public static Map<String, List<String>> azureTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Microsoft Azure Tutorial", Arrays.asList("What is Azure ?", "Cloud Computing Overview", "Azure Portal"));
        topicsMap.put("Azure Storage Service", Arrays.asList("Storage Service", "Azure Storage Account", "Azure Blob Storage", "Creating a Container", "Blob Configuration", "Azure Storage Security", "Azure File Storage", "Table & Queue Storage", "Azure Disk storage", "Storage Monitoring", "Storage Resource Tools"));
        topicsMap.put("Network Services", Arrays.asList("Azure Network Service", "Azure Virtual Network", "Azure Network Security", "Azure Network Interface", "Availability Zones & Sets", "Azure Load Balancer", "Azure VNet Connectivity"));
        topicsMap.put("Compute Services", Arrays.asList("Azure Compute Service", "Azure Virtual Machines", "Azure VM Storage", "Virtual Machine Scale Set", "Azure Backup", "Azure VM Security", "Azure VM Monitoring", "Azure Cloud Service"));
        topicsMap.put("App Services", Arrays.asList("Azure App Services", "Azure Web App", "Azure Mobile App", "Azure Notification Hub", "Azure API Apps", "App Service Backup", "App Service Security", "App Service Monitoring", "Azure CDN", "Azure Media Service"));
        topicsMap.put("Database Services", Arrays.asList("Azure Database Service", "Azure SQL Database", "SQL database Configuration", "SQL Managed Instance", "Azure COSMOS DB", "Azure Data Factory", "SQL Data Warehouse"));
        return topicsMap;
    }
    public static Map<String, List<String>> awsTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("AWS Tutorial", Arrays.asList("What is AWS ?", "History of AWS", "AWS Features", "Global Infrastructure", "AWS Free Tier"));
        topicsMap.put("AWS IAM", Arrays.asList("AWS IAM", "AWS SAML", "IAM Identities", "IAM Roles", "IAM Roles Use Cases", "Creating IAM Roles"));
        topicsMap.put("Storage Services", Arrays.asList("AWS S3", "AWS S3 Concepts", "Creating S3 Bucket", "AWS Storage Classes", "AWS Versioning", "Cross Region Replication", "Lifecycle Management", "CloudFront CDN", "Creating CloudFront CDN", "Storage Gateway", "AWS Snowball", "S3 Transfer Acceleration"));
        topicsMap.put("EC2 - Backbone of AWS", Arrays.asList("AWS EC2", "AWS EBS", "Creating an EC2 instance", "EBS Volume", "Security Group", "AWS AMI", "Creating an AMI", "AWS Load Balancing", "Creating Load Balancer", "AWS Lambda", "Creating a Lambda", "CloudWatch EC2", "AWS Bash Script"));
        topicsMap.put("AWS Route53", Arrays.asList("What is DNS ?"));
        topicsMap.put("Database Services", Arrays.asList("Relational Database", "Non Relational Database", "AWS Elasticache", "Creating an RDS Instance", "AWS DynamoDB", "AWS Aurora", "AWS Redshift"));
        topicsMap.put("Application Services", Arrays.asList("AWS SQS", "AWS SWF", "AWS SNS", "Elastic Transcoder", "API Gateway", "AWS Kinesis"));
        return topicsMap;
    }
    public static Map<String, List<String>> gcloudTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Google Cloud Platform Tutorial" , Arrays.asList("GPC Tutorial"));
        return topicsMap;
    }

    // database tutorial topics set
    public static Map<String, List<String>> sqlTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("SQL Tutorial", Arrays.asList("What is SQL ?", "SQL Syntax", "SQL Data Types", "SQL Operators"));
        topicsMap.put("SQL Database", Arrays.asList("SQL CREATE Database", "SQL DROP Database", "SQL RENAME Database", "SQL SELECT Database"));
        topicsMap.put("SQL Table", Arrays.asList("What is Table", "SQL CREATE Table", "SQL DROP Table", "SQL DELETE  Table", "SQL RENAME Table", "SQL TRUNCATE Table", "SQL COPY Table", "SQL TEMP Table", "SQL ALTER Table"));
        topicsMap.put("SQL Select", Arrays.asList("SELECT Statement", "SQL SELECT UNIQUE", "SQL SELECT DISTINCT", "SQL SELECT COUNT", "SQL SELECT TOP", "SQL SELECT FIRST", "SQL SELECT LAST", "SQL SELECT RANDOM", "SQL SELECT IN", "SQL SELECT Multiple", "SQL SELECT DATE", "SQL SELECT SUM", "SQL SELECT NULL"));
        topicsMap.put("SQL Clause", Arrays.asList("SQL WHERE", "SQL AND", "SQL OR", "SQL WITH",
                "SQL AS", "SQL HAVING Clause"));
        topicsMap.put("SQL Order By", Arrays.asList("ORDER BY Clause", "ORDER BY ASC", "ORDER BY DESC", "ORDER BY RANDOM", "ORDER BY LIMIT", "ORDER BY Multiple Cols"));
        topicsMap.put("SQL Insert", Arrays.asList("INSERT Statement", "INSERT Multiple Rows"));
        topicsMap.put("SQL Update", Arrays.asList("UPDATE Statement", "SQL UPDATE JOIN", "SQL UPDATE DATE"));
        topicsMap.put("SQL Delete", Arrays.asList("DELETE Statement", "SQL DELETE TABLE", "SQL DELETE ROW", "SQL DELETE All Rows", "DELETE Duplicate Rows", "SQL DELETE DATABASE", "SQL DELETE VIEW", "SQL DELETE JOIN"));
        topicsMap.put("SQL Join", Arrays.asList("SQL JOIN", "SQL Outer Join", "SQL Left Join", "SQL Right Join", "SQL Full Join", "SQL Cross Join"));
        topicsMap.put("SQL Keys", Arrays.asList("Primary Key", "Foreign Key", "Composite Key", "Unique Key", "Alternate Key"));
        topicsMap.put("SQL String Functions", Arrays.asList("SQL String Functions", "LTRIM Function in SQL", "UPPER Function in SQL", "RTRIM Function in SQL"));
        return topicsMap;
    }
    public static Map<String, List<String>> mysqlTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("MySQL Tutorial", Arrays.asList("What is MySQL ?", "MySQL Features", "MySQL Versions", "MySQL Data Types", "MySQL Variable", "Install MySQL", "MySQL Connection"));
        topicsMap.put("MySQL Workbench", Arrays.asList("MySQL Workbench"));
        topicsMap.put("User Management", Arrays.asList("MySQL Create User", "MySQL Drop User", "MySQL Show User", "MySQL User Password"));
        topicsMap.put("MySQL Database", Arrays.asList("MySQL Create Database", "MySQL Select Database", "MySQL Show Database", "MySQL Drop Database", "MySQL Copy Database"));
        topicsMap.put("Table & Views", Arrays.asList("MySQL CREATE Table", "MySQL ALTER Table", "MySQL Show Table", "MySQL Rename Table", "MySQL TRUNCATE Table", "MySQL Describe Table", "MySQL DROP Table", "MySQL Temporary Table", "MySQL COPY Table", "MySQL Repair Table", "MySQL Add/Delete Column", "MySQL Show Column", "MySQL Rename Column", "MySQL Views", "MySQL Table Locking", "MySQL Account Lock", "MySQL Account Unlock"));
        topicsMap.put("MySQL Queries", Arrays.asList("MySQL Queries", "MySQL Constraint", "MySQL INSERT Record", "MySQL UPDATE Record", "MySQL DELETE Record", "MySQL SELECT Record", "MySQL Replace", "Insert On DuplicateKey Update", "MySQL INSERT IGNORE", "Insert Into Select"));
        topicsMap.put("MySQL Clauses", Arrays.asList("MySQL WHERE", "MySQL DISTINCT", "MySQL FROM", "MySQL ORDER BY", "MySQL GROUP BY", "MySQL HAVING"));
        topicsMap.put("MySQL Privileges", Arrays.asList("MySQL Grant Privilege", "MySQL Revoke Privilege"));
        topicsMap.put("Control Flow Function", Arrays.asList("MySQL IF()", "MySQL IFNULL()", "MySQL NULLIF()", "MySQL CASE", "MySQL IF Statement", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("MySQL Conditions", Arrays.asList("MySQL AND", "MySQL OR", "MySQL AND OR", "MySQL Boolean", "MySQL Like", "MySQL IN", "MySQL ANY", "MySQL EXISTS", "MySQL NOT", "MySQL Not Equal", "MySQL IS NULL", "MySQL IS NOT NULL", "MySQL BETWEEN"));
        topicsMap.put("MySQL Join", Arrays.asList("MySQL JOIN", "MySQL Inner Join", "MySQL Left Join", "MySQL Right Join", "MySQL Cross Join", "MySQL Self Join", "MySQL Delete Join", "MySQL Update Join", "MySQL Equi Join", "MySQL Natural Join", "Left Join vs Right Join", "MySQL Union vs Join"));
        topicsMap.put("MySQL Key", Arrays.asList("MySQL Unique Key", "MySQL Primary Key", "MySQL Foreign Key", "MySQL Composite Key"));
        topicsMap.put("MySQL Triggers", Arrays.asList("MySQL Trigger", "MySQL Create Trigger", "MySQL Show Trigger", "MySQL Drop Trigger", "Before Insert Trigger", "After Insert Trigger", "MySQL Before Update Trigger", "MySQL After Update Trigger", "MySQL Before Delete Trigger", "MySQL After Delete Trigger"));
        return topicsMap;
    }
    public static Map<String, List<String>> oracleTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Oracle Tutorial", Arrays.asList("Oracle Tutorial", "What is Oracle ?"));
        topicsMap.put("Oracle Tables", Arrays.asList("Create Table", "Create Table As", "Alter Table", "Drop Table", "Global Temp Tables", "Local Temp Tables"));
        topicsMap.put("Oracle Views", Arrays.asList("Oracle View"));
        topicsMap.put("Oracle Query", Arrays.asList("Oracle Queries", "Oracle Select", "Oracle Insert", "Oracle Insert All", "Oracle Update", "Oracle Delete", "Truncate Table"));
        topicsMap.put("Oracle Clauses", Arrays.asList("Oracle DISTINCT", "Oracle FROM", "Oracle ORDER BY", "Oracle GROUP BY", "Oracle HAVING"));
        topicsMap.put("Oracle Operators", Arrays.asList("Oracle Union", "Oracle Union All", "Oracle Intersect", "Oracle Minus", "Oracle HAVING"));
        topicsMap.put("Oracle Joins", Arrays.asList("Oracle Joins", "Inner Join", "Outer Join", "Equi Join", "Self Join", "Cross Join", "Anti Join", "Semi Join"));
        topicsMap.put("Oracle Advance", Arrays.asList("Oracle Procedure", "Oracle Function", "Oracle Cursor", "Oracle Trigger", "Oracle BEFORE Trigger", "Oracle AFTER Trigger", "Oracle DROP Trigger", "Oracle DISABLE Trigger", "Oracle ENABLE Trigger"));
        return topicsMap;
    }
    public static Map<String, List<String>> mongodbTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("MongoDB Tutorial", Arrays.asList("What is MongoDB ?", "No SQL Databases", "Advantages Over RDBMS", "MongoDB Data Types", "Install MongoDB", "MongoDB Data Modeling"));
        topicsMap.put("MongoDB Operators", Arrays.asList("Query & Projection Operator", "MongoDB Update Operator", "Aggregation Pipeline Stages", "MongoDB limit()", "MongoDB sort()", "Query Modifiers"));
        topicsMap.put("Database Commands", Arrays.asList("Aggregation Commands", "Geospatial Command", "Query & Write Operation Command", "Query Plan Cache Commands", "Authentication Commands", "User Management Commands", "Role Management Commands", "Replication Commands", "Sharding Commands", "Session Commands"));
        topicsMap.put("Database", Arrays.asList("Create Database", "Drop Database"));
        topicsMap.put("Collection", Arrays.asList("Create Collection", "Drop Collection"));
        topicsMap.put("CRUD: Documents", Arrays.asList("Insert Documents", "Update Documents", "Delete Documents", "Query Documents", "SQL to MongoDB Mapping", "MongoDB text search"));
        topicsMap.put("MongoDB Shell", Arrays.asList("MongoDB Shell", "Shell Collection Methods", "Cursor Methods", "MongoDB Database Command", "Query Plan Cache Methods", "User Management Methods", "Roll Management Methods", "MongoDB Replication Methods", "Bulk Operation Methods", "Connection Methods", "Sharding Methods"));
        topicsMap.put("MongoDB Cloud", Arrays.asList("MongoDB Stitch", "MongoDB Atlas", "MongoDB Cloud Manager", "MongoDB Ops Manager"));
        topicsMap.put("MongoDB Tools", Arrays.asList("MongoDB Compass", "MongoDB BI connector"));
        topicsMap.put("Connectivity", Arrays.asList("JAVA MongoDB", "PHP MongoDB", "Python MongoDB", "Node.js MongoDB"));
        return topicsMap;
    }
    public static Map<String, List<String>> sqliteTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("SQLite Tutorial", Arrays.asList("What is SQLite ?", "SQL vs SQLite", "SQLite History", "SQLite Features", "SQLite Advantages", "SQLite Installation", "SQLite Commands", "SQLite Syntax", "SQLite Data Types", "SQLite Operators", "SQLite Expressions"));
        topicsMap.put("Databases", Arrays.asList("SQLite Create DB", "SQLite Attach DB", "SQLite Detach DB"));
        topicsMap.put("Table", Arrays.asList("SQLite Create Table", "SQLite Drop Table"));
        topicsMap.put("CRUD Operation", Arrays.asList("SQLite Insert Query", "SQLite Select Query", "SQLite Update Query", "SQLite Delete Query"));
        topicsMap.put("Clauses/Conditions", Arrays.asList("SQLite WHERE", "SQLite AND", "SQLite OR", "SQLite LIKE", "SQLite Glob", "SQLite Limit", "SQLite Order By", "SQLite Group By", "SQLite Having", "SQLite Distinct", "SQLite Union", "SQLite Union All"));
        topicsMap.put("SQLite Joins", Arrays.asList("SQLite Joins", "SQLite Inner Join", "SQLite Outer Join", "SQLite Cross Join"));
        topicsMap.put("SQLite Date & Time", Arrays.asList("SQLite Date & Time", "SQLite date()", "SQLite datetime()", "SQLite juliandday()", "SQLite now()", "SQLite strftime()", "SQLite time()"));
        topicsMap.put("Aggregate Functions", Arrays.asList("Aggregate Functions", "SQLite MIN", "SQLite MAX", "SQLite AVG", "SQLite COUNT", "SQLite SUM"));
        topicsMap.put("SQLite Triggers", Arrays.asList("SQLite Triggers", "After Insert", "After Update", "After Delete", "SQLite Drop Triggers"));
        topicsMap.put("SQLite Keys", Arrays.asList("Primary key", "Foreign Key"));
        topicsMap.put("Connectivity", Arrays.asList("Java SQLite", "PHP SQLite", "Python SQLite"));
        return topicsMap;
    }

    // web tech topics set
    public static Map<String, List<String>> htmlTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("HTML Tutorial", Arrays.asList("What is HTML ?", "HTML Text Editors", "HTML Building Blocks", "HTML tags", "HTML Attributes", "HTML Elements", "HTML Formatting", "HTML Heading", "HTML Paragraph", "HTML Phrase Tags", "HTML Anchor", "HTML Image", "HTML Table", "HTML List", "HTML Ordered List", "HTML Unordered List", "HTML Description List", "HTML Form", "HTML Form Input", "HTML Form Attribute", "HTML with CSS", "HTML Classes", "HTML Id", "HTML Iframes", "HTML JavaScript", "HTML Comments", "HTML File Path", "HTML Head", "HTML Layout", "HTML Layout Techniques", "HTML Responsive", "HTML Computercode", "HTML Entities", "HTML Symbols", "HTML Charset", "HTML URL Encode"));
        topicsMap.put("HTML Attributes", Arrays.asList("HTML Global Attributes", "HTML Event Attributes"));
        topicsMap.put("HTML Tags List", Arrays.asList("HTML <!DOCTYPE> Tag", "HTML <a> Tag", "HTML <abbr> Tag", "HTML <acronym> Tag", "HTML <address> Tag", "HTML <applet> Tag", "HTML <area> Tag", "HTML <article> Tag", "HTML <aside> Tag", "HTML <audio> Tag", "HTML <b> Tag", "HTML <base> Tag", "HTML <basefont> Tag", "HTML <bdi> Tag", "HTML <bdo> Tag", "HTML <big> Tag", "HTML <blockquote> Tag", "HTML <body> Tag", "HTML <br> Tag", "HTML <button> Tag", "HTML <canvas> Tag", "HTML <caption> Tag", "HTML <center> Tag", "HTML <cite> Tag", "HTML <code> Tag", "HTML <col> Tag", "HTML <colgroup> Tag", "HTML <data> Tag", "HTML <datalist> Tag", "HTML <dd> Tag", "HTML <del> Tag", "HTML <details> Tag", "HTML <dfn> Tag", "HTML <dialog> Tag", "HTML <dir> Tag", "HTML <div> Tag", "HTML <dl> Tag", "HTML <dt> Tag", "HTML <em> Tag", "HTML <embed> Tag", "HTML <fieldset> Tag", "HTML <figcaption> Tag", "HTML <figure> Tag", "HTML <font> Tag", "HTML <footer> Tag", "HTML <form> Tag", "HTML <frame> Tag", "HTML <frameset> Tag", "HTML <h1> to <h6> Tag", "HTML <head> Tag", "HTML <header> Tag", "HTML <hr> Tag", "HTML <html> Tag", "HTML <i> Tag", "HTML <iframe> Tag", "HTML <img> Tag", "HTML <input> Tag", "HTML <ins> Tag", "HTML <isindex> Tag", "HTML <kbd> Tag", "HTML <label> Tag", "HTML <legend> Tag", "HTML <li> Tag", "HTML <link> Tag", "HTML <main> Tag", "HTML <map> Tag", "HTML <map> Tag", "HTML <mark> Tag", "HTML <marquee> Tag", "HTML <menu> Tag", "HTML <meta> Tag", "HTML <meter> Tag", "HTML <nav> Tag", "HTML <noframes> Tag", "HTML <noscript> Tag", "HTML <object> Tag", "HTML <ol> Tag", "HTML <optgroup> Tag", "HTML <option> Tag", "HTML <output> Tag", "HTML <p> Tag", "HTML <param> Tag", "HTML <picture> Tag", "HTML <pre> Tag", "HTML <progress> Tag", "HTML <q> Tag", "HTML <rp> Tag", "HTML <rt> Tag", "HTML <ruby> Tag", "HTML <s> Tag", "HTML <samp> Tag", "HTML <script> Tag", "HTML <section> Tag", "HTML <select> Tag", "HTML <small> Tag", "HTML <source> Tag", "HTML <span> Tag", "HTML <strike> Tag", "HTML <strong> Tag", "HTML <style> Tag", "HTML <sub> Tag", "HTML <summary> Tag", "HTML <sup> Tag", "HTML <svg> Tag", "HTML <table> Tag", "HTML <tbody> Tag", "HTML <td> Tag", "HTML <template> Tag", "HTML <textarea> Tag", "HTML <tfoot> Tag", "HTML <th> Tag", "HTML <thead> Tag", "HTML <time> Tag", "HTML <title> Tag", "HTML <tr> Tag", "HTML <track> Tag", "HTML <tt> Tag", "HTML <u> Tag", "HTML <ul> Tag", "HTML <var> Tag", "HTML <video> Tag", "HTML <wbr> Tag"));
        topicsMap.put("HTML API", Arrays.asList("HTML Drag & Drop", "HTML Geolocation", "HTML Web Storage", "HTML Web Workers", "HTML SS Event"));
        return topicsMap;
    }
    public static Map<String, List<String>> cssTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("CSS Tutorial", Arrays.asList("What is CSS", "CSS Syntax", "CSS Selector", "How to Add CSS", "Inline CSS", "Internal CSS", "External CSS", "CSS Comments"));
        topicsMap.put("CSS Properties", Arrays.asList("CSS Background", "CSS Border", "CSS border-radius", "CSS border-collapse", "CSS border-spacing", "CSS Display", "CSS Cursor", "CSS Buttons", "CSS Float", "CSS Font", "CSS Font-size", "CSS font-family", "CSS font-weight", "CSS font-stretch", "CSS Colors", "CSS Hover", "CSS Important", "CSS Background-color", "background-attachment", "background-size", "CSS Line Height", "CSS Margin", "CSS Opacity", "CSS filter", "CSS Images", "CSS Overflow", "CSS Padding", "CSS Position", "CSS Vertical Align", "CSS White Space", "CSS Width", "CSS height", "CSS Word Wrap", "Box-shadow CSS", "CSS Text-shadow", "CSS text-transform", "CSS Outline", "CSS Visibility", "CSS Counter", "CSS clearfix", "CSS icons", "CSS justify-content", "CSS text-decoration", "CSS Lists", "CSS nth selector", "CSS sticky", "CSS background-clip", "CSS checkbox style", "CSS letter-spacing", "CSS Navigation bar", "CSS overlay", "CSS root", "CSS Specificity", "CSS text-indent", "CSS text-stroke", "CSS Zoom", "CSS order", "CSS Descendant Selector", "CSS calc()", "CSS Clip", "CSS clip-path", "CSS Radio Button", "CSS Text Effects", "CSS text-align", "CSS Variables", "CSS content property", "CSS word-spacing", "CSS object-fit", "CSS object-position", "CSS columns", "CSS pointer-events", "CSS hyphens", "CSS font-variant", "CSS left property", "CSS right property", "CSS bottom property", "CSS top property", "word-break property", "CSS max-height", "CSS max-width", "CSS min-height", "CSS min-width", "CSS border-image", "CSS cubic-bezier", "CSS quotes", "CSS transform-origin", "CSS resize", "CSS text-overflow", "CSS writing-mode", "CSS background-origin", "CSS text-orientation", "CSS transition-delay"));
        topicsMap.put("CSS Design", Arrays.asList("CSS Grid", "CSS Layout", "CSS Table", "CSS Box Model"));
        topicsMap.put("CSS Advance", Arrays.asList("CSS Animation", "CSS @keyframes rule", "CSS pseudo-classes", "CSS Pseudo-elements", "CSS radial-gradient", "CSS translate", "CSS Gradient", "CSS z-index", "CSS minify", "CSS Loader", "CSS units", "CSS Combinators", "CSS masking", "CSS Transition", "CSS Arrow", "CSS FlexBox", "CSS flex property", "flex-basis property", "flex-grow property", "flex-shrink property", "flex-flow property", "CSS @Media Query", "CSS 2D Transforms", "CSS 3D Transforms", "CSS Aural Media"));
        return topicsMap;
    }
    public static Map<String, List<String>> jsTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("JavaScript Tutorial", Arrays.asList("What is JavaScript ?", "External JavaScript"));
        topicsMap.put("JavaScript Basics", Arrays.asList("JS Comment", "JS Variable", "JS Global Variable", "JS Data Types", "JS Operators", "JS If Statement", "JS Switch", "JS Loop", "JS Function"));
        topicsMap.put("JavaScript Objects", Arrays.asList("JS Object", "JS Array", "JS String", "JS Date", "JS Math", "JS Number", "JS Boolean"));
        topicsMap.put("JavaScript BOM", Arrays.asList("Browser Objects", "1) Window Object", "2) History Object", "3) Navigator Object", "4) Screen Object", "5) Document Object"));
        topicsMap.put("JavaScript DOM", Arrays.asList("getElementById", "GetElementsByClassName()", "getElementsByName", "getElementsByTagName", "JS innerHTML property", "JS innerText property"));
        topicsMap.put("JavaScript Validation", Arrays.asList("JS form validation", "JS email validation"));
        topicsMap.put("JavaScript OOPs", Arrays.asList("JS Class", "JS Object", "JS Prototype", "JS constructor Method", "JS static Method", "JS Encapsulation", "JS Inheritance", "JS Polymorphism", "JS Abstraction"));
        topicsMap.put("JavaScript Cookies", Arrays.asList("JS Cookies", "Cookie Attributes", "Cookie with multiple Name", "Deleting Cookies"));
        topicsMap.put("JavaScript Events", Arrays.asList("JavaScript Events", "JavaScript addEventListener()", "JS onclick event", "JS dblclick event", "JS onload event", "JS onresize event"));
        topicsMap.put("JavaScript Handling", Arrays.asList("JS Exception Handling", "JavaScript try-catch"));
        return topicsMap;
    }
    public static Map<String, List<String>> phpTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("PHP Tutorial", Arrays.asList("What is PHP ?", "Install PHP", "PHP Code", "PHP Echo", "PHP Print", "PHP Echo vs Print", "PHP Variable", "PHP Variable Scope", "PHP $ and $$", "PHP Constants", "PHP Magic Constants", "PHP Data Types", "PHP Operators", "PHP Comments"));
        topicsMap.put("Control Statement", Arrays.asList("PHP If else", "PHP Switch", "PHP For Loop", "PHP foreach loop", "PHP While Loop", "PHP Do While Loop", "PHP Break", "PHP Continue"));
        topicsMap.put("PHP Functions", Arrays.asList("PHP Functions", "Parameterized Function", "PHP Call By Value", "PHP Call By Reference", "PHP Default Arguments", "PHP Variable Arguments", "PHP Recursive Function"));
        topicsMap.put("PHP Arrays", Arrays.asList("PHP Array", "PHP Indexed Array", "PHP Associative Array", "Multidimensional Array", "PHP Array Functions"));
        topicsMap.put("PHP Strings", Arrays.asList("PHP String", "PHP String Functions"));
        topicsMap.put("PHP Math", Arrays.asList("PHP Math Functions"));
        topicsMap.put("PHP Form", Arrays.asList("PHP Form: Get Post"));
        topicsMap.put("PHP Include", Arrays.asList("PHP include & require"));
        topicsMap.put("State Management", Arrays.asList("PHP Cookie", "PHP Session"));
        topicsMap.put("PHP File", Arrays.asList("PHP File Handling", "PHP Open File", "PHP Read File", "PHP Write File", "PHP Append File", "PHP Delete File"));
        topicsMap.put("PHP Mail", Arrays.asList("PHP Mail"));
        return topicsMap;
    }
    public static Map<String, List<String>> bootstrapTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Bootstrap Tutorial", Arrays.asList("What is Bootstrap ?", "Bootstrap Example", "Bootstrap Container"));
        topicsMap.put("Bootstrap Examples", Arrays.asList("Bootstrap Jumbotron", "Bootstrap Button", "Bootstrap Grid", "Bootstrap Table", "Bootstrap Form", "Bootstrap Alert", "Bootstrap Wells", "Bootstrap Badge & Label", "Bootstrap Panels", "Bootstrap Pagination", "Bootstrap Pager", "Bootstrap Image", "Bootstrap Glyphicon", "Bootstrap Carousel", "Bootstrap Progress Bar", "Bootstrap List Group", "Bootstrap Dropdown", "Bootstrap Collapse"));
        topicsMap.put("Bootstrap Advance", Arrays.asList("Bootstrap Tabs/Pills", "Bootstrap Navbar", "Bootstrap Input Types", "Bootstrap Modals", "Bootstrap Popover", "Bootstrap Scrollspy"));
        topicsMap.put("Bootstrap Utilities", Arrays.asList("Bootstrap Border", "Bootstrap Clearfix", "Bootstrap Close Icons", "Bootstrap Colors", "Bootstrap Flexbox", "Display property", "Image Replacement", "Invisible Content", "Bootstrap Position", "Responsive helpers", "Screen readers", "Bootstrap Sizing", "Bootstrap Spacing", "Bootstrap Typography", "Bootstrap CDN", "Bootstrap Spinners", "Bootstrap star rating", "Bootstrap Tooltip", "Bootstrap Alternatives", "Bootstrap picker"));
        return topicsMap;
    }
    public static Map<String, List<String>> angularjsTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("AngularJS Tutorial", Arrays.asList("What is AngularJS ?", "AngularJS MVC", "AngularJS First App", "AngularJS Data Binding", "AngularJS Expressions", "AngularJS Directives", "AngularJS Controllers", "AngularJS Modules", "AngularJS Scopes", "AngularJS Dependency", "AngularJS Filters", "AngularJS Tables", "AngularJS Select", "AngularJS DOM", "AngularJS Forms", "AngularJS Validation", "AngularJS AJAX", "AngularJS Animation"));
        return topicsMap;
    }
    public static Map<String, List<String>> jqueryTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("jQuery Tutorial" , Arrays.asList("What is jQuery ?" , "jQuery History" , "jQuery Example" , "jQuery Selectors"));
        topicsMap.put("jQuery Effects" , Arrays.asList("jQuery Effects" , "jQuery hide()" , "jQuery show()" , "jQuery toggle()" , "jQuery fadeIn()" , "jQuery fadeOut()" , "jQuery fadeToggle()" , "jQuery fadeTo()" , "jQuery slideDown()" , "jQuery slideUp()" , "jQuery slideToggle()" , "jQuery animate()" , "jQuery delay()"));
        topicsMap.put("jQuery HTML/CSS" , Arrays.asList("jQuery html()" , "jQuery text()" , "jQuery val()" , "jQuery css()" , "jQuery before()" , "jQuery prepend()" , "jQuery after()" , "jQuery insertAfter()" , "jQuery append()" , "jQuery appendTo()" , "jQuery clone()" , "jQuery remove()" , "jQuery empty()" , "jQuery detach()" , "jQuery scrollTop()" , "jQuery attr()" , "jQuery prop()" , "jQuery offset()" , "jQuery position()" , "jQuery addClass()" , "jQuery hasClass()" , "jQuery toggleClass()" , "jQuery width()" , "jQuery height()" , "jQuery innerWidth()" , "jQuery innerHeight()" , "jQuery outerWidth()" , "jQuery outerHeight()" , "jQuery wrap()" , "jQuery wrapInner()" , "jQuery wrapAll()" , "jQuery unwrap()"));
        topicsMap.put("jQuery Form" , Arrays.asList("jQuery serialize()" , "jQuery serializeArray()"));
        topicsMap.put("jQuery Events" , Arrays.asList("jQuery Events" , "jQuery click()" , "jQuery bind()" , "jQuery unbind() method" , "jQuery blur()" , "jQuery focus()" , "jQuery select()" , "jQuery change()" , "jQuery submit()" , "jQuery keydown()" , "jQuery keypress()" , "jQuery keyup()" , "jQuery mouseenter()" , "jQuery mouseleave()" , "jQuery hover()" , "jQuery mousedown()" , "jQuery mouseup()" , "jQuery mouseover()" , "jQuery mouseout()" , "jQuery load()" , "jQuery unload()" , "jQuery delegate()"));
        return topicsMap;
    }
    public static Map<String, List<String>> ajaxTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("AJAX Tutorial", Arrays.asList("What is AJAX ?", "Asynchronous", "Ajax Technologies", "XMLHttpRequest", "How AJAX Works?"));
        topicsMap.put("Java AJAX", Arrays.asList("AJAX Example", "AJAX with Database", "Email Finder", "Comment Form", "Search Example"));
        topicsMap.put("JSON AJAX", Arrays.asList("AJAX JSON"));
        return topicsMap;
    }
    public static Map<String, List<String>> laravelTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Laravel Tutorial", Arrays.asList("What is Laravel ?", "History of Laravel"));
        topicsMap.put("Installation on Windows", Arrays.asList("XAMPP Installation", "Composer Installation", "Git Installation", "Creating First Laravel Project", "Laravel Application Structure"));
        topicsMap.put("Laravel Routing", Arrays.asList("Laravel Basic Routing", "Routing Parameters", "Laravel Named Routes", "Laravel Middleware", "Laravel Route Groups"));
        topicsMap.put("Laravel Controllers", Arrays.asList("Laravel Controllers", "Routing Controllers", "Resource Controllers", "Controller Middleware"));
        topicsMap.put("Laravel Views", Arrays.asList("Laravel Views", "Passing data to views"));
        topicsMap.put("Laravel Blade Template", Arrays.asList("Blade Template", "Template Inheritance", "Laravel Forms"));
        topicsMap.put("Laravel Migration", Arrays.asList("Laravel Migration", "Migration Structure", "Generating Migrations", "Migration Commands"));
        topicsMap.put("Laravel Database", Arrays.asList("Laravel Database", "Laravel Eloquent", "Laravel Relationship", "Laravel Tinker", "Laravel Crud"));
        return topicsMap;
    }


    // app dev topics set
    public static Map<String, List<String>> androidTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Android Tutorial", Arrays.asList("What is Android", "History and Version", "Android Architecture", "Core Building Blocks", "Android Emulator", "Install Android", "Setup Eclipse", "Hello Android example", "Internal Details", "Dalvik VM", "AndroidManifest.xml", "R.java", "Hide Title Bar", "Screen Orientation"));
        topicsMap.put("Android Widgets", Arrays.asList("UI Widgets", "Working with Button", "Toast", "Custom Toast", "ToggleButton", "CheckBox", "Custom CheckBox", "RadioButton", "Dynamic RadioButton", "Custom RadioButton", "AlertDialog", "Spinner", "AutoCompleteTextView", "ListView", "Custom ListView", "RatingBar", "WebView", "SeekBar", "DatePicker", "TimePicker", "Analog and Digital", "ProgressBar", "Vertical ScrollView", "Horizontal ScrollView", "ImageSwitcher", "ImageSlider", "ViewStub", "TabLayout", "TabLayout with FrameLayout", "SearchView", "SearchView on Toolbar", "EditText with TextWatcher"));
        topicsMap.put("Activity and Intents", Arrays.asList("Activity LifeCycle", "Implicit Intent", "Explicit Intent", "StartActivityForResult", "Share App Data"));
        topicsMap.put("Android Fragments", Arrays.asList("Android Fragments"));
        topicsMap.put("Android Menu", Arrays.asList("Option Menu", "Context Menu", "Popup Menu"));
        topicsMap.put("Android Service", Arrays.asList("Android Service"));
        topicsMap.put("Android AlarmManager", Arrays.asList("Android AlarmManager"));
        topicsMap.put("Android Storage", Arrays.asList("Android Preferences", "Internal Storage", "External Storage"));
        topicsMap.put("Android SQLite", Arrays.asList("SQLite Tutorial", "SQLite Spinner"));
        topicsMap.put("Android Multimedia", Arrays.asList("MediaPlayer: Audio", "VideoView: Video", "Recording Media"));
        topicsMap.put("Android Telephony", Arrays.asList("TelephonyManager", "Get Call State", "Get Call State 2", "Simple Caller Talker", "Phone Call", "Send SMS", "Send Email"));
        topicsMap.put("Android Device", Arrays.asList("Bluetooth Tutorial", "List Paired Devices", "WIFI"));
        topicsMap.put("Camera Tutorial", Arrays.asList("Camera Tutorial"));
        topicsMap.put("Sensor Tutorial", Arrays.asList("Sensor Tutorial"));
        topicsMap.put("Android Graphics", Arrays.asList("Android Graphics"));
        topicsMap.put("Android Animation", Arrays.asList("Android Animation"));
        topicsMap.put("Android Web Service", Arrays.asList("Android Web Service"));
        topicsMap.put("Google Map", Arrays.asList("Android Google Map", "Current Location", "Search Location"));
        topicsMap.put("Adding Ads", Arrays.asList("Android Google Admob", "1) Banner Ads", "2) Interstitial Ads"));
        topicsMap.put("Android Social", Arrays.asList("Integrating Google Sign-In", "Integrating LinkedIn", "Integrating Twitter"));
        return topicsMap;
    }
    public static Map<String, List<String>> dartTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Dart Tutorial", Arrays.asList("What is Dart ?", "Dart Features", "History Of Cloud", "Dart Installation", "Dart First Program", "Dart Basic Syntax", "Dart Comments", "Dart Keywords", "Dart Data Types", "Dart Variables", "Dart Operators"));
        topicsMap.put("Dart Data Types", Arrays.asList("Dart Constants", "Dart Numbers", "Dart String", "Dart Lists", "Dart Sets", "Dart Map", "Dart Symbol", "Dart Runes", "Dart Enumeration"));
        topicsMap.put("Control Flow Statement", Arrays.asList("Control Flow Statement", "Dart if Statement", "if else Statement", "if else-if Statement", "Switch case Statement", "Dart Loops", "Dart for Loop", "Dart For..in Loop", "Dart while Loop", "Dart do while Loop", "Dart Boolean"));
        topicsMap.put("Dart Function", Arrays.asList("Dart Function", "Anonymous Function", "main() function", "Dart Recursion"));
        topicsMap.put("Object Oriented", Arrays.asList("Object-Oriented Concepts", "Classes & Object", "Dart Constructor", "Dart this Keyword", "Dart static Keyword", "Dart super Keyword", "Dart Inheritance", "Super Constructor", "Dart Methods", "Method Overriding", "Getters & Setters", "Abstract Classes", "Dart Interfaces"));
        topicsMap.put("Dart Advance Topics", Arrays.asList("Dart Exceptions", "Dart Typedef", "Dart Metadata", "Dart Collection", "Dart Generics", "Dart Packages", "Dart Libraries", "Dart Generators", "Dart Callable Classes", "Dart Isolates", "Dart Async", "Dart Concurrency", "Dart Unit Testing", "Dart HTML DOM"));
        return topicsMap;
    }
    public static Map<String, List<String>> flutterTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Flutter Tutorial", Arrays.asList("What is Flutter ?", "Flutter Installation", "Flutter First Application", "Flutter Architecture", "Flutter vs React native"));
        topicsMap.put("Dart Programming", Arrays.asList("Dart Programming"));
        topicsMap.put("Flutter Basics", Arrays.asList("Flutter Widgets", "Flutter Layouts", "Flutter Gestures", "State Management", "Flutter IDE"));
        topicsMap.put("Flutter Widgets", Arrays.asList("Flutter Scaffold", "Flutter Container", "Flutter Row & Column", "Flutter Text", "Flutter TextField", "Flutter Buttons", "Flutter Stack", "Flutter Forms", "Flutter AlertDialog", "Flutter Icons", "Flutter Images", "Flutter Card", "Flutter Tabbar", "Flutter Drawer", "Flutter Lists", "Flutter GridView", "Flutter Toast", "Flutter Checkbox", "Flutter Radio Button", "Flutter Progress Bar", "Flutter Snackbar", "Flutter Tooltip", "Flutter Slider", "Flutter Switch", "Flutter Charts", "Bottom Navigation Bar", "Flutter Themes", "Flutter Table", "Flutter Calendar", "Flutter Animation"));
        topicsMap.put("Flutter Routing", Arrays.asList("Navigation & Routing"));
        topicsMap.put("Advanced Concepts", Arrays.asList("Flutter Packages", "Flutter Splash Screen", "Flutter Google Maps", "Flutter Slivers", "Flutter REST API", "Flutter Database", "Flutter Testing"));
        return topicsMap;
    }
    public static Map<String, List<String>> kotlinTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Kotlin Tutorial", Arrays.asList("What is Kotlin ?", "Environment Setup", "Hello World Program", "First Program Concept", "Environment Setup (IDE)", "First Program (IDE)", "Kotlin Variable", "Kotlin Data Type", "Kotlin Type Conversion", "Kotlin Operator", "Kotlin Input/Output", "Kotlin Comment"));
        topicsMap.put("Control Flow", Arrays.asList("Kotlin if Expression", "Kotlin when Expression", "Kotlin for Loop", "Kotlin while Loop", "Kotlin Do while Loop", "Return and Jump", "Continue Structure"));
        topicsMap.put("Function", Arrays.asList("Kotlin Function", "", "Recursion Function", "Default and Named Argument", "Kotlin Lambdas", "Higher order Function", "Kotlin Inline Function"));
        topicsMap.put("Array", Arrays.asList("Kotlin Array"));
        topicsMap.put("String", Arrays.asList("Kotlin String"));
        topicsMap.put("Exception Handling", Arrays.asList("Exception Handling", "Kotlin Try Catch", "Multiple Catch Block", "Nested Try Block", "Kotlin Finally Block", "Kotlin Throw Keyword"));
        topicsMap.put("Null Safety", Arrays.asList("Nullable Non Nullable Types", "Kotlin Smart Cast", "Unsafe and Safe Cast", "Kotlin Elvis Operator"));
        topicsMap.put("Collections", Arrays.asList("Mutable Array", "Kotlin Collections", "List: listOf()", "mutableListOf()", "Kotlin ArrayList", "arrayListOf()", "Map: mapOf()", "Kotlin HashMap", "hashMapOf()", "mutableMapOf()", "Set: setOf()", "mutableSetOf()", "hashSetOf()"));
        topicsMap.put("Annotations", Arrays.asList("Kotlin Annotations"));
        topicsMap.put("Reflection", Arrays.asList("Kotlin Reflection"));
        topicsMap.put("Kotlin OOPs", Arrays.asList("Class and Object", "Nested and Inner Class", "Kotlin Constructor", "Visibility Modifier", "Kotlin Inheritance", "Abstract Class", "Kotlin Interface", "Data Class", "Sealed Class", "Extension Function", "Kotlin Generics"));
        topicsMap.put("Ranges", Arrays.asList("Integer type range", "Kotlin Working Ranges", "Kotlin Utility Function"));
        topicsMap.put("Kotlin Android", Arrays.asList("Android TextView and EditText", "Kotlin Android Toast", "Android Button", "Android Custom Toast", "Android Explicit Intent", "Android Implicit Intent", "Android ListView", "Android AlertDialog", "Android Context Menu", "Android Custom ListView", "Android Options Menu", "Android Popup Menu", "Android WebView", "Kotlin Android SeekBar", "TabLayout with FrameLayout", "TabLayout with ViewPager", "DOM Parser", "SAX Parser", "XMLPullParser", "JSON Parsing using URL", "Android Media Player", "Android Video Player", "External Storage", "Internal Storage", "SharedPreferences", "SQLite Tutorial", "Android Notification", "Google reCAPTCHA", "Authentication - Google Login", "Google AdMob Banner Ads", "Google AdMob Interstitial Ads", "Google Map Current Location", "Google Map Fixed Location", "Google Map Search Location", "Android Web Service"));
        return topicsMap;
    }
    public static Map<String, List<String>> swiftTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Swift Tutorial", Arrays.asList("What is Swift?", "History of Swift", "Swift Syntax", "Swift Datatypes", "Swift Variables", "Swift Constants", "Swift Literals", "Swift vs Objective C", "First Swift Program", "Swift Operators"));
        topicsMap.put("Control Statement", Arrays.asList("Switch Statement", "if Statement", "if-else Statement", "if-else-if Statement", "Nested if-else Statement", "Gaurd Statement", "Break Statement", "Continue Statement", "Fallthrough Statement"));
        topicsMap.put("Swift Loops", Arrays.asList("Swift Loops", "for-in loop", "while loop", "repeat-while loop"));
        topicsMap.put("Swift String", Arrays.asList("Swift Strings"));
        topicsMap.put("Swift Functions", Arrays.asList("Swift Functions", "Swift Nested Function", "Parameter & Return Value", "Swift Recursion", "Function Overloading"));
        topicsMap.put("Swift Collection", Arrays.asList("Swift Arrays", "Swift Dictionary", "Swift Sets", "Swift Closures", "Swift Typealias"));
        topicsMap.put("Swift OOPs", Arrays.asList("Swift Enum", "Swift Structures", "Swift Classes", "Swift Properties", "Swift Inheritance", "Swift Methods", "Swift Subscripts", "Swift Deinitialization", "Swift Initialization", "Swift Typecasting", "Function vs Method", "Timers in Swift"));
        return topicsMap;
    }


    // .net tech topics set
    public static Map<String, List<String>> dotnetTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put(".NET Framework", Arrays.asList(".NET Framework", "CLR", "FCL"));
        topicsMap.put("C# Tutorial", Arrays.asList("What is C# ?", "Java vs C#", "C# History", "C# Features", "C# Example", "C# Variables", "C# Data Types", "C# Operators", "C# Keywords"));
        topicsMap.put("C# Control Statement", Arrays.asList("C# if-else", "C# switch", "C# For Loop", "C# While Loop", "C# Do-While Loop", "C# Break", "C# Continue", "C# Goto", "C# Comments"));
        topicsMap.put("C# Function", Arrays.asList("C# Function", "C# Call By Value", "C# Call By Reference", "C# Out Parameter"));
        topicsMap.put("C# Arrays", Arrays.asList("C# Arrays", "C# Array to Function", "C# Multidimensional Array", "C# Jagged Arrays", "C# Params", "C# Array class", "C# Command Line Args"));
        topicsMap.put("C# Object Class", Arrays.asList("C# Object and Class", "C# Constructor", "C# Destructor", "C# this", "C# static", "C# static class", "C# static constructor", "C# Structs", "C# Enum"));
        topicsMap.put("C# Properties", Arrays.asList("C# Properties"));
        topicsMap.put("C# Inheritance", Arrays.asList("C# Inheritance", "C# Aggregation"));
        topicsMap.put("C# Polymorphism", Arrays.asList("C# Member Overloading", "C# Method Overriding", "C# Base", "C# Polymorphism", "C# Sealed"));
        topicsMap.put("C# Abstraction", Arrays.asList("C# Abstract", "C# Interface"));
        topicsMap.put("C# Namespace", Arrays.asList("C# Namespaces", "C# Access Modifiers", "C# Encapsulation"));
        topicsMap.put("C# Strings", Arrays.asList("C# Strings"));
        topicsMap.put("C# Exception Handling", Arrays.asList("C# Exception Handling", "C# try/catch", "C# finally", "C# Custom Exception", "C# checked unchecked", "C# SystemException"));
        topicsMap.put("C# File IO", Arrays.asList("C# FileStream", "C# StreamWriter", "C# StreamReader", "C# TextWriter", "C# TextReader", "C# BinaryWriter", "C# BinaryReader", "C# StringWriter", "C# StringReader", "C# FileInfo", "C# DirectoryInfo", "C# Serialization", "C# Deserialization", "C# System.IO"));
        topicsMap.put("C# Collection", Arrays.asList("C# Collections", "C# List<T>", "C# HashSet<T>", "C# SortedSet<T>", "C# Stack<T>", "C# Queue<T>", "C# LinkedList<T>", "C# Dictionary<K,V>", "C# SortedDictionary<K,V>", "C# SortedList<K,V>"));
        topicsMap.put("C# Generics", Arrays.asList("C# Generics"));
        topicsMap.put("C# Delegates", Arrays.asList("C# Delegates"));
        topicsMap.put("C# Reflection", Arrays.asList("C# Reflection"));
        topicsMap.put("C# Anonymous Function", Arrays.asList("Anonymous Function"));
        topicsMap.put("C# MultiThreading", Arrays.asList("C# Multithreading", "C# Thread Life Cycle", "C# Thread class", "C# Main Thread", "C# Thread Example", "C# Thread Sleep", "C# Thread Abort", "C# Thread Join", "C# Thread Name", "C# ThreadPriority"));
        topicsMap.put("C# Synchronization", Arrays.asList("C# Synchronization"));
        topicsMap.put("C# Web Service", Arrays.asList("Web Services in C#"));
        return topicsMap;
    }
    public static Map<String, List<String>> csharpTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("C# Tutorial", Arrays.asList("What is C# ?", "Java vs C#", "C# History", "C# Features", "C# Example", "C# Variables", "C# Data Types", "C# Operators", "C# Keywords"));
        topicsMap.put("C# Control Statement", Arrays.asList("C# if-else", "C# switch", "C# For Loop", "C# While Loop", "C# Do-While Loop", "C# Break", "C# Continue", "C# Goto", "C# Comments"));
        topicsMap.put("C# Function", Arrays.asList("C# Function", "C# Call By Value", "C# Call By Reference", "C# Out Parameter"));
        topicsMap.put("C# Arrays", Arrays.asList("C# Arrays", "C# Array to Function", "C# Multidimensional Array", "C# Jagged Arrays", "C# Params", "C# Array class", "C# Command Line Args"));
        topicsMap.put("C# Object Class", Arrays.asList("C# Object and Class", "C# Constructor", "C# Destructor", "C# this", "C# static", "C# static class", "C# static constructor", "C# Structs", "C# Enum"));
        topicsMap.put("C# Properties", Arrays.asList("C# Properties"));
        topicsMap.put("C# Inheritance", Arrays.asList("C# Inheritance", "C# Aggregation"));
        topicsMap.put("C# Polymorphism", Arrays.asList("C# Member Overloading", "C# Method Overriding", "C# Base", "C# Polymorphism", "C# Sealed"));
        topicsMap.put("C# Abstraction", Arrays.asList("C# Abstract", "C# Interface"));
        topicsMap.put("C# Namespace", Arrays.asList("C# Namespaces", "C# Access Modifiers", "C# Encapsulation"));
        topicsMap.put("C# Strings", Arrays.asList("C# Strings"));
        topicsMap.put("C# Exception Handling", Arrays.asList("C# Exception Handling", "C# try/catch", "C# finally", "C# Custom Exception", "C# checked unchecked", "C# SystemException"));
        topicsMap.put("C# File IO", Arrays.asList("C# FileStream", "C# StreamWriter", "C# StreamReader", "C# TextWriter", "C# TextReader", "C# BinaryWriter", "C# BinaryReader", "C# StringWriter", "C# StringReader", "C# FileInfo", "C# DirectoryInfo", "C# Serialization", "C# Deserialization", "C# System.IO"));
        topicsMap.put("C# Collection", Arrays.asList("C# Collections", "C# List<T>", "C# HashSet<T>", "C# SortedSet<T>", "C# Stack<T>", "C# Queue<T>", "C# LinkedList<T>", "C# Dictionary<K,V>", "C# SortedDictionary<K,V>", "C# SortedList<K,V>"));
        topicsMap.put("C# Generics", Arrays.asList("C# Generics"));
        topicsMap.put("C# Delegates", Arrays.asList("C# Delegates"));
        topicsMap.put("C# Reflection", Arrays.asList("C# Reflection"));
        topicsMap.put("C# Anonymous Function", Arrays.asList("Anonymous Function"));
        topicsMap.put("C# MultiThreading", Arrays.asList("C# Multithreading", "C# Thread Life Cycle", "C# Thread class", "C# Main Thread", "C# Thread Example", "C# Thread Sleep", "C# Thread Abort", "C# Thread Join", "C# Thread Name", "C# ThreadPriority"));
        topicsMap.put("C# Synchronization", Arrays.asList("C# Synchronization"));
        topicsMap.put("C# Web Service", Arrays.asList("Web Services in C#"));
        return topicsMap;
    }


    // software dev topics set
    public static Map<String, List<String>> pythonTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Python Tutorial", Arrays.asList("What is Python ?","Python Features","Python History","Python Applications","Python Install","Python Example","Python Variables","Python Data Types","Python Keywords","Python Literals","Python Operators","Python Comments","Python If else","Python Loops","Python For Loop","Python While Loop","Python Break","Python Continue","Python Pass","Python Strings","Python Lists","Python Tuples","Python Sets","Python Dictionary","Python Functions","Python Built-in Functions","Python Lambda Functions","Python Files I/O","Python Modules","Python Exceptions","Python Date","Python Regex","Python Sending Email","Read CSV File","Write CSV File","Read Excel File","Write Excel File","Python Assert","Python List Comprehension","Python Collection Module","Python Math Module","Python OS Module","Python Random Module","Python Statistics Module","Python Sys Module","Python IDEs","Python Arrays","Command Line Arguments","Python Magic Method","Python Stack & Queue","PySpark MLlib","Python Decorator","Python Generators","Web Scraping Using Python","Python JSON","Python Itertools","Python Multiprocessing","How to Calculate Distance between Two Points using GEOPY","Gmail API in Python","How to Plot the Google Map using folium package in Python","Grid Search in Python","Python High Order Function","nsetools in Python","Python program to find the nth Fibonacci Number","Python OpenCV object detection","Second Largest Number in Python","Python SimpleImputer module"));
        topicsMap.put("Python OOPs", Arrays.asList("Python OOPs Concepts","Python Object Class","Python Constructors","Python Inheritance","Abstraction in Python"));
        topicsMap.put("Python MySQL", Arrays.asList("Environment Setup","Database Connection","Creating New Database","Creating Tables","Insert Operation","Read Operation","Update Operation","Join Operation","Performing Transactions"));
        topicsMap.put("Python MongoDB", Arrays.asList("Python MongoDB"));
        topicsMap.put("Python SQLite", Arrays.asList("Python SQLite"));
        return topicsMap;
    }
    public static Map<String, List<String>> programmingincTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("C tutorial", Arrays.asList("What is C language ?","History of C ","Features of C","How to install C","First C Program","Compilation Process in C","printf scanf","Variables in C","Data Types in c","Keywords in c","C Identifiers","C Operators","C Comments","C Format Specifier","C Escape Sequence","ASCII value in C","Constants in C","Literals in C","Tokens in C","C Boolean","Static in C","Programming Errors in C","Compile time vs Runtime","Conditional Operator in C","Bitwise Operator in C","2s complement in C","C Fundamental Test"));
        topicsMap.put("C Control Statements", Arrays.asList("C if-else","C switch","if-else vs switch","C Loops","C do-while loop","C while loop","C for loop","Nested Loops in C","Infinite Loop in C","C break","C continue","C goto","Type Casting","C Control Statement Test"));
        topicsMap.put("C Functions", Arrays.asList("What is function ?","Call: Value & Reference","Recursion in c","Storage Classes","C Functions Test"));
        topicsMap.put("C Array", Arrays.asList("1-D Array","2-D Array","Return an Array in C","Array to Function","C Array Test"));
        topicsMap.put("C Pointers", Arrays.asList("C pointers","C Pointer to Pointer","C Pointer Arithmetic","Dangling Pointers in C","sizeof() operator in C","const Pointer in C","void pointer in C","C Dereference Pointer","Null Pointer in C","C Function Pointer","Function pointer as argument in C","C Pointers Test"));
        topicsMap.put("C Dynamic Memory", Arrays.asList("Dynamic memory"));
        topicsMap.put("C String", Arrays.asList("String in C","C gets() & puts()","C String Functions","C strlen()","C strcpy()","C strcat()","C strcmp()","C strrev()","C strlwr()","C strupr()","C strstr()","C String Test"));
        topicsMap.put("C Math", Arrays.asList("C Math Functions"));
        topicsMap.put("C File Handling", Arrays.asList("C File Handling","C fprintf() fscanf()","C fputc() fgetc()","C fputs() fgets()","C fseek()","C rewind()","C ftell()"));
        return topicsMap;
    }
    public static Map<String, List<String>> cplusplusTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("C++ Tutorials", Arrays.asList("C++ Tutorial","C vs C++","C++ History","C++ Features","C++ Installation ","C++ Program","C++ cout, cin, endl","C++ Variable","C++ Data types","C++ Keywords","C++ Operators","C++ Identifiers","C++ Expression"));
        topicsMap.put("C++ Control Statement", Arrays.asList("C++ if-else","C++ switch","C++ For Loop","C++ While Loop","C++ Do-While Loop","C++ Break Statement","C++ Continue Statement","C++ Comments"));
        topicsMap.put("C++ Functions", Arrays.asList("C++ Functions", "Call by value & reference", "C++ Recursion","C++ Storage Classes"));
        topicsMap.put("C++ Arrays", Arrays.asList("What is C++ Arrays ?", "C++ Array to Function", "Multidimensional Arrays"));
        topicsMap.put("C++ Pointers", Arrays.asList("C++ Pointers", "sizeof() operator in C++","C++ Array of Pointers","C++ Void Pointer","C++ References","Reference vs Pointer","Function Pointer in C++","C++ Memory Management","malloc() vs new in C++","free vs delete in C++"));
        topicsMap.put("C++ Object Class", Arrays.asList("C++ OOPs Concepts","C++ Object Class","C++ Constructor","C++ Copy Constructor","C++ Destructor","C++ this Pointer","C++ static","C++ Structs","C++ Enumeration","C++ Friend Function","C++ Math Functions"));
        topicsMap.put("C++ Inheritance", Arrays.asList("C++ Inheritance","C++ Aggregation"));
        topicsMap.put("C++ Polymorphism", Arrays.asList("C++ Polymorphism","C++ Overloading","C++ Overriding","C++ Virtual Function"));
        topicsMap.put("C++ Abstraction", Arrays.asList("C++ Interfaces", "C++ Data Abstraction"));
        topicsMap.put("C++ Namespace", Arrays.asList("C++ Namespace"));
        topicsMap.put("C++ strings", Arrays.asList("C++ Strings"));
        topicsMap.put("C++ Exceptions", Arrays.asList("C++ Exception Handling", "C++ try/catch","C++ User-Defined"));
        return topicsMap;
    }
    public static Map<String, List<String>> rubyTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Ruby Tutorial", Arrays.asList("Ruby Tutorial","What is Ruby ","Ruby Features","Ruby vs Python","Ruby Installation","Hello Ruby Program","Ruby Operators","Ruby Variables","Ruby Data Types"));
        topicsMap.put("Control Statements", Arrays.asList("Ruby if-else","Ruby case","Ruby for","Ruby while do-while","Ruby Until","Ruby break next","Ruby redo retry","Ruby Comments"));
        topicsMap.put("Ruby Core", Arrays.asList("Ruby Object Class","Ruby Methods","Ruby Blocks","Ruby Modules","Ruby Strings","Ruby Arrays","Ruby Hashes","Ruby Date & Time","Ruby Ranges","Ruby Iterators","Ruby File I/O","Ruby Directories","Ruby Exceptions"));
        return topicsMap;
    }
    public static Map<String, List<String>> golangTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Go Language Tutorial", Arrays.asList("Go Tutorial","Go Installation","Go Hello World","Go Data Types","Go Package"));
        topicsMap.put("Go Controls", Arrays.asList("Go if-else","Go Switch","Go For","Go For Range","Go Goto","Go Break","Go Continue","Go Comments","Go Constants","Go Type Casting"));
        topicsMap.put("Go Functions", Arrays.asList("Go Functions","Go Recursion","Go Closure"));
        topicsMap.put("Go Arrays", Arrays.asList("Go Array","Go Slice","Go Command Args"));
        topicsMap.put("Go Strings", Arrays.asList("Go String", "Go Regex"));
        topicsMap.put("Go Types", Arrays.asList("Go Struct", "Go Interface","Go Pointer","Go Reflect","Go Rune"));
        topicsMap.put("Go Map", Arrays.asList("Go Map"));
        topicsMap.put("Go Error", Arrays.asList("Go Error","Go Recover","Go Defer","Go Panic"));
        topicsMap.put("Go Time", Arrays.asList("Go Time", "Go Epoch","Go Tickers"));
        topicsMap.put("Go Concurrency", Arrays.asList("Go Concurrency", "Go Race","Go Mutex","Go Atomic Variable","Go Channel","Go Worker Pools"));
        return topicsMap;
    }


    // digital marketing topics set
    public static Map<String, List<String>> contentmarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> mobilemarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> videomarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> emailmarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> seoTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> socialmediamarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }
    public static Map<String, List<String>> websitemarketingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("What is Cloud Computing ?", Arrays.asList("What is Cloud Computing ?", "Advantage & Disadvantage", "History Of Cloud", "Cloud Computing Architecture", "Cloud Computing Technologies", "Cloud Computing vs Grid Computing", "How Cloud Work", "Cloud Computing Applications", "Security Risks of Cloud Computing"));
        topicsMap.put("Types Of Cloud", Arrays.asList("Public Cloud", "public Cloud", "Hybrid Cloud", "Community Cloud"));
        topicsMap.put("Cloud Service Models", Arrays.asList("IaaS Layer", "PaaS Layer", "SaaS Layer"));
        topicsMap.put("Virtualization", Arrays.asList("What is Virtualization ?", "Data Virtualization", "Hardware Virtualization", "Software Virtualization", "Server Virtualization", "Storage Virtualization", "OS Virtualization", "Linux Virtualization", "Windows Virtualization"));
        topicsMap.put("Cloud Service Providers", Arrays.asList("Cloud Service Provider Companies", "Amazon EC2", "AWS vs Azure vs GCP"));
        return topicsMap;
    }



    // software testing topics set
    public static Map<String, List<String>> softwaretestingTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Software Testing", Arrays.asList("What is Software Testing ?", "Software Testing Principles", "Software Development Life Cycle", "Software Testing Life Cycle", "Types of Software Testing", "Levels of Testing", "Test Maturity Model"));
        topicsMap.put("SDLC models", Arrays.asList("Waterfall model", "Spiral Model", "Hybrid Model", "Prototype Model", "V-model"));
        topicsMap.put("Types of Testing", Arrays.asList("Manual Testing", "Automation Testing"));
        topicsMap.put("Types of Manual", Arrays.asList("White Box Testing", "Black Box Testing", "Grey Box Testing"));
        topicsMap.put("White Box Techniques", Arrays.asList("Data Flow Testing", "Control Flow Testing", "Branch Coverage Testing"));
        topicsMap.put("Black Box Techniques", Arrays.asList("Decision Table", "All-pair Testing", "Cause-Effect Testing", "State Transition", "Use Case"));
        topicsMap.put("Types of Black Box", Arrays.asList("Functional Testing", "Non-Functional Testing"));
        topicsMap.put("Types of Functional", Arrays.asList("Unit Testing", "Integration Testing", "System Testing"));
        topicsMap.put("Types of Non-functional", Arrays.asList("Performance Testing", "Usability Testing", "Compatibility Testing"));
        topicsMap.put("Test case development", Arrays.asList("Testing Documentation", "Test Scenario", "Test Case"));
        topicsMap.put("Testing Techniques", Arrays.asList("Error Guessing", "Equivalence Portioning", "Boundary Value analysis"));
        topicsMap.put("Test Management", Arrays.asList("Test case review process", "Requirement Traceability Matrix"));
        topicsMap.put("Defect Tracking", Arrays.asList("Bug in Software Testing", "Bug Life cycle", "Severity & Priority", "Test Environment", "Defect Management Process"));
        return topicsMap;
    }
    public static Map<String, List<String>> seleniumTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Selenium Tutorial", Arrays.asList("What is Selenium ?", "Basic Terminology", "Selenium Features", "Selenium Limitations", "Selenium vs QTP", "Selenium Tool Suite"));
        topicsMap.put("Selenium IDE", Arrays.asList("Selenium IDE", "IDE-Installation", "IDE-Features", "IDE-First Test Case", "IDE-Login Test", "IDE-Commands", "IDE-Creating Test Cases", "IDE- Locating Strategies"));
        topicsMap.put("Selenium WebDriver", Arrays.asList("Selenium WebDriver", "WebDriver Vs RC", "WebDriver-Installation", "First Test Case", "WebDriver Commands", "WebDriver - Browser Commands", "WebDriver - Navigation Commands", "WebDriver - WebElement Commands", "Handling Radio Buttons", "Handling Checkbox", "Selenium Assertions", "Selenium Grid"));
        return topicsMap;
    }
    public static Map<String, List<String>> qualityassuranceTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Quality Assurance", Arrays.asList("What is Quality Assurance ?"));
        topicsMap.put("Software Testing", Arrays.asList("Testing Introduction", "Software Development Life Cycle", "Software Testing Life Cycle", "Quality Assurance vs Quality Control"));
        topicsMap.put("Black Box Testing", Arrays.asList("Black Box Testing", "Decision Table", "Boundary Value", "State Transition", "All-pair Testing", "Cause-Effect", "Equivalence Portioning", "Error Guessing", "Use Case"));
        topicsMap.put("White Box Testing", Arrays.asList("White Box Testing", "Data Flow Testing", "Control Flow Testing", "Branch Testing", "Grey Box Testing"));
        topicsMap.put("Types of Testing", Arrays.asList("Manual Testing", "Automation Testing", "System Testing", "Smoke Testing", "Sanity Testing", "Smoke Testing vs Sanity Testing"));
        return topicsMap;
    }

    public static Map<String, List<String>> appiumTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Appium Tutorial", Arrays.asList("Appium Tutorial"));
        return topicsMap;
    }
    public static Map<String, List<String>> cybersecurityTopicsMap() {
        Map<String, List<String>> topicsMap = new HashMap<>();
        topicsMap.put("Cyber Security Tutorial", Arrays.asList("What is Cyber Security ?", "Cyber Security History", "Cyber Security Goals", "Types of Cyber Attacks", "Types of Cyber Attackers", "Cyber Security Principles", "Data Security Considerations", "Cyber Security Technology", "Threats to E-Commerce", "Cyber Security Policies", "Cyber Security Standards", "Digital Signature", "Cyber Security Tools", "Cyber Security Challenges", "Security Risk Analysis", "Cyber Security Certification", "MITM Attacks", "Secure e-mail service provider", "Birthday Attack in Cryptography", "Anti-Keylogger", "Advantages and Disadvantages of Cyber Security", "Encryption Algorithms in Cryptography", "SHA Algorithm in Cryptography", "What is AES", "What is MD5 Algorithm", "What is SHA- 256 Algorithm","Impact of IOT on Cyber Security"));
        return topicsMap;
    }
}