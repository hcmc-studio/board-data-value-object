package studio.hcmc.board.vo

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import studio.hcmc.board.domain.ArticleDomain
import studio.hcmc.board.domain.BoardDomain
import studio.hcmc.kotlin.protocol.QualifiedValueObject
import studio.hcmc.kotlin.protocol.ValueObject

@Serializable
data class ArticleVO(
    override val id: Long,
    override val boardId: Long,
    override val title: String,
    override val body: String,
    override val writerNickname: String,
    override val writerPassword: String,
    override val writerAddress: String,
    override val writtenAt: Instant,
    override val lastModifiedAt: Instant?
) : ValueObject, ArticleDomain<Long, Long> {
    companion object;

    @Serializable
    data class Qualified(
        override val id: Long,
        override val boardId: Long,
        override val board: BoardDomain.Qualified<Long>,
        override val title: String,
        override val body: String,
        override val writerNickname: String,
        override val writerPassword: String,
        override val writerAddress: String,
        override val writtenAt: Instant,
        override val lastModifiedAt: Instant?
    ) : QualifiedValueObject, ArticleDomain.Qualified<Long, Long> {
        companion object;
    }
}
