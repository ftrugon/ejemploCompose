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
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//
//@Composable
//@Preview
//fun MainScreen() {
//
//    Column{
//
//        Box(
//            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Cyan),
//            contentAlignment = Alignment.Center
//        ){
//            Text(
//                text = "BOX 1",
//                fontSize = 30.sp
//            )
//        }
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Box(
//            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Gray),
//            contentAlignment = Alignment.Center
//        ){
//            Text(
//                text = "BOX 1",
//                fontSize = 30.sp
//            )
//        }
//
//        Spacer(modifier = Modifier.height(40.dp))
//
//        Box(
//            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Green),
//            contentAlignment = Alignment.Center
//        ){
//            Text(
//                text = "BOX 1",
//                fontSize = 30.sp
//            )
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Box(
//            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Magenta),
//            contentAlignment = Alignment.Center
//        ){
//            Text(
//                text = "BOX 1",
//                fontSize = 30.sp
//            )
//        }
//    }
//}
//
//
//@Composable
//@Preview
//fun ManScreen() {
//    Surface(
//        color = Color.LightGray,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Row {
//            Surface(
//                color = Color.Green,
//                modifier = Modifier.size(60.dp)
//            ) {}
//            Surface(
//                color = Color.Black,
//                modifier = Modifier.size(60.dp)
//            ) {}
//        } }}
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