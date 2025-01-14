# JetpackWeatherApp
Weather App

A simple Android application built with Kotlin that shows current weather information and forecasts for a given location. The app fetches data from a public weather API and displays temperature, humidity, and other relevant weather metrics in a clean, user-friendly interface.

General Structure

    Language: The project is written in Kotlin.
    Icon: Designed by me in Photoshop and fully optimized for Google Play requirements.
    UI: Uses Jetpack Compose to build the user interface (a single Activity and several @Composable functions).
    Architecture: A single-screen application with MainViewModel as the primary ViewModel, managing requests and storage of weather data.
    Data Requests: Weather data and forecasts are fetched via Retrofit + Gson.
    Image Loading: Weather icons are loaded using Coil.
    Location Retrieval: Google Play Services Location is used to determine the user's location (FusedLocationProviderClient).
    Permission Management: Runtime permissions are handled with rememberLauncherForActivityResult(ActivityResultContracts.RequestMultiplePermissions()).
    Additional Libraries:
        Accompanist System UI Controller for controlling the status bar and navigation bar.
        Font Awesome Compose for icons (wind, snowflake, etc.).
    AndroidManifest: Declares the necessary permissions (INTERNET, location access, and so on).

Libraries

    Google Play Services Location: for real-time location tracking.
    Gson: for JSON parsing.
    Retrofit / OkHttp: for network requests to the OpenWeatherMap API.
    Retrofit Gson Converter: converts JSON responses into Kotlin data classes.
    Coil Compose: for loading and displaying images/icons.
    Font Awesome Compose: for icons.
    Accompanist System UI Controller: controls the status bar and navigation bar (hide/show).
    AndroidX Components (core-ktx, lifecycle-runtime, activity-compose):
        Provides full functionality for Activity, ViewModel, and more.
    Jetpack Compose BOM:
        androidx.compose.ui, ui.graphics, ui.tooling.preview, material3, ui.test.

Getting Started

  Clone the repository:

    git clone https://github.com/billkasius/JetpackWeatherApp.git

  Open the project in Android Studio:

    From the welcome screen, select Open and navigate to the project's root folder.

  Configure API key :

    const val openWeatherMapApiKey = "YOUR_API_KEY";

  Build the project:

    Wait for Gradle to sync.

  Run the app:

    Select an emulator or a physical device and click Run > in Android Studio.
