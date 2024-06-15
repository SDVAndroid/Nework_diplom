package ru.netology.nework.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import ru.netology.nework.dto.Event
import ru.netology.nework.enumeration.EventType

@Entity
data class EventEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val authorId: Long,
    val author: String,
    val authorJob: String? = "",
    val authorAvatar: String? = "",
    val content: String,
    val datetime: String,
    val published: String,
    @Embedded
    val coords: PointEmbeddable?,
    val eventType: EventType,
    @TypeConverters
    val likeOwnerIds: List<Long>,
    val likedByMe: Boolean,
    @TypeConverters
    val speakerIds: List<Long>,
    @TypeConverters
    val participantsIds: List<Long>,
    val participatedByMe: Boolean,
    val read: Boolean = true,
    @Embedded
    var attachment: AttachmentEmbeddable?,
    val link: String? = null,
    val likes: Int = 0,
    val participants: Int = 0
) {
    fun toDto() = Event(
        id,
        authorId,
        author,
        authorJob,
        authorAvatar,
        content,
        datetime,
        published,
        coords?.toDto(),
        eventType,
        likeOwnerIds,
        likedByMe,
        speakerIds,
        participantsIds,
        participatedByMe,
        attachment?.toDto(),
        link,
        emptyMap(),
        likes = likes,
        participants = participants
    )

    companion object {
        fun fromDto(dto: Event) =
            EventEntity(
                dto.id,
                dto.authorId,
                dto.author,
                dto.authorJob,
                dto.authorAvatar,
                dto.content,
                dto.datetime,
                dto.published,
                coords = PointEmbeddable.fromDto(dto.coords),
                dto.type,
                dto.likeOwnerIds,
                dto.likedByMe,
                dto.speakerIds,
                dto.participantsIds,
                dto.participatedByMe,
                attachment = AttachmentEmbeddable.fromDto(dto.attachment),
                link = dto.link,
                likes = dto.likeOwnerIds.size,
                participants = dto.participantsIds.size
            )

        fun fromDtoNew(dto: Event) =
            EventEntity(
                dto.id,
                dto.authorId,
                dto.author,
                dto.authorJob,
                dto.authorAvatar,
                dto.content,
                dto.datetime,
                dto.published,
                coords = PointEmbeddable.fromDto(dto.coords),
                dto.type,
                dto.likeOwnerIds,
                dto.likedByMe,
                dto.speakerIds,
                dto.participantsIds,
                dto.participatedByMe,
                read = false,
                attachment = AttachmentEmbeddable.fromDto(dto.attachment),
                link = dto.link,
                likes = dto.likeOwnerIds.size,
                participants = dto.participantsIds.size
            )

    }
}

fun List<EventEntity>.toDto(): List<Event> = map(EventEntity::toDto)
fun List<Event>.toEntity(): List<EventEntity> = map(EventEntity.Companion::fromDto)
fun List<Event>.toEntityNew(): List<EventEntity> = map(EventEntity.Companion::fromDtoNew)
