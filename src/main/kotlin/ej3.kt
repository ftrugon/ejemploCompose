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
//@Composable
//@Preview
//fun MainScreen() {
//    Surface(
//        color = Color.LightGray,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            Surface(
//                color = Color.Green,
//                modifier = Modifier.height(80.dp).width(60.dp),
//
//            ) {
//                Text("Layout 1")
//            }
//            Surface(
//                color = Color.Gray,
//                modifier = Modifier.height(300.dp).width(60.dp)
//            ) {
//                Text("Layout 2")
//            }
//            Surface(
//                color = Color.Green,
//                modifier = Modifier.height(300.dp).width(60.dp),
//
//                ) {
//                Text("Layout 3")
//            }
//            Surface(
//                color = Color.Gray,
//                modifier = Modifier.height(80.dp).width(60.dp)
//            ) {
//                Text("Layout 4")
//            }
//        }
//    }
//}
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