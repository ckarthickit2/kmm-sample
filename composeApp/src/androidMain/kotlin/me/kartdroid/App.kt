package me.kartdroid

import Greeting
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.forEach
import me.kartdroid.presentation.MainViewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(mainViewModel: MainViewModel = viewModel()) {
    MaterialTheme {
        val greetings by mainViewModel.greetingList.collectAsStateWithLifecycle()
        Column(
                Modifier.fillMaxWidth().padding(all = 20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {
            greetings.forEach { greeting ->
                Text(greeting)
                Divider()
            }
        }
    }
}