package com.pageup.ui.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun PreviewComponent(verticalArrangement : Arrangement.Vertical = Arrangement.spacedBy(10.dp), content : @Composable ColumnScope.() -> Unit) = PreviewScreen {
    Column(verticalArrangement = verticalArrangement) {
        content()
    }
}