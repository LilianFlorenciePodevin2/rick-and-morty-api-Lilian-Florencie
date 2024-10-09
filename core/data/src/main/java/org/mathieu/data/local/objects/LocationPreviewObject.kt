package org.mathieu.data.local.objects

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mathieu.data.remote.responses.LocationPreviewResponse
import org.mathieu.domain.models.location.LocationPreview

internal class LocationPreviewObject: RealmObject {
    @PrimaryKey
    var id: Int = -1
    var name: String = ""
    var type: String = ""
    var dimension: String = ""
}

internal fun LocationPreviewResponse.toRealmObject() = LocationPreviewObject().also { objet ->
    objet.id = this.id
    objet.name = this.name
    objet.type = this.type
    objet.dimension = this.dimension
}

internal fun LocationPreviewObject.toModel() = LocationPreview(
    id = this.id,
    name = this.name,
    type = this.type,
    dimension = this.dimension
)