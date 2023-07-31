package studio.hcmc.board.vo

import kotlinx.serialization.Serializable
import studio.hcmc.board.domain.BoardDomain
import studio.hcmc.kotlin.protocol.QualifiedValueObject
import studio.hcmc.kotlin.protocol.ValueObject

@Serializable
data class BoardVO(
    override val id: Long,
    override val name: String
) : ValueObject, BoardDomain<Long> {
    companion object;

    @Serializable
    data class Qualified(
        override val id: Long,
        override val name: String
    ) : QualifiedValueObject, BoardDomain.Qualified<Long> {
        companion object;
    }
}
