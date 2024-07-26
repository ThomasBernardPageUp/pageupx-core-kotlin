package com.pageup.ui.buttons

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pageup.ui.utils.PreviewComponent


@Composable
fun SquaredButton(
    modifier : Modifier = Modifier,
    @DrawableRes resource: Int,
    onClick: () -> Unit,
    backgroundColor : Color = MaterialTheme.colorScheme.primary,
    color : Color = Color.White,
) {
    Button(
        modifier = modifier.size(44.dp),
        onClick = onClick,
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor
        ),
        shape = RoundedCornerShape(size = 8.dp),
    ) {
        Icon(
            painter = painterResource(resource),
            contentDescription = "SquaredButton icon",
            tint = color)
    }
}

@Composable
@Preview
private fun SquaredButtonPreview() = PreviewComponent {
    SquaredButton(
        resource = com.pageup.ui.R.drawable.arrow,
        onClick = {}
    )
}