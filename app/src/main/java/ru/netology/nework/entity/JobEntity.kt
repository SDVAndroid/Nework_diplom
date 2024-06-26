package ru.netology.nework.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.netology.nework.dto.Job

@Entity
data class JobEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val position: String,
    val start: String,
    val finish: String?,
    val link: String?,
    val userId: Long
) {
    fun toDto() = Job(id, name, position, start, finish, link, userId)

    companion object {
        fun fromDto(dto: Job, userId: Long) =
            JobEntity(
                dto.id,
                dto.name,
                dto.position,
                dto.start,
                dto.finish,
                dto.link,
                userId
            )
    }
}

fun List<JobEntity>.toDto(): List<Job> = map(JobEntity::toDto)
fun List<Job>.toEntity(userId: Long): List<JobEntity> {
    return this.map { job ->
        JobEntity(
            job.id,
            job.name,
            job.position,
            job.start,
            job.finish,
            job.link,
            userId
        )
    }
}


