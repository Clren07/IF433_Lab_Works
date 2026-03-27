package oop_120741_clerensiacatherine.week07

enum class AppState {
    STARTING, RUNNING, STOPPPED
}

sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val error: String) : ApiResponse()
    object Loading : ApiResponse()
}
