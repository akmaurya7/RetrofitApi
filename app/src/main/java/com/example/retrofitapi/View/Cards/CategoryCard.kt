package com.example.retrofitapi.View.Cards

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.retrofitapi.Model.Data.Product
import com.example.retrofitapi.View.Navigation.Routes

@Composable
fun CategoryCard(product: Product,navController: NavController) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp)
            .height(170.dp)
            .background(MaterialTheme.colorScheme.surface)
            .clickable { val navigationData = product.category.ifBlank { "No data" }
                navController.navigate(Routes.AllCategoryScreen + "/$navigationData") },
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            )
            Text(
                text = product.category,
                fontWeight = FontWeight.Bold,
                maxLines = 2
            )
        }
    }
}