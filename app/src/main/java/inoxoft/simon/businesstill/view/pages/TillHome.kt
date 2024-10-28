package inoxoft.simon.businesstill.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import inoxoft.simon.businesstill.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TillHomeScreen(
    modifier: Modifier,
    navController: NavHostController,
    scrollBehavior: TopAppBarScrollBehavior
) {
    Column(modifier.verticalScroll(rememberScrollState())) {
        TopBar(modifier, scrollBehavior)
        Spacer(modifier = Modifier.height(30.dp))
        CardSection(modifier.fillMaxWidth())
    }
}

@Composable
fun CardSection(modifier: Modifier) {
    Box(modifier=modifier){
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(
                brush = Brush.horizontalGradient(
                    listOf(Color.Green, Color.Yellow)
                )
            )
        )
        ElevatedCard(
            modifier= Modifier
                .fillMaxWidth()
                .height(240.dp)
                .padding(horizontal = 22.dp, vertical = 10.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(20.dp)
        ){
            CardContent(modifier=Modifier.fillMaxSize())
        }
    }
}

@Composable
fun CardContent(modifier: Modifier= Modifier) {
Box(modifier = modifier.background(
    brush = Brush.linearGradient(
        listOf(
            MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.error
        )
    )
)){
    Icon(
        painter = painterResource(id = R.drawable.icon),
        contentDescription ="Icon",
        tint = MaterialTheme.colorScheme.background.copy(0.2f),
        modifier = Modifier
            .fillMaxSize()
            .offset(150.dp, 88.dp)
        )
}
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier:Modifier,scrollBehavior: TopAppBarScrollBehavior){

    TopAppBar(
        scrollBehavior=scrollBehavior,
        title = {
            Box(modifier = modifier.padding(end = 20.dp)){
                Box(modifier = Modifier
                    .clip(CircleShape)
                    .size(40.dp)
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .align(Alignment.CenterStart)
                )
                Text(
                    text = "Till Wallet",
                    fontSize = 40.sp,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .align(Alignment.CenterStart)
                    //font family
                )

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription ="Account profile picture",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .align(Alignment.CenterEnd)

                    )


            }
        }
    )

}