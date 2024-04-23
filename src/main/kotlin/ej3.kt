//import androidx.compose.desktop.ui.tooling.preview.Preview
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Button
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.DpSize
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//
//
//@Composable
//@Preview
//fun Ejemplos(color: Color,fraccion:Float){
//    Box(
//        modifier = Modifier.background(color).fillMaxHeight(fraccion)
//    ){
//        Text("Ejemplo 1")
//    }
//}
//
//@Composable
//@Preview
//fun MainScreen() {
//    Surface(
//        color = Color.LightGray,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier.fillMaxHeight()
//        ) {
//
//            Ejemplos(Color.Red,0.2f)
//            Ejemplos(Color.Gray,0.4f)
//            Ejemplos(Color.Cyan,0.6f)
//            Ejemplos(Color.Green,1f)
//
//        }
//    }
//}
//
//// Rehecho por lo de ivan , este tio va loco
//
//fun main() = application {
//
//    val windowState = rememberWindowState(size = DpSize(1200.dp,800.dp))
//
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "Achili pum",
//        state = windowState
//
//    ) {
//        MainScreen()
//    }
//}
//