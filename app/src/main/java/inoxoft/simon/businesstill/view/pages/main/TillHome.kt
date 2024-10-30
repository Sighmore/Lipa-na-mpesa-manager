package inoxoft.simon.businesstill.view.pages.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import inoxoft.simon.businesstill.ui.theme.blue
import inoxoft.simon.businesstill.ui.theme.green
import inoxoft.simon.businesstill.ui.theme.grey
import inoxoft.simon.businesstill.ui.theme.lightBlue
import inoxoft.simon.businesstill.ui.theme.lightRed

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TillHomeScreen(
    modifier: Modifier,
    navController: NavHostController,
    scrollBehavior: TopAppBarScrollBehavior
) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier.verticalScroll(rememberScrollState())) {
            TopBar(modifier, scrollBehavior)
            Spacer(modifier = Modifier.height(10.dp))
            CardSection(modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(12.dp))
            TransactionSection(navController,modifier)
        }
        BottomBar(
            navController,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )
    }
    }

@Composable
fun TransactionSection(x0: NavHostController, x1: Modifier) {
    Column {
        Text(
            modifier = Modifier.padding(start = 30.dp),
            text = "Transactions",
            fontSize = 24.sp,
            color = green
            )
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    modifier = Modifier.clip(CircleShape)
                        .clickable(onClick = {
                        //TODO: navigate to customers
                    }).size(30.dp),
                    imageVector = Icons.Default.AccountCircle, contentDescription = "Home",
                    tint = green
                )
                Text(text = "pay")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    modifier = Modifier.clickable(onClick = {
                        //TODO: navigate to history

                    }).size(30.dp),
                    imageVector = Icons.Default.CheckCircle, contentDescription = "Home",
                    tint = lightBlue
                )
                Text(text = "History")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    modifier = Modifier.clickable(onClick = {
                        //TODO: navigate to notifications
                    }).size(30.dp),
                    imageVector = Icons.Default.ShoppingCart, contentDescription = "Home"
                    , tint = green
                )
                Text(text = "pay")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    modifier = Modifier.clickable(onClick = {
                        //TODO: navigate to notifications
                    }).size(30.dp),
                    imageVector = Icons.Default.Favorite, contentDescription = "Home",
                    tint = lightBlue
                )
                Text(text = "Fav")
            }
        }

    }
}


@Composable
    fun BottomBar( navController: NavHostController, modifier: Modifier) {

        BottomAppBar(modifier = modifier) {
            Row(
                modifier = Modifier.fillMaxWidth().height(50.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        modifier= Modifier.clickable(onClick={
                            navController.navigate("homeTill")
                        }),
                        imageVector = Icons.Default.Home,
                        contentDescription = "Home",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Text(text = "Home")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        modifier= Modifier.clickable(onClick={
                            navController.navigate("TransactionHistory")
                        }),
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Records",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Text(text = "Records")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Icon(
                        modifier= Modifier.clickable(onClick={
                            navController.navigate("transactionInit")
                        }),

                        imageVector = Icons.Default.Person,
                        contentDescription = "Init",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Text(text = "Customers")

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        modifier= Modifier.clickable(onClick={
                            //TODO: navigate to notifications
                        }),
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                    Text(text = "Notifications")
                }

            }
        }
    }

    @Composable
    fun CardSection(modifier: Modifier) {
        Box(modifier = modifier) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(MaterialTheme.colorScheme.primary, Color.Yellow)
                        )
                    )
            )
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp)
                    .padding(horizontal = 22.dp, vertical = 10.dp),
                elevation = CardDefaults.cardElevation(6.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                CardContent(modifier = Modifier.fillMaxSize())
            }
        }
    }

    @Composable
    fun CardContent(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier.background(
                brush = Brush.linearGradient(
                    listOf(
                        Color.Green,
                        MaterialTheme.colorScheme.error
                    )
                )
            )
        ) {

            Icon(painter = painterResource(id = R.drawable.file), contentDescription = "Icon", tint = MaterialTheme.colorScheme.background.copy(0.5f), modifier = Modifier
                    .fillMaxSize()
                    .offset(10.dp, 60.dp))
            Text(
                modifier = Modifier.offset(30.dp, 15.dp),
                text = "Balance"
                , fontSize = 20.sp,
                color = MaterialTheme.colorScheme.background

            )
            Spacer(modifier = Modifier.height(10.dp))


            Text(
                modifier = Modifier.offset(40.dp, 60.dp),
                color = MaterialTheme.colorScheme.background,
                text = "Ksh 1000"
                , fontSize = 30.sp
            )
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(
        modifier: Modifier,
        scrollBehavior: TopAppBarScrollBehavior
    ) {

        TopAppBar(
            scrollBehavior = scrollBehavior,
            title = {
                Box(modifier = modifier.padding(end = 20.dp).fillMaxWidth()) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(40.dp)
                            .background(MaterialTheme.colorScheme.primaryContainer)
                            .align(Alignment.CenterStart)
                    )
                    Text(
                        text = "Till Wallet",
                        fontSize = 30.sp,
                        color = green,
                        modifier = Modifier
                            .padding(start = 12.dp)
                            .align(Alignment.CenterStart)
                        //font family
                    )

                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "Account profile picture",
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .align(Alignment.CenterEnd)

                    )


                }
            }
        )

    }
