package studio.hcmc.board.vo

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import studio.hcmc.board.domain.ArticleDomain
import studio.hcmc.board.domain.CommentDomain
import studio.hcmc.kotlin.protocol.QualifiedValueObject
import studio.hcmc.kotlin.protocol.ValueObject

@Serializable
data class CommentVO(
    override val id: Long,
    override val articleId: Long,
    override val body: String,
    override val writerNickname: String,
    override val writerPassword: String,
    override val writerAddress: String,
    override val writtenAt: Instant,
    override val lastModifiedAt: Instant?
) : ValueObject, CommentDomain<Long, Long> {
    companion object;

    @Serializable
    data class Qualified(
        override val id: Long,
        override val articleId: Long,
        override val article: ArticleDomain.Qualified<Long, Long>,
        override val body: String,
        override val writerNickname: String,
        override val writerPassword: String,
        override val writerAddress: String,
        override val writtenAt: Instant,
        override val lastModifiedAt: Instant?
    ) : QualifiedValueObject, CommentDomain.Qualified<Long, Long, Long> {
        companion object;
    }
}
