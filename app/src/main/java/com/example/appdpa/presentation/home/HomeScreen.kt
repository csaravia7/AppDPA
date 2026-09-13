package com.example.appdpa.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.appdpa.data.model.CountryModel

val mockCountries = listOf(
    CountryModel(name = "Argentina", ranking = 1, imageUrl = "https://flagcdn.com/w320/ar.png"),
    CountryModel(name = "Brasil", ranking = 2, imageUrl = "https://flagcdn.com/w320/br.png"),
    CountryModel(name = "Chile", ranking = 3, imageUrl = "https://flagcdn.com/w320/cl.png"),
    CountryModel(name = "Colombia", ranking = 4, imageUrl = "https://flagcdn.com/w320/co.png"),
    CountryModel(name = "Ecuador", ranking = 5, imageUrl = "https://flagcdn.com/w320/ec.png"),
    CountryModel(name = "Perú", ranking = 6, imageUrl = "https://flagcdn.com/w320/pe.png"),
    CountryModel(name = "Uruguay", ranking = 7, imageUrl = "https://flagcdn.com/w320/uy.png"),
    CountryModel(name = "Venezuela", ranking = 8, imageUrl = "https://flagcdn.com/w320/ve.png")
)

@Composable
fun HomeScreen() {
    // Columna con un mensaje de bienvenida



    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ranking FIFA 2026", style = MaterialTheme.typography.titleLarge)

        LazyColumn{
            items(mockCountries){ country ->
               Card(
                     modifier = Modifier.padding(16.dp)
                ) {
                   Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                   ) {
                       Image (
                           painter = rememberAsyncImagePainter(country.imageUrl),
                           contentDescription = "${country.name} flag",
                           modifier = Modifier.size(50.dp),
                           contentScale = ContentScale.Crop
                       )

                       Column(
                            modifier = Modifier.padding(start = 16.dp)
                          ) {
                            Text(country.name, style = MaterialTheme.typography.titleMedium)
                            Text("Ranking: ${country.ranking}", style = MaterialTheme.typography.bodyMedium)
                          }

                   }
                }

            }
        }

    }


}

@Composable
fun CountryItem(x0: CountryModel) {
    TODO("Not yet implemented")
}