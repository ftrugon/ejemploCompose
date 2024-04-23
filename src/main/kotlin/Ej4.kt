//import androidx.compose.desktop.ui.tooling.preview.Preview
//import androidx.compose.foundation.background
//import androidx.compose.foundation.border
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
//import androidx.compose.ui.graphics.Brush
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
//    Row(
//        verticalAlignment = Alignment.Bottom,
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        modifier = Modifier.fillMaxSize()
//    ){
//
//        Box(
//            modifier = Modifier.wrapContentSize().border(
//                width = 3.dp,
//                color = Color.Red
//            ).height(300.dp).padding(10.dp)
//        ){
//            Text("ejemplo 1")
//        }
//
//        Box(
//            modifier = Modifier.wrapContentSize().border(
//                width = 3.dp,
//                color = Color.Blue
//            ).height(200.dp).padding(10.dp)
//        ){
//            Text("ejemplo 2")
//        }
//
//        Box(
//            modifier = Modifier.wrapContentSize().border(
//                width = 3.dp,
//                color = Color.Red
//            ).height(100.dp).padding(10.dp)
//        ){
//            Text("ejemplo 3")
//        }
//
//        Box(
//            modifier = Modifier.wrapContentSize().border(
//                width = 3.dp,
//                color = Color.Blue
//            ).padding(10.dp)
//        ){
//            Text("ejemplo 4")
//        }
//
//    }
//}
//
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