plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.learning"
    compileSdk = 34
    buildToolsVersion="34.0.0"

    defaultConfig {
        applicationId = "com.example.learning"
        minSdk = 28
        //noinspection EditedTargetSdkVersion
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        exclude("META-INF/NOTICE.md")
        exclude("META-INF/LICENSE.md")
    }
}


dependencies {

    implementation("androidx.appcompat:appcompat-resources:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.android.car.ui:car-ui-lib:2.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //loader
    implementation("com.github.ybq:Android-SpinKit:1.4.0")

    // smooth bottom navigation view
    implementation("com.github.ibrahimsn98:SmoothBottomBar:1.7.9")

    // google sign in
    implementation("com.google.android.gms:play-services-auth:21.0.0")

    // lottie animation
    implementation("com.airbnb.android:lottie:6.2.0")
    // rounded image
    implementation("com.makeramen:roundedimageview:2.3.0")
    // load image
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation("io.github.shashank02051997:FancyToast:2.0.2")
    implementation ("com.google.firebase:firebase-auth:22.3.1")
    implementation ("com.google.android.gms:play-services-auth:21.0.0")
    implementation ("com.google.android.gms:play-services-auth:21.0.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.5.0")
    implementation ("com.squareup.retrofit2:converter-simplexml:2.5.0")
    implementation("com.squareup.okhttp3:okhttp:3.14.9")

    //APIS
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Promotional Mail
    implementation ("com.sun.mail:android-mail:1.6.6")
    implementation ("com.sun.mail:android-activation:1.6.7")

    //grender toast
    implementation ("com.github.GrenderG:Toasty:1.5.2")
    implementation ("io.github.muddz:styleabletoast:2.4.0")
}