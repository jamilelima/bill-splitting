package dev.jamile.models

data class Bill(
    val id: String,
    val total: Number, // TODO: Verificar qual melhor formato para número de $$$
    val participants: List<Participant>
)